package com.udemy.code;

class ParentY
{
	ParentY()
    {
        System.out.println("Non-Param of parent");
    }
	ParentY(int x)
    {
        System.out.println("Param of parent "+x);
    }
}

class ChildY extends ParentY
{
	ChildY()
    {
        System.out.println("Non-Param of child");
    }
	ChildY(int y)
    {
        System.out.println("Param of child");
    }
	ChildY(int x,int y)
    {
        super(x);
        System.out.println("2 param of child "+y);
    }
}

public class SuperConstr {

    public static void main(String[] args) {
        //Child c=new Child();
        //Child c=new Child(20);
    	ChildY c=new ChildY(10,20);
    }
    
}
