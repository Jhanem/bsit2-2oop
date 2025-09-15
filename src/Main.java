import java.util.*;

public class Main {
    public static void main(String[] args){
        PetService service = new PetService();
        System.out.println("\nBasic checkup: " + "$" + service.calculateFee());
        System.out.println("Checkup with vaccination: " + "$" + service.calculate(false
        ));
        System.out.println("Full Service: " + "$" + service.calculate(true
                , true));
        System.out.println("Emergency: " + service.calculateFee("emergency"));


        System.out.println("\nWelcome to the Pet Clinic!");
        System.out.println("==========================");
        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);
        Pet bird = new Bird("Tweety", 1);

        dog.displayInfo();
        dog.makeSound();
        System.out.println("");
        cat.displayInfo();
        cat.makeSound();
        System.out.println("");
        bird.displayInfo();
        bird.makeSound();

        System.out.println("\nTraining Session Started");
        System.out.println("========================");
        trainPet((Trainable) dog);
        trainPet((Trainable) bird);
    }

    public static void trainPet(Trainable pet) {
        pet.performTrick();
    }
}
