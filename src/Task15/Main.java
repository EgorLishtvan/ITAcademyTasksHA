package Task15;


public class Main {
    public static void main(String[] args) {
        long number = 7893823445L;
        Calculate calculate = new Calculate();
        long result = calculate.sumD2(number);
        System.out.println("Искомая сумма равна " + result);
    }
}