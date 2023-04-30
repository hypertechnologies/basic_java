package example;

public class loop {
    public static void main(String[] args) {

        String[] cities = {"New York", "Toronto", "London", "Dhaka", "Montreal", "Buffalo"};

        // Print all of the cities
        for (int i = 0; i < cities.length; i++ ){
            System.out.println(cities[i]);
        }

        System.out.println("================");


        // Find Dhaka city
        for (int i = 0; i < cities.length; i++ ){

            //  if(cities[i] == "Dhaka"){
            if(cities[i].equals("Dhaka")){
                System.out.println("Found: " + cities[i]);
                break;
            }

            System.out.println(cities[i]);
        }

        System.out.println("================");


        // Find Dhaka city and then continue with the loop
        for (int i = 0; i < cities.length; i++ ){

            //  if(cities[i] == "Dhaka"){
            if(cities[i].equals("Dhaka")){
                System.out.println("Found: " + cities[i]);
                continue;
            }

            System.out.println(cities[i]);
        }


    }




}
