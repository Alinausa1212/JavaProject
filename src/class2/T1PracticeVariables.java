package class2;
/*
Create a Java program and name it Practice Variables
In your program create 8 variables to store all diferent types of primitive date
Print the value of each variable
 */

public class T1PracticeVariables { //PascalCase
    public static void main(String[] args) {

        byte verySmallWholeBox=127;
        short smallWholeNBox=1200;
        int mostWidelyUsedWholeNumberBox=1256220; //camelCase
        long largeWholeBox=1245866666541411L;

        float mediumDecimalBox=12532.5F;
        double largeDecimalBox=1354541.13215421;// capacity is double than float
        char singleCharacterBox='G'; // can hold only one letter
        boolean trueFalseBox=true; //boolean and true the same color because they reserved by Java

        System.out.println(verySmallWholeBox);
        System.out.println(smallWholeNBox);
        System.out.println(mostWidelyUsedWholeNumberBox);
        System.out.println(largeWholeBox);
        System.out.println(mediumDecimalBox);
        System.out.println(largeDecimalBox);
        System.out.println(singleCharacterBox);
        System.out.println(trueFalseBox);


    }

}
