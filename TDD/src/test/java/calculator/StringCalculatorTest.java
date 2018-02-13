package calculator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


/**
 * Tdd training on 31.01.18.
 */
@RunWith(JUnitParamsRunner.class)
public class StringCalculatorTest {

    private Object[][] paramsForTests(){
        return new Object[][]{
                {"1",1},
                {"1,1", 2},
                {"1200,1000", 2200},
                {"1,4,1", 6},
                {"25,25,25", 75},
                {"", 0},
                {"99,1,99,1,99,1", 300},
                {"1\n2,3", 6},
                {"1,3,4\n2,3", 13},
                {"1\n3", 4},
                {"1\n3\n6\n10", 20},
                {";1;3;6;10", 20}
        };
    }

    @Test
    @Parameters(method = "paramsForTests")
    public void shouldReturnSumWhenInputStringOfNumbers(String input, int expectedResults){
        StringCalculator testedObject = new StringCalculator();

        int result = testedObject.Add(input);
        assertThat(result).isEqualTo(expectedResults);
    }

    @Test (expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenNegativeNumbersInput(){
        StringCalculator testedObject = new StringCalculator();

        testedObject.Add("-2,1,14,3");
    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void shouldThrowIllegalArgumentExceptionWhenNotEnoughMoney() {
//        Account from = new Account(A, new Instrument(EUR, -501));
//        Account to = new Account(B, new Instrument(EUR, 0));
//
//        testedObject.transferMoney(from, to, new Instrument(EUR, 200));
//    }
//
//    @Test
//    public void shouldThrowIllegalArgumentExceptionWithProperMessageWhenNotEnoughMoney() {
//        expectedException.expect(IllegalArgumentException.class);
//        expectedException.expectMessage(SORRY_TEXT);
//        Account from = new Account(A, new Instrument(EUR, -501));
//        Account to = new Account(B, new Instrument(EUR, 0));
//
//        testedObject.transferMoney(from, to, new Instrument(EUR, 200));
//    }
//
//    @Test
//    public void shouldThrowIllegalArgumentExceptionWithProperMessageWhenNotEnoughMoneyUsingAssertJ() {
//        Account from = new Account(A, new Instrument(EUR, -501));
//        Account to = new Account(B, new Instrument(EUR, 0));
//
//
//        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(
//                () -> testedObject.transferMoney(from, to, new Instrument(EUR, 200))
//        ).withMessage(SORRY_TEXT);
//    }
}