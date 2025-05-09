
package com.udemy.code;

class TestN
{
    public int max(int a,int b)
    {
        return a>b?a:b;
    }
    
    public int max(int a,int b,int c)
    {
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }
}

public class Overloading 
{
    public static void main(String[] args) 
    {
    	TestN t=new TestN();
        t.max(10,5);
        t.max(10,15,5);
        
        
        
    }
    
}
