package fall2025.ITSC_1213.proj1;

import java.util.Scanner;

public class DogPark {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of d1: ");
        String nameD1 = scanner.nextLine();

        System.out.println("Breed of d1: ");
        String breedD1 = scanner.nextLine();

        System.out.println("Name of d2: ");
        String nameD2 = scanner.nextLine();

        System.out.println("Breed of d2: ");
        String breedD2 = scanner.nextLine();

        scanner.close();

        Dog d1 = new Dog(nameD1, breedD1);
        Dog d2 = new Dog(nameD2, breedD2);

        d1.play(d2);

    }
}   