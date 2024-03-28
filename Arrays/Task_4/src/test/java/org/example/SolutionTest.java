package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void mergeTest1() {
        Solution sol = new Solution();
        int[] fst = new int[]{1,3};
        int[] snd = new int[]{2};
        int[] ans = new int[]{1,2,3};

        int[] res = sol.mergeTwoArrays(fst, snd);
        assertEquals(res.length, ans.length);
        for (int i = 0; i < res.length; i++) {
            assertEquals(res[i], ans[i]);
        }
    }

    @Test
    public void mergeTest2() {
        Solution sol = new Solution();
        int[] fst = new int[]{1,2};
        int[] snd = new int[]{3,4};
        int[] ans = new int[]{1,2,3,4};

        int[] res = sol.mergeTwoArrays(fst, snd);
        assertEquals(res.length, ans.length);
        for (int i = 0; i < res.length; i++) {
            assertEquals(res[i], ans[i]);
        }
    }

    @Test
    public void mergeTest3() {
        Solution sol = new Solution();
        int[] fst = new int[]{1,2};
        int[] snd = new int[]{3,4,5,7};
        int[] ans = new int[]{1,2,3,4,5,7};

        int[] res = sol.mergeTwoArrays(fst, snd);
        assertEquals(res.length, ans.length);
        for (int i = 0; i < res.length; i++) {
            assertEquals(res[i], ans[i]);
        }
    }
}
