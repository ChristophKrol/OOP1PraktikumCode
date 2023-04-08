package konto;

public class BankkontoTest {

    public static void main(String[] args) {
        Bankkonto konto1 = new Bankkonto("Julian", 1500);

        Bankkonto konto2 = new Bankkonto("Anne");

        Bankkonto.ueberweise(konto1, konto2, 100.50);

        System.out.println(konto1.geldbetrag);  // Attribut vom Objekt
        System.out.println(konto2.geldbetrag);  // Attribut vom Objekt
        System.out.println(Bankkonto.anzahlKonten); //Allg. Attribut der Klasse
        System.out.println(konto1.anzahlKonten);
        System.out.println(konto2.anzahlKonten);

    }
}
