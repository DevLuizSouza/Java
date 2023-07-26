
public class Main {
    public static void main(String[] args) {
        Arquivo arquivo1 = new ArquivoConcreto("marcadores", ".txt");
        Arquivo arquivo2 = new ArquivoConcreto("background", ".png");

        Pasta pasta = new Pasta("minhaPasta", "");
        pasta.adicionarArquivo(arquivo1);
        pasta.adicionarArquivo(arquivo2);

        System.out.println("---------------------------------------");
        System.out.println("Arquivos na pasta:");
        for (Arquivo arquivo : pasta.getArquivos()) {
            System.out.println("Nome do arquivo: " + arquivo.getNome());
        }

        Arquivo arquivo3 = new ArquivoConcreto("documento", ".docx");
        pasta.adicionarArquivo(arquivo3);

        System.out.println("---------------------------------------");
        System.out.println("Arquivos na pasta após adição:");
        for (Arquivo arquivo : pasta.getArquivos()) {
            System.out.println("Nome do arquivo: " + arquivo.getNome());
        }

        Arquivo arquivo4 = new ArquivoConcreto("planilhaDados", ".xlsx");
        pasta.adicionarArquivo(arquivo4);

        System.out.println("---------------------------------------");
        System.out.println("Arquivos na pasta após adição:");
        for (Arquivo arquivo : pasta.getArquivos()) {
            System.out.println("Nome do arquivo: " + arquivo.getNome());
        }



        ArquivoConcreto arquivo1Concreto = (ArquivoConcreto) arquivo1;
        arquivo1Concreto.editarArquivo("Novo conteúdo do arquivo de texto");

        System.out.println("Conteúdo do arquivo de texto após edição: " + arquivo1Concreto.getConteudo());
    }
}
