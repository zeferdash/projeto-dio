public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status - Tv ligada? " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status - Tv ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();

        smartTv.abaixarVolume();

        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(27);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
