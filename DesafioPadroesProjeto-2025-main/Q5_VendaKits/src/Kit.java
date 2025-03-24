import java.util.Arrays;
import java.util.List;

public class Kit extends Produto {
    private List<Produto> children;

    public Kit(int id, String nome, Produto... produtos) {
        super(id, nome, 0);

    }

    public void add(Produto produto) {
        children.add(produto);
    }

    public void add(Produto... produtos) {
        children.addAll(Arrays.asList(produtos));
    }

    public void remove(Produto produto) {
        children.remove(produto);
    }

    public void remove(Produto... produtos) {
        children.removeAll(Arrays.asList(produtos));
    }

    public void clear() {
        children.clear();
    }

    public double getPreco() {
        double total = 0;
        for (Produto produto : children) {
            total += produto.getPreco();
        } 
        return total * 0.9;
    }
}
