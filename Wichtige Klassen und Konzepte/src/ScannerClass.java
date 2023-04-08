import java.util.Scanner;

/**
 * Hier wird einmal die Klasse Scanner erklärt.
 * Scanner wird benutzt, um vom Benutzer in die Konsole eingegebenen Werte einzulesen.
 */
public class ScannerClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Scanner Objekt aufbauen

        System.out.println("Gib eine Zahl ein: ");  //Optionaler Text
        int zahl1 = scanner.nextInt();              // Nach optionalem Text wartet Konsole auf Benutzereingabe
                                                    // scanner.nextInt() liest diese Zahl ein (Eingegebene Zahl muss hier vom Typ int sein)
        System.out.println("Gib eine zweite Zahl ein: ");
        int zahl2 = scanner.nextInt();

        int ergebnis = zahl1 + zahl2;           // Diese eingelesenen Werte können wir jetzt für div. Berechnungen nutzen

        System.out.println("Ergebnis: " + ergebnis);

        /**
         * Es gibt außer nur nextInt() auch weitere identische Methoden, die aber keine ints, sondern andere primitive Datentypen einlesen:
         * nextLong()
         * nextByte()
         * nextDouble()
         */
    }



}
