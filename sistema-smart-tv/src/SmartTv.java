public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 15;

        //Ligar && desligar TV
        public void ligar(){
            ligada = true;
        }
        public void desligar(){
            ligada = false;
        }

        //Aumentar && diminuir volume
        public void aumentarVolume(){
            volume++;
                System.out.println("Aumentando volume para: " + volume);
        }
        public void diminuirVolume(){
            volume--;
                System.out.println("Diminuindo volume para: " + volume);
        }

        //Trocar de canal +||-
        public void aumentarCanal(){
            canal++;    
        }
        public void DiminuirCanal(){
            canal--;    
        }
        public void escolherCanal(int novoCanal){
            canal = novoCanal;
        }
     
}
