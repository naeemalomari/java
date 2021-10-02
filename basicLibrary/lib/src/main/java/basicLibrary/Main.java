package basicLibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


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

        System.out.println("*********28/9/2021 ( REQUIREMENTS )****************");
        System.out.println((library.maxAndMin(weeklyMonthTemperatures)));

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String name = library.tally(votes);
        System.out.println(name+ " received the most votes!");
    }
}
