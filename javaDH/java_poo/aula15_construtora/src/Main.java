public class Main {
    public static void main(String[] args) {
        // Criando um objeto Departamento
        Departamento departamento = new Departamento(1, "Departamento 1", "Cidade A", "terminado", "Endereço 1", "2022-01-01", "2022-12-31", "2022-12-31", 20, 8);

        // Verificando se o departamento é um arranha-céu
        String resultadoArranhaCeu = departamento.isArranhaCeu() ? "O departamento é um arranha-céu." : "O departamento não é um arranha-céu.";
        System.out.println(resultadoArranhaCeu);

        // Comparando o tamanho do departamento com outro departamento
        Departamento outroDepartamento = new Departamento(2, "Departamento 2", "Cidade B", "terminado", "Endereço 2", "2022-01-01", "2022-12-31", "2022-12-31", 15, 10);
        int comparacao = departamento.compararTamanho(outroDepartamento);
        String resultadoComparacao = (comparacao > 0) ? "O departamento atual é maior." : (comparacao < 0) ? "O outro departamento é maior." : "Os departamentos têm o mesmo tamanho.";
        System.out.println(resultadoComparacao);
    }
}
