package Logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    static Factorial testSubject;


    @BeforeEach
    public void setUp() {
        testSubject = new Factorial();
    }

    @Test
    void recursive1() {
        assertEquals(1,testSubject.factorialRecursive(1));
    }

    @Test
    void recursive0() {
        Factorial fac = new Factorial();
        assertEquals(0,testSubject.factorialRecursive(0));
    }

    @Test
    void recursive12() {
        Factorial fac = new Factorial();
        assertEquals(479001600,testSubject.factorialRecursive(12));
    }

    @Test
    void recursive5() {
        Factorial fac = new Factorial();
        assertEquals(120,testSubject.factorialRecursive(5));
    }
}