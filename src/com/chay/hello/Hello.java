package com.chay.hello;



public class Hello {
        public  static void  main(String[] args){
            System.out.println("hello world");
            System.out.println(new Hello().getNum(20));

        }


    private int getNum(int a){
            if (a>=20){
                System.out.println("a is bigger");
                return ++a;
            }else{
                System.out.println("a is smaller");
                return --a;
            }
        }
    private String getString(int a, int b){
            return a + b + "";
    }


}
