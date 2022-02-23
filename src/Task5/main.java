package Task5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
myMethod myMethod=new myMethod();
        myMethod.calculate();
    }
}
class myMethod{
    Scanner firstVar=new Scanner(System.in);
       Scanner secondVar=new Scanner(System.in);
     int firstV= firstVar.nextInt();
    int secondV= secondVar.nextInt();
    int calculate(){
int sum=(firstV+secondV)+(firstV*secondV);
        System.out.println("In result : "+sum);
        return sum;
    }
}