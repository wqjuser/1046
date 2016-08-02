package com.wqj;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by MR.WEN on 2016/8/2.
 */
public class test1046 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str = s.next();
//        System.out.println(str.replaceAll("[0-9]",""));

        System.out.println(str.replaceAll("[0-9?]",""));
    }

    public static void countChar(String str) {
        int num = 0;
        while (!"".equals(str)) {
//            String temp = str;
//            System.out.print("字符：" + str.substring(0, 1));
            str = str.replaceAll(str.substring(0, 1), "");
            num++;
        }

        System.out.println(num);

    }


}

