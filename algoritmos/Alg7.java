import java.util.Arrays; 
import java.util.Scanner; 
 
public class Alg7 { 
	public static void main(String[] args) { 
 		Scanner teclado = new Scanner(System.in); 
 		int[] x = new int[5]; 
 		int num = 0, i = 0; 
 		
 		System.out.println("Este programa aceita apenas números inteiros!");
 
 		for (i = 0; i < x.length; i++) { 
 			System.out.print("Digite um número: "); 
 			x[i] = teclado.nextInt(); 
 		} 
 
 		for (i = 0; i < x.length; i++) { 
 			num += x[i]; 
 		} 
 
 		System.out.println("O maior número dentre os 5 digitados é " + Arrays.stream(x).max().getAsInt()); 
 		
 		teclado.close();
 	} 
} 
