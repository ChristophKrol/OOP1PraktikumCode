import java.util.Scanner;

public class Fakultaet {
    Scanner scanner = new Scanner(System.in);


    public static int factorialIteration(int number){
        int fact = 1;
        for (int i = 1; i<= number; i++){
            fact = fact * i;
        }
        return fact;

    }

    public static int factorialRecursion(int number){
        if (number <= 1){
            return 1;
        }
        else {
            return (number * factorialRecursion(number - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(factorialIteration(3));

        System.out.println(factorialRecursion(4));


    }
}
