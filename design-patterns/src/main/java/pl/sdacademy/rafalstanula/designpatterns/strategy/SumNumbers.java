package pl.sdacademy.rafalstanula.designpatterns.strategy;

import java.util.List;

public class SumNumbers extends Numbers {
    @Override
    protected int flat(List<Integer> numbers) {
        return numbers.stream().mapToInt(a -> a).sum();
    }
}
