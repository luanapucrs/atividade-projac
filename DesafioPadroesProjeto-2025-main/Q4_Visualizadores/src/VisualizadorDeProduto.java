import java.util.List;

public class VisualizadorDeProduto implements Observer {
    @Override
    public void update(List<Integer> valores) {
        int produto = valores.stream()
            .reduce(1, (a, b) -> a * b);
        System.out.println("Produto: " + produto + ", quantidade de elementos analisados: " + valores.size());
    }
}