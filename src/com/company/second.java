package com.company;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведіть Гіпотинузу : ");
        int a = sc.nextInt();

        Scanner sc_2 = new Scanner(System.in);
        System.out.println("Ведіть перший катет  : ");
        int b = sc_2.nextInt();

        Scanner sc_3 = new Scanner(System.in);
        System.out.println("Ведіть другий катет : ");
        int c = sc_3.nextInt();

        if(b == 3 && c == 4){
            System.out.println("P = " + (a + b + c) );
            System.out.println("S = " + (b + c) /2 );
        }else System.out.println("Ведено не вірне значення !");
    }
}
