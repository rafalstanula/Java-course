package pl.sdacademy.rafalstanula.designpatterns.strategy;

import java.util.List;
import java.util.OptionalDouble;

public class AvgNumbers extends Numbers {
    @Override
    protected int flat(List<Integer> numbers) {
        OptionalDouble average = numbers.stream().mapToInt(a -> a).average();

        return (int)average.orElse(0);
    }
}
