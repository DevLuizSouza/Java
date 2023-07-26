import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Digite seu nome? ");
        pessoa.setNome(scanner.nextLine());

        System.out.println("Digite seu sobrenome? ");
        pessoa.setSobrenome(scanner.nextLine());

        System.out.println("Digite seu dia de nascimento?");
        pessoa.setDiaNascimento(scanner.nextInt());

        System.out.println("Digite seu mês de nascimento?");
        pessoa.setMesNascimento(scanner.nextInt());

        System.out.println("Digite seu ano de nascimento?");
        pessoa.setAnoNascimento(scanner.nextInt());
    }
}






