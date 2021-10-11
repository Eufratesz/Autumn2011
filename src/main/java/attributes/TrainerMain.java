package attributes;

import java.util.Arrays;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer("John Doe", true, Arrays.asList());
        System.out.println(trainer.getName());      //null alapesetben
        System.out.println(trainer.isActive());     //false
        System.out.println(trainer.getTraining());     //null
    }
}
