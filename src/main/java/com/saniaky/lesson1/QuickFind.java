package com.saniaky.lesson1;

/**
 * @author saniaky
 * @since 2/17/17
 */
@SuppressWarnings("WeakerAccess")
public class QuickFind {

    private int[] array;

    public QuickFind(int N) {
        array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = i;
        }
    }

    public void uion(int a, int b) {
        if (array[a] == array[b]) {
            return;
        }

        int pid = array[a];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == pid) {
                array[i] = array[b];
            }
        }
    }

    public boolean isConnected(int a, int b) {
        return array[a] == array[b];
    }


}
