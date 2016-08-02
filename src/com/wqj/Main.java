package com.wqj;

import java.util.Scanner;

public class Main {
    static int result = 0;
    static int zres = 1;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String zero = "";
        Boolean status = false;
        String[] sp = str.split("");

        if (sp[0].equals("?")) {
            int count = 9;
            int num = 0;
            for (int i = 1; i < str.length(); i++) {
                if (sp[i].equals("?")) {
                    zero += "0";
                }
            }
            String str2 = str.replaceAll("[0-9?]", "");

            while (!"".equals(str2)) {
                str2 = str2.replaceAll(str2.substring(0, 1), "");
                num++;
            }
            for (int i = 0; i < num; i++) {
                zres = zres * (10 - i);
            }

            System.out.println(count * zres + zero);

        } else {
            String str5 = sp[0].toString();
            boolean isNum = str5.matches("[0-9]+");
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                if (sp[i].equals("?")) {
                    zero += "0";
                }
            }
            String str2 = str.replaceAll("[0-9?]", "");
            while (!"".equals(str2)) {
                str2 = str2.replaceAll(str2.substring(0, 1), "");
                num++;
            }
            for (int i = 0; i < num; i++) {
                zres = zres * (10 - i);
            }

            int shishi = (9 * zres) / 10;
            if (shishi == 0) {
                System.out.println(1);
            } else {
                if (isNum) {
                    System.out.println((10 * zres) / 10 + zero);
                } else {
                    System.out.println((9 * zres) / 10 + zero);
                }
            }

        }
    }
}

