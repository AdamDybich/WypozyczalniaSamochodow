package wypozyczalnia;

import java.util.HashMap;

public class WypozyczalniaSamochodow {
    private HashMap<String, Samochod> samochody = new HashMap<>();
    public void dodajSamochod(Samochod samochod) {
        samochody.put(samochod.getIdentyfikator(), samochod);
    }
    public void wyswietlWsztystkieSamochody() {
        System.out.println("Wszystkie samochody:");
        for (Samochod samochod : samochody.values()) {
            System.out.println(samochod);
        }
    }

    public void wyswietlDostepneSamochody() {
        System.out.println("Dostepne samochody:");
        for (Samochod samochod : samochody.values()) {
            if (!samochod.isWypozyczony()) {
                System.out.println(samochod);
            }
        }

    }
    public void wyswietlLiczbeDostepnychSamochodow() {
        long liczbaDostepnychSamochodow = samochody.values().stream()
                .filter(samochod -> !samochod.isWypozyczony())
                .count();
        System.out.println("Liczba dostepnych samochodow: " + liczbaDostepnychSamochodow);
    }

    public void wypozycz(String identyfikator) {
        samochody.get(identyfikator).setWypozyczony(true);
        System.out.println("Wypozyczono samochod: " + identyfikator);
        }

        public void zwroc(String identyfikator) {
        samochody.get(identyfikator).setWypozyczony(false);
        System.out.println("Zwrocono samochod " + identyfikator);
    }
}
