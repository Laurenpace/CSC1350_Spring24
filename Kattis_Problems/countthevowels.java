package CSC1350_Spring24.Kattis_Problems;

import java.util.Scanner;

//NOT FINISHED
public class countthevowels {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int count = 0;
        for(int i = 0; i < s.length(); i++){
//            System.out.println(s.charAt(i));
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'A'){

                count++;
            }
            if(s.charAt(i) == 'a'){

                count++;
            }
            else if(s.charAt(i) == 'e'){

                count++;
            }
            else if(s.charAt(i) == 'i'){

                count++;
            }
        }

        System.out.println(count);
    }
}
