package com.udemy.code;



class SuperX
{
    private void display()//or even protected may not give any error.
    {
        System.out.println("Super display.");
        
    }
}

class SubX extends SuperX    
{
    //@Override if public
    public void display()
    {
        System.out.println("Sub diaplay.");
        
    }
}

public class OverrideRules {

    public static void main(String[] args) {
        
        SubX s=new SubX();
        
    }
    
}
