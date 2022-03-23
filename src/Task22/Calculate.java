package Task22;

public class Calculate {
    public void execute() {
        int z = 0;
        int size = 15;
        int a[] = new int[size];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) ((Math.random() * 110) - 10);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                indexMax = i;
            }
            if (a[i] < min) {
                min = a[i];
                indexMin = i;
            }
        }
        System.out.println(min + " " + max);

        if (min < max) {
            for (int i = indexMin + 1; i < indexMax; i++)
                z += a[i];
        } else if (min > max) {
            for (int i = indexMax + 1; i < indexMin; i++)
                z += a[i];
        }
        System.out.println(z);
    }
}