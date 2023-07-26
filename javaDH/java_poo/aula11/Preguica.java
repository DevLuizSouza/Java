package aula12_mesa;

public class Preguica extends Animal{

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String deveEmitirSom() {
        return "algum som";
    }
    public String escalarArvores(){
        return "Escalar arvore";
    }
}
