package com.company;

import java.rmi.MarshalException;
import java.util.Scanner;

public class fouth {
    public static void main(String[] args) {
        int sprob = 0;
        int prog;
        while (sprob != 2){
                prog = (int)(Math.random()*4);
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Ведіть числа : ");
                    sc.nextInt();
                    sprob++;
                    if(prog == sc.nextInt()){
                        System.out.println("Вітаю ви вгадали ( : ");
                        break;
                    }
                }
            }
        }



