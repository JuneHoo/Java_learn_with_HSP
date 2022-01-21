package com.edu.oop;

public class Hw08 {
    public static void main(String[] args) {
        Color green = Color.GREEN;
        green.show();
        switch (green) {
            case RED:
                System.out.println("Catch red!");
                break;
            case BLACK:
                System.out.println("Catch black");
                break;

            case YELLOW:
                System.out.println("catch yellow");
                break;
            default:
                System.out.println("Do not match");

        }
    }
}


interface MyInterface {
    void show();

}
enum Color implements MyInterface{
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blurValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blurValue;
    }
    public void show() {
        System.out.println("属性值为:" + redValue + "," + greenValue + "," + blueValue);
    }
    }