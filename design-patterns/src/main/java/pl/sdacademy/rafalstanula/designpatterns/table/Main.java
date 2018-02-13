package pl.sdacademy.rafalstanula.designpatterns.table;

import org.apache.commons.lang.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        for(int i = 1;i <= 100;++i) {
            String text = "";
            if(i % 3 == 0) {
                text += "TIC";
            }

            if(i % 5 == 0) {
                text += "TOCK";
            }

            if(text.length() == 0) {
                text = String.valueOf(i);
            }

            System.out.println(text);
        }

        /*String[][] tab = new String[][] {
                {"Nr.", "1.", "2.", "3."},
                {"Nazwa", "Testowa nazwa 1", "Nazwa 2", "N 3"},
                {"Cena", "1372.5zł", "0.38zł", "27.2zł"}
        };

        printTable(tab, 3, 4);*/
    }

    private static void printTable(String[][] tab, int cols, int rows) {
        int[] colsSize = new int[cols];

        for(int i = 0;i < cols;++i) {
            colsSize[i] = 2 + Collections.max(Arrays.asList(tab[i]), Comparator.comparingInt(String::length)).length();
        }

        int width = IntStream.of(colsSize).sum() + 1 + colsSize.length;

        System.out.println(StringUtils.repeat("*", width));
        for(int j = 0;j < rows;++j) {
            System.out.print("*");
            for (int i = 0; i < cols; ++i) {
                System.out.print(StringUtils.center(tab[i][j], colsSize[i]) + "*");
            }
            System.out.println();
            System.out.println(StringUtils.repeat("*", width));
        }
    }
}
