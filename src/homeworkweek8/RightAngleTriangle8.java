package homeworkweek8;
/*
Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */

public class RightAngleTriangle8 {
    static void j() {
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("@ ");}
                System.out.println(" ");

            }
            System.out.println();
        }

        //main method
        public static void main (String[]args){
            RightAngleTriangle8.j();//object for calling static to main method
        }
    }
