import java.util.Random;
import java.util.Scanner;

public class Email {



    private String firstName;
    private String lastName;

    private  String department;

    private String email;
    private int passwordLength = 8;
    private String password;
    private String alternateEmail;
    private int mailboxCapacity;

    private String companyEmail = "jacksonInc.com";

    Scanner scan = new Scanner(System.in);
    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + firstName + " " + lastName);
        setDepartment();
        System.out.println();
        System.out.println("Department: " + this.department);
        System.out.println();
        this.password = generatePassword(passwordLength);
        System.out.println("Your newly generated password is: " + this.password);

        System.out.println();
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + companyEmail;

        System.out.println("Your Email: " + email);
    }

    private void setDepartment(){
        System.out.print("Department Numbers: \n"
                + "1. Sales \n"
                + "2. Development\n"
                + "3. Accounting \n\n");

        System.out.print("Enter Department Number: ");

        int choice = scan.nextInt();


        switch(choice){
            case 1:
                this.department = "sales";
                break;
            case 2:
                this.department = "development";
                break;
            case 3:
                this.department = "accounting";
                break;
            case 4:
                this.department = "hr";
                break;
            case 5:
                this.department = "default";
                break;
            default:
                break;

        }
    }



    private String generatePassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcefghijklmnopqrstuvwxyz1234567890!@#$%^&*()?{}|<>";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
           int rand = (int) (Math.random() * passwordSet.length());
           password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void changePassword(String password){
        this.password = password;
    }

    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }


    public void fullName(){
        System.out.println(firstName + " " + lastName);
    }

    public void setMailboxCapacity(int mailboxCapacity){
        this.mailboxCapacity = mailboxCapacity;
    }
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

}

