package com.company;

public class Friendship implements Priceable{
    public String price = "not for sale";
    @Override
    public void getPrice() {
        System.out.println(price);
    }
}
