package com.udemy.code;

import java.lang.reflect.*;

class MyObj
{
    private int a;
    protected int b;
    public int c;
    int d;
    
    public MyObj() {}
    
    public MyObj(int x,int y) {}
    
    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}
    
}

public class ReflectDemo 
{
    public static void main(String[] args) 
    {
        Class c=MyObj.class;
        
        Field field[]=c.getDeclaredFields();
        
        Method meth[]=c.getMethods();
        
        for(Method m:meth)
            System.out.println(m);
        
        Parameter param[]=meth[0].getParameters();
        
        for(Parameter p:param)
        {
            System.out.println(p);
        }
        
    }   
}
















