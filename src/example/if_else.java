package example;

public class if_else {

    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 50;

        if (num1 > num2){
            System.out.println("num1 is grater");
        }else {
            System.out.println("num1 is smaller");
        }


        // Determine the time of the day 1-24

        int currentTime = 20;

        if(currentTime >= 1 && currentTime <= 11){
            System.out.println("Good Morning!");
        }else if(currentTime >= 12 && currentTime <=18){
            System.out.println("Good Afternoon!");
        }else {
            System.out.println("Good night!");
        }



        if(10 > 15 || 20 < 35){
            System.out.println("print this!");
        }

        if(10 > 15 && 20 < 35){
            System.out.println("don't print this!");
        }


    }


}
