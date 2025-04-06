import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu saldo: ");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Digite o valor da sua primeira transação: ");
        double transacao1 = scanner.nextDouble();
        System.out.println("Digite o valor da sua segunda transação: ");
        double transacao2 = scanner.nextDouble();
        System.out.println("Digite o valor da sua terceira transação: ");
        double transacao3 = scanner.nextDouble();

        double saldoFinal = saldoInicial + transacao1 + transacao2 + transacao3;

        System.out.println("Seu saldo atual é: R$" + saldoFinal);

            if(saldoFinal<0){
                System.out.println("\nSeu saldo está negativado");
            }else if(saldoFinal<=500){
                System.out.println("\nSeu saldo está baixo");
            }else{
                System.out.println("\nSeu saldo está confortavel");
            }

        scanner.close();
    }
}
