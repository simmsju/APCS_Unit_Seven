import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TraversingArrayLists {

    public static ArrayList<Integer> largestAndSmallest() throws FileNotFoundException {
        Scanner input = new Scanner(new File("files/numbers.txt"));
        ArrayList<Integer> list = new ArrayList<>();
        while (input.hasNext()) {
            list.add(input.nextInt());
        }
        // Your code should go below here, and above the return statement.

        return list;
    }


}
