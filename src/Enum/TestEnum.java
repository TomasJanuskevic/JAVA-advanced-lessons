package Enum;


import java.util.Scanner;

public class TestEnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.next();
        try {
            Animal animalUser = Animal.valueOf(animal);
            System.out.println(animalUser.name() + " : " + animalUser.getTranslation());
        } catch (IllegalArgumentException e) {
            System.out.println("Wrong animal");
        }
    }
}
