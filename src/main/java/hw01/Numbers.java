package hw01;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        int[] array = new int[100];
        int number = (int) (Math.random() * 100);
        String name="";
        int guess = 0;
        int wrongNumbers = 0;


        System.out.println("Let the game begin");



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name=sc.nextLine();
        System.out.println("Guess the number between 0-100");


        while (guess != number) {
            wrongNumbers++;
            guess = sc.nextInt();
            if(guess>=0 && guess<=100) {
                if (guess > number) {
                    System.out.println("Your number is too big. Please, try again.");


                } else if (guess < number) {
                    System.out.println("Your number is too small. Please, try again.");

                }

                array[wrongNumbers] = guess;
            }else{
                System.out.println("Please enter numbers range 0-100");

            }
        }
        System.out.println("Congratulations, " + name);

        int[] wrongArray = new int[wrongNumbers];

        System.arraycopy(array, 1, wrongArray, 0, wrongNumbers);
        Arrays.sort(wrongArray);

        System.out.println("Your numbers " + Arrays.toString(wrongArray));
    }
}
