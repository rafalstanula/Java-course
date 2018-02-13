package pl.sdacademy.rafalstanula.designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public abstract class PowNumbers {

    public Integer pow (List<Integer> list) {
      list.forEach(a -> a*=a);

        calculate(list);

        return calculate(list);
    }
    protected abstract Integer calculate(List<Integer> list);
}
