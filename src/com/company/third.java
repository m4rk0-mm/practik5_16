package com.company;

public class third {
    public static void main(String[] args) {
        int [] num = new int[1];
        for(int i = 0; i <num.length; i++){
            num[i] =(int) Math.round(Math.random()*102);
            if(num[i] <= 9){
                System.out.println(num[i] + " Одна цифра");
            }else if(num[i] <= 99){
                System.out.println(num[i] + " Дві цифри");
            }else {
                System.out.println(num[i] + " Три цифри");
            }
        }

    }
}
