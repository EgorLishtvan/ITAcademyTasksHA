package Task12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday. I am Free");
                break;
            case 2:
                System.out.println("Tuesday. Meet my boss");
                break;
            case 3:
                System.out.println("Wednesday. Find a new job");
                break;
            case 4:
                System.out.println("Thursday. I am free");
                break;
            case 5:
                System.out.println("Friday. Go skiing");
                break;
            case 6:
                System.out.println("Saturday. Free day");
                break;
            case 7:
                System.out.println("Sunday. Free day");
                break;
            default:
                System.out.println("There is no such day");
        }
    }
}
