package pl.sdacademy.rafalstanula.designpatterns.decorator;

import java.time.LocalDate;

public class DayMotto implements Motto {
    private static final String[] MOTTO_LIST = new String[] {
            "Test 1",
            "Test 2",
            "Test 3",
            "Test 4",
            "Test 5",
            "Test 6",
            "Test 7"
    };

    @Override
    public String getMotto() {
        return MOTTO_LIST[LocalDate.now().getDayOfWeek().getValue() - 1];
    }
}
