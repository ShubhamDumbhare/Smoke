package Test;

import org.testng.annotations.Test;

public class Arithmatic {

	@Test (groups = "smoke")
	public void test1()
	{
	System.out.println("smoke");
	}
	
	@Test (groups = "sanity")
	public void test2()
	{
	System.out.println("sanity");
	}

	@Test (groups = "Regression")
	public void test3()
	{
	System.out.println("Regression");
	}

	@Test (dependsOnGroups = {"smoke","sanity","Regression"})
	public void king()
	{
	System.out.println("King");
	}
}
