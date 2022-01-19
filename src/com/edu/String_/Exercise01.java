package com.edu.String_;

import javax.sql.rowset.FilteredRowSet;
import java.util.Locale;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String price = "88123456.59";
        StringBuffer sb = new StringBuffer(price.toString());
        for (int i = sb.indexOf(".") - 3; i > 0; i -= 3) {
                    sb = sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
