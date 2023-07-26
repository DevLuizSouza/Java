import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        // Criando um objeto PacienteParticular
        BigDecimal valorConsultaPacienteParticular = new BigDecimal("150.00");
        PacienteParticular pacienteParticular = new PacienteParticular("João", "Silva",
        LocalDate.of(1990, 5, 15), true, valorConsultaPacienteParticular, 123456);


        System.out.println("Paciente Particular:");
        System.out.println("Nome: " + pacienteParticular.getNome());
        System.out.println("Sobrenome: " + pacienteParticular.getSobrenome());
        System.out.println("Data de Nascimento: " + pacienteParticular.getDataNascimento());
        System.out.println("Primeira Consulta: " + pacienteParticular.isPrimeiraConsulta());
        System.out.println("Valor da Consulta: " + pacienteParticular.getValorConsulta());
        System.out.println("Número RG: " + pacienteParticular.getNumeroRg());
        System.out.println();

        // Criando um objeto PacientePublico
        PacientePublico pacientePublico1 = new PacientePublico("Maria", "Santos",
                LocalDate.of(1985, 9, 10), false, 987654321);
        PacientePublico pacientePublico2 = new PacientePublico("Carlos", "Souza",
                LocalDate.of(1978, 3, 22), true, 123456789);

        System.out.println("Paciente Público 1:");
        System.out.println("Nome: " + pacientePublico1.getNome());
        System.out.println("Sobrenome: " + pacientePublico1.getSobrenome());
        System.out.println("Data de Nascimento: " + pacientePublico1.getDataNascimento());
        System.out.println("Primeira Consulta: " + pacientePublico1.isPrimeiraConsulta());
        System.out.println("Número do Cartão SUS: " + pacientePublico1.getNumeroCartaoSus());
        System.out.println();

        System.out.println("Paciente Público 2:");
        System.out.println("Nome: " + pacientePublico2.getNome());
        System.out.println("Sobrenome: " + pacientePublico2.getSobrenome());
        System.out.println("Data de Nascimento: " + pacientePublico2.getDataNascimento());
        System.out.println("Primeira Consulta: " + pacientePublico2.isPrimeiraConsulta());
        System.out.println("Número do Cartão SUS: " + pacientePublico2.getNumeroCartaoSus());
        System.out.println();

        // Criando um objeto Consulta
        Consulta consulta = new Consulta("Cardiologia", LocalDate.of(2023, 6, 10),
                LocalDateTime.of(2023, 6, 10, 14, 30));

        System.out.println("Consulta:");
        System.out.println("Especialidade: " + consulta.getEspecialidade());
        System.out.println("Data da Consulta: " + consulta.getDataConsulta());
        System.out.println("Hora da Consulta: " + consulta.getHoraConsulta());
        System.out.println();

        consulta.avaliarPaciente(pacienteParticular);
        consulta.avaliarPaciente(pacientePublico1);
        consulta.avaliarPaciente(pacientePublico2);
    }
}
