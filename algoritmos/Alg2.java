import java.util.Scanner;

public class Alg2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String user;
        String senha; 
        do {
            System.out.println("Nome de usuário: ");
            user = teclado.next();
            System.out.println("Digite uma senha (apenas letras): ");
            senha = teclado.next();
            
            if (user.equalsIgnoreCase(senha)) {
                System.out.println("A senha não pode ser igual ao nome de usuário");
            } 
            
        } while(user.equalsIgnoreCase(senha));
        

        teclado.close();
    }
}
