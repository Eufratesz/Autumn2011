package classstructureconstructors;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer("John Doe", 1980);
        System.out.println(trainer.getName() + " " + trainer.getYearOfBirth());

        Trainer anotherTrainer = new Trainer("Jack Doe", 1981);
        System.out.println(anotherTrainer.getName() + " " + anotherTrainer.getYearOfBirth());

    }
}
