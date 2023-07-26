import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {

    private String nomeProduto;
    private String descricao;
    private BigDecimal preco;
    private List<Produto> listaProdutos;

    public Produto() {
        listaProdutos = new ArrayList<>();
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void incluirProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Incluir Produto -----");
        System.out.print("Nome: ");
        this.nomeProduto = scanner.nextLine();
        System.out.print("Preço: ");
        String precoStr = scanner.nextLine();
        this.preco = new BigDecimal(precoStr);
        System.out.print("Descrição: ");
        this.descricao = scanner.nextLine();

        listaProdutos.add(this); // Adicionar o novo produto à lista de produtos

        System.out.println("Produto adicionado com sucesso.");
    }

    public void consultarProdutos() {
        System.out.println("----- Consultar Produtos -----");
        if (listaProdutos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            for (Produto produto : listaProdutos) {
                System.out.println("Nome: " + produto.getNomeProduto());
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println();
            }
        }
    }


    public void alterarProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("----- Alterar Produto -----");
        System.out.print("Nome do produto a ser alterado: ");
        String nome = scanner.nextLine();

        Produto produtoEncontrado = null;
        for (Produto produto : listaProdutos) {
            if (produto.getNomeProduto().equalsIgnoreCase(nome)) {
                produtoEncontrado = produto;
                break;
            }
        }
        if (produtoEncontrado != null) {
            System.out.print("Novo Nome: ");
            String novoNome = scanner.nextLine();
            System.out.print("Novo Preço: ");
            String novoPrecoStr = scanner.nextLine();
            BigDecimal novoPreco = new BigDecimal(novoPrecoStr);

            produtoEncontrado.setNomeProduto(novoNome);
            produtoEncontrado.setPreco(novoPreco);

            System.out.println("Produto alterado com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }


        public void excluirProduto(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("----- Excluir Produto -----");
            System.out.print("Nome do produto a ser excluído: ");
            String nome = scanner.nextLine();
            Produto produtoEncontrado = null;
            for (Produto produto : listaProdutos) {
                if (produto.getNomeProduto().equalsIgnoreCase(nome)) {
                    produtoEncontrado = produto;
                    break;
                }
            }

            if (produtoEncontrado != null) {
                listaProdutos.remove(produtoEncontrado);
                System.out.println("Produto excluído com sucesso.");
            } else {
                System.out.println("Produto não encontrado.");
            }


        }



        public void manterProdutos() {
            Scanner scanner = new Scanner(System.in);
            int opcao;
            do {
                System.out.println("----- Menu de Produtos -----");
                System.out.println("1. Cadastrar Produto");
                System.out.println("2. Consultar Produtos");
                System.out.println("3. Alterar Produto");
                System.out.println("4. Excluir Produto");
                System.out.println("5. Voltar ao menu principal");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        incluirProduto();
                        break;
                    case 2:
                        consultarProdutos();
                        break;
                    case 3:
                        alterarProduto();
                        break;
                    case 4:
                        excluirProduto();
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