import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {

    public static ArrayList<Donor> donorList;

    public static void main(String[] args) throws IOException {
        donorList = new ArrayList<>();
        getDonorList("files/donors.txt");
        sortDonorList();
        System.out.println(donorList.get(0).getName()); // Should print out Hernandez
        System.out.println(donorList.get(donorList.size()-1).getName()); // Should print out Hall
        System.out.println(getDonatedAmount("Anderson")); // should print 1436.5
        System.out.println(getDonatedAmount("Roberts")); // should print 307.86
        System.out.println(getDonatedAmount("Wilkinson")); // should print 0.0
    }

    public static void getDonorList(String filename) throws IOException {
        String name;
        double amount;
        Scanner s = new Scanner(new File(filename));
        while (s.hasNext()) {
            name = s.next();
            amount = s.nextDouble();
            donorList.add(new Donor(name, amount));
        }
    }

    public static void sortDonorList() {
        Donor temp;
        int index;
        for (int i = 1; i < donorList.size(); i++){
            temp = donorList.get(i);
            index = i - 1;
            while (index >= 0 && temp.getAmount() < donorList.get(index).getAmount()) {
                donorList.set(index + 1, donorList.get(index));
                index--;
            }
            donorList.set(index + 1, temp);
        }
    }

    public static double getDonatedAmount(String name) {
        for (Donor a: donorList) {
            if (a.getName().equals(name))
                return a.getAmount();
        }
        return 0.0; // this is returned if the name is not found
    }
}
