import java.util.Scanner;

public class Alg1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        do {
            System.out.println("Digite um número inteiro entre 0 e 10: ");
            nota = teclado.nextInt();
            if (nota < 0 || nota > 10){
                System.out.println("Informe um valor válido");
            }
        } while (nota < 0 || nota > 10);
        

        teclado.close();
    }
}
