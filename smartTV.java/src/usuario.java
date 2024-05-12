public class usuario {
    public static void main(String[] args) throws Exception {
        smartTv smartTv = new smartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
       
        System.out.println("canal Atual : " + smartTv.canal);
        
        smartTv.mudarcanal(13);
        
        System.out.println("canal Atual : " + smartTv.canal);


        System.out.println("Volume atual : " + smartTv.volume);




        System.out.println("Tv Ligada ? " + smartTv.ligada);
        System.out.println("canal Atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);
        
      
        smartTv.ligar ();
        System.out.println("novo Status -> Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("novo Status -> Tv Ligada ? " + smartTv.ligada);
    }
    }



