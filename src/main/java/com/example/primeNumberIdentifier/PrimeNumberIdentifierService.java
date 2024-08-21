package com.example.primeNumberIdentifier;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrimeNumberIdentifierService {

    public List<Integer> filterForPrimeNumbers(List<Integer> numbers) {
        return numbers.stream().filter(this::isPrime).toList();
    }

    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
