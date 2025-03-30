public class Usuario {
    public static void main (String [] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        //Status TV
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar ();
            System.out.println("TV ligada? " + smartTv.ligada);
            //a TV é ligada

        smartTv.diminuirVolume ();
        smartTv.diminuirVolume ();
        smartTv.diminuirVolume ();
            System.out.println("Volume atual: " + smartTv.volume);
            //Diminui o volume e confirma o volume atual

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
            System.out.println("Canal atual: " + smartTv.canal);
        smartTv.escolherCanal(13);
            System.out.println("Canal atual: " + smartTv.canal);
        //sobe de canal 2x e em seguida escolhe um canal específico

        smartTv.desligar(); //FIM
    }
  
}
