package com.udemy.code;
import java.util.Date;

class StudentCheck
{
    private String rollNo;
    
    private static int count=1;
    
    private String assignRollNo()
    {
        Date d=new Date();
        
        String rno="Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    StudentCheck()
    {
        rollNo=assignRollNo();
    }
    public String getRollNo()
    {
        return rollNo;
    }
    
}

public class SCStatic1 
{
    public static void main(String[] args) 
    {
    	StudentCheck s1=new StudentCheck();
    	StudentCheck s2=new StudentCheck();
    	StudentCheck s3=new StudentCheck();
        
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
        
    }   
}
