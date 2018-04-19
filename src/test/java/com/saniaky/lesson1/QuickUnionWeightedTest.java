package com.saniaky.lesson1;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Alexander Kohonovsky
 * @since 4/19/18
 */
public class QuickUnionWeightedTest {

    @Test
    public void test() {
        QuickUnionWeighted uf = new QuickUnionWeighted(10);

        uf.union(1, 4);

        Assert.assertTrue(uf.isConnected(1, 4));
        Assert.assertFalse(uf.isConnected(1, 5));
    }

}