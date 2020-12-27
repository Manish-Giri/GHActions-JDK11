package org.example.test;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SomeTestTest {

    @Test
    void generatePrimesTest() {
        List<Integer> res = SomeTest.generatePrimes(20);
        List<Integer> expected = List.of(2,3,5,7,11,13,17,19);
        assertEquals(res, expected);
    }
}