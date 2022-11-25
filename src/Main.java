import java.util.Scanner;

public class Main {
    public static void checkEvenOdd() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER - ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " IS EVEN.");
        } else {
            System.out.println(number + " IS ODD.");
        }
    }

    public static void getFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER - ");
        int number = sc.nextInt();
        int fact = 1;
        for (int i = 1; i < number; i++) {
            fact *= i;
        }
        System.out.println("FACTORIAL OF " + number + " IS " + fact);
    }

    public static void main(String[] args) {
        checkEvenOdd();
        getFactorial();

    }
}