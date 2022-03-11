package Task14;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.calc();
    }

}

class Calculate {
    public void calc() {
        int i = 1;
        int product = 0;
        do {
            product += i;
            i++;
        }
        while (i <= 25);
        System.out.println(product);

    }
}