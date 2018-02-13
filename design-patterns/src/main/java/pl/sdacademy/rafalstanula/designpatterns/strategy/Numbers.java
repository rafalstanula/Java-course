package pl.sdacademy.rafalstanula.designpatterns.strategy;

import java.util.List;

public abstract class Numbers {
    public int compute(List<Integer> numbers) {
        numbers.forEach(a -> a *= a);

        return flat(numbers);
    }

    protected abstract int flat(List<Integer> numbers);
}
