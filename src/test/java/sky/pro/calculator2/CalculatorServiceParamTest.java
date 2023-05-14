package sky.pro.calculator2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import sky.pro.calculator2.exception.DivZeroException;
import sky.pro.calculator2.service.CalculatorService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceParamTest {
    private final CalculatorService out = new CalculatorService();

    public static Stream<Arguments> plusTestParams() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(3, 5, 8));
    }

    @ParameterizedTest
    @MethodSource("plusTestParams")

    public void plusTest(int a, int b, int expected) {

        assertEquals(expected, out.plus(a, b));

    }

    public static Stream<Arguments> minusTestParams() {
        return Stream.of(
                Arguments.of(1, 2, -1),
                Arguments.of(7, 5, 2));
    }

    @ParameterizedTest
    @MethodSource("minusTestParams")

    public void minusTest(int a, int b, int expected) {

        assertEquals(expected, out.minus(a, b));

    }

    public static Stream<Arguments> multiplyTestParams() {
        return Stream.of(
                Arguments.of(3, 2, 6),
                Arguments.of(7, 5, 35));
    }

    @ParameterizedTest
    @MethodSource("multiplyTestParams")

    public void multiplyTest(int a, int b, int expected) {

        assertEquals(expected, out.multiply(a, b));

    }

    public static Stream<Arguments> divideTestParams() {
        return Stream.of(
                Arguments.of(1, 2, 0.5),
                Arguments.of(10, 5, 2));
    }

    @ParameterizedTest
    @MethodSource("divideTestParams")

    public void divideTest(int a, int b, double expected) {

        assertEquals(expected, out.divide(a, b));

    }

    public static Stream<Arguments> negativeDivideTestParams() {
        return Stream.of(
                Arguments.of(1, 0),
                Arguments.of(10, 0));
    }

    @ParameterizedTest
    @MethodSource("negativeDivideTestParams")


    public void negativeDivideTest(int a, int b) {

        assertThrows(DivZeroException.class, () -> out.divide(a, b));
        assertThrows(DivZeroException.class, () -> out.divide(a, b));

    }
}
