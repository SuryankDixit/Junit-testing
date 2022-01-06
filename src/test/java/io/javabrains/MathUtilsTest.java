package io.javabrains;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
    Lifecycle hooks:
        @BeforeAll
        @BeforeEach
        @AfterAll
        @AfterEach
*/

class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init(){
        mathUtils = new MathUtils();
    }

    @Test
    void test(){
        int expected = 2;
        int actual = mathUtils.add(1,1);
        assertEquals(expected,actual,"The add method should add 2 numbers.");
    }

    @Test
    void add() {
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
//        fail("failed");
    }

    @Test
    void divide() {
        // expectedType, executable => lambda
        assertThrows(ArithmeticException.class,()->mathUtils.divide(1,0),"Divide by zero should throw");
    }

    @Test
    void computeCircleArea() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),
                "Should return right circle area");
    }
}