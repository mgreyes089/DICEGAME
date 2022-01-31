import java.util.Scanner;
public class calculatorif {

    public static void main(String[] args) {

        calculateAddition();
        calculateSubstraction();
        askForOperation();
    }


    private static void calculateSubstraction() {
        int num1=askForNumber();
        int num2=askForNumber();
        int result=substractTwoNumber(num1,num2);
        printResult(result);
    }

    private static void calculateAddition() {
        int num1=askForNumber();
        int num2=askForNumber();
        int result=addTwoNumber(num1,num2);
        printResult(result);
    }

    private static void printResult(int result) {
        System.out.println("Resultat: " + result);
    }

    private static int substractTwoNumber(int num1, int num2) {
        return num1 - num2;
    }

    private static int addTwoNumber(int num1, int num2) {
        return num1 + num2;}

    private static int askForNumber() {
        System.out.println("Número a operar:");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();}


    private static String askForOperation() {
        System.out.println("Escriba la operaciòn que desea hacer S para suma y A para resta");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();}






}
