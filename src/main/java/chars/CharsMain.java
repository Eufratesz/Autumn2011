package chars;

import java.util.Arrays;

public class CharsMain {

    public static void main(String[] args) {

        System.out.println('a');

        char c = 'a';
        System.out.println(c);
        System.out.println((int) c); //97

        if (c == 'a') {
            System.out.println("Ez egy 'a' karakter.");
        }

        System.out.println(c + 1);      //98  (Automatikus típuskényszerítés

        System.out.println((char) (c + 1)); //b

        char n = 'a';
        System.out.println((int)n); //48

        if ('0' <= n && n < '9'){
            System.out.println("számjegy");
        }
        if('a'<= n && n < 'z'){
            System.out.println("kisbetű");
        }

        System.out.println(Character.isAlphabetic(n));
        System.out.println(Character.isDigit(n));

        String welcome = "Hello";
        System.out.println(welcome.charAt(0));

        char[] letters = welcome.toCharArray();
        System.out.println(Arrays.toString(letters));  //[H, e, l, l, o]

        for(char i : letters){
            System.out.println(i);
        }

        char[] word = {'h', 'e', 'l', 'l', 'o'};
        String message = new String(word);
        System.out.println(message);
    }
}
