package pl.sdacademy.rafalstanula.designpatterns.strategy;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public abstract class ChangePolishChars {
    public List<String> change(List<String> list) {
        List<String> newList = new ArrayList<>(list);
        List<String> changedList = new ArrayList<>();

        for (String e : newList) {
            changedList.add(removeAccents(e));
        }
        sort(changedList);

        return changedList;
    }

    private String removeAccents(String text) {
        return text == null ? null :
                Normalizer.normalize(text, Normalizer.Form.NFD)
                        .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }

    protected abstract void sort(List<String> list);
}
