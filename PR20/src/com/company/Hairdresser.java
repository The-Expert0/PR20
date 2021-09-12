package com.company;

public class Hairdresser implements Priceable{
    public String price;
    public Hairdresser(String type){
        if (type == "3mm")
            price = "100р.";
        else if (type == "flat-top")
            price = "400р.";
        else if (type == "cropped")
            price = "500р.";
    }
    @Override
    public void getPrice() {
        System.out.println(price);
    }
}