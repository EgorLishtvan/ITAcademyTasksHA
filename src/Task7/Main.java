package Task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean bol;
        Scanner var=new Scanner(System.in);
      double variable=  var.nextDouble();
        variable %= 10;
        if (variable==7){
            bol=true;
        }
        else {
            bol=false;
        }
        System.out.println("Последняя чифра числа семерка ? "+bol);
    }
}
