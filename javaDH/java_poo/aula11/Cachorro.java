package aula12_mesa;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String deveEmitirSom() {
        return "auau";
    }

    public String correr() {
        return "correndo";
    }


}
