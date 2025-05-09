package com.udemy.code;

class TestAb
{
    static
    {
        System.out.println("Block 1");
    }
    
    static
    {
    System.out.println("Block 2");
    }
}

public class StaticPractice1 {

    
    
    /*static
    {
        System.out.println("Block 1");
    }*/
    
    
    public static void main(String[] args) 
    {
        //Test t=new Test();
        System.out.println("Main");
        TestAb t=new TestAb();
    }
    
    /*static
    {
    System.out.println("Block 2");
    }*/
    
}
