package Ab3;

import Ab3.Types.COLOR;
import Ab3.Types.VALUE;
import Ab3.Card;
import java.util.ArrayList;

public class CardDeck {
    ArrayList<ArrayList<Card>> deck = new ArrayList<>();

    CardDeck() {
        for (int enumeratorColor = 0; enumeratorColor < COLOR.values().length; enumeratorColor++) {
            ArrayList<Card> tmp = new ArrayList<>();
            for (int enumeratorValue = 0; enumeratorValue < VALUE.values().length; enumeratorValue++) {
                tmp.add(new Card(enumeratorColor, enumeratorValue));
            }
            deck.add(tmp);
        }
        // System.out.println("123");
    }

    public String toString() {
        String result = "";
        for (ArrayList<Card> itemArrayList : deck) {
            for (Card item2 : itemArrayList) {
                result += (item2.toString() + ", ");
            }
            result = result.substring(0, result.length() - 2);
            result += "\n\n";
        }
        return result;
    }
}
