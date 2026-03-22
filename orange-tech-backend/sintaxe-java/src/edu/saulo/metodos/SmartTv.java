package edu.saulo.metodos;

public class SmartTv {
    int canal = 0;
    int volume = 0;
    boolean estado;

    public boolean ligar(){
        estado = true;
        return  estado;
    }

    public boolean desligar(){
        estado = false;
        return  estado;
    }

    public int aumentarVolume(){
        volume = volume + 1;
        return  volume;
    }
    
    public int diminuirVolume(){
        volume = volume - 1;
        return  volume;
    } 

    public int subirCanal(){
        canal = canal + 1;
        return  canal;
    }

    public int diminuirCanal(){
        canal = canal - 1;
        return  canal;
    }
}
