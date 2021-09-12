package com.company;

public class Car implements Priceable{
    public String carModel = "Camry 3.5 ";
    public String price = "2000000р.";
    @Override
    public void getPrice() {
        System.out.println(price);
    }
}
