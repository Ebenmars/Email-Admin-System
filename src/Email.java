import java.util.Random;
import java.util.Scanner;

public class Email {



    private String firstName;
    private String lastName;

    private  String department;

    private String email;
    private String password;
    private String alternateEmail;

    private int mailboxCapacity;
    public Email(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        setDepartment();
    }

    private void setDepartment(){
        System.out.print("Enter Department: \n"
                + "1. Sales \n"
                + "2. Development\n"
                + "3. Accounting \n"
                + "0. Accounting \n");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();

        switch(choice){
            case 1:
                this.department = "Sales";
                break;
            case 2:
                this.department = "Development";
                break;
            case 3:
                this.department = "Accounting";
                break;
            default:
                this.department = "";
                break;
        }

        return;
    }


    public void generatePassword(){
        Random rand = new Random();
        this.password = firstName;
    }
    public void setPassword(String password){
        this.password = password;
    }

    public void setAlternateEmail(String alternateEmail){
        this.password = firstName;
    }


    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getEmail(){
        return email;
    }

    public void fullName(){
        System.out.println(firstName + " " + lastName);
    }

    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

}

