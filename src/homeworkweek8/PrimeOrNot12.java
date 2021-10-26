package homeworkweek8;
/*
Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
 */

import java.util.Scanner;

public class PrimeOrNot12 {
   //Instance Methods
    public static void isPrime() {
        boolean prime = true;//Variable
        int n, a;
        Scanner sc = new Scanner(System.in);//Scanner input
        n = sc.nextInt();
        for (int i = 2; i <=n/2; i++) {//For Statement
            a = n%i;
            if (a == 0) {//If Statement
                prime = false;
                break;
            }
        }

        if (prime) {//If Statement
            System.out.println(n + " is a prime number");//Print Statement
        } else {
            System.out.println(n + " is not a prime number");
        }

    }
    //Main Methods
    public static void main(String[] args) {

        System.out.println(" Enter a number : ");//Print Statement

        PrimeOrNot12.isPrime();

    }
}
