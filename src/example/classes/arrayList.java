package example.classes;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        ArrayList<String>  cars = new ArrayList<String>();

        // Size of the cars
        System.out.println("Size: " + cars.size());

        // Add different cars inside cars arrayList
        cars.add("Toyota");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");
        cars.add("Honda");
        System.out.println("Size: " + cars.size());

        // Print all cars
        System.out.println("Print all cars after adding all car name");
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        // Remove an element from array
        cars.remove("Mazda");
        // Print all cars after removing Mazda
        System.out.println("Print all cars after removing Mazda");
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        // Update an element in array
        cars.set(0, "Tesla");
        // Print all cars after updating Toyota by Tesla
        System.out.println("Print all cars after updating Toyota by Tesla");
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }

        // Clear/Delete all elements from cars arraylist
        cars.clear();
        //Check the size
        System.out.println("Size of cars after clearing: " + cars.size());

    }
}
