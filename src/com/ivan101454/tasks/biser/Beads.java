package com.ivan101454.tasks.biser;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

public class Beads {
    public static void main(String[] args) throws IOException {
        File fileIn = Path.of("resources", "input.txt").toFile();
        File fileOut = Path.of("resources", "output.txt").toFile();
        int color;
        try(Scanner scanner = new Scanner(fileIn);
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {
            String sc = scanner.nextLine();
            color = Integer.parseInt(sc);
            bw.write(String.valueOf(color+1));
        }
    }
}
