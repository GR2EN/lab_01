//
//  Created by Almaz 6.12.2017
//

package com.laboratory;

import java.util.ArrayList;

public class StringManipulator {
    private static final String RUSSIAN_ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private String string;

    private void setString(String string) {
        this.string = string;
    }

    private void printFormattedString() {
        // Выводим форматированную строку в формате {символ*два пробела*}
        for(int i = 0; i < string.length(); i++){
            System.out.print(string.toCharArray()[i] + "  ");
        }

        System.out.println("");
    }

    public StringManipulator(String inputString) {
        clearInputString(inputString);
        printFormattedString();
    }

    private void clearInputString(String inputString) {
        StringBuilder cleanString = new StringBuilder();
        char symbol;

        // Оставляем в строке только буквы русского алфавита
        for (int i = 0; i < inputString.length(); i++) {
            symbol = inputString.charAt(i);

            if(symbol >= 'а' && symbol <= 'я' || symbol >= 'А' && symbol <= 'Я') {
                cleanString.append(symbol);
            }
        }

        setString(cleanString.toString());
    }

    public ArrayList<Integer> getIndexList() {
        char[] inputStringLower = string.toLowerCase().toCharArray();
        ArrayList<Integer> indexList = new ArrayList<>();

        // Выводим порядковый номер алфавите каждого символа из строки
        // + 1 компенсация отсчета в массивах с нуля
        for (char anInputStringLower : inputStringLower) {
            indexList.add(RUSSIAN_ALPHABET.lastIndexOf(anInputStringLower) + 1);
        }
        
        return indexList;
    }
}
