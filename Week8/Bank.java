import java.util.*;

class Account
{
Scanner in=new Scanner(System.in);
String customer_name,type_of_account;
long account_number;
double balance=9000;

void Accept(){
System.out.println("Enter customer name");
customer_name=in.next();
System.out.println("Enter Account number");
account_number=in.nextLong();
}

void deposit()
{
int dep;
System.out.println("Enter the amount to be be deposited");
dep=in.nextInt();
balance+=dep;
System.out.println("Balance="+balance);
}

void withdrawal()
{
int witdra;
System.out.println("Enter the amount to be withdra");
witdra=in.nextInt();
balance-=witdra;
System.out.println("Balance="+balance);
}
}
class CurrAct extends Account{ 
void penalty(){
if(balance<2000){
balance-=100;
System.out.println("Penalty for maintaining less balance");
System.out.println("Balance="+balance);
}
}
}

class SavAct extends Account{
	void intrest(){
double i;
i=balance*0.02;
balance+=i;
System.out.println("Intrest="+i);
System.out.println("Total Balance="+balance);
}
}

class Bank{
public static void main (String args[]){
Scanner in=new Scanner(System.in);
CurrAct c=new CurrAct();
SavAct s=new SavAct();
System.out.println("Enter your choice\n1.Saving account\n2.current account");
int choice=in.nextInt();
if(choice==2){
c.Accept();
System.out.println("Enter your choice\n1. Deposite\n2.Withdrawl");
int n=in.nextInt();
switch(n){
case 1:{
c.deposit();
break;}
case 2:{
c.withdrawal();
c.penalty();
break;}
default : System.out.println("Wrong Option");
}
}
if(choice==1){
s.Accept();
System.out.println("Enter your choice\n1. Deposite\n2. Withdraw");
int n=in.nextInt();
switch (n){
case 1:{
s.deposit();
s.intrest();
break;}
case 2:{
s.withdrawal();
break;}
default : System.out.println("Wrong option");
}
}
}
}
