package arrayofarrays;

public class ArrayOfArraysMain {

    public static void main(String[] args) {
        int[][] a = new int[3][];
        a[0]= new int[1];
        a[1]= new int[2];
        a[2]= new int[3];

        a[0][0] = 8;

        //A tömbök tömbjét literálként is deklarálhatjuk:
        int[][] b = {{1}, {1, 2}, {1,2,3}};

    }
}
