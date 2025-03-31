import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String [] arg){
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

            
    }
    
}
