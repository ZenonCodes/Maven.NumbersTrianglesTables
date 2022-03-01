package io.zipcoder.microlabs.mastering_loops;

import java.util.Scanner;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);

    }

    public static String getMultiplicationTable(int tableSize) {
        String result = " ";
        int i = 1;
        int multiple = 1;

      for (; i < tableSize + 1; i++) {
          for (int j = 1; j < tableSize + 1; j ++){

              if (j * multiple < 10){
              result += " " + j * multiple;
              } else {
                  result += j * multiple;
              }
                      if (j == tableSize) {
                          result += " |";
                      }else if (j * multiple < 100) {
                          result += " | ";
                      } else {
                          result += "| ";
                      }
          }
          result += '\n';
          if (i != tableSize) result += " ";
          multiple++;
  }
        return result;

    }

}

