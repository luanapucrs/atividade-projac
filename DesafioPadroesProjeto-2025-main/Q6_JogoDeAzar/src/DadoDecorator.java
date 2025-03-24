import java.util.ArrayList;
import java.util.List;

public class DadoDecorator extends Dado {
    private List<Integer> historico;

    public DadoDecorator(int lados) {
        super(lados);
        historico = new ArrayList<>();
    }

    @Override
    public void rolar() {
        super.rolar();
        historico.add(super.getValor());
    }

    public List<Integer> getHistorico() {
        return historico;
    }
}