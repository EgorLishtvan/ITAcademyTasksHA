package Task9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите вашу сумму: ");
        Scanner scanner=new Scanner(System.in);
        int count = scanner.nextInt();
        int x = count % 100;
        int y = count % 10;
        if (x == 1 || y == 1)
            System.out.println(count + " рубль");
     else if (5 > x && x > 1 || y > 1 && y < 5)
            System.out.println(count + " рубля");
      else if (20 > x && x > 10 || y > 5 && y < 10)
            System.out.println(count + " рублей");
}
}
