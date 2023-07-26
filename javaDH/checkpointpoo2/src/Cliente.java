import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;
    private int ddd;
    private long numero;
    private LocalDate idade;
    private String endereco;

    private List<Cliente> listaClientes;

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public Cliente() {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.email = email;
        this.ddd = ddd;
        this.numero = numero;
        this.idade = idade;
        this.endereco = endereco;
        this.listaClientes = new ArrayList<>();
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    private void consultarClientes() {
        System.out.println("----- Consultar Clientes -----");

        if (listaClientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            for (Cliente cliente : listaClientes) {
                System.out.println(cliente);
            }
        }
    }

    private void incluirCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Incluir Cliente -----");
        System.out.print("Nome: ");
        this.nome = scanner.nextLine();
        System.out.print("Sobrenome: ");
        this.sobrenome = scanner.nextLine();
        System.out.print("CPF: ");
        this.cpf = scanner.nextLine();
        System.out.print("Email: ");
        this.email = scanner.nextLine();
        System.out.print("DDD: ");
        this.ddd = scanner.nextInt();
        System.out.print("Número: ");
        this.numero = scanner.nextLong();
        scanner.nextLine(); // Consumir a quebra de linha após a leitura do número
        System.out.print("Data de Nascimento (Formato: YYYY-MM-DD): ");
        String dataNascimentoString = scanner.nextLine();
        this.idade = LocalDate.parse(dataNascimentoString);
        System.out.print("Endereço: ");
        this.endereco = scanner.nextLine();

        listaClientes.add(this);

        System.out.println("Cliente adicionado com sucesso.");
    }


    private void deletarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Deletar Cliente -----");
        System.out.print("CPF do cliente a ser deletado: ");
        String cpf = scanner.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            listaClientes.remove(clienteEncontrado);
            System.out.println("Cliente deletado com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private void alterarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Alterar Cliente -----");
        System.out.print("CPF do cliente a ser alterado: ");
        String cpf = scanner.nextLine();

        Cliente clienteEncontrado = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            System.out.print("Novo Nome: ");
            String novoNome = scanner.nextLine();
            System.out.print("Novo Sobrenome: ");
            String novoSobrenome = scanner.nextLine();
            System.out.print("Novo Email: ");
            String novoEmail = scanner.nextLine();
            System.out.print("Novo DDD: ");
            int novoDdd = scanner.nextInt();
            System.out.print("Novo Número: ");
            long novoNumero = scanner.nextLong();
            scanner.nextLine(); // Consumir a quebra de linha após a leitura do número
            System.out.print("Nova Data de Nascimento (Formato: YYYY-MM-DD): ");
            String novaDataNascimentoString = scanner.nextLine();
            LocalDate novaDataNascimento = LocalDate.parse(novaDataNascimentoString);
            System.out.print("Novo Endereço: ");
            String novoEndereco = scanner.nextLine();

            clienteEncontrado.setNome(novoNome);
            clienteEncontrado.setSobrenome(novoSobrenome);
            clienteEncontrado.setEmail(novoEmail);
            clienteEncontrado.setDdd(novoDdd);
            clienteEncontrado.setNumero(novoNumero);
            clienteEncontrado.setIdade(novaDataNascimento);
            clienteEncontrado.setEndereco(novoEndereco);

            System.out.println("Cliente alterado com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", ddd=" + ddd +
                ", numero=" + numero +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                '}';
    }
    public void manterClientes() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("----- Menu de Clientes -----");
            System.out.println("1. Consultar clientes");
            System.out.println("2. Incluir cliente");
            System.out.println("3. Deletar cliente");
            System.out.println("4. Alterar cliente");
            System.out.println("5. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a leitura do número

            switch (opcao) {
                case 1:
                    consultarClientes();
                    break;
                case 2:
                    incluirCliente();
                    break;
                case 3:
                    deletarCliente();
                    break;
                case 4:
                    alterarCliente();
                    break;
                case 5:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            System.out.println();
        } while (opcao != 5);
    }

}

