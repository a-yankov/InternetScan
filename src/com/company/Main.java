package com.company;

import java.io.IOException;
import java.util.List;

public class Main {

    public static final String P_REG = "<\\s*p[^>]*>(.*?)<\\s*\\/\\s*p>";

    public static void main(String[] args) throws IOException, InterruptedException {
        NetScanner scanner = new NetScanner();




        char[] arr = "abcdefghijklmnopqrstuvwxyz./123456789".toCharArray();
        List<String> list = GFG.printAllKLength(arr, 3);


        for (String str : list) {
          System.out.println(scanner.scan("https://news.bg/", str));
        }
    }



}
