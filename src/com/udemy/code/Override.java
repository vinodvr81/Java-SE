package com.udemy.code;

class SuperT
{
    public void display()
    {
        System.out.println("Super Display");
    }
}

class SubT extends SuperT
{
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class Override
{
    public static void main(String[] args) 
    {
        SuperT s=new SubT();
        s.display();
          
    }    
}
