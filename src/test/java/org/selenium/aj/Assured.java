package org.selenium.aj;

import org.testng.annotations.Test;

public class Assured {

    // Hello I am User 2 updating few details

    @Test
    public void test1(){
        System.out.println("Test1");
    }

    @Test
    public void test2(){
        System.out.println("Test2");
    }

    @Test
    public void test3(){
        System.out.println("Test3");
    }

    public void calculate(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Assured assured = new Assured();
        assured.calculate(10,22);
    }
}
