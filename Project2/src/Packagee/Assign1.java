package Packagee;

public class Assign1 {
	public int sum(int a, int b)
	{
	int c;
	c=a+b;
	System.out.println("Result one"+c);
	return c;
	}
	public int sub(int a1, int b1)
	{
	int c1;
	c1=a1-b1;
	System.out.println("Result three"+c1);
	return c1;
	}
	public int multi(int x, int y)
	{
	int z;
	z=x*y;
	System.out.println("Result four"+z);
	return z;
	}
	public void division(int u, int v)
	{
	int w;
	w=u/v;
	System.out.println("Result five"+w);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Assign1 obj=new Assign1();
        int sumResult=obj.sum(2, 3);
        int sumResult2=obj.sum(sumResult, 4);
        int subResult=obj.sub(sumResult2, 6);
        int multiResult=obj.multi(subResult, 9);
        obj.division(multiResult, 9);
	}
}
