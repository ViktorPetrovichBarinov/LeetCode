package org.example;

import java.util.*;

public class SolutionImprove {
    public int[] topKFrequent(int[] nums, int k) {
        int length = nums.length;
        if (length == 1) {
            return nums;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        //находим минимум максимум в худшем случае за 10^5
        for (int i = 0; i < length; i++) {
            int currentElement = nums[i];
            if (currentElement > max) {
                max = currentElement;
            }
            if (currentElement < min) {
                min = currentElement;
            }
        }
        //мапим минимум в 0 максимум в последний индекс
        //максимально возможная длинна массива 2*10^4
        int[] hist = new int[max - min + 1];

        //подсчитываем количество каждого элемента
        for (int i = 0; i < length; i++) {
            hist[nums[i] - min]++;
        }

        //строим массив растущих массивов
        //i-ому элементу ссответствуют элементы, которые встречаются в массиве i-раз
        int histLength = hist.length;
        ArrayList<Integer>[] data = new ArrayList[length + 1];

        //заполняем его
        for (int i = 0; i < histLength; i++) {
            //обращаемся по встречаемости элемента в исходном массиве
            if (data[hist[i]] == null) {
                data[hist[i]] = new ArrayList<>();
            }
            //добавляем уже готовый элемент размапливая его
            data[hist[i]].addLast(i + min);
        }

        int[] answer = new int[k];
        int answerIndex = 0;
        //ответ
        for (int i = length; i >= 0 && answerIndex < k; i--) {
            ArrayList<Integer> currentData = data[i];
            if (currentData == null) {
                continue;
            }
            for (int j = 0; j < currentData.size(); j++) {
                answer[answerIndex++] = currentData.get(j);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        SolutionImprove sol = new SolutionImprove();
        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{-1, -1}, 1)));
        System.out.println(Arrays.toString(sol.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2)));
    }
}
