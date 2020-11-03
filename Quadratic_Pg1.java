import java.util.*;
class javapg1
{
public static void main (String args[])
{
double a,b,c,d,r1,r2;
System.out.println("Enter the values of a, b and c:");
Scanner sc =new Scanner(System.in);
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
d=(b*b)-(4*a*c);
r1=((-b)+Math.sqrt(d))/(2*a);
r2=((-b)-Math.sqrt(d))/(2*a);
if (d>0)
{
System.out.println("root 1="+r1+"root 2="+r2);
}
else if (d ==0)
{
System.out.println("root 1=root2="+r1);
}
else
	System.out.println("There are no real solutions for the quadratic equation");
}
}
