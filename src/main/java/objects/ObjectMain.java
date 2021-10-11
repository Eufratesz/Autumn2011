package objects;

import java.util.Arrays;
import java.util.List;

public class ObjectMain {

    public static void main(String[] args) {

        Trainer trainer1 = new Trainer("John Doe");
        Trainer trainer2 = null;

        System.out.println(trainer1.getName());
        System.out.println(trainer2);

        if (trainer2 ==null){
            System.out.println("trainer2 is null");
        }

        Trainer trainer3 = new Trainer("John Doe");
        System.out.println(trainer1 == trainer3);       //false

        trainer3 = trainer1;
        System.out.println(trainer1 == trainer3);       //true

        Trainer[] trainers = {trainer1};

        List<Trainer> trainerList = Arrays.asList(trainer1);

    }
}
