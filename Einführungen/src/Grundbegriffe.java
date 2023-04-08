public class Grundbegriffe {
// ############### Block-Anfang ################## // {
    public static int addiereZahlen(int a, int b){
    // ##### Sequenz-Anfang #### //
        int x = a; // ## Anweisung ## //
        int y = b;
        int sum = x + y;
        return sum;
    // #### Sequenz-Ende #### //
    }
// ############# Block-Ende ############# // }

    public static void istGeradeZahl(int x){
// ########## if-else Verzweigung - Anfang ########## //
        if ( x % 2 == 0 ){
            System.out.println(x + " ist eine gerade Zahl.");       // Bei definierten Bedingungen anwenden
        }
        else {
            System.out.println(x + " ist eine ungerade Zahl.");
        }
// ########## if-else Verzweigung - Ende ########## //
    }

    public static void printInt(int x){
// ########## Switch-Case Verzweigung - Anfang ########## //
        switch(x){
            case 1:
                System.out.println("EINS");
                break;
            case 2:
                System.out.println("ZWEI");         // Bei KONSTANTEN anwenden
                break;
            case 3:
                System.out.println("DREI");
                break;
            case 4:
                System.out.println("VIER");
                break;
            case 5:
                System.out.println("FÜNF");
                break;
            default:
                System.out.println(x);
                break;
        }
// ########## Switch-Case Verzweigung-Ende ########## //
    }

    public static void main(String[] args) {
        int newInt = addiereZahlen(1, 2);
        System.out.println(newInt);
        istGeradeZahl(newInt);
        printInt(newInt);
        printInt(10);

    }
}
