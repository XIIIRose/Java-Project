/*

*   This class defines the data and methods for collecting name
    data from the new employee and generating a email and default password.
*   This class also allows the user to change their password and displays
    a welcome email.
*
    Autumn Rose
*
    Version 1
*/
import java.util.Scanner;
class NewEmployee {
    String fName;
    String lName;
    String changePass;
    String password;
    String rand;
    String welcomeIntro;
    String welcomeBody;
    StringBuilder tempPass;
    int passSize;
    NewEmployee() {
        //constructor
        //generate random password
        passSize=7;
        rand="ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz";
        tempPass=new StringBuilder(passSize);
    }
    //generate email
    void generateEmail () {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(fName);
        stringBuilder.append("_");
        stringBuilder.append(lName);
        stringBuilder.append("@umsl.edu");
        System.out.print(stringBuilder);
    }
    //generate password
    void generatePassword() {
        int index;
        for(int i=0; i<passSize; i++) {
            index=(int)(rand.length()*Math.random());
            tempPass.append(rand.charAt(index));
        }
    }
    //get new password method
    String getNewPass() {
        //prompt for password
        Scanner input=new Scanner(System.in);
        System.out.print("Please change your password. Enter new password: ");
        changePass=input.next();
        return changePass;
    }
    //set new password method
    void setNewPass(String newPass) {
        password=newPass;
        System.out.println("Your password was changed successfully.");
    }
    //display name method

    //display email method
    void displayWelcomeEmail() {
        welcomeIntro="Welcome email!\nSubject line: Welcome to UMSL\nDear "
                + fName + " " + lName + ",\n\n";
        welcomeBody="Welcome to UMSL - We are excited " +
                "to have you aboard. Just a reminder, your\nfirst day is August " +
                "6th. All you need to do is click the Zoom link in your calendar " +
                "\ninvite at 9 a.m. CST to join our onboarding meeting.\n\n";
        System.out.println(welcomeIntro+welcomeBody);
    }
    //display mailbox capacity method
    void displayCapacity() {
        System.out.println("Your mailbox capacity is 1 gb");
    }
    //count words in message method
    int countWords(String message) {
        int count=0;
        boolean wordFound=false;
        int end=message.length()-1;
        for(int i=0; i<message.length(); i++) {
            if(Character.isLetter(message.charAt(i)) && i!=end) {
                wordFound=true;
            }
            else if(!Character.isLetter(message.charAt(i))&&wordFound) {
                count++;
                wordFound=false;
            }
            else if(Character.isLetter(message.charAt(i))&& i==end) {
                count++;
            }
        }
        return count;
    }
}
