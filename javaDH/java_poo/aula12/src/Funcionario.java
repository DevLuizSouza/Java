public abstract class Funcionario {
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }


    public Double getSalario() {
        return salario;
    }

    public abstract void addAumento();
    public abstract  Double ganhoAnual();
    public abstract void exibeDados();


}
