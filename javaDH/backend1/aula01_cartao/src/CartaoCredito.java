public class CartaoCredito {

    private String nome;
    private String numero;

    public CartaoCredito(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }


    public boolean isTem19Caracteres(){
        int qtdCaracters = numero.length();
        return qtdCaracters == 19;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
