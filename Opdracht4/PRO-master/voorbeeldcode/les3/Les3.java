import java.util.Scanner;
public class Les3
{
  public static void main(String[] args)
  {
    //Opdracht 1
    //maak een aantal variabelen aan
    //voornaam, achternaam, leeftijd, geslacht.
    //vul waarden voor deze variabelen in
  // Scanner input = new Scanner(System.in);
  // System.out.print("Wil je media gaan doen of game? ");
  // Scanner answer = input.nextLine();
  //
  // if (answer.equals("media")) {
  //   System.out.println("Leuk");
  // }  else if (answer.equals("game")){
  //         System.out.println("Je kan het wel ik geloof in je");
  //
  //       } else {
  //         System.out.println("je had anders kunnen kiezen");
  //       }

        // System.out.println("Hoe oud ben je?");
        // System.out.print("$ ");
        // int age = input.nextInt();
        //
        // if (age==16){
        //   System.out.println("Leuk, ik ook");
        // } else if (age>16); {
        //   System.out.println("dan ben je ouder dan ik ben");
        //}
        // for (int i = 0 ; i < 10 ; i++) {
        //   int product = i * 13;
        //   System.out.println(i+" x 13 ="+product) ;
        // }



        boolean proceed = true;
        while (proceed==true) {
          Symstem.out.println("Welk getal denk je dat ik in gedachten heb? ");
          int guess = input.nextInt();
          if (guess==16){
          System.out.println("dat had ik inderdaad in gedachten!");
          proceed=false;
        } else if (guess>16){
          System.out.println("Nee, lager");
        } else (guess<16);


          System.out.println("Nee, hoger");
        }



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
