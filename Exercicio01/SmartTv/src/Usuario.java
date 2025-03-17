public class Usuario {
    public static void main(String[] args) {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está ligada? " + smartTv.ligada);

        System.out.println("Qual o volume da tv? " + smartTv.volume);

        System.out.println("Qual canal a tv esta? " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.err.println("O volume foi aumentado para :> " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();

        System.err.println("O canal atual é: " + smartTv.canal);

        smartTv.alterarCanal(30);

        System.err.println("O canal atual é: " + smartTv.canal);
    }
}
