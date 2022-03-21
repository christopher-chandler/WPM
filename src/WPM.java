// Program-specific libraries
import lexicon.elements.CalculateScore;
import lexicon.elements.RandomElements;
import timeManager.Speed;
import timeManager.Countdown;

// Standard
import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.Scanner;


/** Represents an employee.
 * @author Christopher Chandler
 * @author https://github.com/
 * @version 0.0.1
 */

public class WPM {

    public static void main(String[] args) throws InterruptedException {

        // New Instances
        DecimalFormat df = new DecimalFormat("###.##");

        Countdown.StartCountdown(4);
        RandomElements.PrintRandomWords(animals.birds);

        double start = LocalTime.now().toNanoOfDay();

        Scanner scan = new Scanner(System.in);
        String typedWords = scan.nextLine();

        double end = LocalTime.now().toNanoOfDay();

        double elapsedTime = Speed.ElapsedTime(start, end)/1000000000.0;
        int numChars = typedWords.length();

        double rawScore  = CalculateScore.RawScore(numChars,elapsedTime);

        // User information
        String result = String.format("You finished in %s seconds", df.format(elapsedTime));
        String userScore = String.format("Your score is around %s wpm.", df.format(rawScore));

        System.out.println(result);
        System.out.println(userScore);

    }

}
