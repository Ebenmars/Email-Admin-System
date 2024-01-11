import java.util.Scanner;

public class Email {


    private String firstName;
    private String lastName;

    private String department;

    private String email;

    //default password length
    private int passwordLength = 8;
    private String password;
    private String alternateEmail;
    private int mailboxCapacity;

    //Company Email
    private String companyEmail = "jacksonInc.com";

    Scanner scan = new Scanner(System.in);

    /**
     * Constructor to receive the first name and last name
     *
     * @param firstName
     * @param lastName
     */
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // Showing user created
        System.out.println("USER CREATED: " + firstName + " " + lastName);
        setDepartment();
        System.out.println();
        // Showing department
        System.out.println("Department: " + this.department);
        System.out.println();
        // Showing password
        this.password = generatePassword(passwordLength);
        System.out.println("Your newly generated password is: " + this.password);
        System.out.println();
        // Showing email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department + "." + companyEmail;
        System.out.println("Your Email: " + email);
        System.out.println();
    }

    /**
     * Set the department
     */
    private void setDepartment() {
        System.out.print("Department Numbers: \n"
                + "1. Sales \n"
                + "2. Development\n"
                + "3. Accounting \n\n");

        System.out.print("Enter Department Number: ");
        int choice = scan.nextInt();
        switch (choice) {
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


    /**
     * Generate a random password
     * @param length
     * @return a generated password
     */
    private String generatePassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcefghijklmnopqrstuvwxyz1234567890!@#$%^&*()?{}|<>";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    /**
     * Change the password
     * @param password
     */
    public void changePassword(String password) {
        this.password = password;
    }

    /**
     * Set the alternate email
     * @param alternateEmail
     */
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }


    /**
     * Get the full name of a user
     */
    public void fullName() {
        System.out.println(firstName + " " + lastName);
    }

    /**
     * Set the mailbox capacity
     * @param mailboxCapacity
     */
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    /**
     * Get the mailbox capacity
     *
     * @return mailboxCapacity
     */
    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    /**
     * Get the full info for the user to view
     */
    public void fullInfo() {
        System.out.print("Name: ");
        fullName();
        System.out.println("Email: " + this.email);
        System.out.println("Password: " + this.password);
        System.out.println("Department: " + this.department);
        System.out.println("MailboxCapacity: " + getMailboxCapacity());
    }


}

