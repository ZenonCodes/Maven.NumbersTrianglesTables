package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(4);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(9);

    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for (int i = 1; i < tableSize + 1; i++){
            result += i;
            for (int j = i + 1; j < tableSize + 1; j++) {
                result += j + " | ";
            }
            result += '\n';
        }
        return result;
    }
}
