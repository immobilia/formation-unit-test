package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

//    Setup     : initialisation
//    Test      : test
//    TearDown  : fermeture des resources

    Calculator calculator;

    @BeforeEach
    void setup() {
        System.out.println("beforeEach");
        calculator = new Calculator();
    }

    @AfterEach
    void teardown() {
        System.out.println("afterEach");
    }

    @Test
    void testSimple() {

        // Assert : Vérifier

        Integer a = 1;
        Integer b = 2;
        assertEquals(3, calculator.add(1, 2)); // 1+ 2 = 3 ?

        a = Integer.MAX_VALUE;
        b = Integer.MAX_VALUE;
//        assertEquals(3, calculator.add(a,b));

//        a = null;
//        b = null;
//        assertEquals(3, calculator.add(a, b));
    }
//
//    @Test
//    void testThrow() {
//        Integer a = null;
//        assertThrows(NullPointerException.class, () -> {
//            calculator.add(2, 3);
//        });
//    }

//    @Test
//    @DisplayName("1 + 2 = 3 (dans le @DisplayName)")
//        // impacte le nom du test (et pas le résultat de la ligne de test)
//    void testNommé() {
//        assertEquals(3, calculator.add(1, 222)); // 1+ 2 = 3 ?
//    }
//
//    @Test
//    void testCommenté() {
//        assertEquals(3, calculator.add(1, 222), "1 + 2 = 3 (dans le commentaire) [le message affiché en cas de fail]"); // org.opentest4j.AssertionFailedError: 1 + 2 = 3 (dans le commentaire) ==>
//    }
//

//    @ParameterizedTest
//    @CsvSource({
//            "1, 2, 3",
//            "0, 0, 0",
//            "-1, 1, 0",
//            "50, 60, 100"
//    })
//    void testAddCsv(int a, int b, int expectedResult) {
////        assertEquals(expectedResult, a, b); // est passant, mais pourquoi ? (oublie de l'appel a la méthode et 3eme argument)
//        assertEquals(expectedResult, calculator.add(a, b));
//    }
//
//    @Test
//    void testDivide() {
//        assertEquals(0.5, calculator.divide(1, 2));
////        assertEquals(0.333, calculator.divide(1, 3)); // 0.333 différent de 0.3333333333333333
//        assertEquals(0.333, calculator.divide(1, 3), 0.001); // plage
//        assertEquals(0 , calculator.divide(123,0));
//    }

    // Avec activation du Sonar Cloud

}