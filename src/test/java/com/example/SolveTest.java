package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SolveTest {

    private final Solve solver = new Solve();

    @Test
    void findsMinimumEatingSpeed() {
        assertEquals(4, solver.minEatingSpeed(new int[] { 3, 6, 7, 11 }, 8));
    }

    @Test
    void handlesLargeHourLimit() {
        assertEquals(30, solver.minEatingSpeed(new int[] { 30, 11, 23, 4, 20 }, 5));
    }

    @Test
    void handlesOneHourPerPile() {
        assertEquals(23, solver.minEatingSpeed(new int[] { 30, 11, 23, 4, 20 }, 6));
    }
}
