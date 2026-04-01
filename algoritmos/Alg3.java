import java.util.Scanner;

public class Alg3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        int idade;
        double salario;
        char sex;
        char estadoCivil;
        
        System.out.println("Nome: ");
        nome = teclado.next();
        if (nome.length() < 3) {
            System.out.println("Idade: ");
            idade = teclado.nextInt();
            if (idade >= 0 || idade <= 150) {
                System.out.println("Salário: ");
                salario = teclado.nextDouble();
                if (salario > 0) {
                    System.out.println("Sexo: ");
                    sex = teclado.next().charAt(0);
                    if (sex != 'F' || sex != 'M') {
                      System.out.println("Estado civil: ");
                      estadoCivil = teclado.next().charAt(0);
                      if (estadoCivil != 'S' || estadoCivil != 'C' || estadoCivil != 'V' || estadoCivil != 'D'){
                        System.exit(0);
                      } else {
                        System.out.println("Estado civil inválido. Reinicie o programa e insira um valor válido como S, C, V ou D");
                      }
                    } else {
                      System.out.println("Sexo inválido. Reinicie o programa e insira F ou M");
                    }
                } else {
                    System.out.println("Salário inválido. Reinicie o programa e insira um valor maior do que zero.");
                }
            } else {
                System.out.println("Idade inválida. Reinicie o programa e insira uma idade entre 0 e 150.");
            }
        } else {
            System.out.println("Nome inválido. Reinicie o programa e insira um nome com 3 ou mais caractéres.");
        }
        
        
        teclado.close();
    }
}
