package Task11;

import java.util.Scanner;

public class Square {


    public void IsPlaceEnough() {
        System.out.println("Please inter var. A: ");
        Scanner scanner = new Scanner(System.in);
        int aVar = scanner.nextInt();
        System.out.println("Please inter var. B: ");
        int bVar = scanner.nextInt();
        System.out.println("Please inter var. C: ");
        int cVar = scanner.nextInt();
        System.out.println("Please inter var. D: ");
        int dVar = scanner.nextInt();
        int eVar = 6;
        int fVar = 4;
        if (aVar + cVar <= eVar & (bVar < fVar | dVar < fVar)) {
            System.out.println("Houses are placed.");
        } else {
            System.out.println("Houses aren't placed");
        }
    }
}
