import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ArrayListAlgorithms_Tests {

    /*
    @Test
    public void fileDuplicatesTest() throws FileNotFoundException{
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(9);
        expected.add(22);
        expected.add(-4);
        expected.add(3);
        ArrayList<Integer> actual = ArrayListAlgorithms.fileDuplicates();
        assertEquals(expected, actual);
    }

     */


/*
    @Test
    public void fileDuplicatesTwoTest() throws FileNotFoundException {
        Scanner inputFileOne = new Scanner(new File("data_files/names2.txt"));
        ArrayList<String> expected = new ArrayList<>();
        while (inputFileOne.hasNext()) {
            expected.add(inputFileOne.nextLine());
        }
        ArrayList<String> actual = ArrayListAlgorithms.fileDuplicatesTwo();
        assertEquals(expected, actual);
    }

 */
 /*
    @Test
    public void orderedListTest() throws FileNotFoundException {
     Scanner inputFileOne = new Scanner(new File("data_files/ordered_set.txt"));
     ArrayList<Integer> expected = new ArrayList<>();
     while (inputFileOne.hasNext()) {
      expected.add(inputFileOne.nextInt());
     }
     ArrayList<Integer> actual = ArrayListAlgorithms.orderedList();
     assertEquals(expected, actual);
    }

  */


 }
