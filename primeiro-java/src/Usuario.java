public class Usuario{

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();   

        System.out.println("A tv esta ligada?" + smartTv.ligada);
        System.out.println("A tv esta em qual canal?" + smartTv.canal);
        System.out.println("A tv esta em qual volume?" + smartTv.volume);

        
        smartTv.ligar();
        System.out.println("Novo status?" + smartTv.ligada);

       smartTv.aumentarVolume();
       smartTv.aumentarVolume();
       smartTv.aumentarVolume();

       System.out.println(smartTv.volume);
        
    }

}