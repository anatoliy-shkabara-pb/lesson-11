package hw9;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class FileNumbers {

    private static final Logger LOGGER = Logger.getLogger(FileNumbers.class.getName());

    private static final String NUMBERS_FILE_PATH = "files/numbers.txt";
    private static final String ODD_NUMBERS_FILE_PATH = "files/odd-numbers.txt";

    private static void createNumbersFile() {
        Random rand = new Random();
        Path numbersPath = Paths.get(NUMBERS_FILE_PATH);
        LOGGER.log(Level.FINE, "Start creating file {0} ...", numbersPath.toAbsolutePath());
        try (BufferedWriter writer = Files.newBufferedWriter(numbersPath)) {
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < 10; j++) {
                    int num = rand.nextInt(100) + 1;
                    if (j < 9) {
                        writer.write(num + " ");
                    } else {
                        writer.write(String.valueOf(num));
                    }
                }
                if (i < 9) {
                    writer.newLine();
                }
                LOGGER.log(Level.FINE, "Line {0} recorded ok ", i + 1);
            }
            LOGGER.log(Level.INFO, "File {0} created!", numbersPath.toAbsolutePath());
        } catch (Exception ex) {
            System.out.println("Error creating file " + numbersPath.getFileName() + ": " + ex.getMessage());
            LOGGER.log(
                    Level.SEVERE,
                    String.format("Error creating file %s: %s", numbersPath.toAbsolutePath(), ex),
                    ex
            );
        }
    }

    private static void createOddNumbersFile() {
        Path numbersPath = Paths.get(NUMBERS_FILE_PATH);
        Path oddNumbersPath = Paths.get(ODD_NUMBERS_FILE_PATH);

        LOGGER.log(Level.FINE, "Reading from file {0} ...", numbersPath.toAbsolutePath());
        LOGGER.log(Level.FINE, "Start creating file {0} ... ", oddNumbersPath.toAbsolutePath());
        try (Scanner scan = new Scanner(numbersPath);
             PrintStream ps = new PrintStream(oddNumbersPath.toFile())
        ) {
            boolean isFirstLine = true;
            while (scan.hasNextLine()) {

                if (isFirstLine) {
                    isFirstLine = false;
                } else {
                    ps.println();
                }

                LOGGER.log(Level.FINE, "Start line processing...");
                String line = scan.nextLine();
                String[] strNumbers = line.split(" ");
                for (int i = 0; i < strNumbers.length; i++) {
                    int num = Integer.parseInt(strNumbers[i]);
                    if (num % 2 == 0) {
                        LOGGER.log(Level.FINER, "Number {0} is even", num);
                        ps.print(0);
                    } else {
                        LOGGER.log(Level.FINER, "Number {0} is odd", num);
                        ps.print(num);
                    }
                    if (i < strNumbers.length - 1) {
                        ps.print(" ");
                    }
                }
                LOGGER.log(Level.FINE, "Finish line processing");
            }
            LOGGER.log(Level.INFO, "File {0} created!", oddNumbersPath.toAbsolutePath());
        } catch (Exception ex) {
            System.out.println("Error creating file " + oddNumbersPath.getFileName() + ": " + ex.getMessage());
            LOGGER.log(
                    Level.SEVERE,
                    String.format("Error creating file %s: %s", oddNumbersPath.toAbsolutePath(), ex),
                    ex
            );
        }
    }

    public static void main(String[] args) {

        try {
            LogManager logManager = LogManager.getLogManager();
            Path logConfigPath = Paths.get("src/hw9/logging.properties");
            InputStream logConfigIs = Files.newInputStream(logConfigPath);
            logManager.readConfiguration(logConfigIs);
        } catch (Exception ex) {
            System.out.println("Error log configuration: " + ex);
        }

        System.out.println("Creates and process files...");
        createNumbersFile();
        createOddNumbersFile();
        System.out.println("Done!");
    }
}
