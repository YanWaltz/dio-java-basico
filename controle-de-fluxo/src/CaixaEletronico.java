import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 25.00;

        System.out.print("Saldo atual: " + saldo + "\nQuanto você deseja sacar: ");
        double valorSolicitado = scanner.nextDouble();

        if(valorSolicitado<=0){
            System.out.println("\nValor inválido, o valor precisa ser maior que zero.\n");
        }
        else if(saldo >= valorSolicitado){ 
            saldo = saldo - valorSolicitado;
                System.out.println("\nSaque efetuado com sucesso!");
                System.out.println("Saldo atual: " + saldo + "\n");
        }else{
                System.out.println("\nSaldo insuficiente!\n");
       }
    }
}