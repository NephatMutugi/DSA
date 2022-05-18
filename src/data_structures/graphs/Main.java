package data_structures.graphs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NumberOfProvinces provinces = new NumberOfProvinces();
        SmallestStringWithSwaps stringWithSwaps = new SmallestStringWithSwaps();


        int [][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        System.out.println( "Provinces -> "+ provinces.findCircleNum(isConnected));

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> integerList = new ArrayList<>();
        list.add(0);
        list.add(3);
        integerList.add(list);

        list2.add(1);
        list2.add(2);
        integerList.add(list2);
        String s = "dcab";
        System.out.println(stringWithSwaps.smallestStringWithSwaps(s, integerList));

    }
}
