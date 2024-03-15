package CSC1350_Spring24.Loops;

import java.text.DecimalFormat;

public class Random {
    public static void main(String[] args) {
        System.out.println(Math.random());

        System.out.println((Math.random() * 100)  + 1);
        System.out.println((Math.random() * 100)  + 1);
        System.out.println((Math.random() * 100)  + 1);

        //ways to round number to n (4 here) decimal places
        double randomNum = Math.random()* 100;
        System.out.println(randomNum);
        double number = Math.round(randomNum * Math.pow(10, 4)) / Math.pow(10, 4);
        System.out.println(number);
        DecimalFormat df_obj = new DecimalFormat("#.####"); //cant extend # to more decimal places
        System.out.println(df_obj.format(randomNum) );


        System.out.println((int)(Math.random() * 100)  + 1);
        System.out.println((int)(Math.random() * 100)  + 1);
        System.out.println((int)(Math.random() * 100)  + 1);
        System.out.println((int)(Math.random() * 100)  + 1);
        System.out.println((int)(Math.random() * 100)  + 1);
        System.out.println((int)(Math.random() * 10)  + 1);
        System.out.println((int)(Math.random() * 10)  + 1);
        System.out.println((int)(Math.random() * 10)  + 1);
        System.out.println((int)(Math.random() * 10)  + 1);






    }
}
