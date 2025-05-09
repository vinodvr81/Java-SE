package com.udemy.code;


class ATM
{
    
    synchronized public void checkBalance(String name)
    {
       System.out.print(name + " Checking ");
       
       try{Thread.sleep(1000);}catch(Exception e){}
       
       System.out.println("Balance");
    }
    
    synchronized public void withdraw(String name,int amount)
    {
        System.out.print(name + " withdrawing "); 
        
        try{Thread.sleep(1000);}catch(Exception e){}
        
        System.out.println(amount);
        
    }
}

class CustomerThread extends Thread
{
    String name;
    int amount;
    ATM atm;
    
    CustomerThread(String n,ATM a,int amt)
    {
        name=n;
        atm=a;
        amount=amt;
    }
    public void useATM()
    { 
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }
    public void run()
    {
        useATM();
    }
}

public class SCThread1 
{
    public static void main(String[] args) 
    {
        ATM atm=new ATM();
        CustomerThread c1=new CustomerThread("Smith",atm,100);
        CustomerThread c2=new CustomerThread("John",atm,200);
        c1.start();
        c2.start();
        
        
    }   
}
