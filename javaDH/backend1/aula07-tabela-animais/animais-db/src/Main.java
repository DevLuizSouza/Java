import com.sun.jdi.PrimitiveValue;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    private static final String SQL_CREATE_TABLE = """
            DROP TABLE IF EXISTS Animal;
            CREATE TABLE Animal(
                id      VARCHAR(36) PRIMARY KEY,
                nome    VARCHAR(100) NOT NULL,
                tipo    VARCHAR(100) NOT NULL
            );
            """;

    private static final String PITOCO =
            "INSERT INTO Animal values('uuid_1', 'pitoco', 'CACHORRO')";
    private static final String SUZI =
            "INSERT INTO Animal values('uuid_2', 'suzi', 'CACHORRO')";
    private static final String MEAU =
            "INSERT INTO Animal values('uuid_3', 'meau', 'GATO')";
    private static final String MARYLU =
            "INSERT INTO Animal values('uuid_4', 'marylu', 'VACA')";
    private static final String DRAGAO =
            "INSERT INTO Animal values('uuid_5', 'dragao', 'dragão de komodo')";

    private static final String SQL_GET_ALL = "SELECT * FROM Animal;";
    private static final String SQL_DELETE_PITOCO = "DELETE FROM Animal where id='uuid_1';";

    public static void main(String[] args) {
        final Logger log = Logger.getLogger(Main.class);
        Connection connection;
        try {
            log.info("resgatando conexão");
            connection = getConnection();

            log.info("criando statement");
            Statement statement = connection.createStatement();

            log.info("iniciando banco de dados, tabela animal");
            statement.execute(SQL_CREATE_TABLE);

            log.info("inserindo animais no banco de dados");
            statement.execute(PITOCO);
            statement.execute(MEAU);
            statement.execute(MARYLU);
            statement.execute(DRAGAO);
            statement.execute(SUZI);

            log.info("executando getAll() no banco de dados");
            ResultSet resultSet = statement.executeQuery(SQL_GET_ALL);

            log.info("logando valores retornados do banco de dados:");
            while (resultSet.next()) {
                log.info("| id: %s | nome: %s | tipo: %s |"
                        .formatted(
                                resultSet.getString(1),
                                resultSet.getString(2),
                                resultSet.getString(3))
                );
            }

            log.info("excluindo pitoco do sistema");
            statement.execute(SQL_DELETE_PITOCO);

            log.info("executando getAll() no banco de dados");
            resultSet = statement.executeQuery(SQL_GET_ALL);

            log.info("logando valores retornados do banco de dados:");
            while (resultSet.next()) {
                log.info("| id: %s | nome: %s | tipo: %s |"
                        .formatted(
                                resultSet.getString(1),
                                resultSet.getString(2),
                                resultSet.getString(3))
                );
            }
        } catch (Exception e) {
            log.error(e);
        }

    }

    public static Connection getConnection() throws Exception {

        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:file:./db/test", "sa", "");
    }
}