package com.saniaky.lesson1;

/**
 * @author saniaky
 * @since 2/19/17
 */
@SuppressWarnings("WeakerAccess")
public class QuickUnionWeighted {

    private int[] id;
    private int[] size;

    public QuickUnionWeighted(int N) {
        id = new int[N];
        size = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    public void uion(int p, int q) {
        int root1 = findRoot(p);
        int root2 = findRoot(q);

        if (root1 == root2) {
            return;
        }

        if (size[root1] < size[root2]) {
            id[root1] = root2;
            size[root2] += size[root1];
        } else {
            id[root2] = root1;
            size[root1] += size[root2];
        }
    }

    private int findRoot(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean isConnected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

}
