/*

*   This class tests and displays the data and methods contained
    in the newEmloyee class. The program will accept a first and
*   last name and display a users email, password, and welcome message.

*   Autumn Rose

*   Version 1

*/
import java.util.Scanner;

public class testNewEmployee {
    public static void main(String[] args) {
        //create new employee class instance
        String newPass;
        Scanner input=new Scanner(System.in);
        String name;
        int words;
        NewEmployee emp=new NewEmployee();
        //accept first and last name of new employee
        System.out.print("Enter first name of the employee: ");
        name=input.next();
        emp.fName=name;
        System.out.print("Enter last name of the employee: ");
        name=input.next();
        emp.lName=name;
        //generate a random email- fname_lname@umsl.edu
        System.out.print("Email generated: ");
        emp.generateEmail();
        System.out.print("\n");
        //generate a random string for their password-5 letters+2 special
        emp.generatePassword();
        System.out.println("Your password is " + emp.tempPass);
        //employee can change pass with get and set methods
        emp.displayCapacity();
        newPass=emp.getNewPass();
        emp.setNewPass(newPass);
        System.out.print("\n");
        //methods to display name, email and mailbox capacity 1gb
        //create welcome email
        emp.displayWelcomeEmail();
        //count word count of email
        words=emp.countWords(emp.welcomeBody);
        System.out.println("Word count=" + words);
    }
}
