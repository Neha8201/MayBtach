package Packagee;

public class Arith {
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("value of addition"+c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("value of subtraction"+z);
		return z;
	}
    public void multi(int a1, int a2)
    {
    	int a3;
    	a3=a1*a2;
    	System.out.println("value of multiplication"+a3);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Arith obj=new Arith();
         int resultsum= obj.sum(4, 4);
         int resultsub= obj.sub(9, 5);
         obj.multi(resultsum, resultsub);
         
	}

}
