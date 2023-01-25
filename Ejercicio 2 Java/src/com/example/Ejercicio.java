package com.example;

public class Ejercicio {
    public static void main(String[] args) {
    double price = getPrice(500,7);
        System.out.println(price);
    }
    static double getPrice(double price, double iva){
        return price + (price * (iva / 100));
    }
}