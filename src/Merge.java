import java.util.ArrayList;

public class Merge {
    public static ArrayList<Integer> mergeLists(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        ArrayList<Integer> merged = new ArrayList<>();
        int temp;
        int index;
        for (int num: listOne) {
            merged.add(num);
        }
        for (int num: listTwo) {
            merged.add(num);
        }
        for (int i = 1; i < merged.size(); i++) {
            temp = merged.get(i);
            index = i - 1;
            while (index >= 0 && temp < merged.get(index)) {
                merged.set(index + 1, merged.get(index));
                index--;
            }
            merged.set(index + 1, temp);
        }


        return merged;
    }
}
