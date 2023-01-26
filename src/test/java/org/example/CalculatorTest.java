package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testSimple() {
        Calculator calculator = new Calculator();

        // Assert : Vérifier

        Integer a = 1;
        Integer b = 2;
        assertEquals(3, calculator.add(1,2)); // 1+ 2 = 3 ?

        a = Integer.MAX_VALUE;
        b = Integer.MAX_VALUE;
//        assertEquals(3, calculator.add(a,b));

        a = null;
        b = null;
        assertEquals(3, calculator.add(a,b));
    }

    @Test
    void testThrow() {
        Integer a = null;
        assertThrows(NullPointerException.class, () -> {
            Calculator calculator = new Calculator();
            calculator.add(2, 3);
        });
    }

    @Test
    @DisplayName("1 + 2 = 3 (dans le @DisplayName)") // impacte le nom du test (et pas le résultat de la ligne de test)
    void testNommé() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1,222)); // 1+ 2 = 3 ?
    }

    @Test
    void testCommenté() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1,222), "1 + 2 = 3 (dans le commentaire)"); // org.opentest4j.AssertionFailedError: 1 + 2 = 3 (dans le commentaire) ==>
    }


    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "0, 0, 0",
            "-1, 1, 0",
            "50, 60, 100"
    })
    void testAddCsv(int a, int b, int expectedResult){
        Calculator calculator = new Calculator();
//        assertEquals(expectedResult, a, b); // est passant, mais pourquoi ? (oublie de l'appel a la méthode et 3eme argument)
        assertEquals(expectedResult, calculator.add(a, b));
        assertEquals(expectedResult, 3, "message en cas de fail"); // org.opentest4j.AssertionFailedError: message en cas de fail ==>
    }

}