package edu.saulo.operadores;

public class operadores {

    public static void aritimeticos(){
        double soma = 2.5 + 3.2;
        int subtracao = 10 - 5;
        int multiplicacao = 9 * 3;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
    }

    public static void unarios(){
        String valPositivo = "+"; // operador que soma valores
        String valNegativo = "-"; // Operador que decrementa valores
        String valIncremento = "++"; // Operador que incrementa valores
        String valDecremento = "--"; // Operador que decrementa valores
        String logNegacao = "!"; // nega o valor de uma expressão booleana

    }

    public static void ternario(){
        // Estrutura geral: <Expressão Condicional> ? <Caso condição seja true> : <caso condição seja false>
        int a, b;

        a = 5;
        b = 10;

        String resultado = (a==b) ? "Verdadeiro" : "false";

    }

    public static void relacionais(){
        String varIgual = "=="; // Verifica a igualdade entre dois valores
        String varDiferente = "!="; // Verifica desigualdade entre dois valores
        String maiorQue = ">"; // verifica se um valor é maior que outro
        String maiorIgual = ">="; // Verifica se uma vairável é maior ou igual a outra

    }

    public static void logicos(){
        String varE = "E"; // A primeira E a segunda é verdadeira?
        String varOU = "ou"; // A primeira OU a segunda é verdadeira?
    }
}
