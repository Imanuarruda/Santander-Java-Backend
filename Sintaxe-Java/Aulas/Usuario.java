public class Usuario {
    public static void main(String[] args) throws Exception {

        // chamar a classe e criar uma variavel ao chamar
        SmartTv smartTv = new SmartTv();

        //mostrar o estado atual dos atributos
        System.out.println("Canal atual " + smartTv.canal);
        System.out.println("Volume atual " + smartTv.volume);
        System.out.println("Canal atual: " + smartTv.canal);

        // chamando o método
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(13);

        //mostrando atualizações
        System.out.println("Canal atual " + smartTv.canal);

    }
}
