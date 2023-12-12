package Ab4;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListClass {
    private ArrayList<Integer> list;
    ListClass(String[] args){
        this.list = new ArrayList<Integer>();

        for (var item: args){
            list.add(Integer.parseInt(item));
        }
    }
    
    public Integer calculate(){
        Integer result = 0;

        for (Integer item:list){
            result += item;
        }

        return result;
    }
    
    public String toString(){
        Integer sum = calculate();
        String result;
        //result = list.stream().collect(Collectors.joining(" "));
        result = list.stream().map(String::valueOf).collect(Collectors.joining(" "));
        return (result + " // Result -> " + sum);
    }
}
