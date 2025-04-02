public class Contagem {
    public static void main(String[] args) {
        
        for (int carneirinhos = 2; carneirinhos<=50; carneirinhos++) {
            if(carneirinhos == 10 || carneirinhos == 20 || carneirinhos == 30)
                continue; //faz com que os números 10,20,30 não sejam impressos
            System.out.println("Tem " +carneirinhos + " carneirinhos");
        }

            System.out.println("\nOu seja, tem carneirinho pra caraca\n");
   
     }
    
}
//Praticando o uso do "continue" para ocultar alguns numeros