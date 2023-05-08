package wypozyczalnia;

import java.util.Scanner;

public class Aplikacja {
    public static void main(String[] args) {

        WypozyczalniaSamochodow  wypozyczalniaSamochodow = new WypozyczalniaSamochodow();
        String operacja;


        do {
            operacja = odczytajParametr("operacje");
            if ("dodaj samochod".equalsIgnoreCase(operacja)) {
                dodajSamochod(wypozyczalniaSamochodow);
            } else if ("wyswietl samochody".equalsIgnoreCase(operacja)) {
                wypozyczalniaSamochodow.wyswietlWsztystkieSamochody();
            } else if ("wypozycz".equalsIgnoreCase(operacja)) {
                String identyfikator = odczytajParametr("identyfikator");
                wypozyczalniaSamochodow.wypozycz(identyfikator);
            } else if ("zwroc".equalsIgnoreCase(operacja)) {
                String identyfikator = odczytajParametr("identyfikator");
                wypozyczalniaSamochodow.zwroc(identyfikator);
            } else if ("wyswietl dostepne samochody".equalsIgnoreCase(operacja)) {
                wypozyczalniaSamochodow.wyswietlDostepneSamochody();
            } else if ("wyswietl liczbe dostepnych samochodow".equalsIgnoreCase(operacja)) {
                wypozyczalniaSamochodow.wyswietlLiczbeDostepnychSamochodow();
            }
            else if (!"wyjdz".equalsIgnoreCase(operacja)) {
                System.out.println("Nieznana operacja");
                            }

        } while (!"wyjdz".equalsIgnoreCase(operacja));


    }

    private static void dodajSamochod(WypozyczalniaSamochodow wypozyczalniaSamochodow) {
        String identyfikator = odczytajParametr("identyfikator");
        String marka = odczytajParametr("marke");
        String model = odczytajParametr("model");
        String rocznik = odczytajParametr("rocznik");
        Samochod samochod = new Samochod(identyfikator, marka, model, Integer.valueOf(rocznik));
        wypozyczalniaSamochodow.dodajSamochod(samochod);
    }

    private static String odczytajParametr(String nazwaParametru) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj " + nazwaParametru + ": ");
        String wartosc = scanner.nextLine();
        System.out.println("Wpisałes" + nazwaParametru + ": " + wartosc);

        return wartosc;
    }


    }

