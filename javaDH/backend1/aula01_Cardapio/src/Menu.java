public abstract class Menu {
    public void montarMenu() {
        System.out.println("Montando cardápio...");
        adicionarItens();
        System.out.println("Cardápio montado com sucesso!");
    }

    public abstract void adicionarItens();

    public double calcularCusto() {
        adicionarItens();
        double custo = calcularPrecoBase();
        System.out.println("Custo do cardápio: R$" + custo);

        return custo;
    }

    protected abstract double calcularPrecoBase();
}
