// Zach Weldon
//The following program reads two arrays from files two of the four files, merges them into one, and outputs the merged array elements.

package org.example;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class MergeArrays {

    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {
        int[] first = new int[20];
        int countFirst = 0;      //used to determine number of elements in "first"

        int[] second = new int[20];
        int countSecond = 0;    //used to determine number of elements in "second"

        int[] merge = new int[40];
        //counters used when merging two arrays
        int indexMerge = 0;
        int indexFirst = 0;
        int indexSecond = 0;

        //open files
        Scanner inFile1 = new Scanner(new File("array1.txt"));
        Scanner inFile2 = new Scanner(new File("array2.txt"));
        //Scanner inFile1 = new Scanner(new File("array1b.txt"));
        //Scanner inFile2 = new Scanner(new File("array2b.txt"));


        //populate "first" array and output its elements
        System.out.println("First Array: ");
        while (inFile1.hasNext()) {
            first[countFirst] = inFile1.nextInt();
            System.out.print(first[countFirst] + "  ");
            countFirst++;
        }
        System.out.println();
        ////////////////////////////////////////////////////////////////////////////////////
        //TODO:  Populate "second" array and output its elements
        ////////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nSecond array: ");
        while (inFile2.hasNext()) {
            second[countSecond] = inFile2.nextInt();
            System.out.print(second[countSecond] + "  ");
            countSecond++;
        }
        System.out.println();


        //initialize index variables - these will be needed to merge arrays
        indexFirst = 0;
        indexSecond = 0;


        ////////////////////////////////////////////////////////////////////////////////////
        //TODO:  Use a while-loop to traverse through BOTH arrays merging them into "merge" array

        while (indexFirst < countFirst && indexSecond < countSecond) {
            if (first[indexFirst] < second[indexSecond]) {
                merge[indexMerge] = first[indexFirst];
                indexFirst++;
            } else {
                merge[indexMerge] = second[indexSecond];
                indexSecond++;
            }
        indexMerge++;
    }

        //TODO:  Capture remaining element(s) from either the first array or the second
        //array by checking to see which array's count variable is less than its length
        //That is, which is true: indexFirst < countFirst OR indexSecond < countSecond
        ////////////////////////////////////////////////////////////////////////////////////
        if(indexFirst < countFirst) {
            while (indexFirst < countFirst) {
                merge[indexMerge] = first[indexFirst];
                indexFirst++;
                indexMerge++;
            }
        }else {
            while (indexSecond < countSecond) {
                merge[indexMerge] = second[indexSecond];
                indexSecond++;
                indexMerge++;
            }
        }



        ///////////////////////////////////////////////////////////////////////////////////
        //TODO: Output/print elements of "merge" array
        ///////////////////////////////////////////////////////////////////////////////////
        System.out.println("\n The Merged Array: ");
        for(int i = 0; i < indexMerge; i++){
            System.out.println("Elements: " +merge[i]);
        }
        inFile1.close();
        inFile2.close();
    }

}