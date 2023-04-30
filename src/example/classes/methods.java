package example.classes;

public class methods {

    public static void main(String[] args) {

        // Calculate sum of two numbers
        int num1 = 10;
        int num2 = 25;

        int total = num1 + num2;

        System.out.println(total);

        System.out.println("=================");

        // Calculate sum of two numbers
        System.out.println(calculateSum(11,13));
        System.out.println(calculateSum(150,850));


    }

    // Calculate sum of two numbers using a function
    public static int calculateSum(int num1, int num2){
        int total = num1 + num2;
        return total;
    }


}
