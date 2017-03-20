package org.adam.algorithms.dinamic_connectivity.algorithms.implementations;

import org.adam.algorithms.dinamic_connectivity.algorithms.UnionFinder;

/**
 * Quick Find
 * efficiency:
 * initialize: N
 * union: N
 * find: 1
 * When initialize and union we loop through the whole array!!! Not good.
 * Union is too expensive. It takes N^2 (quadratic) array accesses to process a sequence of N union commands on N objects
 */
public class QuickFind implements UnionFinder {
    private int[] idArr;

    public QuickFind() {
        super();
    }

    public QuickFind(int N) {
        idArr = new int[N];
        for (int i = 0; i < N; i++){
            idArr[i] = i;
        }
    }

    public void union(int p, int q) {
        int pId = idArr[p];
        int qId = idArr[q];
        for (int i = 0; i < idArr.length; i++){
            if(idArr[i] == pId) idArr[i] = qId;
        }
    }

    public boolean connected(int p, int q) {
        return idArr[p] == idArr[q];
    }

    public int[] getIdArr() {
        return idArr;
    }
}
