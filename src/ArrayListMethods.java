import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {


    public static ArrayList<Integer> numberList() {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(0);
        ints.add(-5);
        ints.add(7);
        ints.add(12);
        ints.add(-1);
        ints.add(2, 10);
        ints.set(1, 9);
        ints.remove(4);
        return ints;
    }



    public static ArrayList<Double> firstAndLast() {
        ArrayList<Double> fal = new ArrayList<Double>();
        ArrayList<Double> last = new ArrayList<Double>();
        Scanner s = new Scanner(System.in);
        double num = 1;
        while (num != 0) {
            System.out.print("Please enter a decimal number: ");
            num = s.nextDouble();
            fal.add(num);
        }
        last.add((double)(fal.size()-1));
        last.add(fal.get(0));
        if (fal.size() != 1)
            last.add(fal.get(fal.size() - 2));
        else
            last.add(fal.get(fal.size() - 1));
        return last;
    }

    public static void main(String[] args) {
        ArrayList<Double> a = firstAndLast();
    }


    public static boolean double23(ArrayList<Integer> nums) {
        int threes = 0;
        int twos = 0;
        for (Integer num : nums) {
            if (num == 2)
                twos++;
            else if (num == 3)
                threes++;
        }
        if (twos >= 2 || threes >= 2)
            return true;
        else
            return false;
    }




    public static boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a.get(0) == b.get(0) || a.get(a.size() - 1) == b.get(b.size() - 1))
            return true;
        else
            return false;
    }


}
