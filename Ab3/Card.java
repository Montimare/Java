package Ab3;

import Ab3.Types.COLOR;
import Ab3.Types.VALUE;

public class Card {
    COLOR color;
    VALUE value;

    public Card() {
    }
    
    public Card(int color, int value){
        this.color = COLOR.values()[color];
        this.value = VALUE.values()[value];
    }

    public String toString(){
        return (value + " of " + color);
    }
}
