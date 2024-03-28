package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void test1() {
        Solution main = new Solution();
        int[] nums = new int[]{1, 2, 3, 4};
        int[] answer = new int[]{1, 3, 6, 10};

        int[] ret = main.runningSum(nums);
        for (int i = 0; i < answer.length; i++) {
            assertEquals(ret[i], answer[i]);
        }
    }

    @Test
    void test2() {
        Solution main = new Solution();
        int[] nums = new int[]{1, 1, 1, 1, 1};
        int[] answer = new int[]{1, 2, 3, 4, 5};

        int[] ret = main.runningSum(nums);
        for (int i = 0; i < answer.length; i++) {
            assertEquals(ret[i], answer[i]);
        }
    }

    @Test
    void test3() {
        Solution main = new Solution();
        int[] nums = new int[]{3, 1, 2, 10, 1};
        int[] answer = new int[]{3, 4, 6, 16, 17};

        int[] ret = main.runningSum(nums);
        for (int i = 0; i < answer.length; i++) {
            assertEquals(ret[i], answer[i]);
        }
    }
}
