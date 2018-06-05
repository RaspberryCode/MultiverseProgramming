package Logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiverseCalculationTest {

    static MultiverseCalculation testSubject = new MultiverseCalculation();


    @Test
    void recursive1() {
        assertEquals(1, testSubject.factorial(1));
    }

    @Test
    void recursive0() {
        Factorial fac = new Factorial();
        assertEquals(0, testSubject.factorial(0));
    }

    @Test
    void recursive12() {
        Factorial fac = new Factorial();
        assertEquals(479001600, testSubject.factorial(12));
    }

    @Test
    void recursive5() {
        Factorial fac = new Factorial();
        assertEquals(120, testSubject.factorial(5));
    }

    @Test
    void fibonacci7() {
        assertEquals(13, testSubject.fibonacci(7));
    }

    @Test
    void fibonacci5() {
        assertEquals(5, testSubject.fibonacci(5));
    }

    @Test
    void fibonacci0() {
        assertEquals(0, testSubject.fibonacci(0));
    }

    @Test
    void fibonacci11() {
        assertEquals(89, testSubject.fibonacci(11));
    }
}