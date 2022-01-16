package com.edu.enum_;

public class Enumeration01 {
    public static void main(String[] args) {
        Season spring = new Season("Spring", "warm");
        Season summer = new Season("Summer", "hot");
        Season winter = new Season("Winter", "cold");
        Season autumn = new Season("Autumn", "cool");
    }
}


class Season {
    private String name;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

}