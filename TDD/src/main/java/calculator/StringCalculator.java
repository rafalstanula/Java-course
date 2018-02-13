package calculator;

import java.util.Arrays;

public class StringCalculator {


    public int Add(String numbers) {

        if(numbers.length() > 0) {

            String firstChar = numbers.substring(0,1);

            if((firstChar.matches("-"))){
                throw new IllegalArgumentException();
            }
            else if(firstChar.matches("-?[1-9]\\d*|0")) {
                int sum = 0;
                int[] intArray = Arrays.asList(numbers.split(",|\\n")).stream().mapToInt(Integer::parseInt).toArray();
                for (int e : intArray) {
                    if(e < 0){
                        throw new IllegalArgumentException();
                    }
                    sum = sum + e;
                }
                return sum;
            }else{
                int sum = 0;
                int[] intArray = Arrays.asList(numbers.substring(1).split(firstChar)).stream().mapToInt(Integer::parseInt).toArray();
                for (int e : intArray) {
                    if(e < 0){
                        throw new IllegalArgumentException();
                    }
                    sum = sum + e;
                }
                return sum;
            }
        }
        return 0;
    }
}
