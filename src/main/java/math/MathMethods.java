package math;

import java.util.Random;

public class MathMethods {

    public static void main(String[] args) {

        System.out.println(Math.max(8, 3));  //8
        System.out.println(Math.min(4,2));   //2
        System.out.println(Math.PI);        //3.14159
        System.out.println(Math.round(Math.PI));  //3
        System.out.println(Math.round(9.12));      //9
        System.out.println(Math.round(9.98));   //10
        System.out.println(Math.abs(7.6));  //7.6
        System.out.println(Math.abs(-7.6));     //7.6
        System.out.println(Math.negateExact(1));    //-1
        System.out.println(Math.addExact(4,7));     //11
        System.out.println(Math.subtractExact(3,6));    //-3
        System.out.println(Math.subtractExact(6,2));       //4
        System.out.println(Math.multiplyExact(3,7));    //21
        System.out.println(Math.pow(2, 2));     //4
        System.out.println(Math.pow(2,3));      //8
        System.out.println(Math.decrementExact(67));       //66
        System.out.println(Math.incrementExact(67));        //68
        System.out.println(new Random().nextDouble());
        System.out.println(new Random(2).nextDouble());     //0.7311469360199058

    }
}
