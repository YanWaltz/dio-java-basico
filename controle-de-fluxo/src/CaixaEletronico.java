import java.util.Scanner;
public class CaixaEletronico {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 25.00;
        System.out.println("Quanto você deseja sacar: ");
        int valorSolicitado = scanner.nextInt();

        if(saldo > valorSolicitado){ //Poderia ter colocado ">=" e tirar o else if da linha 13 para o código ficar mais limpo, porém decidi fazer assim nesse exercício somente para praticar as 3 estruturas condicionais 
            saldo = saldo - valorSolicitado;
                System.out.println("\nSaldo atual: " + saldo);
        }else if (saldo == valorSolicitado){
                System.out.println("\nSeu saldo agora é: 00.00");
        }else{
                System.out.println("\nSaldo insuficiente!");}
   
    }
}