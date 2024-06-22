package Packagee;

public class Arithmetic {
	  public int Sum(int a,int b)
	  {
		int c;
		c=a+b;
		System.out.println("Value of addition"+c);
		 return c; 
	  }
	  public int Sub(int x,int y)
	  {
		  int z;
		  z=x-y;
		  System.out.println("Value of subtraction"+z);
		  return z;
	  }
	  public void multiplication(int a1,int a2)
	  {
		 int result;
		 result=a1*a2;
		 System.out.println("Value of multiplication"+result);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Arithmetic ob=new Arithmetic();
       int sumResult = ob.Sum(10, 5);
       int subResult = ob.Sub(10, 5);
       ob.multiplication(sumResult, subResult);
       }

}
