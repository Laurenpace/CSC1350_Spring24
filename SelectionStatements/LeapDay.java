package CSC1350_Spring24.SelectionStatements;

import java.util.Scanner;
/*
if divisible by 400 print leap year
else if divisble by 100 print not a leap year
else if divisible by 4 print leap year
else print not a leap year
 */
public class LeapDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        //if divisible by 400 print leap year/
        if(year % 400 == 0){
            System.out.println("leap year");
        }
//        else if divisble by 100 print not a leap year
        else if(year % 100 == 0 ){
            System.out.println("not a leap year");
        }
//        else if divisible by 4 print leap year
        else if(year % 4 == 0){
            System.out.println("leap year");
        }
//        else print not a leap year
        else System.out.println("not a leap year");
















        boolean leap = false;
       if(year % 4 == 0){
           if(year % 100 == 0){
               if(year % 400 == 0){
                   leap = true;
               }
               else leap = false;
           }
           else leap = true;
       }



        if(leap)
            System.out.println("leap");
        else
            System.out.println("not leap");



    }
}
