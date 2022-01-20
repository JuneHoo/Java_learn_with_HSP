package com.edu.oop;

public class HW06 {
    // 需求---》理解---》实现
    public static void main(String[] args) {
        Person person = new Person("Tom", new Horse());
//        Person person1 = new Person("Tom", new Boat());
        person.common();
        person.passRiver();
        person.passRiver();
        person.common();
        person.passRiver();
        person.passFireHill();
        person.passFireHill();
        person.passRiver();
    }
}

interface Vehicles {
    public void work();
}

class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("Riding~ typically");
    }
}

class Plane implements Vehicles {

    @Override
    public void work() {
        System.out.println("Plying~");
    }
}
class Boat implements Vehicles {

    @Override
    public void work() {
        System.out.println("Using boat");
    }
}

class VehiclesFactory {
    // 将方法做成static方便
    private static Horse horse = new Horse(); // 饿汉式

    public static Horse getHorse() {
//        return new Horse();
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }
    public static Plane getPlane() {
        return new Plane();
    }

}


class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    // 把具体要求封装成方法：编程思想
    public void passRiver() {
        // 先得到船
//        Boat boat = VehiclesFactory.getBoat();
//        boat.work();
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();

    }
    public void passFireHill() {
        if (!(vehicles instanceof Plane)) {
            // 这里使用的是多态
            vehicles = VehiclesFactory.getPlane();
        }
        vehicles.work();
    }

    public void common() {
        if (!(vehicles instanceof Horse)) {
            // 这里使用的是多态
            vehicles = VehiclesFactory.getHorse();
        }
        vehicles.work();

//        Horse horse = VehiclesFactory.getHorse();
//        horse.work();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }
}
