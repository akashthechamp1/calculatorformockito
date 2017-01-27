
import java.math.*;
public class Cal {

	public double add(double a,double b)

	{
		return a + b;
		
	}
	
	
	public double sub(double a,double b)

	{
		return a - b;
		
	}
	
	public double mul(double a,double b)

	{
		return a * b;
		
	}
	
	public double div(double a,double b)

	{
		double d = 0;
		try{
		 d = a / b;
	}
	catch(Exception e )
	{
		System.out.println("Denpminator zero is not possible");
	}
		return d;
	
	}
	
	
	
	public double exp(double a,double b)

	{
		return Math.pow(a, b);
		
	}
	
	
	public double[] root(int a,int b, int c)

	{   double[] roots=new double[2];
		double root2 ;
		double root1;
	    int d=(b*b)-4*a*c;
		if(d>0)
		{
			System.out.println("roots are real and not equal");
			 roots[0] = ( - b + Math.sqrt(d))/(2*a);
			 roots[1]= (-b - Math.sqrt(d))/(2*a);
       
           
            return roots;
		
		}
		
		else if(d==0)
		{
			
			 System.out.println("Roots are real and equal");
	             roots[0] = (-b+Math.sqrt(d))/(2*a);
	             roots[1] = (-b+Math.sqrt(d))/(2*a);
		return roots;	
		}
		else
		{
			 System.out.println("Roots are imaginary");
			
		
		return roots;
		}
		
		
		
		

		
	
		}
	
	
	
	
	
	
	
	
}
