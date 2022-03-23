package lexicon.logic;
import java.util.Random;

public class RandomElements {

public String[] getRandomWordArray(String[][] allAnimals){
    Random rand = new Random();
    int wordsArrayLength = allAnimals.length;
    String[] choice = allAnimals[rand.nextInt(wordsArrayLength)];
    return choice;
}

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

