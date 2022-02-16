import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrabbleHelper {
    private ArrayList<String> wordsList = new ArrayList<>();

    public ScrabbleHelper() throws FileNotFoundException {
        Scanner s = new Scanner(new File("files/word_list.txt"));
        while (s.hasNext()) {
            wordsList.add(s.next());
        }
    }

    public boolean foundWord(String word) {
        int high = wordsList.size() - 1;
        int low = 0;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (word.compareTo(wordsList.get(mid)) > 0) {
                low = mid + 1;
            } else if (word.compareTo(wordsList.get(mid)) < 0) {
                high = mid - 1;
            } else if (word.equals(wordsList.get(mid))) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> findMatches(String fragment) {
        ArrayList<String> matches = new ArrayList<>();
        for (String word : wordsList) {
            if (word.indexOf(fragment)>= 0) {
                matches.add(word);
            }
        }
        return matches;
    }

    public void sortWords(ArrayList<String> list) {
        String temp;
        int count;
        for (int i = 1; i < list.size(); i++) {
            temp = list.get(i);
            count = i-1;
            while (count >= 0 && temp.length() < list.get(count).length()) {
                list.set(count + 1, list.get(count));
                count--;
            }
            list.set(count + 1, temp);
        }
    }

    public ArrayList<String> findUsable(String letters) {
        ArrayList<Character> hand = new ArrayList<>();
        ArrayList<String> possibleWords = new ArrayList<>();
        ArrayList<Character> letterTest = new ArrayList<>();
        int container = 0;
        for (int i = 0; i < letters.length(); i++) {
            hand.add((Character)letters.charAt(i));
        }


        for (String words: wordsList) {
            container = 0;
            letterTest = new ArrayList<>(hand);
            for(int i = words.length() - 1; i >= 0; i--) {
                if (letterTest.contains(words.charAt(i))) {
                    letterTest.remove((Character)words.charAt(i));
                    container++;
                } else {
                    break;
                }
            }
            if (container == words.length()) {
                possibleWords.add(words);
            }
        }
        return possibleWords;
    }

    public int getScores(String word) {
        int[] scores = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            score += scores[word.charAt(i) - 'a'];
        }
        return score;
    }

    public void sortByScores(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int smallest = i;
            for (int k = i + 1; k < list.size(); k++) {
                if (getScores(list.get(k)) < getScores(list.get(smallest))) {
                    smallest = k;
                }
            }
            String temp = list.get(i);
            list.set(i, list.get(smallest));
            list.set(smallest, temp);
        }
    }

    public ArrayList<String> getWordsList() {
        return wordsList;
    }

    public static void main(String[] args) throws FileNotFoundException{

    }
}

