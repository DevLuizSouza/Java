import java.util.ArrayList;

public class Pasta implements Arquivo {
                        private String nome;
    private String extensao;
    private ArrayList<Arquivo> listaArquivos;

    public Pasta(String nome, String extensao) {
        this.nome = nome;
        this.extensao = extensao;
        this.listaArquivos = new ArrayList<>();
    }

    @Override
    public String getNome() {
        return nome + extensao;
    }

    @Override
    public void adicionarArquivo(Arquivo arquivo) {
        listaArquivos.add(arquivo);
    }

    @Override
    public void removerArquivo(Arquivo arquivo) {
        listaArquivos.remove(arquivo);
    }

    @Override
    public ArrayList<Arquivo> getArquivos() {
        return listaArquivos;
    }
}