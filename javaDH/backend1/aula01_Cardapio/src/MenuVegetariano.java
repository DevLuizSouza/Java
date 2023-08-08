public class MenuVegetariano extends Menu {
    @Override
    public void adicionarItens() {
        String itens = "Cardápio vegetariano:\n" +
                "- Sanduíche de vegetais grelhados\n" +
                "- Batata doce frita\n" +
                "- Refrigerante de 300ml\n" +
                "- Temperos adicionais (adicional)";
        System.out.println(itens);
    }

    @Override
    protected double calcularPrecoBase() {

        return 20.0;
    }

    @Override
    public double calcularCusto() {
        double custoBase = super.calcularCusto();
        double custoFinal = custoBase + (custoBase * 0.01); // Acrescenta 1% por causa dos condimentos
        System.out.println("Custo final do cardápio vegetariano: R$" + custoFinal);
        return custoFinal;
    }
}
