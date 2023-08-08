import com.sun.jdi.PrimitiveValue;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Main {
    private static final String SQL_CREATE_TABLE = """
            DROP TABLE IF EXISTS Figuras;
            CREATE TABLE Figuras(
                id          VARCHAR(36) PRIMARY KEY,
                figura      VARCHAR(100) NOT NULL,
                cor VARCHAR(100) NOT NULL 
            
            );
            """;

    private static final String CIRCULO1 =
            "INSERT INTO Figuras VALUES('uuid_1', 'Circulo', 'Amarelo')";

    private static final String CIRCULO2 =
            "INSERT INTO Figuras VALUES('uuid_2', 'Circulo', 'Vermelha')";

    private static final String QUADRADO1 =
            "INSERT INTO Figuras VALUES('uuid_3', 'Qradrado', 'Roxa')";
       private static final String QUADRADO2 =
            "INSERT INTO Figuras VALUES('uuid_4', 'Quadrado', 'Preta')";
    private static final String QUADRADO3 =
            "INSERT INTO Figuras VALUES('uuid_5', 'Quadrado', 'Azul')";

    private static final String SQL_GET_ALL = "SELECT * FROM Figuras;";

    public static void main(String[] args) {

        final Logger log = Logger.getLogger(Main.class);
        Connection connection;
        try {
            log.info("resgatando conexão");
            connection = getConnection();

            log.info("criando statement");
            Statement statement = connection.createStatement();

            log.info("iniciando banco de dados, tabela Figuras");
            statement.execute(SQL_CREATE_TABLE);

            log.info("inserindo figuras no banco de dados");
            statement.execute(CIRCULO1);
            statement.execute(CIRCULO2);
            statement.execute(QUADRADO1);
            statement.execute(QUADRADO2);
            statement.execute(QUADRADO3);


            log.info("executando getAll() no banco de dados");
            ResultSet resultSet = statement.executeQuery(SQL_GET_ALL);

            log.info("logando valores retornados do banco de dados:");
            while (resultSet.next()) {
                log.info("| id: %s | figura: %s | cor: %s |"
                        .formatted(
                                resultSet.getString(1),
                                resultSet.getString(2),
                                resultSet.getString(3))
                );
            }

            ResultSet redCirclesResultSet = statement.executeQuery(
                    "SELECT * FROM Figuras WHERE figura = 'Circulo' AND cor = 'Vermelha';"
            );

            log.info("Círculos de cor vermelha:");
            while (redCirclesResultSet.next()) {
                log.info("| id: %s | figura: %s | cor: %s |"
                        .formatted(
                                redCirclesResultSet.getString(1),
                                redCirclesResultSet.getString(2),
                                redCirclesResultSet.getString(3))
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
