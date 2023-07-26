import java.time.LocalDate;

public class PacientePublico extends Paciente implements Comparable<PacientePublico> {
    protected long numeroCartaoSus;

    public PacientePublico(String nome, String sobrenome, LocalDate dataNascimento, boolean primeiraConsulta, long numeroCartaoSus) {
        super(nome, sobrenome, dataNascimento, primeiraConsulta);
        this.numeroCartaoSus = numeroCartaoSus;
    }



    public long getNumeroCartaoSus() {
        return numeroCartaoSus;
    }

    @Override
    public int compareTo(PacientePublico pacientePublico){
        int resultado = pacientePublico.numeroCartaoSus < this.numeroCartaoSus ? -1 : 0;
        String mensagem = resultado < 0
                ? "Este paciente deverá ser atendido primeiro"
                : "Este paciente será atendido na sequência";
            System.out.println(mensagem);
        return resultado;
    }

}
