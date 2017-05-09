import java.util.Scanner;
public class Assignment{
  public static void main(String[] args)
  public void showAssignment(){
    System.out.println("Assignment 1: Jay you just completed your first assignment");
    System.out.println("Assignment 2: create 3 variables here, one for your name, age and one for your postal code. Print the values to the commandline!");
    String name = "Jacco";
    int age = 16;
    String postalcode = "1911";

    Scanner scanner = new Scanner(System.in);

    System.out.println("Vul je naam in");
    name = scanner.next();

    System.out.println("Vul je leeftijd in");
    age = Integer.parseInt(scanner.next());

    System.out.println("Voer je postcode in");
    postalcode = scanner.next();

    System.out.println("Mijn naam is " + name);
    System.out.println("Ik ben" + age + "jaar oud ");
    System.out.println("My postalcode is" + postalcode);

    System.out.println("Assignment 3: Use the Scanner datatype to allow a user to enter the values for name, age, and postal code. ");
    System.out.println("Assignment 4: Parse the Scanner output to an int when entering the age value. This way the user will get an error if numbers arent used. ");
    System.out.println("Note: Find out about datatypes at the Application Programming Interface(API) reference https://docs.oracle.com/javase/7/docs/api/allclasses-noframe.html. Select the Scanner link.");
  }
}
