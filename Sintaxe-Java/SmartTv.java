import java.security.PublicKey;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
        System.out.println("A tv está ligada");
    }

    public void desligar(){
        ligada = false;
        System.out.println("A tv está desligada");
    }

    public void diminuirVaalume(){
        volume --;
        System.out.println("Diminuindo volume " + volume );
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando volume " + volume );
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

}