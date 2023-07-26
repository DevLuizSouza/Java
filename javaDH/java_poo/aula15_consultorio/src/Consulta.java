import java.time.LocalDate;
import java.time.LocalDateTime;

public class Consulta {

    private String especialidade;
    private LocalDate dataConsulta;
    private LocalDateTime horaConsulta;

    public Consulta(String especialidade, LocalDate dataConsulta, LocalDateTime horaConsulta) {
        this.especialidade = especialidade;
        this.dataConsulta = dataConsulta;
        this.horaConsulta = horaConsulta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void avaliarPaciente(Paciente p) {
        String mensagem = p.isPrimeiraConsulta()
                ? "Essa é a primeira consulta do paciente " + p.getNome() + ". Ele precisa fazer a avaliação prévia. Especialidade: "
                + especialidade
                : "O paciente " + p.getNome() + " não precisa realizar a avaliação. Especialidade: " + especialidade;

        if (p instanceof PacienteParticular) {
            mensagem += " Valor da Consulta: " + ((PacienteParticular) p).getValorConsulta();
        }

        System.out.println(mensagem);
    }


    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public LocalDateTime getHoraConsulta() {
        return horaConsulta;
    }

    public void setHoraConsulta(LocalDateTime horaConsulta) {
        this.horaConsulta = horaConsulta;
    }
}