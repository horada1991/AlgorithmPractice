package org.adam.algorithms.dinamic_connectivity.algorithms.implementations;

import org.adam.algorithms.dinamic_connectivity.algorithms.UnionFinder;

import java.util.Arrays;

/**
 * Created by Cerianth on 2017.03.24..
 */
public class WeightedQU implements UnionFinder {
    private int[] idArr;
    private int[] treeSize;


    public WeightedQU() {
        super();
    }

    public WeightedQU(int N) {
        treeSize = new int[N];
        Arrays.fill(treeSize, 1);

        idArr = new int[N];
        for (int i = 0; i < N; i++){
            idArr[i] = i;
        }
    }

    public void union(int p, int q) {
        int i = findRoot(p);
        int j = findRoot(q);
        if (i == j) return;
        if (treeSize[i] < treeSize[j]) {
            idArr[i] = j;
            treeSize[j] += treeSize[i];
        } else {
            idArr[j] = i;
            treeSize[i] += treeSize[j];
        }
    }

    private int findRoot(int i){
        while (i !=  idArr[i]){
            // grandparent
            idArr[i] = idArr[idArr[i]];
            i = idArr[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    public int[] getIdArr() {
        return idArr;
    }
}
