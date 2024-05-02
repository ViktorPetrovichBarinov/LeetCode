package org.example;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Car[] cars = new Car[position.length];
        for (int i = 0; i < position.length; i++) {
            cars[i] = new Car(position[i], speed[i]);
        }

        Arrays.sort(cars, Collections.reverseOrder());
        int groups = 0;
        for (int i = 0; i < cars.length; i++) {
            groups++;
            int firstCarSpeed = cars[i].speed;
            int firstCarPosition = cars[i].position;
            int differenceFirstCar = target - firstCarPosition;
            double timeToTargetFirstCar = (double) differenceFirstCar / firstCarSpeed;
            for (int j = i + 1; j < cars.length; j++) {
                if (firstCarSpeed < cars[j].speed) {
                    int differenceICar = target - cars[j].position;
                    double timeToTargetICar = (double) differenceICar / cars[j].speed;
                    if (timeToTargetICar <= timeToTargetFirstCar) {
                        i++;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return groups;
    }

    public static class Car implements Comparable<Car> {
        int position;
        int speed;
        public Car(int position, int speed) {
            this.position = position;
            this.speed = speed;
        }
        @Override
        public int compareTo(Car other) {
            return Integer.compare(this.position, other.position);
        }
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.carFleet(31, new int[]{5,26,18,25,29,21,22,12,19,6}, new int[]{7,6,6,4,3,4,9,7,6,4}));
    }
}