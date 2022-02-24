package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Czytelnicy: ");
        runCzytelnicy();

        System.out.println("\nKsiążki: ");
        runKsiazki();
        /*
         * Zadania:
         * 1. Stworz wlasna klase Czytelnik (z atrybutami: imie oraz nazwisko).
         * 2. Otworz do zapisu kolejny plik (np. czytelnicy.txt).
         * 3. Zapisz do niego 2 obiekty klasy Czytelnik.
         * 4. Wypisz na ekran zawartosc pliku czytelnicy.txt.
         *
         */

    }

    public static void runCzytelnicy() throws IOException {
        Czytelnik c1 = new Czytelnik("Patryk", "Nowak");
        Czytelnik c2 = new Czytelnik("Robert", "Kowalski");

        FileWriter fw = new FileWriter("czytelnicy.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("-------\n");
        bw.write(c1.toString());
        bw.write("------\n");
        bw.write(c2.toString());

        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("czytelnicy.txt"));

        while (true) {
            String wiersz = br.readLine();
            if (wiersz == null) break;
            System.out.print(wiersz + "\n");
        }

        br.close();
    }


    public static void runKsiazki() throws IOException {
        Ksiazka k1 = new Ksiazka("Bruce Eckel", "Thinking in Java", 2006);
        Ksiazka k2 = new Ksiazka("Radoslaw Sokol", "ABC ochrony przed wirusami", 2004);

        FileWriter fw = new FileWriter("plik.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("-------\n");
        bw.write(k1.toString());
        bw.write("-------\n");
        bw.write("" + k2);

        bw.close();

        FileReader fr = new FileReader("plik.txt");
        BufferedReader br = new BufferedReader(fr);

        while (true) {
            String wiersz = br.readLine();
            if (wiersz == null) break;
            System.out.print(wiersz + "\n");
        }

        br.close();
    }
}

