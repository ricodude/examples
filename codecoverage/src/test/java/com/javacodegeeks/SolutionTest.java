package com.javacodegeeks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testSortAsc () {
        Integer[] asc = solution.sort(true);
        Assert.assertTrue(asc[0] == 2);
    }

    @Test
    public void testSortDesc () {
        Integer[] desc = solution.sort(false);
        Assert.assertTrue(desc[0] == 890);
    }

}