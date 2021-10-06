package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomDraw {

    public static void main(String[] args) {


        List<String> names = new ArrayList<>(Arrays.asList("Anna", "Béla", "Csaba", "Dani", "Eszter", "Feri",
                "Gergő", "Gyula", "Hedvig", "Irén"));

        Random random = new Random();
        int firstRandom = random.nextInt(5)+1;
     //   IntStream secondRandom = random.ints(6, 10);

        System.out.println(firstRandom);
      //  System.out.println(secondRandom.toString());


        String firstLuckyPerson = names.get(firstRandom);

        System.out.println(firstRandom + ": " + firstLuckyPerson);
    }
}
