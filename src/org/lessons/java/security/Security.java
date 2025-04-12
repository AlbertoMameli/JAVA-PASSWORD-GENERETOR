package org.lessons.java.security;

import java.util.Scanner;

public class Security {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome");
        String nome = input.nextLine();

        System.out.println("Inserisci in tuo cognome");
        String cognome = input.nextLine();

        nome = nome.substring(0, 1).toUpperCase() + nome.substring(1);
        cognome = cognome.substring(0, 1).toUpperCase() + cognome.substring(1);

        System.out.println("dimmi il tuo colore preferito");
        String colorePreferito = input.nextLine();
        colorePreferito = colorePreferito.toLowerCase();

        System.out.println("Inserisi il tuo giorno di nascita in valore numerico");
        int giornoNascita = input.nextInt();

        System.out.println("Inserisi il tuo mese di nascita in valore numerico");
        int meseNascita = input.nextInt();

        System.out.println("Inserisi il tuo anno di nascita in valore numerico");
        int annoNascita = input.nextInt();

        int sommaData = giornoNascita + meseNascita + annoNascita;

        // Generazione della password concatenando i dati
        String password = nome + "-" + cognome + "-" + colorePreferito + "-" + sommaData;

        // Output della password
        System.out.println("La tua password generata è: " + password);
      

        input.close();
    }
}
