package codeforcesIntellij;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LeetcodePascalsTri {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int rows = Integer.parseInt(in.readLine());

//        Solution.generate(rows);

        List<List<Integer>> triangle = generate(rows);

        for (List<Integer> row:triangle)
            System.out.println(row);


    }

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

