public class ArraysAlunos {
    public static void main(String[] args) {
       
        String[] alunos = {"Paulo", "Igor", "Bruno", "Yan" };
            for(int x=0 ; x<alunos.length; x++){
                System.out.println("O nosso " + (x+1) + "º aluno é: " + alunos [x]);
            }
                System.out.println("\n");
                
            //Outra forma que aprendi é com o For/Each, irei fazer agora
            for(String aluno : alunos){
                System.out.println("O nome do aluno é " + aluno);
            }
    }
    
}
