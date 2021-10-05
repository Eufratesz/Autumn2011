package linebreak;

public class LineBreakMain {

    public static void main(String[] args) {
        System.out.println("John");
        System.out.println("Doe");

        System.out.print("John");
        System.out.print("Doe");

        System.out.println();

        System.out.println("John\r\nDoe");
        System.out.println("John\nDoe");

        System.out.println("Jane" + System.lineSeparator() + "Doe");

        String names = "Jack Doe " +
                "Jane Doe " +
                "John Doe";
        System.out.println(names);

        names = "Jack Doe\n" +
                "Jane Doe\n" +
                "John Doe";
        System.out.println(names);
    }
}
