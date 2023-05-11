//ArithmeticOperations.java
import java.util.Scanner;
import lnv.LowerNumeratorValueException;
import dbz.DivisionByZeroException;
import mbz.ModuloByZeroException;
import al.ArithmeticLogics;
import aom.MenuOp;
class ArithmeticOperations 
{
	public static void main(String[] args) 
	{
        ArithmeticLogics all=new ArithmeticLogics();
		Scanner s=new Scanner(System.in);
        while(true)
        {
        try
        {
         MenuOp.operations();
         System.out.println("Enter your choice");
         int ch=Integer.parseInt(s.nextLine());
         switch(ch)
         {
			case 1:all.sum();
                    break;
            case 2:all.sub();
                   break;
            case 3:all.mul();
                   break;
            case 4:try
            {
				all.div();
            }
            catch (NumberFormatException nfe)
            {
             System.out.println("Enter only numbers");
            }catch(DivisionByZeroException dbe)
            {
				 System.out.println("Don't enter zero in denomenator");
            }
            break;
            case 5:try
            {
				all.mod();
            }
            catch (ModuloByZeroException mb)
            {
             System.out.println("Don't enter negative numbers");
            }catch(NumberFormatException nfe)
            {
				System.out.println("Enter only numbers");
            }catch(LowerNumeratorValueException lle)
            {
				System.out.println("Numerator value should be greater than denomenator value");
            }
            break;
             case 6:System.out.println("----------------------------------");
                    System.out.println("\t\tThanks for using Arithmetic Application");
                     System.out.println("----------------------------------");
                      System.exit(0);
             break;
            default:System.out.println("--------------------------------------");
                     System.out.println("\t\t Select number of Menu only");
                     System.out.println("-------------------------------------");
     
         }
			
        }
        catch (NumberFormatException nfe)
        {
         System.out.println("Enter only numbers");
        }
        
	}
}
}
