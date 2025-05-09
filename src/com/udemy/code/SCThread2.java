package com.udemy.code;

class WhiteBoard
{
    String text;
    int numberOfStudents=0;
    int count=0;
    public void attendance()
    {
        numberOfStudents++;
    }
    
    synchronized public void write(String t)
    {
        System.out.println("Teacher is Writing " +t);
        while(count!=0)
                try{wait();}catch(Exception e){}
        text=t;
        count=numberOfStudents;
        notifyAll();

    }
    synchronized public String read()
    {
        
        while(count==0)
                try{wait();}catch(Exception e){}
            
        String t=text;
        count--;
        if(count==0)
                notify();
        return t;
    }
    
}
class Teacher extends Thread
{
    WhiteBoard wb;
    
    String notes[]={"Java is language","It is OOPs","It is Platform Independent","It supports Thread","end"};
    
    public Teacher(WhiteBoard w)
    {
        wb=w;
    }
    
    public void run()
    {
        for(int i=0;i<notes.length;i++)
            wb.write(notes[i]);
    }          
    
}

class StudentTread extends Thread
{
    String name;
    WhiteBoard wb;
    public StudentTread(String n,WhiteBoard w)
    {
        name=n;
        wb=w;
    }
    
    public void run()
    {
        String text;
        wb.attendance();
                
        do
        {
            text=wb.read();
            System.out.println(name + " Reading " + text);
            System.out.flush();
        }while(!text.equals("end"));
    }
    
}


public class SCThread2 
{
    public static void main(String[] args) 
    {
        WhiteBoard wb=new WhiteBoard();
        Teacher t=new Teacher(wb);
        
        StudentTread s1=new StudentTread("1. John",wb);
        StudentTread s2=new StudentTread("2. Ajay",wb);
        StudentTread s3=new StudentTread("3. Kloob",wb);
        StudentTread s4=new StudentTread("4. Smith",wb);
        
        t.start();
        
        s1.start();
        s2.start();
        s3.start();
        s4.start();
        
    }   
}
