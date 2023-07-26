import java.util.ArrayList;
import java.util.List;

public class Leilao {
    private double valor;
    private String descricao;
    private List<Licitante> licitantes;
    private List<Observer> observers;
    private Licitante vencedor;

    public Leilao(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
        this.licitantes = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        notificarLicitantes();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void registrarLicitante(Licitante licitante) {
        licitantes.add(licitante);
        observers.add(licitante);
    }

    public void removerLicitante(Licitante licitante) {
        licitantes.remove(licitante);
        observers.remove(licitante);
    }

    private void notificarLicitantes() {
        for (Observer observer : observers) {
            observer.atualizar(this);
        }
    }

    public Licitante getVencedor() {
        return vencedor;
    }

    public void setVencedor(Licitante vencedor) {
        this.vencedor = vencedor;
    }
}
