package com.company;

public class Main {
    public static void main(String[] args) {
    Car car = new Car();
    car.getPrice();
    Hairdresser h1 = new Hairdresser("3mm");
    h1.getPrice();
    Hairdresser h2 = new Hairdresser("cropped");
    h2.getPrice();
    Friendship friend = new Friendship();
    friend.getPrice();
    }
}
