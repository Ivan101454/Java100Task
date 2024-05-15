package com.ivan101454.tasks.taskAandB;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Требуется сложить два целых числа А и В.
 */

public class SumAAndB {
    public static void main(String[] args) throws IOException {
        int a = 0;
        int b = 0;
        File fileIn = Path.of("resources", "input.txt").toFile();
        File fileOut = Path.of("resources", "output.txt").toFile();
        try (Scanner scanner = new Scanner(fileIn);
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            String sum = String.valueOf(a + b);
//            bw.write(sum);
            System.out.println(sum);
            variantB();
        }
    }

    public static void variantB() throws IOException {
        int sum = 0;
        File fileIn = Path.of("resources", "input.txt").toFile();
        File fileOut = Path.of("resources", "output.txt").toFile();
        try (Scanner scanner = new Scanner(fileIn);
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {
            String strIn = scanner.nextLine();
            String[] s = strIn.split(" ");
            for (String str : s) {
                sum += Integer.parseInt(str);
            }
            System.out.println(sum);
            bw.write(String.valueOf(sum));
        }
    }
}
