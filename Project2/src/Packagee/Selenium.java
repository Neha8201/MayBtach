package Packagee;

public class Selenium {
	public Selenium()
	{
		System.out.println("Default constructor");
	}
  public Selenium(int a)
  {
	  System.out.println("one parameterized");
  }
  public Selenium(int a, int b)
  {
  System.out.println("Two parameterized");
  }
  public static void main(String[]args)
  {
	  Selenium obj= new Selenium(99,66);
  }
}
