package org.example;

import java.util.Arrays;

public class SolutionFaster {
    public void duplicateZeros(int[] arr) {
        int[] clone = arr.clone();
        int length = clone.length;
        int cloneIndex = 0;
        for (int arrIndex = 0; arrIndex < length; arrIndex++) {
            arr[arrIndex] = clone[cloneIndex];
            if (clone[cloneIndex] == 0) {
                arrIndex++;
                if (arrIndex >= length) {
                    break;
                }
                arr[arrIndex] = 0;
            }
            cloneIndex++;
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[] {1,0,2,3,0,4,5,0};
        SolutionFaster sol = new SolutionFaster();
        sol.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
}
