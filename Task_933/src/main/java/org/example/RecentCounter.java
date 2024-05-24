package org.example;

import com.sun.source.tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

class RecentCounter {
    private List<Integer> pings;
    public RecentCounter() {
        pings = new ArrayList();
    }

    public int ping(int t) {
        int counter = 1;
        for (int i = 0; i < pings.size(); i++) {
            if (pings.get(i) >= t - 3000) {
                counter++;
            }
        }
        pings.add(t);
        return counter;
    }
}