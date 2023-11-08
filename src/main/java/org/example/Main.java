package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Truck t = new Truck() ;
        Moped m = new Moped();

        t.setColor("red");
        m.setColor("red");

        System.out.println(t.getColor());
        System.out.println(m.getColor());

    }
}