package Ab3;

import Ab3.Types.COLOR;
import Ab3.Types.VALUE;
import Ab3.Card;
import java.util.ArrayList;

public class CardDeck {
    ArrayList<ArrayList<Card>> deck = new ArrayList<>();
    CardDeck(){
        for (int enumeratorColor = 0; enumeratorColor < COLOR.values().length; enumeratorColor++) {
            ArrayList<Card> tmp = new ArrayList<>();
            for (int enumeratorValue = 0; enumeratorValue < VALUE.values().length; enumeratorValue++) {
                tmp.add(new Card(enumeratorColor, enumeratorColor));
            }
            deck.add(tmp);
        }

    }

    public String toString(){
        String result = "";
        for (ArrayList<Card> item: deck){
            for (ArrayList<Card> arrayList : deck) {
                
            }
        }
        return "abc";
    }
}

