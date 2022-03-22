package lexicon.logic;

import java.util.Random;

public class RandomElements {

 public void getRandomWord(String[] WordGroup){

   Random rand = new Random();
   int WordGroupLength = WordGroup.length;

   for (int i = 0; i < WordGroupLength; i++) {
       int RandomNumber = rand.nextInt(WordGroupLength);
       String WordString = WordGroup[RandomNumber];
       System.out.print(String.format("%s ",WordString));

        }
   }

 }

