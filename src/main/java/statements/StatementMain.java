package statements;

public class StatementMain {

    public static void main(String[] args) {
        int i = 5 + 6;
        System.out.println(5 + 6);

        System.out.println("Hello" + 11 + "world!");

        StatementMain s = new StatementMain();

        System.out.println(i = 8);  //8
        System.out.println(i);

        System.out.println("".equals("aaa")); //false
        System.out.println("aaa".equals("aaa")); //true

        System.out.println(i % 2 ==0);  //true
        System.out.println(!(i % 2 ==0));  //false
        System.out.println(!(i % 2 ==0) || true);  //true

        i++;
        System.out.println(i); //9
        i = i+1;
        System.out.println(i);  //10

        System.out.println(i % 2 ==0 ? "páros" : "páratlan");  //páros


    }
}
