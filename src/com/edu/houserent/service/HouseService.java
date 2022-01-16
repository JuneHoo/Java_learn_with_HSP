package com.edu.houserent.service;
// 业务层：定义House[], 保存House对象
// 响应HouseView的调用
// 完成对房屋信息的各种操作

import com.edu.houserent.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums = 1;
    private int idCounter = 1; // 记录当前id增长到

    public HouseService(int size) {
        houses = new House[size];

        houses[0] = new House(1, "jack", "海淀区", 2000, "未出租", "112");
    }

    public House findById(int findId) {
        // 遍历数组
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }

    public boolean add(House newHouse) {
        // 判断是否还可以继续添加（暂时不考虑数组扩容问题） => 能否加入数组扩容机制？
        if (houseNums == houses.length) {
            System.out.println("The capacity is full you cannot add more~");
            return false;
        }
        // end ++
        houses[houseNums++] = newHouse;

        // Set an auto increasing mechanism to add id number
        newHouse.setId(++idCounter);
        return true;
    }

    public boolean del(int delId) {
        // 应当先找到删除的房屋信息 对应的下标（index）
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }

        if (index == -1) {
            // 说明delId在数组中不存在
            return false;
        }
        // 如果找到
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i+1];
        }
        houses[--houseNums] = null;
        return true;
    }

    public House[] list() {
        return houses;
    }
}
