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
    }

    public static void main(String[] args) throws FileNotFoundException{
        ScrabbleHelper help = new ScrabbleHelper();
        wordTest();
        ArrayList<String> bart = help.findMatches("bart");
        ArrayList<String> kscpeuf = help.findUsable("kscpeuf");
        System.out.println(bart);
        help.sortWords(bart);
        System.out.println(bart);
        System.out.println(kscpeuf);
        help.sortByScores(kscpeuf);
        System.out.println(kscpeuf);
        System.out.println(help.getScores("p"));
        System.out.println(help.getScores("c"));
        System.out.println(help.getScores("us"));
    }
}
