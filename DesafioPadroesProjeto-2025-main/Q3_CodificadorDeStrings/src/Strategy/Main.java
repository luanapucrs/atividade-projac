public class Main {
    public static void main(String[] args) {
        StrategyManager codificador = new StrategyManager();

        // Usando estratégia de codificação simples
        codificador.setStrategy(new CodificadorSimples());
        String codificadoSimples = codificado.codificar("abc");
        System.out.println("Codificado Simples: " + this.codificadoSimples);
        System.out.println("Decodificado Simples: " + codificador.decodifica(this.codificadoSimples));

        // Usando estratégia de deslocamento
        codificador.setStrategy(new CodificadorDesloca());
        String codificadoDesloca = codificado.codificar("hello");
        System.out.println("Codificado Desloca: " + this.codificadoDesloca);
        System.out.println("Decodificado Desloca: " + codificador.decodifica(this.codificadoDesloca));
    }
}
