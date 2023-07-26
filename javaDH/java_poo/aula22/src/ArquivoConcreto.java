public class ArquivoConcreto implements Arquivo {
    private String nome;
    private String extensao;
    private String conteudo;

    public ArquivoConcreto(String nome, String extensao) {
        this.nome = nome;
        this.extensao = extensao;
        this.conteudo = "";
    }

    @Override
    public String getNome() {
        return nome + extensao;
    }

    @Override
    public void editarArquivo(String novoConteudo) {
        this.conteudo = novoConteudo;
    }

    public String getConteudo() {
        return conteudo;
    }
}
