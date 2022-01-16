package com.edu.enum_;

public class EnumExercise {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for (Week day : values) {
            System.out.println(day);
        }
    }
}

// 使用enum之后 就不能继承其他类了！
enum Week {
    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"),
    FRIDAY("Friday");

    @Override
    public String toString() {
        return "Week{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;
    private int number;

    Week(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Week(String name) {
        this.name = name;
    }
}
