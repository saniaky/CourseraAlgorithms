package com.saniaky.lesson1.percolation;


/**
 * @author saniaky
 * @since 2/20/17
 */
public class Percolation {

    // true - open, false - blocked
    private boolean[][] grid;

    // create n-by-n grid, with all sites blocked
    public Percolation(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        grid = new boolean[n][n];
    }

    // test client (optional)
    public static void main(String[] args) {

    }

    // open site (row, col) if it is not open already
    public void open(int row, int col) {
    }

    // is site (row, col) open?
    public boolean isOpen(int row, int col) {
        return grid[row][col];
    }

    // is site (row, col) full?
    public boolean isFull(int row, int col) {
        return !isOpen(row, col);
    }

    // number of open sites
    public int numberOfOpenSites() {
        return 0;
    }

    // does the system percolate?
    public boolean percolates() {
        return false;
    }
}
