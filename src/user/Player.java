// Custom libraries
package user;
import lexicon.logic.*;
import lexicon.words.*;

// Standard
import java.util.Scanner;


public class Player {

    public String name;
    public int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

   public void greetPlayer(){
        String greeting = String.format("Hello %s, %d! ", this.name, this.age);
        System.out.println(greeting);
    }

   public String[] playerChoice(Scanner scan) {
       String prompt = "\nWhat would would you like to have as practice?";
       System.out.println(prompt);
       String[] wordChoices = {"words", "sentences"};

       Animals animals = new Animals();
       Plants plants = new Plants();
       RandomElements randomElements = new RandomElements();

       String[][] allAnimals = animals.allAnimals;

       for (String word: wordChoices) {
           System.out.println(word);
       }

       while (true) {

           String selectTest = scan.next();

           if (selectTest.equals("words")) {
               System.out.println("You have chosen words!\n");
               String[] randomSelection = randomElements.getRandomWordArray(allAnimals);
               return randomSelection;

           } else if (selectTest.equals("sentences")) {
               System.out.println("Comeback later, the sentences aren't ready!");
           }
           else{
            System.out.println("Your input was incorrect. Please enter 'words' or 'sentences'");
           }


            }
    }

}
