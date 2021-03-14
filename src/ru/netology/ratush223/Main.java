package ru.netology.ratush223;

public class Main {


    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int totalCreditAmount = 1_000_000;
        float rate = 9.99f;
        byte term = 1;
        long monthPayment = service.calculate(totalCreditAmount, term, rate);
        System.out.println(monthPayment);
        term = 2;
        monthPayment = service.calculate(totalCreditAmount, term, rate);
        System.out.println(monthPayment);
        term = 3;
        monthPayment = service.calculate(totalCreditAmount, term, rate);
        System.out.println(monthPayment);
    }

}
