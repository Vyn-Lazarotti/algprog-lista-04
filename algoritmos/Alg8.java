import java.util.Scanner;

public class Alg3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa aceita apenas números inteiros");

        System.out.println("Insira o primeiro número: ");
        int primeiroNumero = teclado.nextInt();
        System.out.println("Insira o segundo número: ");
        int segundoNumero = teclado.nextInt();
        System.out.println("Insira o terceiro número: ");
        int terceiroNumero = teclado.nextInt();
        System.out.println("Insira o quarto número: ");
        int quartoNumero = teclado.nextInt();
        System.out.println("Insira o quinto número: ");
        int quintoNumero = teclado.nextInt();

        int soma = primeiroNumero + segundoNumero  + terceiroNumero + quartoNumero + quintoNumero;
        int media = (primeiroNumero + segundoNumero  + terceiroNumero + quartoNumero + quintoNumero) / 5;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
      
        teclado.close();
    }
}
