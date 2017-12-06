package com.laboratory;

public class StringManipulator {
    private static final String RUSSIAN_ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public String clearInputString(String inputString) {
        String cleanString = "";
        char symbol;

        // Оставляем в строке только буквы русского алфавита
        for (int i = 0; i < inputString.length(); i++) {
            symbol = inputString.charAt(i);

            if(symbol >= 'а' && symbol <= 'я' || symbol >= 'А' && symbol <= 'Я') {
                cleanString += symbol;
            }
        }

        return cleanString;
    }

    public void printFormattedString(String inputString) {
        // Выводим форматированную строку в формате {символ*два пробела*}
        for(int i = 0; i < inputString.length(); i++){
            System.out.print(inputString.toCharArray()[i] + "  ");
        }

        System.out.println("");
    }

    public void stringProcessing(String inputString) {
        char[] inputStringLower = inputString.toLowerCase().toCharArray();

        // Выводим порядковый номер алфавите каждого символа из строки
        // + 1 компенсация отсчета в массивах с нуля
        for (char x : inputStringLower) {
            System.out.print(RUSSIAN_ALPHABET.lastIndexOf(x) + 1 + "  ");
        }
    }
}
