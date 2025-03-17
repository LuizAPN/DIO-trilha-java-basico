public class SmartTv {
    
    int volume = 0;
    int canal = 1;
    boolean ligada = false;

    public void ligar(){
        ligada = true;
    }
    
    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void desligar(){
        ligada = false;
    }
    public void alterarCanal(int novoCanal){
        canal = novoCanal;
    }

}

