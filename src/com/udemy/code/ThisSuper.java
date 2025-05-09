package com.udemy.code;


class RectangleU
{
    int length;
    int breadth;
    int x=10;
    
    RectangleU(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
   
}

class CuboidU extends RectangleU
{
    int height;
    int x=20;
    
    CuboidU(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
    }
}


public class ThisSuper 
{
    public static void main(String[] args) 
    {
    
    	CuboidU c=new CuboidU(10,5,15);
           c.display();
        
    }   
}
