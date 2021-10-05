package array;

public class ArrayMain {

    public static void main(String[] args) {

        int[] a = new int[3];
        a[0] = 1;
        System.out.println(a[0]); //1
        System.out.println(a[1]);  //0

        System.out.println(a.length);

        int[]b = {1, 2, 3};

        for (int i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }

        for(int item : b){
            System.out.println(item);
        }

        String[] fruits = {"apple", "peach", "plum", "orange"};

        for(int i =0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }

        for(String item : fruits){
            System.out.println(item);
        }

        String[] favouriteFruits = new String[2];
        System.arraycopy(fruits, 1, favouriteFruits, 0, 2);
        System.out.println(favouriteFruits[0]);
        System.out.println(favouriteFruits[1]);

    }
}
