package pl.sdacademy.rafalstanula.designpatterns.strategy;

import java.util.List;

public class QuickSortChangePolishChars extends ChangePolishChars {
    @Override
    protected void sort(List<String> list) {
        list.sort(String.CASE_INSENSITIVE_ORDER);
    }
}
