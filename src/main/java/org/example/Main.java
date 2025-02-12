package org.example;

public class Main {
   private String name="Hello";
   private int age=22;


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

    public boolean calculate(int a){
        if (a%2==0){
            return true;
        }
        return true;
    }
}
