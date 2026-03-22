package edu.saulo.terminaleargumentos;

public class AboutMe {
    public static void main(String[] args) {
        // O parâmetro String[] passa um array de strings como argumentos, para criação de argumentos dinâmicos
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]); // Como o array é de strings o Integer.valueOf vai fazer a leitura
        double altura = Double.parseDouble(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Eu tenho " + idade + "anos");
        System.out.println("Minha altura é " + altura + "metros");

    }
}
