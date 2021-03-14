package ru.netology.ratush223;


public class CreditPaymentService {
    
    //Расчет ежемесячного ануитетного платежа
    public long calculate(int totalCreditAmount, byte term, float rate) {
        float rateMonth = rate / 100 / 12;
        byte termMonth = (byte) (term * 12);
        double koef = Math.pow(1 + rateMonth, termMonth);
        return (long) (totalCreditAmount * rateMonth * koef /( koef  - 1));
    }
}
