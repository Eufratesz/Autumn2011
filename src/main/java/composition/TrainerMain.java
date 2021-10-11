package composition;

public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer("John Doe");
        System.out.println(trainer.getAddress());  //null

        trainer.setAddress(new Address("Budapest", "Váci utca"));
        System.out.println(trainer.getAddress().getCity());


        Address address = new Address("Budapest", "Váci utca");
        trainer.setAddress(address);

        Address trainerAddress = trainer.getAddress();
        System.out.println(trainerAddress.getCity());
        System.out.println(trainerAddress.getLine1());

        trainer.setAddress(new Address("Pécs", "Fő út"));
        System.out.println(trainer.getAddress().getCity());
    }
}
