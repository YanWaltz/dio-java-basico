import java.util.concurrent.ThreadLocalRandom;

public class WhileMesada {
    public static void main(String[] args) {
        double mesada = 50.0;
       
        while(mesada>0){
            double valorDoce = valorAleatorio();
            if(valorDoce>mesada)
                valorDoce = mesada;
                
            System.out.println("O doce que custa " + valorDoce + " foi adicionado ao carrinho.");
            mesada = mesada - valorDoce;
        }
        System.out.println("\nValor da mesada atual: " + mesada);
        System.out.println("Não sobrou nada da mesada, mas sobraram muitos doces\n");
    }
        
    private static double valorAleatorio(){
         return ThreadLocalRandom.current().nextDouble(2,15);
    }

}
