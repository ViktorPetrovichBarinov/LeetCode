package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[][] findFarmland(int[][] land) {
        int rows = land.length;;
        int cols = land[0].length;
        boolean[][] visited = new boolean[rows][cols];
        List<Element> elements = new ArrayList<Element>();
        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    if (land[i][j] == 1) {
                        int right = j + 1;
                        while (right < cols && land[i][right] == 1) {
                            visited[i][right] = true;
                            right++;
                        }
                        right--;
                        int down = i + 1;
                        while (down < rows && land[down][j] == 1) {
                            for (int k = j; k <= right; k++) {
                                visited[down][k] = true;
                            }
                            down++;
                        }
                        down--;
                        elements.add(new Element(j, i, right, down));
                    }
                }
            }
        }
        int[][] answer = new int[elements.size()][4];
        for (int i  = 0; i < elements.size(); i++) {
            Element element = elements.get(i);
            answer[i][0] = element.y1;
            answer[i][1] = element.x1;
            answer[i][2] = element.y2;
            answer[i][3] = element.x2;
        }
        return answer;
    }

    public static class Element {
        public int x1;
        public int y1;
        public int x2;
        public int y2;
        public Element(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.deepToString(sol.findFarmland(new int[][]{
                {1,1},
                {1,1}
        })));
    }
}