package edu.saulo.tiposevariaveis;
import  java.util.Date;

public class TiposEVariaveis {

    public static void tiposNumericos(){
        byte varByte = 2;  // Tipo primitivo que vai de -128 a 127, ocupa 1 byte de memória.
        short varShort = 5; // Tipo primitivo que vai de -32.768 para 32.765, ocupa 2 bytes de memória;
        int varInt = 124; // Tipo primitivo que vai de 0-2.147.483.648 até 2...., ocupa 4 bytes
        long varLong = 12312321; // Tipo primitivo que vai de -9.223.372.036.854.775.808 até o positivo. Ocupa 8 bytes
    }

    public static void tiposFracionarios(){
        float varFloat = 1.32f; // Tipo primitivo que ocupa 4 bytes.
        double varDouble = 1.32; //tipo primitivo que ocupa 8 bytes. É o mais utilizado

    }

    public static void declaracaDeConstantes(){
        final double VALOR_DE_PI = 3.14; // Variável constante em caixa alta e precisa da expressão final no inico
    }

    public static void textos(){
        String meuTexto = "Teste de testo"; // No caso de strings, o java usa a CLASSE String.

    }

    public static void outroTipos(){
        char sexo = 'M';
        boolean doadorOrgao = true;
        Date dataNascimento = new Date();
    }

     public static void main(String[] args) throws Exception { int numero1 = 1; String numero2 = "2"; System.out.println(numero1+numero2); }
    
}