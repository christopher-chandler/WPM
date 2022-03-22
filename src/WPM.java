// Custom libraries
import lexicon.logic.*;
import timeManager.*;
import user.Player;

// Standard
import java.text.DecimalFormat;
import java.time.LocalTime;
import java.util.Scanner;


/**
 * @author Christopher Chandler
 * @author https://christopher-chandler.github.io/christopher-chandler/
 * @version 0.0.1
 */

public class WPM {

    public static void main(String[] args) throws InterruptedException {

        // elements
        CalculateScore calculateScore = new CalculateScore();
        RandomElements randomElements = new RandomElements();

        // time
        Countdown clock = new Countdown();
        Speed speed = new Speed();

        // scanner
        Scanner scan = new Scanner(System.in);

        // score formatting
        DecimalFormat df = new DecimalFormat("###.##");

        // gather user information
        System.out.print("Enter username: ");
        String name = scan.nextLine();

        System.out.print("Enter user age: ");
        int age = scan.nextInt();

        // get user selection
        Player newPlayer = new Player(name, age);
        newPlayer.greetPlayer();
        String[] choice = newPlayer.playerChoice(scan);

        // Game start
       clock.StartCountdown(4, newPlayer.name);
       randomElements.getRandomWord(choice);

        double start = LocalTime.now().toNanoOfDay();

        String typedWords = scan.next();

        double end = LocalTime.now().toNanoOfDay();

        // Calculating WPM
        double elapsedTime = speed.ElapsedTime(start, end)/1000000000.0;
        int numChars = typedWords.length();
        double rawScore  = calculateScore.RawScore(numChars,elapsedTime);

        // User score information
        String result = String.format("You finished in %s seconds", df.format(elapsedTime));
        String userScore = String.format("Your score is around %s wpm.", df.format(rawScore));

        System.out.println(result);
        System.out.println(userScore);
    }



}
