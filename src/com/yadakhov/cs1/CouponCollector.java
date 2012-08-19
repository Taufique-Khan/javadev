package com.yadakhov.cs1;

/**
 * Given N distinct card types, how many random cards do you need
 * do collect before you have (at least) one of each type?
 * This program simulates this random process.
 */
public class CouponCollector {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean[] found = new boolean[N];
        int cardcnt = 0;    // total number of cards collected
        int valcnt = 0;     // number of distinct cards

        // Repeatedly choose a random card and check whether it's a new one
        while (valcnt < N) {
            int val = (int) (Math.random() * N);  // random card between 0 and N-1
            cardcnt++;
            if (!found[val]) {
                valcnt++;
                found[val] = true;
            }
        }

        // print number of cards collected
        System.out.println(cardcnt);
    }
}
