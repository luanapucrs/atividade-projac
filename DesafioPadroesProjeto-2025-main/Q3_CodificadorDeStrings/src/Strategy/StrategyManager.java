public class StrategyManager {
    public ICodificadorStrategy strategy;

    public void setStrategy(ICodificadorStrategy strategy) {
        this.strategy = strategy;
    }

    public String codifica(String str) {
        return strategy != null ? strategy.codifica(str) : str;
    }

    public String decodifica(String str) {
        return strategy != null ? strategy.decodifica(str) : str;
    }
}
