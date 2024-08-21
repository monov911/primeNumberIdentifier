package com.example.primeNumberIdentifier.fileWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.List;


@Service
public class FileWriterService {

    Logger logger = LoggerFactory.getLogger(FileWriterService.class);

    public void saveToCSV(List<Integer> primeNumbers, Path path) {
        PrintWriter outFile = null;
        try {
            outFile = new PrintWriter(new FileWriter(path.toString()));
        } catch (IOException e) {
            logger.error("Failed to save data to CSV file ", e);
        }

        PrintWriter finalOutFile = outFile;
        primeNumbers.stream().forEach(i-> finalOutFile.print(i + ", "));

        if (outFile != null) {
            outFile.close();
        }

    }
}
