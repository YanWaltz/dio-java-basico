

public class Operadores{

public static void main(String [] args) {

boolean terraPlana = false;
boolean terraGeoide = true;

    if(terraGeoide && terraPlana){
        System.out.println("As condições são verdadeiras");}
    else{
        System.out.println("Uma das condições ou as duas estão erradas");}
    
    if(terraGeoide || terraPlana){
        System.out.println("Umas das condições é verdadeira");}
        
}
}
