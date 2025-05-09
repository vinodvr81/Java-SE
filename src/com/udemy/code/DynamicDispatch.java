
package com.udemy.code;

class SuperNew
{
    public void meth1()
    {
        System.out.println("Super Meth1");
    }
    
    public void meth2()
    {
        System.out.println("Super Meth2");
    }
}

class SubNew extends SuperNew
{
    @java.lang.Override
    public void meth2()
    {
        System.err.println("Sub Meth2");
    }
    
    public void meth3()
    {
        System.out.println("Sub Meth3");
    }
}

public class DynamicDispatch 
{
    public static void main(String[] args) 
    {
        SuperNew sup=new SubNew();
       
        sup.meth1();
        sup.meth2();

        
    }   
}
