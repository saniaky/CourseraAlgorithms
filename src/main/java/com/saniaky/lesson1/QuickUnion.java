package com.saniaky.lesson1;

/**
 * @author saniaky
 * @since 2/19/17
 */
@SuppressWarnings("WeakerAccess")
public class QuickUnion {

    private int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public void uion(int p, int q) {
        int root1 = findRoot(p);
        int root2 = findRoot(q);
        id[root1] = root2;
    }

    public boolean isConnected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    private int findRoot(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

}
