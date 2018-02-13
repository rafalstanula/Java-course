package pl.sdacademy.rafalstanula.designpatterns.strategy;

import java.util.Arrays;
import java.util.List;

public class MedianPowNumbers extends PowNumbers{
    @Override
    protected Integer calculate(List<Integer> list) {
        Integer[] array = new Integer[list.size()];
        list.toArray(array);
        Arrays.sort(array);
        Integer median;
        if (array.length % 2 == 0)
            median = (array[array.length/2] + array[array.length/2 - 1])/2;
        else
            median = array[array.length/2];

        return median;
    }
}
