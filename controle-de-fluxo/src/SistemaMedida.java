public class SistemaMedida {
    public static void main(String[] args) {
        String tamanho = "M";

        switch (tamanho) {
            case "P":{
                System.out.println("\nPequeno\n");
                break;
            }
            case "M":{
                System.out.println("\nMédio\n");
                break;
            }
            case "G":{
                System.out.println("\nGrande\n");
                break;
            }
            default :
                System.out.println("\nIndefinido\n");

        }
        
    }
    
}
