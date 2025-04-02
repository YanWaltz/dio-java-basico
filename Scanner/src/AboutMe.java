import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String [] arg){
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("\nDigite seu nome: ");
            String nome = scanner.next();
            System.out.println("\nDigite seu sobrenome: ");
            String sobrenome = scanner.next();
            System.out.println("\nDigite a sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("\nDigite a sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("\nOla, eu me chamo " + nome + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("A minha altura é " + altura + " cm");
            scanner.close();
        }
        catch(InputMismatchException e){
            System.out.println("Idade e altura precisam ser númericos e estar no padrão americano.\nPor exemplo: idade 18 e altura 1.70");
        }
    }
    
}
