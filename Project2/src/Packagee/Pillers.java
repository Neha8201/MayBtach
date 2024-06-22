package Packagee;

public class Pillers {//piller1 create class
	int xyz;
	public void me1()//piller2 create method
	{
		System.out.println("Automation is very easy, I will do it");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Pillers obj= new Pillers();//piller3 create object in main method
         obj.me1();//piller4 call method name and variable
         obj.xyz=2402;
         System.out.println("Value of"+obj.xyz);
	}

}
