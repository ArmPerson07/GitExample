package org.example;

public class Main {
   private String name;



    public static void main(String[] args) {
       int a[]=new int[]{1,3,3,45,54,66};
        int max=0;
        for (int i = 0; i <a.length; i++) {
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);


    }
}