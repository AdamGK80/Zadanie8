package com.company;

public class Czytelnik {
    //1. Stworz wlasna klase Czytelnik (z atrybutami: imie oraz nazwisko).
    String imie, nazwisko;

    public Czytelnik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String toString() {
        String wynik = "Imie: " + imie + "\n";
        wynik += "Nazwisko: " + nazwisko + "\n";
        return wynik;
    }
}
