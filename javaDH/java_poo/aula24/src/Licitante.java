public class Licitante implements Notificacao {
    private String nome;
    private String sobrenome;
    private String identidade;
    private double valorMaximo;

    public Licitante(String nome, String sobrenome, String identidade, double valorMaximo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.identidade = identidade;
        this.valorMaximo = valorMaximo;
    }

    @Override
    public void atualizar(Leilao leilao) {
        double lanceAtual = leilao.getValor();
        if (lanceAtual < valorMaximo) {
            System.out.println(nome + " dá um lance de " + lanceAtual);
            if (leilao.getVencedor() == null || lanceAtual > leilao.getVencedor().getValorMaximo()) {
                leilao.setVencedor(this);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public double getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(double valorMaximo) {
        this.valorMaximo = valorMaximo;
    }
}
