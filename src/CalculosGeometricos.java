import java.util.Scanner;

public class CalculosGeometricos {
    public static void main(String[] args) {
        Scanner entrarComDado = new Scanner(System.in);

        System.out.println("Digite 1 para calcular a área do quadrado ou 2 para calcular a área do círculo:");
        int opcaoUsuario = entrarComDado.nextInt();

        switch (opcaoUsuario){
            case 1:
                System.out.println("Calcule a área do quadrado");

                System.out.println("Informe o valor do lado A do quadrado:");
                double ladoADoQuadrado = entrarComDado.nextDouble();
                System.out.println("Informe o valor do lado B do quadrado:");
                double ladoBDoQuadrado = entrarComDado.nextDouble();

                double calculaAreaQuadrado = ladoADoQuadrado * ladoBDoQuadrado;

                System.out.println(String.format("A área do quadrado é: %.1f", calculaAreaQuadrado));
                break;
            case 2:
                System.out.println("Calcule a área do círculo");

                System.out.println("Informe o valor do raio do círculo:");
                double raioDoCirculo = entrarComDado.nextDouble();
                double calculaAreaCirculo = Math.PI*(Math.pow(raioDoCirculo, 2));

                System.out.println(String.format("A área do círculo é: %.1f", calculaAreaCirculo));
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
