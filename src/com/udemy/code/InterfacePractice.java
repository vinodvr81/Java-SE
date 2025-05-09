
package com.udemy.code;

interface TestNew
{
    final static int X=10;
    public abstract void meth1();
    public abstract void meth2();
    public static void meth3()
    {
        System.out.println("Meth3 of Test");
    }
}

interface Test2 extends TestNew
{
    void meth4();
}

class MyTestNew implements Test2
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}
public class InterfacePractice 
{
    public static void main(String[] args) 
    {
        System.out.println(TestNew.X);
        TestNew.meth3();
        
    }
}
