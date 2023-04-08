/**
 * Hier werden Arrays erklärt.
 */
public class ArrayClass {

    public static void main(String[] args) {

        // Wir wollen mehrere Variablen eines Typs speichern. Eine Möglichkeit:

        String mitarbeiter1 = "Joffrey";
        String mitarbeiter2 = "Harry";
        String mitarbeiter3 = "Lena";       // keine gute Lösung, wenn diese Variablen alle irgendwie zusammengehören sollen
        String mitarbeiter4 = "Ronald";
        String mitarbeiter5 = "Kevin";
        String mitarbeiter6 = "Amelie";

        // Das wäre eine bessere Lösung:
                            //     [0]      [1]
        String [] mitarbeiter = {"Joffrey", "Harry", "Lena", "Ronald", "Kevin", "Amelie"};  // Wir erstellen ein Array mit den Mitarbeiternamen. Das ist eine Art, ein Array aufzubauen

        // Andere Art: Ein leeres Array aufbauen

        int [] zahlen = new int[5]; // new int[5] bedeutet, wir bauen uns ein leeres Array der Größe 5 auf -> [][][][][]

        /**
         * Arrays haben feste Größe, sie können im Nachhinein nicht größer oder kleiner werden
         * Ein Array besteht aus einzelnen Speicherzellen []
         * Auf diese Speicherzellen kann man zurückgreifen mithilfe von einem index  z.B. zahlen[0] -> Erste Speicherzelle, 0 ist ein index
         * Bei Arrays fängt man bei 0 an, zu zählen
         * Bsp new int[5]
         * [] [] [] [] []
         * |  |  |  |  |
         * 0  1  2  3  4        -> Indizes
         * Länge des Arrays zwar 5, aber letztes index ist 4
         * Länge kann man sich mit .length ausgeben lassen. Bsp mitarbeiter.length
         */

        zahlen[0] = 1;  // [1] [] [] [] []
        zahlen[zahlen.length-1] = 5; // [1] [] [] [] [5]  letzte Stelle
        // 5 - 1

        /**
         * Wichtig auch:
         * Arrays haben einen bestimmten Typen, Bsp. int-Array String-Array ...
         * Da dürfen dann auch nur Werte vom selben Typ sein
         */

        //String[] stringArray = {"Hallo", "123String", 1, 2.0}; // Das geht hier nicht, weil in einem String-Array ein int und ein double drin sind

        //Man kann mit for-Schleifen durch ein ganzes array iterieren

        // Eine Möglichkeit // zweite Möglichkeit: foreach Schleife

        for (int i = 0; i < mitarbeiter.length; i++){
            System.out.println(mitarbeiter[i]);

        }

        char[] chars = {'a', 'b', 'c'};




    }








}
