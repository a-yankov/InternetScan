package com.company;

// Java program to print all
// possible strings of length k

import java.util.ArrayList;
import java.util.List;

class GFG {

    // The method that prints all
// possible strings of length k.
// It is mainly a wrapper over
// recursive function printAllKLengthRec()
    static List<String> printAllKLength(char[] set, int k) {

        int n = set.length;
        return printAllKLengthRec(set, "", n, k);
    }

    // The main recursive method
// to print all possible
// strings of length k
    static List<String> printAllKLengthRec(char[] set,
                                   String prefix,
                                   int n, int k) {
        List<String> list = new ArrayList<>();
        // Base case: k is 0,
        // print prefix
        if (k == 0) {
            list.add(prefix);
            //return;
        }

        // One by one add all characters
        // from set and recursively
        // call for k equals to k-1
        for (int i = 0; i < n; ++i) {

            // Next character of input added
            String newPrefix = prefix + set[i];

            // k is decreased, because
            // we have added a new character
            printAllKLengthRec(set, newPrefix,
                    n, k - 1);
        }
        return null;
    }
}