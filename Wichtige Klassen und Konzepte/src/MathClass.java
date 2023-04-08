/**
 * Hier werden hilfreiche Methoden für Berechnungen der Klasse Math erklärt.
 */

public class MathClass {
    public static void main(String[] args) {

        // Zufallszahlen

        double randomDouble = Math.random();        //Math.random() ist für die Generierung von Zufallszahlen verantwortlich
        System.out.println(randomDouble);           // Hier wird aber nur eine Kommazahl standardmäßig von 0 - 1 generiert

        // Wir wollen jetzt aber eine ganze Zahl von 5 - 10

        int randomInt = (int)((Math.random() * (10-5)) + 5);        //Formel: (int) ((Math.random() * (max - min)) + min)
        System.out.println(randomInt);

        /**
         * Mehr zu Zufallszahlen und anderen Methoden findet man unter:
         * https://www.baeldung.com/java-generating-random-numbers-in-range
         */


        // Potenzen
                    //int        // double
        int pow4 = (int) (Math.pow(10, 4)); // 10^4
        System.out.println(pow4);


        //Runden

        int round = (int) Math.round(4.1);
        System.out.println(round);
    }


}
