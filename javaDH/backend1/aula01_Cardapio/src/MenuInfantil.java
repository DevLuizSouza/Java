public class MenuInfantil extends Menu {
    @Override
    public void adicionarItens() {
        String itens = "Cardápio infantil:\n" +
                "- Sanduíche de queijo\n" +
                "- Batata frita pequena\n" +
                "- Refrigerante de 300ml\n" +
                "- Brinquedo surpresa (adicional)";
        System.out.println(itens);
    }

    @Override
    protected double calcularPrecoBase() {

        return 10.0;
    }

    @Override
    public double calcularCusto() {
        double custoBase = super.calcularCusto();
        double custoFinal = custoBase + (custoBase * 0.10); // Acrescenta 10% por causa do brinquedo surpresa
        System.out.println("Custo final do cardápio infantil: R$" + custoFinal);
        return custoFinal;
    }
}
