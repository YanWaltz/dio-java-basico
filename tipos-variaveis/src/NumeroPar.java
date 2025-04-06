public class NumeroPar {
    public static void main(String[] args) {
        int numero = 11;
        boolean resultado = ePar(numero); //Tipo variável Nome = Método();
        System.out.println(numero + " é par? " + resultado);
    }
 
    public static boolean ePar (int numero){
        return numero % 2 == 0;
    }

}
