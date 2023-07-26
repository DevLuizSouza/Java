
        import java.util.ArrayList;

        public interface Arquivo {
            String getNome();

            default void adicionarArquivo(Arquivo arquivo) {
                throw new UnsupportedOperationException("Este arquivo não suporta a adição de outros arquivos.");
            }
            default void editarArquivo(String novoConteudo) {
                throw new UnsupportedOperationException("Este arquivo não pode ser editado.");
            }
            default void removerArquivo(Arquivo arquivo) {
                throw new UnsupportedOperationException("Este arquivo não suporta a remoção de outros arquivos.");
            }

            default ArrayList<Arquivo> getArquivos() {
                throw new UnsupportedOperationException("Este arquivo não contém outros arquivos.");
            }
        }
