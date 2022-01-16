package com.edu.oop.interface_;

import com.sun.xml.internal.fastinfoset.util.CharArrayArray;

public class InterfacePolyArr {
    public static void main(String[] args) {
        USB[] usbs = new USB[2];
        usbs[0] = new Phone();
        usbs[1] = new Camera();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if (usbs[i] instanceof Phone) {
                ((Phone) usbs[i]).call();
            }
        }
    }


}

interface USB {
    //    public void call();
    void work();
}

class Phone implements USB {
    public void call() {
        System.out.println("Phone can call");
    }

    @Override
    public void work() {
        System.out.println("Phone is working");
    }
}


class Camera implements USB {
    @Override
    public void work() {
        System.out.println("Usb is working~");
    }
}