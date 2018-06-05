package Logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    static Fibonacci testSubject;

    @BeforeEach
    public void init() {
        testSubject = new Fibonacci();
    }

    @Test
    void fibonacciRecursive1() {
        assertEquals(13, testSubject.fibonacciRecursive(7));
    }

    @Test
    void fibonacciRecursive2() {
        assertEquals(5, testSubject.fibonacciRecursive(5));
    }

    @Test
    void fibonacciRecursive3() {
        assertEquals(0, testSubject.fibonacciRecursive(0));
    }

    @Test
    void fibonacciRecursive4() {
        assertEquals(89, testSubject.fibonacciRecursive(11));
    }

    @Test
    void fibonaccifibonacciDynamic1() {
        assertEquals(13, testSubject.fibonacciDynamic(7));
    }

    @Test
    void fibonaccifibonacciDynamic2() {
        assertEquals(5, testSubject.fibonacciDynamic(5));
    }

    @Test
    void fibonaccifibonacciDynamic3() {
        assertEquals(0, testSubject.fibonacciDynamic(0));
    }

    @Test
    void fibonaccifibonacciDynamic4() {
        assertEquals(89, testSubject.fibonacciDynamic(11));
    }

    @Test
    void fibonaccilWithOutIf1() {
        assertEquals(13, testSubject.fibonacciRecursive(7));
    }

    @Test
    void fibonacciWithOutIf2() {
        assertEquals(5, testSubject.fibonacciWithOutIf(5));
    }

    @Test
    void fibonacciWithOutIf4() {
        assertEquals(0, testSubject.fibonacciWithOutIf(0));
    }

    @Test
    void fibonacciWithOutIf5() {
        assertEquals(89, testSubject.fibonacciWithOutIf(11));
    }
}