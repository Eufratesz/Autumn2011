package looptypesmodify;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopTypesModifyMain {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        System.out.println(Arrays.toString(numbers));


        List<String> names = new ArrayList<>(Arrays.asList("John", "Jack", "Jane"));
        for (int i = 0; i < names.size(); i++) {
            names.set(i, "dr. " + names.get(i));
        }
        System.out.println(names);


        List<String> nameList = new ArrayList<>(Arrays.asList("John", "Jack", "Jane"));
        List<String> namesToRemove = new ArrayList<>();
        for (String name : nameList) {
            if (name.substring(0, 2).equals("Ja")) {
                namesToRemove.add(name);
            }
        }
        System.out.println(namesToRemove);
        names.removeAll(namesToRemove);
        System.out.println(nameList);

    }
}


