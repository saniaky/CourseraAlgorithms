package com.saniaky.lesson1;

/**
 * Weighted Quick Union with Path Compression
 *
 * <p> Cost model:
 * <li>Initialize - N
 * <li>Union - lg(N) (Worst case)
 * <li>Find - lg(N) (Worst case)
 *
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

        // Initialize nodes
        for (int i = 0; i < N; i++) {
            id[i] = i;
            size[i] = 1;
        }
    }

    public void union(int p, int q) {
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
            // Add path compression
            // Make every other node in path point to its grandparent (thereby halving path length).
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }

    public boolean isConnected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

}
