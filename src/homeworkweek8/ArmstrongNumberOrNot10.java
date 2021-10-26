package homeworkweek8;
/*
Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */

import java.util.Scanner;

public class ArmstrongNumberOrNot10 {
    int number, originalNumber, remainder, result;

    void armst(){
        originalNumber = number;
        for (;originalNumber !=0; originalNumber /= 10){
            remainder = originalNumber % 10;
            result = result + remainder * remainder * remainder;
        }

        if (result == number)
            System.out.println(" is Armstrong number. ");
            else
            System.out.println(" is not Armstong number. ");
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter Number ");
        ArmstrongNumberOrNot10 obj = new ArmstrongNumberOrNot10();
       obj.number = sca.nextInt();
        sca.close();

        obj.armst();
    }

    }



