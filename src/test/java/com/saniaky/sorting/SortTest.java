package com.saniaky.sorting;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Alexander Kohonovsky
 * @since 4/19/18
 */
class SortTest {

    private final static int[] in1 = new int[]{8, 5, 4, 2, 1, 7, 9, 3, 6};
    private final static int[] out1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    private final Sort sorting;

    SortTest(Sort sorting) {
        this.sorting = sorting;
    }

    void run() {
        int[] array = in1.clone();
        sorting.sort(array);
        assertArrayEquals(out1, array);
    }

}
