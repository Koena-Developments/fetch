import java.util.Scanner;

public class Email {
    private String firstName;
    private    String lastName;
    private   String password;
    private   String department;
    private int defaultPasswordLength = 10;
    private String email;
    private  int mailboxCapacity = 500;
    private  String alternativeEmail;
    private String companySuffix = "oxfordDeliveries.com";


    // Constructor to receive first name and last name
    public Email()
    {   String lastName = "";
        String firstName = "";
        this.firstName = firstName;
        this.lastName = lastName;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name ");
        firstName = input.nextLine();

        System.out.println("Please enter your last Name ");
        lastName = input.nextLine();

        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        // call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call a method returns a random password

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
    }


    // Ask for the department
    private String setDepartment()
    {
        System.out.print("DEPARTMENT CODE \n1 or sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department code ");
        Scanner input = new Scanner(System.in);
        int depChoice = input.nextInt();
        if(depChoice == 1)
        {
            return "Sales";
        } else if (depChoice == 2)
        {
            return "Development";
        } else if (depChoice == 3)
        {
        return "Acc";
        }

        else{
            return "";
           }

    }

    // Generate a random password
    private String randomPassword(int length)
    {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i = 0; i < length; i++)
        {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // set the mailbox capacity
    public void setMailboxCapacity(int capacity)
    {
        this.mailboxCapacity = capacity;
    }

    // set the alternative email
    public void setAlternativeEmail(String altEmail)
    {
        this.alternativeEmail = altEmail;
    }
    // change the password
    public void changePassword(String password)
    {
        this.password = password;
    }

    public int getMailboxCapacity()
    {
        return mailboxCapacity;
    }
 public String getAlternateEmail()
    {
        return alternativeEmail;
    }
   public static void main(String[] args)
   {
    Email em1 = new Email();
   }

   public String getPassword()
   {
       return password;
   }
}