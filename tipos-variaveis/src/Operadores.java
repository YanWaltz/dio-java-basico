

public class Operadores{

public static void main(String [] args) {
    int numero1 = 2;
    int numero2 = 0;
    
    if(numero1++ == 2 && numero2 ++ != 2 )
        System.out.println("As 2 condições são verdadeiras");
    
    System.out.println("O numero 1 agora é " + numero1);
    System.out.println("O numero 2 agora é " + numero2);
}
}
