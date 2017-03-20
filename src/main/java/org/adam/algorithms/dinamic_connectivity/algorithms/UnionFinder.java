package org.adam.algorithms.dinamic_connectivity.algorithms;


public interface UnionFinder {
    void union(int p, int q);
    boolean connected(int p, int q);
    int[] getIdArr();
}
