import lexicon.elements.CalculateScore;
import lexicon.elements.RandomElements;
import lexicon.words.Animals;
import time.Speed;
import time.Countdown;

import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.Scanner;


public class WPM {

    public static void main(String[] args) throws InterruptedException {

        // New Instances
        DecimalFormat df = new DecimalFormat("###.##");
        Speed speed = new Speed();
        Animals animals = new Animals();

        Countdown.StartCountdown(4);
        RandomElements.PrintRandomWords(animals.pets);

        double start = LocalTime.now().toNanoOfDay();

        Scanner scan = new Scanner(System.in);
        String typedWords = scan.nextLine();

        double end = LocalTime.now().toNanoOfDay();

        double elapsedTime = Speed.ElapsedTime(start, end)/1000000000.0;
        int numChars = typedWords.length();

        double rawScore  = CalculateScore.RawScore(numChars,elapsedTime);

        // User information

        String result = String.format("You finished in %s seconds", df.format(elapsedTime));
        String userScore = String.format("your score is %s around wpm per minute.", df.format(rawScore));

        System.out.println(result);
        System.out.println(userScore);

    }

}
