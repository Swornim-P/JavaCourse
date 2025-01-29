package com.third_week;

public class calclulatetotal {
    static double totalPriceCalculator(double[] items, double discount ){
        double price = 0;
        double finalprice = 0;

        for (int i = 0; i < items.length; i++) {
            price = price+items[i];


        }
        finalprice = price - ((discount/100) * price);
        return finalprice;

    }



    public static void main(String[] args) {
        double[] shoppingcart = {100, 50, 50, 300};
        System.out.println(totalPriceCalculator(shoppingcart, 20));


    }
}
