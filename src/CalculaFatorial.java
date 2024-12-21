import java.util.Scanner;

public class CalculaFatorial {
    public static void main(String[] args) {
        Scanner entrarComDado = new Scanner(System.in);
        int fatorial = 0;

        System.out.println("Digite um número para calcular o seu fatorial: ");
        int numeroParaFatorial = entrarComDado.nextInt();
        int guardaNumeroFatorialDigitado = numeroParaFatorial;

        for (fatorial = 1; numeroParaFatorial > 1; numeroParaFatorial--) {
           fatorial = fatorial * numeroParaFatorial;
        }
        System.out.println(String.format("O fatorial de %d é %d", guardaNumeroFatorialDigitado, fatorial));
    }
}
