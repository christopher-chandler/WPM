package user;

import java.util.Arrays;
import java.util.Scanner;
import lexicon.words.*;


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

       //
       Animals animals = new Animals();



       Plants plants = new Plants();

       for (String word : wordChoices) {
           System.out.println(word);
       }

       while (true) {

           String selectTest = scan.next();

           if (selectTest.equals("words")) {


               System.out.println();
               return wordChoices;

           } else if (selectTest.equals("sentence")) {
               return wordChoices;

           }
           else{
            System.out.println("Your input was incorrect");
           }



            }
    }

}
