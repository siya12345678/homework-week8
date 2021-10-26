package homeworkweek8;
/*
6. Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */

public class PatternLikeTriangle6 {
    public static void main(String[] args)//main method
    {
        int r=10;
        //for loop to get given pattern
        for(int i=1;i<=r;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
