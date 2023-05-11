//ArithmeticLogics.java
package al;
import lnv.LowerNumeratorValueException;
import dbz.DivisionByZeroException;
import mbz.ModuloByZeroException;
import java.util.Scanner;
public class ArithmeticLogics  
{
  Scanner s=new Scanner(System.in);
    public void sum()
  {
  System.out.println("Enter first value");
  int a=Integer.parseInt(s.nextLine());
  System.out.println("Enter second value");
  int b=Integer.parseInt(s.nextLine());	

	int c=a+b;
    System.out.println(a+ "+" +b+ "=" +c);
  }
 public void sub() throws ArithmeticException
{
  System.out.println("Enter first value");
  int a=Integer.parseInt(s.nextLine());
  System.out.println("Enter second value");
  int b=Integer.parseInt(s.nextLine());	

	int d=a-b;
    System.out.println(a+ "-" +b+ "=" +d);
}
 public void mul() throws ArithmeticException
{
  System.out.println("Enter first value");
  int a=Integer.parseInt(s.nextLine());
  System.out.println("Enter second value");
  int b=Integer.parseInt(s.nextLine());	

	int e=a*b;
    System.out.println(a+ "*" +b+ "=" +e);
}
public void div() throws NumberFormatException, DivisionByZeroException
{
  System.out.println("Enter first value");
  int a=Integer.parseInt(s.nextLine());
  System.out.println("Enter second value");
  int b=Integer.parseInt(s.nextLine());	
	if(b<=0)
    {
		DivisionByZeroException dz=new DivisionByZeroException();
        throw dz;
    }
else
{
	int f=a/b;
    System.out.println(a+ "/" +b+ "=" +f);
}
}
public void mod() throws NumberFormatException, LowerNumeratorValueException, ModuloByZeroException
{
  System.out.println("Enter first value");
  int a=Integer.parseInt(s.nextLine());
  System.out.println("Enter second value");
  int b=Integer.parseInt(s.nextLine());	
    if(a<b) 
    {
      LowerNumeratorValueException llv=new LowerNumeratorValueException();
      throw llv;
    }

	if(a<0 || b<0 )
{
	ModuloByZeroException mz=new ModuloByZeroException();
    throw mz;
}
else
{
	int g=a%b;
     System.out.println(a+ "%" +b+ "=" +g);
}
}
}
