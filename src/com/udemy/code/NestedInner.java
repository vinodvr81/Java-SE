
package com.udemy.code;

class OuterType
{
    static int x=10;
    Inner i=new Inner();
    
    class Inner
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    
    public void outerDisplay()
    {
        
        i.innerDisplay();
        System.out.println(i.y);
        
    }
}

public class NestedInner {

    public static void main(String[] args) 
    {
    	OuterType.Inner oi=new OuterType().new Inner();
        oi.innerDisplay();
        
    }
    
}
