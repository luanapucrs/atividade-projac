import java.util.List;

public class VisualizadorDeSomatorio implements Observer {
    @Override
    public void update(List<Integer> valores) {
        Integer soma = valores.stream()
            .mapToInt(Integer::intValue)
            .sum();
        System.out.println("Somatorio: " + soma + ", quantidade de elementos analisados: " + valores.size());
    }
}