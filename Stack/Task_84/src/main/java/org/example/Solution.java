package org.example;

import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Element> stack = new Stack<>();
        int maxArea = 0;
        int length = heights.length;
        for (int i = 0; i < length; i++) {
            int height = heights[i];
            if (stack.isEmpty()) {
                stack.push(new Element(i, height));
            } else if (height > stack.peek().height){
                stack.push(new Element(i, height));
            } else if (height < stack.peek().height) {
                Element currentElement = new Element(i, height);
                while(!stack.isEmpty()) {
                    Element top = stack.pop();
                    if (top.height >= height) {
                        maxArea = Math.max(maxArea, (i - top.index) * top.height);
                        currentElement.index = top.index;
                    } else {
                        stack.push(top);
                        break;
                    }
                }
                stack.push(currentElement);
            }
        }

        while (!stack.isEmpty()) {
            Element top = stack.pop();
            maxArea = Math.max(maxArea, top.height * (length - top.index));
        }
        return maxArea;
    }

    public static class Element{
        int index;
        int height;
        public Element(int index, int height) {
            this.index = index;
            this.height = height;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestRectangleArea(new int[]{2,1,5,6,2,3}));
        System.out.println(solution.largestRectangleArea(new int[]{2,4}));
        System.out.println(solution.largestRectangleArea(new int[]{2,1,2}));

    }
}