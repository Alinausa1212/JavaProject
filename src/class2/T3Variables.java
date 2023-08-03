package class2;
/*
Create a Java Program and name it Variables
1) In your program create different type of variables to
store students information(first name, last name,
grade, city,state,phone number) and then print value
of those variables in the format:
-My First name is__ and my last name is__
-My grade is__
-I live in city__ and state__
-And my phone number is____

2) Change students city, state, phone number and grade
And print those updated value:

Example:
My name is__ and I moved to new city__ and new state___.
My new phone number is___
 */

public class T3Variables {
    public static void main(String[] args) {
        //part 1 of task
       String firstName="Alina";
       String lastName="Lytvynenko";
       String city="Brooklyn";
       String state="New York";
       String phoneNumber="123-45-6789";
        System.out.println("My first name is "+firstName+" and my last name is "+lastName);
        System.out.println("I live in city "+city+" and state "+state);
        System.out.println("And my phone number is "+phoneNumber);

        //part 2 of task
        city="Tampa";
        state="Florida";
        phoneNumber="987-65-4321";
        System.out.println("My name is "+firstName);
        System.out.println("I moved to new city "+city+" and new state "+state);
        System.out.println(" My new phone number "+phoneNumber);




    }
}
