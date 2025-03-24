import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados {
    private List<Integer> lst;
    private List<Observer> observers;

    public FonteDeDados() {
        lst = new LinkedList<>();
        observers = new ArrayList<>();
    }

    public void add(Integer value) {
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        notifyObservers();
    }

    public int quantidade() {
        return lst.size();
    }

    public List<Integer> getValores() {
        return new ArrayList<>(lst);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(lst);
        }
    }
}