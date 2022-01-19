import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TraversingArrayLists {

    // Please write the two methods for listOfStates in the space below. Uncomment the tests
    // when you are ready to run them.


    public static ArrayList<Integer> largestAndSmallest(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNext()) {
            list.add(input.nextInt());
        }
        // Your code should go below here, and above the return statement.


        return list;
    }







}
