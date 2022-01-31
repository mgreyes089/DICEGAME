import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        int num1=askForNumber();
        int num2=askForNumber();
        int result=addTwoNumber(num1,num2);
        printResult(result);

    }

    private static void printResult(int result) {
        System.out.println("Resultat: " + result);
    }

    private static int addTwoNumber(int num1, int num2) {
        return num1 + num2;
    }

    private static int askForNumber() {
        System.out.println("Número a operar:");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();}
}
