import java.util.Scanner;

public class Alg5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Simulador de taxa de natalidade entre 2 paC-ses!");
		
		System.out.println("Informe o tamanho da população A: ");
		double paisA = teclado.nextDouble;
		System.out.println("Informe a taxa de natalidade: ");
		double taxaA = teclado.nextDouble;
		
		System.out.println("Informe o tamanho da população B: ");
		double paisB = teclado.nextDouble;
		System.out.println("Informe a taxa de natalidade: ");
		double taxaB = teclado.nextDouble;
		
		for (int anos = 0; ; anos++) {
			double populacaoA = paisA * taxaA;
			double populacaoB = paisB * taxaB;
			paisA = paisA + populacaoA;
			paisB = paisB + populacaoB;
			if (paisA >= paisB) {
				anos = anos + 1;
				System.out.println("O país A vai se igualar ou passar o país B em " + anos + " anos");
				break;
			} else {
			    anos = anos + 1;
				System.out.println("O país B vai se igualar ou passar o país B em " + anos + " anos");
				break;
			}

		}
		
		teclado.close();

	}
}
