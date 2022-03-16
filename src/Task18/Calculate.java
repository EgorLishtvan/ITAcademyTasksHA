package Task18;

import java.text.DecimalFormat;
import java.util.Scanner;

class Calculate{
    public void toBushFormat() {
        Scanner scanner = new Scanner(System.in);
        long var = scanner.nextLong();
        System.out.println(new DecimalFormat("###,###,###,###,###,###").format(var));
    }
}
