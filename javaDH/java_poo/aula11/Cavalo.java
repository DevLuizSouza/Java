package aula12_mesa;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String deveEmitirSom() {
        return "relinchar";
    }

    public String correr(){
        return "correr";
    }
}
