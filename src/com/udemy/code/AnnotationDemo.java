
package com.udemy.code;

class A
{
    public void display()
    {
        
    }
}

class B extends A
{
	@java.lang.Override
    public void display()
    {
        
    }
    @Deprecated
    public void show()
    {
        
    }
    
}

public class AnnotationDemo 
{
    
    public static void main(String[] args) 
    {
        int i;
        @SuppressWarnings("deprecation")

        B b=new B();
  
        b.show();
    }
    
}
