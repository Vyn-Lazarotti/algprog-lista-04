import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("A população de um país A é da ordem de 80 mil habitantes com uma taxa anual de crescimento de 3% e a população de B seja 200 mil habitantes com uma taxa de crescimento de 1.5%.");
        double paisA = 80000;
        double paisB = 200000;
        for (int anos = 0; ; anos++) {
            double populacaoA = paisA * 0.03;
            double populacaoB = paisB * 0.015;
            paisA = paisA + populacaoA;
            paisB = paisB + populacaoB;
            if (paisA >= paisB) {
                anos = anos + 1;
                System.out.println("O país A vai se igualar ou passar o país B em " + anos + " anos");
                break;
            }
        }
        
        
    }
}
