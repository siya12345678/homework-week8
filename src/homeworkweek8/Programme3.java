package homeworkweek8;
/*
3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */

import java.util.Scanner;

public class Programme3 {

    //Instance Method
    void pro(){
        int i=10;//Variables
        Scanner sca = new Scanner(System.in);//Input Scanner Class
        char ch = sca.next().charAt(0);
        //If Condition
        if (ch== 'a'||ch== 'e'||ch== 'i'||ch== 'o'||ch== 'u'||ch== 'A'||ch== 'E'||ch== 'I'||ch== 'O'||ch== 'U'){
            System.out.println(ch + " Input latter is Vowel");
//If else condition
        }else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z') && (ch<1) ) {
            System.out.println(ch + " Input Letter is Consonant");//Print Statement
        }else {
            System.out.println("Invalid Input");
        }
    }
    //Main Method
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);// Input Scanner Class
        System.out.println("Enter any letter to check ist vowel or consonant :");//Print Statement
        Programme3 obj = new Programme3();//Object for Instance to Main Method
        obj.pro();
    }
}
