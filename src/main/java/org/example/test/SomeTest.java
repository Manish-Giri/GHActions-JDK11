package org.example.test;

import java.util.ArrayList;
import java.util.List;

public class SomeTest {

    // generate prime numbers from 1 to n(inclusive)
    static List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        for(int i = 2; i <= n; i++) {
            if(helper(i))
                primes.add(i);
        }
        return primes;
    }

    private static boolean helper(int i) {
        for(int j = 2; j*j <= i; j++) {
            if(i % j == 0) {
                return false;
            }
        }
        return true;
    }

}
