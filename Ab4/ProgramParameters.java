package Ab4;

import java.util.ArrayList;

public class ProgramParameters {
    public static void main(String[] args) {
        ListClass list = new ListClass(args);
        System.out.println(list);

        String test = "That’s it! You people have stood in my way long enough. I’m going to clown college!";
        System.out.println(test.length());
        System.out.println(test.charAt(5));
        System.out.println(test.contains("way"));
        System.out.println(test.indexOf("You"));
        System.out.println(test.equals("That’s it! You people have stood in my way long enough. I’m going to clown college!"));
        //(test == new String("That’s it! You people have stood in my way long enough. I’m going to clown college!"));
    }
}
