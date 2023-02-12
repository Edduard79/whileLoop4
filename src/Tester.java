import java.util.Scanner;

public class Tester {

    public static void main(String[] args){

        int number;
        int min = 0;
        int max = 10;
        double random =  Math.floor(Math.random() *(max - min + 1) + min);

        System.out.println("Welcome!");

        System.out.println("Guess the number!");
        Scanner num = new Scanner(System.in);
        number = num.nextInt();

        while(number != random){
            System.out.println("Try again!");
            number = num.nextInt();
        }

        System.out.println("Congratulation!");
        










    }
}
