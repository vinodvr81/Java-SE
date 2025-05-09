package com.udemy.code;


class RectangleCr
{
    int length;
    int breadth;
    
    RectangleCr()
    {
        length=breadth=1;
    }
    RectangleCr(int l,int b)
    {
        length=l;
        breadth=b;
    }
   
}

class Cuboid extends RectangleCr
{
    int height;
    
    Cuboid()
    {
        height=1;
    }
    
    Cuboid(int h)
    {
        height=h;
    }
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    
    int volume()
    {
        return length*breadth*height;
    }
}


public class SuperConst 
{
    public static void main(String[] args) 
    {

        Cuboid c=new Cuboid(5,3,10);
        System.out.println(c.volume());
    }    
}



class ParentX
{
	ParentX()
    {
        System.out.println("Non-Param of Parent");
    }
	ParentX(int x)
    {
        System.out.println("Param of Parent "+x);
    }
}

class ChildX extends ParentX
{
	ChildX()
    {
        System.out.println("Non-Param of Child");
    }
	ChildX(int y)
    {
        System.out.println("Param of Child");
    }
	ChildX(int x,int y)
    {
        super(x);
        System.out.println("2 Param of Child "+y);
    }
}










