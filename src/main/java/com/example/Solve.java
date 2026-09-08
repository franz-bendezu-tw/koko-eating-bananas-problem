package com.example;

public class Solve {

    public int minEatingSpeed(int[] piles, int hours) {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {
            int speed = low + (high - low) / 2;
            if (canFinish(piles, hours, speed)) {
                high = speed;
            } else {
                low = speed + 1;
            }
        }

        return low;
    }

    private boolean canFinish(int[] piles, int hours, int speed) {
        long requiredHours = 0;

        for (int pile : piles) {
            requiredHours += (pile + (long) speed - 1) / speed;
            if (requiredHours > hours) {
                return false;
            }
        }

        return true;
    }
}
