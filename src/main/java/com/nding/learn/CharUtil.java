package com.nding.learn;

public class CharUtil {
    public static void main(String[] args) {

        sort("A3c2b1");
        if (args == null || args.length<1) {
            System.out.println("it need one string argument");
        }
//        sort(args[0]);
    }
    public static void sort(String str) {
        if (str == null || "".equals(str)) {
            return;
        }
        StringBuilder letterSb = new StringBuilder();
        StringBuilder digitSb = new StringBuilder();
        char[] chs = str.toCharArray();
        for (char ch : chs) {
            if (Character.isLetter(ch)) {
                letterSb.append(ch);
            }
            else if (Character.isDigit(ch)) {
                digitSb.append(ch);
            }
        }
        if (digitSb.length() > 0) {
            letterSb.append(digitSb);
        }
        System.out.println("original str:" + str);
        System.out.println("result:" + letterSb.toString());

    }
}
