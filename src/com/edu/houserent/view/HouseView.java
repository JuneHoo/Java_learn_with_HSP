package com.edu.houserent.view;

import com.edu.houserent.domain.House;
import com.edu.houserent.service.HouseService;
import com.edu.houserent.utils.Utility;

import javax.rmi.CORBA.Util;

public class HouseView {
    private boolean loop = true;
    private char key;
    private HouseService houseService = new HouseService(10); // 设置数组大小10

    public void updateHouse() {
        System.out.println("===============修改房屋信息===============");
        System.out.println("请选择待修改房屋编号（-1表示退出）");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("===============放弃修改房屋信息===============");
            return;
        }
        // 根据输入得到updateId, 查找对象
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("===============欲修改房屋信息不存在===============");
            return;
        }

        System.out.println("姓名(" + house.getName() + ")：");
        String name = Utility.readString(8, "");
        if (!"".equals(name)) { // Modify
            house.setName(name);
        }

        System.out.println("电话(" + house.getPhone() + "): ");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }

//        if (!"".equals(phone)) {
//            house.setPhone(phone);
//        }
        System.out.println("地址(" + house.getAddress() + "): ");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            house.setAddress(address);
        }
        System.out.println("租金(" + house.getRent() + "): ");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }
        System.out.println("状态(" + house.getState() + "): ");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            house.setRent(rent);
        }
        System.out.println("修改信息成功");

    }
    public void findHouse() {
        System.out.println("===============查找房屋信息===============");
        System.out.println("请输入要查找的id：");
        int findId = Utility.readInt();

        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println();
        }
    }

    public void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }
    // 编写addHouse() 接受输入、创建House对象 调用add方法

    public void addHouse() {
        System.out.println("===============添加房屋===============");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("租金：");
        int rent = Utility.readInt(7);
        System.out.println("状态：");
        String state = Utility.readString(3);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        // 创建一个新的House对象，注意id是系统分配的 用户不能输入
        new House(0, name, address, rent, state, phone);

        House newHouse = new House(0, name, address, rent, state, phone);
        if (houseService.add(newHouse)) {
            System.out.println("添加房屋成功");
        } else {
            System.out.println("添加房屋失败");
        }

    }

    // 编写listHouses() 显示房屋列表
    public void listHouses() {
        System.out.println("===============房屋列表===============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list(); // 得到所有房屋信息

        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("===============房屋列表显示完毕===============");

    }

    public void delHouse() {
        System.out.println("===============删除房屋信息===============");
        System.out.println("请输入待删除房屋的编号(-1退出)：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("===============已放弃删除房屋信息===============");
            return;
        }
//        System.out.println("请确认是否删除房屋信息(Y/N)");
        // 该方法本身有循环判断的逻辑 必须输出Y/N
        char choice = Utility.readConfirmSelection();

        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("===============删除房屋信息成功===============");
            } else {
                System.out.println("===============删除房屋编号不存在===============");
            }
        } else {
            System.out.println("===============放弃删除房屋信息===============");

        }
    }
    public void mainMenu() {

        do {
            System.out.println("===============房屋出租系统===============");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退      出");
            System.out.println("请输入你的选择：(1-6) ");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    System.out.println("新增");
                    addHouse();
                    break;
                case '2':
                    System.out.println("查找");
                    findHouse();
                    break;
                case '3':
                    System.out.println("删除");
                    delHouse();
                    break;
                case '4':
                    System.out.println("修改");
                    updateHouse();
                    break;
                case '5':
                    System.out.println("显示");
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }
}
