import java.util.Scanner;

public class Alg10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digite um número inteiro: ");
    int x = teclado.nextInt();
    System.out.println("Digite outro número inteiro: ");
    int y = teclado.nextInt();
    
    //System.out.println("Números entre eles:");

    for (int i = x; i <= y; i++) {
      System.out.println(i);
    }

    teclado.close();
  }

}
