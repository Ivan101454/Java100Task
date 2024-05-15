package com.ivan101454.tasks.taskDeafPhone;

import java.io.*;
import java.nio.file.Path;

/**
 * Неглухой телефон (1%)
 * Время: 1 сек.
 * Память: 16 Мб
 * Сложность: 1%
 * <p>
 * Возможно, что Вы когда то играли в игру «Глухой телефон», либо слышали о ней. В этой игре участникам приходится передавать информацию друг другу различными способами: словесно, образно, бывает даже приходится писать левой рукой текст, который другой участник команды должен будет прочитать. Так же известно, что практически никогда передаваемая информация не доходит до конечного адресата. Обозначим за Fi(x) функцию, которая преобразует текст передаваемой информации x в ту, которую получит участник i+1 от участника i. Тогда последний n-й участник получит данные y, которые будут выражаться следующей формулой:
 * <p>
 * y = Fn-1(Fn-2(…F2(F1(x))))
 * <p>
 * Но Вам необходимо исключить какие-либо внешние факторы, которые могут исказить исходную информацию и Вы должны реализовать программу «неглухой телефон», которая сможет безошибочно доставлять исходные данные, т.е. в нашем случае функция Fi(x) = x для всех i от 1 до n-1.
 */
public class NotDeafPhone {
    public static void main(String[] args) throws IOException {
        final long MEGABYTE = 1024L * 1024L;
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memory = (runtime.totalMemory() - runtime.freeMemory())/MEGABYTE;
        System.out.println("Memory take start = " + memory + " MB");
        long startTime = System.currentTimeMillis();
        int player = 100;
        int numberStart;
        int numberEnd = 0;
        File fileInput = Path.of("resources", "input.txt").toFile();
        File fileOutput = Path.of("resources", "output.txt").toFile();
//        try (FileInputStream fileInputStream = new FileInputStream(fileInput);
//             FileOutputStream fileOutputStream = new FileOutputStream(fileOutput)) {
//            byte[] bytes = fileInputStream.readAllBytes();
//            String stringValue = new String(bytes);
//            numberStart = Integer.parseInt(stringValue);
//            for (int i = 0; i < player; i++) {
//                numberEnd = numberStart + 1;
//            }
//            fileOutputStream.write(Integer.reverseBytes(numberEnd));
//        }
        try (BufferedReader br = new BufferedReader(new FileReader(fileInput));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileOutput, true))) {
            String input = br.readLine();
            numberStart = Integer.parseInt(input);
            for (int i = 0; i < player; i++) {
                numberEnd = numberStart;
            }
            memory = (runtime.totalMemory() - runtime.freeMemory())/MEGABYTE;
            System.out.println("Memory take middle = " + memory + " MB");
            bw.write(String.valueOf(numberEnd));

        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime));
        memory = (runtime.totalMemory() - runtime.freeMemory())/MEGABYTE;
        System.out.println("Memory take end = " + memory + " MB");
    }
}
