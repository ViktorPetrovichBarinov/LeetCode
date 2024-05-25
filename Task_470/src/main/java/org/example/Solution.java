package org.example;

class Solution extends SolBase {
    public int rand10() {
        int fst = rand7();
        int snd = rand7();
        int ans = fst * 10 + snd;
        return ans % 10;
    }
}