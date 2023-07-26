public interface Notificacao {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notificaObserver();
}
