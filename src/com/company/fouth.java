package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class fouth {
    public static void main(String[] args) {
        int sprob = 0;
        int[] num = new int[3];

        for (int i = 0; i < num.length; i++) {
            num[i] = (int) Math.round(Math.random() * 2 + 1);
            System.out.println(num[i]);
        }
        int[] num_2 = new int[3];
        while (sprob != 2) {
            for (int a = 0; a < num_2.length; a++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ведіть числа :");
                num_2[a] = sc.nextInt();

            }
            sprob++;
            if (Arrays.equals(num, num_2)) {
                System.out.println("---- Вітаю ви виграли !! ----");
                break;
            }else if (sprob == 2){
                System.out.println("---- Повезе наступного разу ( :  ----");
            }else System.out.println("---- Спробуй ще раз ----");

        }


    }
}

