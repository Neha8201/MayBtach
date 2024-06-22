package Packagee;

public class Assign2 {
	
public int multi(int a, int b)
{
	int c;
	c=a*b;
	System.out.println("Value of multi method is"+c);
	return c;
	}
public int sum(int x, int y)
{
	int z;
	z=x+y;
	System.out.println("Value of sum method is"+z);
	return z;
}
public int sub(int a1, int a2)
{
	int a3;
	a3=a1-a2;
	System.out.println("Value of sub method is"+a3);
	return a3;
}
public void div(int b1,int b2)
{
	int b3;
	b3=b2/b1;
	System.out.println("Value of div method is"+b3);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Assign2 obj=new Assign2();
      int multiResult=obj.multi(10, 2);
      int sumResult=obj.sum(multiResult, 2);
      int subResult=obj.sub(sumResult, 4);
      int subResult2=obj.sub(subResult, 4);
      obj.div(subResult2, 7);
	}

}
