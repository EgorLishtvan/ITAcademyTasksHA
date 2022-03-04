package Task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 36;
        int b = 66;
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        if (a < (r * 2) && b < (r * 2)) {
            System.out.println("Круг с радиусом r= " + r + " полностью закроет отверстие.");
        } else {
            System.out.println("Радиус слишком мал.");
        }
    }
}