package Packagee;

public class Solution2 {
  int a,b,c,d,e;
  public void method1(int x1,int x2,int x3, int x4,int x5)
  {
	 a= x1;
	 b= x2;
	 c= x3;
	 d= x4;
	 e= x5;
  }
  public static void main(String[] args) {
	Solution2 obj1=new Solution2();
	obj1.method1(10, 20, 30, 40, 50);
	System.out.println("Value one is "+obj1.a);
	System.out.println("Value 2nd is "+obj1.b);
	System.out.println("Value 3rd is "+obj1.c);
	System.out.println("Value 4th is "+obj1.d);
	System.out.println("Value 5th is "+obj1.e);
}
}
