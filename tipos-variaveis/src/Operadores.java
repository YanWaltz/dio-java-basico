import java.util.Scanner;

public class Operadores{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do 1º número: ");
            int a = scanner.nextInt();
        System.out.println("Digite o valor do 2º número: ");
            int b = scanner.nextInt();

        int resultado  = somar(a, b); //Invoco o método
            System.out.println("O resultado da soma dos números é: " + resultado + "\n");
            
        scanner.close();
    }

    public static int somar (int a, int b){ //Criação do método,ele é int por que ele retorna valores inteiros
        return a + b;
    }

}

