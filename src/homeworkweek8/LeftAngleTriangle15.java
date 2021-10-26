package homeworkweek8;
/*
Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *
 */

public class LeftAngleTriangle15 {
    //static method
    static void leftangle(){
        int row = 5;//variable
        //for loop statement
        for (int s = 1; s <= row; s++){
            for (int p = 1; p <= s; p++){
                System.out.print(" * ");//print statement
            }
            System.out.println("");//print statement
        }
    }
    //main method
    public static void main(String[] args) {
        LeftAngleTriangle15.leftangle();
    }
}
