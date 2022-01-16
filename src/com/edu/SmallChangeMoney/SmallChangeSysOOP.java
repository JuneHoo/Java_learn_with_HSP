package com.edu.SmallChangeMoney;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    boolean loop = true;
    String key = "";
    Scanner scanner = new Scanner(System.in);
    double money = 0;
    double balance = 0;
    String note;
    String details = new String();
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); // 可以用于日期格式化

    public static void main(String[] args) {

    }
    public void mainMenu() {
        do {
            System.out.println("=============零钱通菜单(OOP)================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退      出");

            System.out.println("请选择（1-4）:");
            key = scanner.next();

            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.cost();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误！");
            }
        } while (loop);


    }

    public void detail() {
        System.out.println("1 零钱通明细");
        System.out.println(details);
        return;
    }

    public void income() {
        System.out.println("2 收益入账");
        money = scanner.nextDouble();
        date = new Date();
        // 找出不正确的金额条件 给出提示 直接break

        if (money <= 0) {
            System.out.println("输入金额需要大于 0!");
            return;
        }
        balance += money;
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;

        return;
    }

    public void cost() {
        System.out.println("消费金额");
        money  = scanner.nextDouble();
        if (money <= 0 || money >= balance) {
            if (balance == 0) {
                System.out.println("当前没有余额！");
            }else
                System.out.println("消费金额应该在1.0 - " + balance);
            return;
        }
        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;
//                    balance += money;
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;

        return;
    }

    public void exit() {
        System.out.println("4 退出");
        System.out.println();
        String choice = "";
        while (true) {
            System.out.println("Are you sure you want to exit?(y/n)");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }

        if (choice.equals("y")) {
            loop = false;
        }
    }
}
