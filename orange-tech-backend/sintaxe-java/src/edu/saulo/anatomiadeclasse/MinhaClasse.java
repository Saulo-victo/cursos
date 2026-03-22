package edu.saulo.anatomiadeclasse;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.print("Olá mundo!");
        String primeiroNome = "Saulo";
        String segundoNome = "Victo Soares";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);

        
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        String nomeFormatado = primeiroNome.concat(" ").concat(segundoNome);
        return nomeFormatado;
    }
}   