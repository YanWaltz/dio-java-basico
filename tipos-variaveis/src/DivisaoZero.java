import java.util.Scanner;

public class DivisaoZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       
        System.out.println("Digite o valor do 1º número: ");
        int a = scanner.nextInt();
        System.out.println("Digite o valor do 2º número: ");
        int b = scanner.nextInt();
        
        int resultado = dividir (a, b);
        System.out.println("o resultado é igual a: " + resultado);

    scanner.close();
    }

   public static int dividir (int a, int b) {
    try{return a/b;
    }catch (ArithmeticException e){
    System.out.println("\nDivisão por zero não é permitido.\n");    
    return 0;
    }

    }

}


