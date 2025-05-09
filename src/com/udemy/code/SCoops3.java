package com.udemy.code;


class SubjectT
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtain;
    
    public SubjectT(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }
    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtain(){return marksObtain;}
    
    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }
    public void setMarksObtain(int m)
    {
        marksObtain=m;
    }
    boolean isQualified()
    {
        return marksObtain>=maxMarks/10*4;
    }
    public String toString()
    {
        return "\nSubject ID:"+subID+"\nName :"+name+"\nMarks Obtained: "+marksObtain;
    }
}

class StudentN
{
    private String rollNo;
    private String name;
    private String dept;
    private int numOfSub;
    private SubjectT sub[];
    
    
    public void SubjectT(String roll,String name)
    {
         this.rollNo=roll;
         this.name=name;
         
    }
    public void SubjectT(String roll,String name,int ns)
    {
         this.rollNo=roll;
         this.name=name;
         this.numOfSub=ns;
    }
    
    public String getRollNo(){return rollNo;}
    public String getName(){return name;}
    public String getDept(){return dept;}
    public int getNoOfSubjects(){return numOfSub;}
    public SubjectT[] getSubjects(){return sub;}
    
    public void setDept(String dept)
    {
        this.dept=dept;
    }
    public void setSubjects(SubjectT ...subs)
    {
        for(int i=0;i<subs.length;i++)
            sub[i]=subs[i];
    }
    
    public String toString()
    {
        return "Roll :" +rollNo+"\nName :"+name+"\nDept :"+dept;
    }
    
}

public class SCoops3 
{
    
    public static void main(String[] args) 
    {
    	SubjectT subs[]=new SubjectT[3];
        subs[0]=new SubjectT("s101","DS",100);
        subs[1]=new SubjectT("s102","Algorithms",100);
        subs[2]=new SubjectT("s103","Operating Systems",100);
        
        for(SubjectT s:subs)
            System.out.println(s);
        
    }
    
}
