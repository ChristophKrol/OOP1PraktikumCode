package konto;

public class Bankkonto {

    static int anzahlKonten;
    double geldbetrag;
    String besitzer;

    public Bankkonto(String besitzer) {
        Bankkonto.anzahlKonten ++;   // optional nur: anzahlKonten ++;
        this.besitzer = besitzer;
    }

    public Bankkonto(String besitzer, double geldbetrag) {
        Bankkonto.anzahlKonten ++;
        this.besitzer = besitzer;
        this.geldbetrag = geldbetrag;

    }


    public void einzahlen(double betrag){
        this.geldbetrag = betrag;
    }

    public double auszahlen(double betrag){
        if (betrag > this.geldbetrag){
            System.out.println("Betrag zu groß!");
            return 0;
        }
        else {
            this.geldbetrag =- betrag;
            return betrag;
        }
    }

    public static void ueberweise(Bankkonto absender, Bankkonto empfaenger, double betrag){
        if (betrag > absender.geldbetrag){
            System.out.println("Betrag zu hoch!");
        }
        else{
            absender.geldbetrag -= betrag;
            empfaenger.geldbetrag += betrag;
        }

    }

    //toString()-Methode Programmieren
}
