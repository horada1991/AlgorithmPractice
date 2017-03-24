package org.adam.algorithms.dinamic_connectivity;


import org.adam.algorithms.dinamic_connectivity.algorithms.UnionFinder;
import org.adam.algorithms.dinamic_connectivity.algorithms.implementations.QuickFind;
import org.adam.algorithms.dinamic_connectivity.algorithms.implementations.QuickUnion;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        UnionFinder uf = new QuickUnion(N);

        while (in.hasNext()){
            int p = in.nextInt();
            int q = in.nextInt();
            if (!uf.connected(p, q)){
                uf.union(p, q);
                System.out.println(p + " " + q);
                System.out.println(Arrays.toString(uf.getIdArr()));
            }
        }
    }
}
