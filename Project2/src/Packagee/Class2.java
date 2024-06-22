package Packagee;

public class Class2 {

	
		// TODO Auto-generated method stub
        int age;
        int rollno;
        
	public void M1()
	{
	System.out.println("Welcome to all of you");
	}
	public void M2()
	{
		System.out.println("Automation is very easy");
	}

    public static void main(String[] args) {
    Class2 abc=new Class2();
    abc.M1();
    abc.M2();
    abc.age = 2;
    abc.rollno = 1;
		System.out.println("Value for "+abc.age);
	    System.out.println("Value for"+abc.rollno);
    }
}
