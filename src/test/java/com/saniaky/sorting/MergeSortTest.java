package com.saniaky.sorting;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Alexander Kohonovsky
 * @since 4/19/18
 */
public class MergeSortTest {

    private SortTest sortTest;

    @Before
    public void setUp() {
        sortTest = new SortTest(new MergeSort());
    }

    @Test
    public void sort() {
        sortTest.run();
    }

}