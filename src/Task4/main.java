package Task4;

import static java.lang.Math.pow;

public class main {

    public static void main(String[] args) {
        byte b = 0 * 55;
        short s = 32767;
        int i = 1000000;
        long l = (long) pow(2, 63);
        char c = 'a';
        float f = 025f;
        double d = 0.00001234;
        boolean bool = true;

        System.out.println("byte b = " + b + "\n" + "short s = " + s + "\n" + " int i = " + i + "\n"
                + "long l =" + l + "\n" + "char c = " + c + "\n" + "float f =" + f + "\n" + "double d =" + d + "\n" + "boolean bool =" + bool + "\n");
    }
}