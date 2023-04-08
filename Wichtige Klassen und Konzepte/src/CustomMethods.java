/**
 * Hier wird das Definieren eigener Methoden erklärt
 */

public class CustomMethods {
    String srtr = "Hallo";

    /* public -> optional */
    /* static -> nicht an Objekt gebunden (Objekte lernen wir später) */

                                    // ()
    public static void printConstant(){ //void -> Gibt keinen Bestimmten Wert/Objekt zurück, wird genutzt, um etwas z.B. im Hintergrund zu verändern
        System.out.println(Math.PI);
    }

    /*
    wfwf
    fwf
    wfw
     */


                                        //7           3
    public static void printIntRepeat(int input, int count){    //Methode mit Parametern (int input, int count)
        for (int i = 0; i < count; i++){
            System.out.println(input);
        }
    }


    /* Methode hat einen Rückgabewert (hier double) */
    public static double pythagoras(double a, double b){
        // a^2 + b^2 = c^2
        // um c zu bekommen muss man Wurzel(c^2) rechnen
        double aQuadrat = Math.pow(a, 2); // lokale Variable
        double bQuadrat = Math.pow(b, 2);
        double c = Math.sqrt(aQuadrat + bQuadrat);

        return c;                                            // bei einer Methode, die etwas zurückgeben soll,
                                                            // muss am Ende "return <Ausgabewert>" stehen.
                                                            // return muss dann einen Wert vom Typ der Methode ausgeben

    }


    public static void main(String[] args) {

        System.out.println(pythagoras(3, 5));
        //printIntRepeat(4, 10);
        printIntRepeat(7, 3);
        printConstant();


    }
}
