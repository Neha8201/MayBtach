package Packagee;

public class Assignment3 {
public Assignment3() {
	
	System.out.println("default");// 0
}
public Assignment3(int a) {
	
	System.out.println("one parameterized");//1
}
public Assignment3(int a, int b) {
	this();
	
	System.out.println("two parameterized");//2
}
public Assignment3(int a, int b, int c) {
	
	this(2,3);
	System.out.println("Three parameterized");//3
}
public static void main(String[] args) {
	Assignment3 obj=new Assignment3(1,2);
	Assignment3 obj1=new Assignment3();
	Assignment3 obj2=new Assignment3(3,3,7);
	Assignment3 obj3=new Assignment3(4);
}
}
