import java.util.Scanner;

public class Les3
 {
   public static void main(String[] args)
   {
     String firstname;
     String lastname;
     int age;
     String gender = null;

     Scanner user_input = new Scanner( System.in );

     System.out.println("What is your first name?: ");
     firstname = user_input.nextLine();

     System.out.println("What is your last name?: ");
     lastname = user_input.nextLine();

     System.out.println("What is your age?: ");
     age = user_input.nextInt();

     while (gender == null){
       System.out.println("\nWhat is your gender?:");
       System.out.println("Choose 1 for Male");
       System.out.println("Choose 2 for Female");

       System.out.print("Answer: ");
       int gender_temp = user_input.nextInt();

       if (gender_temp == 1) {
         gender = "Male";
       } else if (gender_temp == 2) {
         gender = "Female";

       } else {
         continue;
       }
     }

    //  if(gender.equals("Female")) {
    //      System.out.println("Are you pregnant?: [y/n] ");
    //      System.out.print("Answer: ");
    //      String pregnant = user_input.next();
    //      pregnant = pregnant.toLowerCase();
    //      while (pregnant == null){
     //
    //      if (pregnant.equals("y")) {
    //        System.out.println("We don't recommend that you consume alcoholic beverages");
    //        System.exit(1);
    //      } else if (pregnant.equals("n")) {
    //        System.out.println("This means you can drink alcoholic beverages");
    //      } else {
    //        continue;
    //      }
    //    }
    //  }




     if(age >= 18) {
       beer.drink();
     } else {
       System.out.println("\nYou are not old enough for alcoholic beverages");
       System.exit(1);
     }

     while (beer.empty() == false) {
       beer.drink();
     }

     if (beer.empty() == true)
     {
       System.out.println("\nTime to go home");
     }

     beer.drink();

       System.out.println("\noh there is still Whiskey");
     Alcohol rum = new Alcohol();

     for (int i = 0; i < 3 ; i++ ) {
       rum.drink();
     }
      System.out.println("\nLets do some math!");


     System.out.println("243 * 632 = " + 243 * 632);

     System.out.println("243 - 632 + 549 = ");
     System.out.println(243 - 632 + 549);

     System.out.println("243 / 34 = " + 243 % 34);
     //Opdracht 1
     //maak een aantal variabelen aan
     //voornaam, achternaam, leeftijd, geslacht.
     //vul waarden voor deze variabelen in

     //Opdracht 2
     //maak van het Alcohol datatype een flesbier aan
     //maak een if statement om te kijken of je alcohol mag drinken
     //roep de method flesbier.drink() aan als je oud genoeg bent
     //Denk aan het patroon voor het aanmaken van een Referencee variabele
     //Als je dit niet meer weet zoek je het op in de code van vorige les

     //Opdracht 3
     //Drink de fles bier leeg!
     //met de method empty() van het datatype Alcohol kun je checken of de fles leeg is
 /*
     if(bierfles.empty() == true)
     {

     }
 */
     //deze method geeft met behulp van een boolean aan of de fles leeg is of niet
     //Op de plek waar je deze method aanroept komt dus true of false te staan
     //Je mag maar maximaal 1x de drink() method aanroepen.

     //Opdracht 4
     //Drink nu nog eens een slok bier om te kijken of de fles echt leeg is.

     //Opdracht 5
     //Het bier is op.
     //Gelukkig kun je nog meer drinken
     //Maak eens een fles Whiskey en drink daar precies 3 slokken uit.
     //gebruik hiervoor niet 3x de zelfde regel code.
     //Zoals hieronder is dus niet toegestaan
     /*
       whiskey.drink();
       whiskey.drink();
       whiskey.drink();
     */

     //Opdracht 6
     //Je hebt nu redelijk wat code geschreven
     //Alle code die je hebt zorgt ervoor dat je je bezat
     //Zorg er nu voor dat al deze code alleen werkt als je ouder bent dan 18
     //verander je leeftijd eens naar 17
     //kun je nog drinken?
     //Geef op de command line een boodschap dat je te jong bent om te drinken

     //Opdracht 7
     //reken uit hoeveel 243 maal 632 is. Stuur het antwoord naar de commandline

     //Opdracht 8
     //reken uit hoeveel 243 min 632 plus 549 is. Stuur het antwoord naar de commandline

     //Opdracht 9
     //reken uit wat de restwaarde van 243 gedeeld door 34 is. Stuur het antwoord naar de commandline

     //Extra Opdracht 1
     //Maak een variabele aan waain je bij kunt houden of je zwanger bent. (Waar of niet waar)
     //Controleer aan het begin van je code of het geslacht een vrouw of een man is.
     //Zorg dat je niet zwanger kunt zijn als je een man bent.

     //Extra Opdracht 2
     //Zorg dat je niet kunt drinken als je jonger bent dan 18 of zwanger.

     //Extra Opdracht 3
     //Gebruik de Scanner zodat je bij het runnen van je applicatie zelf je naam , achternaam , leeftijd , geslacht en zwanger in kunt vullen.
     //Test of je inderdaad niet kunt drinken als je zwanger bent of jonger dan 18

   }


 }
