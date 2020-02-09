import java.util.ArrayList;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        List<Animal> ListOfAnimal = new ArrayList<>();
        ListOfAnimal.add(new Animal());
        ListOfAnimal.add(new Animal());
        ListOfAnimal.add(new Animal());

        List<Dog> ListOfDogs = new ArrayList<>();
        ListOfDogs.add(new Dog());
        ListOfDogs.add(new Dog());
        ListOfDogs.add(new Dog());

        test(ListOfAnimal);
        test(ListOfDogs);

        //Anoniminis class
        Animal animal1 = new Animal(){
            @Override
            public void myName() {
                System.out.println("My name is Bob");
            }
        };
        animal1.myName();

    }

    private static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.myName();
        }
    }
}

class Animal {
    public void myName() {
        System.out.println("I am animal");
    }
}

class Dog extends Animal {

    public void myName() {
        System.out.println("I am dog");
    }
}





