public class Main {
    public static void main(String[] args) {
        StrategyManager codificador = new StrategyManager();

        // Usando estratégia de codificação simples
        codificador.setStrategy(new CodificadorSimples());
        String codificadoSimples = codificador.codifica("abc");
        System.out.println("Codificado Simples: " + codificadoSimples);
        System.out.println("Decodificado Simples: " + codificador.decodifica(codificadoSimples));

        // Usando estratégia de deslocamento
        codificador.setStrategy(new CodificadorDesloca());
        String codificadoDesloca = codificador.codifica("hello");
        System.out.println("Codificado Desloca: " + codificadoDesloca);
        System.out.println("Decodificado Desloca: " + codificador.decodifica(codificadoDesloca));
    }
}
