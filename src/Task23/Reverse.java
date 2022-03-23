package Task23;

import java.util.Scanner;

public class Reverse {
    public void execute() {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] mass = new int[N];
        for (int i = 1; i < N; i++) {
            mass[i] = (int) ((Math.random() * 130) - 0);
        }
        for (int i = 1; i < N; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = N - 1; i >= 1; i--) {
            System.out.print(mass[i] + " ");
        }

    }

}
