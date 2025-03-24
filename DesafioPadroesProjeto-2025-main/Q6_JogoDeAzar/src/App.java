public class App {
    public static void main(String[] args) {
        DadoDecorator d6 = new DadoDecorator(6);
        DadoDecorator d20 = new DadoDecorator(20);

        d6.rolar();
        d20.rolar();
        d6.rolar();
        d20.rolar();

        System.out.println("D6: " + d6.getValor());
        System.out.println("D20: " + d20.getValor());

        System.out.println("Histórico D6: " + d6.getHistorico());
        System.out.println("Histórico D20: " + d20.getHistorico());
    }
}