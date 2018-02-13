package pl.sdacademy.rafalstanula.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class AddPowNumbers extends PowNumbers {
    @Override
    protected Integer calculate(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list);
        Integer sum = 0;
        for (Integer e : list) {
          sum = sum + e;
        }
        return sum;
    }
}
