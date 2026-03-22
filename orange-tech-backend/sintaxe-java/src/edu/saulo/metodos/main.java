package edu.saulo.metodos;

public class main {

    public static void main(String[] args) {
        SmartTv tv = new SmartTv();

        System.out.print(tv.volume);
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        System.out.print(tv.volume);

        System.out.print(tv.estado);
        tv.ligar();
        System.out.print(tv.estado);




    }
    
}
