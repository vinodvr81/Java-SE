package com.udemy.code;


class AccountTy
{
    private String accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected long balance;
    
    public AccountTy(String acc,String n,String add,String phno,String dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;
        balance=0;
    }
    public String getAccNo(){return accNo;}
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}
    public long getBalance(){return balance;}
    
    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }
            
}

class SavingsAccountTy extends AccountTy
{
    public SavingsAccountTy(String acc, String n, String add, String phno, String dob) {
		super(acc, n, add, phno, dob);
		// TODO Auto-generated constructor stub
	}
	public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccountTy extends AccountTy
{
    public LoanAccountTy(String acc, String n, String add, String phno, String dob) {
		super(acc, n, add, phno, dob);
		// TODO Auto-generated constructor stub
	}
	public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

public class SCInherit 
{
    public static void main(String[] args) 
    {
        
    }   
}
