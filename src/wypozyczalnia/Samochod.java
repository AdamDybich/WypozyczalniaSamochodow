package wypozyczalnia;

public class Samochod {
    private String identyfikator;
    private String marka;
    private String model;
    private int rocznik;
    private boolean wypozyczony = false;

    public Samochod(String identyfikator, String marka, String model, int rocznik) {
        this.identyfikator = identyfikator;
        this.marka = marka;
        this.model = model;
        this.rocznik = rocznik;
    }

    public String getIdentyfikator() {
        return identyfikator;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getRocznik() {
        return rocznik;
    }

    public boolean isWypozyczony() {
        return wypozyczony;
    }

    public void setWypozyczony(boolean wypozyczony) {
        this.wypozyczony = wypozyczony;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "identyfikator='" + identyfikator + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rocznik=" + rocznik +
                ", wypozyczony=" + wypozyczony +
                '}';
    }
}
