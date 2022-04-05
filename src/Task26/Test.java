package Task26;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        CashCard card1 = new CashCard("Goldman", 1111, 9000);
        CashCard card2 = new CashCard("Miranda", 1234, 100);
        CashCard card3 = new CashCard("Grey", 6969, 1000000);

        Set<CashCard> cashCards = new HashSet<CashCard>();
        cashCards.add(card1);
        cashCards.add(card2);
        cashCards.add(card3);

        new ATM(cashCards).run();
    }
}