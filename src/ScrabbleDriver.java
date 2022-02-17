import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleDriver {
    public static void wordTest() throws FileNotFoundException{
        ScrabbleHelper helper = new ScrabbleHelper();
        Scanner s = new Scanner(System.in);
        String theirWord = " ";
        System.out.print("(Enter a blank line to exit) ");
        while(true) {
            System.out.print("Enter a word to test: ");
            theirWord = s.nextLine();
            if (theirWord.equals("")) {
                break;
            }
            if (helper.foundWord(theirWord)) {
                System.out.println("\"" + theirWord + "\" is a word");
            } else {
                System.out.println("\"" + theirWord + "\" is not a word");
            }
        }
        System.out.println("good-bye!");
    } //Lets user test Strings to see if they are in "wordsList"


    public static void main(String[] args) throws FileNotFoundException{
        ScrabbleHelper help = new ScrabbleHelper();
        wordTest();
        ArrayList<String> lengthList = help.findMatches("tube");
        ArrayList<String> scoreList = help.findUsable("pdnkeua");
        System.out.println(lengthList);
        help.sortWords(lengthList);
        System.out.println(lengthList);
        System.out.println(scoreList);
        help.sortByScores(scoreList);
        System.out.println(scoreList);
    }
}
