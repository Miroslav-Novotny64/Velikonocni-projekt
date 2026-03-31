package com.example;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static String getText(String prompt) {
        System.out.print(prompt + "\n");
        return scanner.nextLine();
    }

    public static int getInt(String prompt, boolean acceptsZero) {
        while (true) {
            System.out.print(prompt + "\n");
            String input = scanner.nextLine();
            try {
                int num = Integer.parseInt(input);
                if (num < 0 || (!acceptsZero && num == 0)) {
                    throw new NumberFormatException();
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Warning: Napište prosím kladné číslo" +
                        (acceptsZero ? " nebo nulu" : ""));
            }
        }
    }
}
