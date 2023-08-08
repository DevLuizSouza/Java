public class MenuAdulto extends Menu {
    @Override
    public void adicionarItens() {
        String itens = "Cardápio adulto:\n" +
                "- Sanduíche de frango com maionese\n" +
                "- Batata frita\n" +
                "- Refrigerante de 500ml";
        System.out.println(itens);

    }

    @Override
    protected double calcularPrecoBase() {

        return 25.0;
    }
}
