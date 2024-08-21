package com.example.primeNumberIdentifier.controller;


import com.example.primeNumberIdentifier.fileWriter.FileWriterService;
import com.example.primeNumberIdentifier.PrimeNumberIdentifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class NumbersConsumer {

    private static List<Integer> primeNumbers = new ArrayList<>();

    @Autowired
    private PrimeNumberIdentifierService primeNumberIdentifierService;

    @Autowired
    private FileWriterService fileWriterService;

    @PostMapping("/receiveNumbers")
    public ResponseEntity<List<Integer>> receiveNumbers(
            @RequestBody List<Integer> numbers) {
        System.out.println("Received numbers: " + Arrays.toString(numbers.toArray()) + " at time:" + LocalDateTime.now());

        primeNumbers.addAll(primeNumberIdentifierService.filterForPrimeNumbers(numbers));
        fileWriterService.saveToCSV(primeNumbers, Paths.get("primeNumbers.csv"));

        return  ResponseEntity.ok().body(primeNumberIdentifierService.filterForPrimeNumbers(numbers));
    }
}
