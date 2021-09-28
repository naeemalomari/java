package basicLibrary;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

//
        Library library =new Library();
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] myArray = library.roll(4);
        System.out.println(Arrays.toString(myArray));
        System.out.println(library.containsDuplicates(myArray));
        System.out.println(library.average(myArray));
        System.out.println(Arrays.toString(library.lowestAvg(weeklyMonthTemperatures)));
//    int[] binaryArray = {2,5,6,8,9,5,1,9,2,6};
//    int n1 =library.binarySearch(binaryArray, 1);
//        System.out.println(n1);
    }
}