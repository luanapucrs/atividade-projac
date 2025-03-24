import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();
        var vm = new VisualizadorDeMedia();
        var vs = new VisualizadorDeSomatorio();
        var vp = new VisualizadorDeProduto(); // Novo visualizador

        Scanner s = new Scanner(System.in);
        int valor = 0;

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("-1 = Ligar Visualizador de Somatório");
            System.out.println("-2 = Ligar Visualizador de Média");
            System.out.println("-3 = Ligar Visualizador de Produto");
            System.out.println("0 = Sair");
            System.out.println("Ou entre um valor positivo maior que zero:");

            valor = Integer.parseInt(s.nextLine());
            if (valor == 0) {
                break;
            } else if (valor == -1) {
                dados.addObserver(vs);
                System.out.println("Visualizador de Somatório ligado.");
            } else if (valor == -2) {
                dados.addObserver(vm);
                System.out.println("Visualizador de Média ligado.");
            } else if (valor == -3) {
                dados.addObserver(vp);
                System.out.println("Visualizador de Produto ligado.");
            } else if (valor > 0) {
                dados.add(valor);
            }
        }
        System.out.println("Fim");
    }
}