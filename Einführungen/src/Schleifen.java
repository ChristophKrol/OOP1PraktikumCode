public class Schleifen {

    public static int inkrementiere(int eingabe, int x){
        for(int i=0; i< x; i++){
            eingabe ++;
        }
        return eingabe;
    }

    public static void zaehleHoch(int x){
        for(int i=0; i< x; i++){
            for (int j = 0; j <x ; j++) {
                System.out.println("i: " + i);
                System.out.println("j: " + j);
            }
        }
    }

    public static void primzahl(int n){
        int wurzel = (int) Math.sqrt(n);
        int teiler = 2;
        boolean istPrimzahl = true;

        while(teiler <= wurzel && istPrimzahl){     // 2 Bedingungen
            if (n % teiler == 0){
                istPrimzahl = false;
            }
            else{
                teiler++;
            }
        }
        System.out.println(n + " Primzahl: " + istPrimzahl);
    }

    public static void main(String[] args) {
        zaehleHoch(3);
        primzahl(1);


    }

}
