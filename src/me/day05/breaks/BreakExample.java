package me.day05.breaks;

import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) {
                break;
            }
            System.out.println("i = " + i);
        }

        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println("i = " + i);
        }

        String str = "";
        String str2 = "";
        while (true) {
            char ch = sc.next().charAt(0);
            if (ch == 'q') {
                break;
            }
            str += ch;
            str2 = ch + str2;
        }

        System.out.println(str);
        System.out.println(str2);

    }
}