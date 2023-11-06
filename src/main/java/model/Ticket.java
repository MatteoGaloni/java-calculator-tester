package model;

import java.text.DecimalFormat;

public class Ticket {
    private int km;
    private int age;

    public Ticket(int km, int age) throws IllegalArgumentException{
        if (km <= 0 && age <= 0){
            throw new IllegalArgumentException();
        }
        this.km = km;
        this.age = age;
    }

    public int getPrice(){
        double pricePerKm = 0.21;
        int underDiscount = 20;
        int overDiscount =  40;
        double standardPrice = km * pricePerKm;
        double ticketPrice;

        if (age < 18){
            ticketPrice = standardPrice - (standardPrice * ((double) underDiscount /100));

        } else if (age > 65) {
            ticketPrice = standardPrice - (standardPrice * ((double) overDiscount /100));

        } else {
            ticketPrice = standardPrice;
        }
            return (int)ticketPrice;
    }


}
