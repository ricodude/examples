package com.javacodegeeks;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    private Integer[] arr = {2, 67, 43, 890, 5, 78, 98, 23, 100, 201};

    public Integer[] sort(boolean ascending) {
        if (ascending) {
            Arrays.sort(arr);
        } else {
            Arrays.sort(arr, Collections.reverseOrder());
        }
        return arr;
    }

}
