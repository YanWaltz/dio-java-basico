public class BalancoTrimestral {
    public static void main(String[] args) {
        
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro+gastosFevereiro+gastosMarco;
        int mediaMensal = ((gastosJaneiro+gastosFevereiro+gastosMarco)/3);

        System.out.println("\nO total gasto no trimestre foi de R$" + gastosTrimestre);
        System.out.println("O valor da média mensal foi R$" + mediaMensal + "\n");

    }
}
