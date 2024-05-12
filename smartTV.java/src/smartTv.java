public class smartTv {
    int canal = 1;
        int volume = 25;
        boolean ligada=false;

        public void mudarcanal(int novoCanal){
            canal= novoCanal;
        }
        
        
        public void aumentarCanal(){
           canal++;
        }
        public void diminuirCanal(){
            canal--;
         }

        public void aumentarVolume() {
            volume++;
            System.out.println("Aumentando o volume Para " + volume);
        }
    
        public void diminuirVolume() {
            System.out.println("Dimuindo  o volume Para " + volume);
            volume--;
        }
    
 
        public void ligar(){
            ligada=true;
        }
        public void desligar(){
            ligada=false;
        }
    
}
