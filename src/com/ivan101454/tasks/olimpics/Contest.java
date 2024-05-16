package com.ivan101454.tasks.olimpics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

/**
 * Ваша задача – по описанию соревнований по программированию определить, кто из студентов победит. 
 */

public class Contest {
    public static void main(String[] args) throws IOException {

        File fileIn = Path.of("resources", "input.txt").toFile();
        File fileOut = Path.of("resources", "output.txt").toFile();
        int quantity;
        int decision = 0;
        final int totalTime = 300;
        int totalRemainderTime1 = 0;
        int totalRemainderTime3 = 0;
        int totalRemainderTime5 = 0;
        int penalty5 = 0;
        int penalty3 = 0;
        int penalty1 = 0;
        try(Scanner scanner = new Scanner(fileIn);
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))) {
            String quantityTask = scanner.nextLine();
            String timeDecision= scanner.nextLine();
            quantity = Integer.parseInt(quantityTask);
            String[] s = timeDecision.split(" ");

            for (int i = 0; i < quantity; i++) {
                totalRemainderTime5 += Integer.parseInt(s[i]);
                penalty5 += totalRemainderTime5;
                bw.append("Пятикурсник набрал " + penalty5 +"\n");
            }
            for (int i = quantity-1; i >= 0; i--) {
                totalRemainderTime3 += Integer.parseInt(s[i]);
                penalty3 += totalRemainderTime3;
                bw.append("Третьекурсник набрал " + penalty3 +"\n");
            }
//            int min = 0;
//            for (int i = 0; i < quantity; i++) {
//                if(Integer.parseInt(s[i])<min){
//                    min = Integer.parseInt(s[i]);
//                }
//                penalty1 += (totalTime -Integer.parseInt(s[i]));
//                }
//
            List<Integer> list = new ArrayList<>();
            for (String str: s) {
                list.add(Integer.parseInt(str));
            }
            Collections.sort(list);
            for (int i: list) {
                totalRemainderTime1 += i;
                penalty1 += totalRemainderTime1;
                bw.append("Первокурсник набрал " + penalty1 +"\n");
            }


        }
        }

}
