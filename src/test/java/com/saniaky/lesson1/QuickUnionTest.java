package com.saniaky.lesson1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Alexander Kohonovsky
 * @since 4/19/18
 */
public class QuickUnionTest {

    @Test
    public void test() {
        QuickUnion uf = new QuickUnion(10);
        uf.uion(1, 4);
        assertTrue(uf.isConnected(1, 4));
        assertFalse(uf.isConnected(1, 5));
    }

}