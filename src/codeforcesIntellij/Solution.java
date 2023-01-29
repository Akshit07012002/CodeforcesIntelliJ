package codeforcesIntellij;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> tri = new ArrayList<>();
        List<Integer> fRow = new ArrayList<>();

        if (numRows == 0) return tri;

        fRow.add(1);
        tri.add(fRow);

        for (int i = 1; i < numRows; i++) {

            List<Integer> prevRow = tri.get(i - 1);
            List<Integer> currRow = new ArrayList<>();

            currRow.add(1);

            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currRow.add(1);
            tri.add(currRow);

        }

        return tri;

    }
}
