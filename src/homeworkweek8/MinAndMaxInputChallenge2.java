package homeworkweek8;
/*-Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.

 */

import java.util.Scanner;

public class MinAndMaxInputChallenge2 {
    public static void main(String[] args) {

        int i = 1;
        int highest =0 , lowest =0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number to continue or Alphabet to end :");
        while (in.hasNextInt()) {

            System.out.println("Enter any number to continue or Alphabet to end :");
            int num = in.nextInt();

            if( i == 1) {
                highest = num ;
                lowest = num ;
                i++; }
            else {
                if (num > highest) {
                    highest = num;
                    i++;
                } else if (num < lowest) {
                    lowest = num;
                    i++;
                }
            }
        }
        System.out.println("User entered "+ i +"values");
        System.out.println("highest number enter by user : "+ highest );
        System.out.println("lowest number enter by user  : "+ lowest);
    }

}
