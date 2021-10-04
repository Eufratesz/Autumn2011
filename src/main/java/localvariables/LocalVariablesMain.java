package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {
        boolean b;
        b = true;
        System.out.println(b);

        int i =  100_000_000;

        double d;
        d = 3.14;

        d = i;
        System.out.println(d);

//        i = (int) d;
//        System.out.println(i); //3

        String s = "Hello World";
        s = "";
        System.out.println(s);
        System.out.println(s.length());

        s = null;
        System.out.println(s);





    }
}
