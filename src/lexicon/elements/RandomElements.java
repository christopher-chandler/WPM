package lexicon.elements;


import java.util.Random;

public class RandomElements {

 public static void PrintRandomWords(String[] WordGroup){

   Random rand = new Random();
   int WordGroupLength = WordGroup.length;

   for (int i = 0; i < WordGroupLength; i++) {
       int RandomNumber = rand.nextInt(WordGroupLength);
       String WordString = WordGroup[RandomNumber];
       System.out.print(String.format("%s ",WordString));

        }
   }

 }

