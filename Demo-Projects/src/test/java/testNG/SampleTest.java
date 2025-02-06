package testNG;

import org.testng.annotations.Test;

public class SampleTest {
	
	
	@Test(invocationCount =3 )
	public void createContact() 
	{
		
		System.out.println("contact created");
	}

	//@Test(priority=1)
	//@Test(dependsOnMethods = "createContact")
	//@Test(enabled = false)
	
	@Test
public void modifyContact() 
{
	System.out.println("contact modified");
}
	
//	@Test(dependsOnMethods = "createContact")
	@Test
	
	public void deleteContct() 
	{
		System.out.println("contact deleted");
	}
			
}
