package com.laboratory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст:");

        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        StringManipulator stringObject = new StringManipulator();
        String cleanInputString = stringObject.clearInputString(inputString);
        stringObject.printFormattedString(cleanInputString);
        stringObject.stringProcessing(cleanInputString);
    }
}
