public class CalculoAluno {
    public static void main(String [] args){
        int nota = 4;
        //Ternário fazendo a função do Else if
        String resultado = nota>=7 ? "aprovado" : nota>5 && nota<7 ? "Recuperação" : "Reprovado";
                    System.out.println(resultado);
        
    }
    
}
