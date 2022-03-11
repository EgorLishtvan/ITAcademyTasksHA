package Task13;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int factorial;
        if (num >= 0 && num <= 10) {
            int i = 1;
            factorial = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of "+num+ " = "+factorial);
        } else {
            System.out.println("Please inter var only 0 to 10");
        }
    }
}