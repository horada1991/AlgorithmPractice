package org.adam.algorithms.dinamic_connectivity.algorithms.implementations;

import org.adam.algorithms.dinamic_connectivity.algorithms.UnionFinder;

/**
 * Created by Cerianth on 2017.03.24..
 */
public class QuickUnion implements UnionFinder {
    private int[] idArr;

    public QuickUnion() {
        super();
    }

    public QuickUnion(int N) {
        idArr = new int[N];
        for (int i = 0; i < N; i++){
            idArr[i] = i;
        }
    }

    public void union(int p, int q) {
        idArr[findRoot(p)] = findRoot(q);
    }

    public boolean connected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    public int[] getIdArr() {
        return idArr;
    }

    private int findRoot(int i){
        while (i !=  idArr[i]) i = idArr[i];
        return i;
    }
}
