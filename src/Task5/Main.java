package Task5;

public class Main {
    public static void main(String[] args) {
        MyMethod myMethod = new MyMethod();
        myMethod.Calculate(6.6, 7.2);
    }
}

class MyMethod {
    //Scanner firstVar=new Scanner(System.in);
    //Scanner secondVar=new Scanner(System.in);
    //int firstV= firstVar.nextInt();
    //int secondV= secondVar.nextInt();
    double Calculate(double firstV, double secondV) {
        double sum = (firstV + secondV) + (firstV * secondV);
        System.out.println("In result : " + sum);
        return sum;
    }
}