//
//  Created by Almaz 6.12.2017
//

package com.laboratory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст:");

        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        StringManipulator stringObject = new StringManipulator(inputLine);
        System.out.println(stringObject.getIndexList());

    }
}
