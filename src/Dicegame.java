import java.util.Random;
import java.util.Scanner;

public class Dicegame {

    public static void main(String[] args) {

        int diceValue1 = new Random().nextInt(1, 7);
        System.out.println("Dau1:" + diceValue1);

        int diceValue2 = new Random().nextInt(1, 7);
        System.out.println("Dau2:" + diceValue2);

        int result = diceValue1 + diceValue2;
        System.out.println("Suma: " + result);

        if (result == 7) {
            System.out.println("Has guanyat");

        } else {
            System.out.println("Has perdut ");

            System.out.println("Tornar el dau2? ");

            Scanner sc = new Scanner(System.in);
            String option= sc.nextLine();
            if(option.equals("S")){

                diceValue2 = new Random().nextInt(1, 7);
                result = diceValue1 + diceValue2;
                System.out.println("Suma: " + result);

                if (result == 7) {
                    System.out.println("Has guanyat");

                } else {
                    System.out.println("Has perdut ");}


            }


        }

        ////Si ha guanyat
        //només si ha perdut
        //
        //preguntar si vol tornar a tirar el dau 2

        //mostrem suma i si ha guanyat
        //
        //fin


    }

}
