package example;

public class arrays {

    public static void main(String[] args) {

        // String array
        String[] cars = {"Toyota", "BMW", "Mazda", "Honda"};

        // Integer array
        int[] ages = {40, 21, 55, 15, 77};

        // Print Toyota from string array
        System.out.println("First car name is: " + cars[0]);
        System.out.println(cars[2]);

        // Print age 40 from ages array
        System.out.println("First age is: " + ages[0]);

        // Print the length of the cars array
        System.out.println("Length of the cars array is: " + cars.length);
        // Print the length of the ages array
        System.out.println("Length of the ages array is: " + ages.length);


        // Update BMW by Volvo in the cars array
        System.out.println("Before update cars[1] should be bmw: " + cars[1]);
        cars[1] = "Volvo";
        System.out.println("After update cars[1] should be Volvo: " + cars[1]);



    }


}
