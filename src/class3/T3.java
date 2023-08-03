package class3;
/*
Create Java Program to store 2 values for
expected and actual hours.Your program
should check:
- If actual hours are more than expected the
  program should print "You will love the course
  and will succeed"
- otherwise "Course will be very hard for you:
 */

public class T3 {
    public static void main(String[] args) {
        double expectedHours=20;
        double actualHours=25;
        if(actualHours>expectedHours){
            System.out.println("You will love the course and will succeed");

        }else{
            System.out.println("Course will be very hard for you");
        }


    }
}
