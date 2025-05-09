package com.udemy.code;

class TestNr
{
    static int x=10;
    int y=20;
    
    void show()
    {
        System.out.println(x+" "+y);
    }
    
    static void display()
    {
        System.out.println(x);
    }
}

public class StaticPractice {

    public static void main(String[] args) {
        
    	TestNr t1=new TestNr();
        t1.show();
        t1.x=30;
        t1.y=50; 
        
        TestNr t2=new TestNr();
        t2.show();
        
    }
    
}
