package lexicon.elements;

public class CalculateScore {

    public static int RawScore(int numChars, double seconds){

        double allTypedEntries = (numChars/5);
        double minutes = seconds * 60;
        int rawScore = (int) (allTypedEntries/minutes);

        int wpm = (int) ((((double) numChars / 5)/seconds)* 60);
        return wpm;

    }

}
