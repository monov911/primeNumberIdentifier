package com.example.primeNumberIdentifier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import scala.Int;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberIdentifierServiceTest {

    PrimeNumberIdentifierService primeNumberIdentifierService;

    @BeforeEach
    void setUp() {
       primeNumberIdentifierService = new PrimeNumberIdentifierService();
    }

    @Test
    void filterForPrimeNumbers() {
        // When
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);

        List<Integer> nonPrimes = new ArrayList<>();
        nonPrimes.add(8);
        nonPrimes.add(9);

        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        positiveNumbers.addAll(primes);
        positiveNumbers.addAll(nonPrimes);

        // Then
        List<Integer> filteredResult = positiveNumbers.stream().filter(integer -> primeNumberIdentifierService.isPrime(integer)).toList();

        // Assert
        assertEquals(primes.size(),filteredResult.size());
    }

    @Test
    void isPrime(){
        int number = 5;

        assertTrue(primeNumberIdentifierService.isPrime(number));
    }

    @Test
    void isPrime_negativeCase(){
        int number = 4;

        assertFalse(primeNumberIdentifierService.isPrime(number));
    }
}