package auto;



public class AutoTest {

    public static void main(String[] args) {

        Auto auto = new Auto("Mercedes");

        for (int i = 0; i < 100; i ++){
            auto.fahren();
        }
        System.out.println(auto.getKilometerStand());


        System.out.println(auto.toString());

    }
}
