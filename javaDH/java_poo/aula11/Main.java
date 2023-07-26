package aula12_mesa;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Poof", 7);

        System.out.println("O nome do cachorro é: " + cachorro.getNome() + " | " + "O método do cachorro é: " + cachorro.correr());

        Preguica preguica = new Preguica("maicon", 20);
        System.out.println("O método da preguiça é: " + preguica.escalarArvores() + " e ela faz: " + preguica.deveEmitirSom());

        Cavalo cavalo = new Cavalo("Drake", 30);
        System.out.println("O nome é do cavalo é: " + cavalo.nome + " | " + "A idade do cavalo é: " + cavalo.idade + " anos.");

    }
}
