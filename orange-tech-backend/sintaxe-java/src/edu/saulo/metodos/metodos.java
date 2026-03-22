package edu.saulo.metodos;

public class metodos {
    // Exemplo de claração de método:
    public int somar (int num1, int num2){
        int resultado = num1 + num2;
        return  resultado;      

    }

    public void imprimir(String texto){
        // O void não precisa de return
        System.out.println(texto);
    }

    public double dividir(int dividendo, int divisor) throws Exception{
        // O throws exception indica que possivelmente o método enfrentará uma exceção
        double resultado = dividendo / divisor;
        return  resultado;
    }
}
