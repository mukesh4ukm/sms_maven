package mavenpackage;

import org.testng.annotations.Test;

public class TestScript01 {
	
	
		@Test(groups = "smoke")
		public void testscript01()
		{
			System.out.println("frist method of first class");
		}
		
		
		@Test(groups = "regression")
		public void testscript02()
		{
			System.out.println("second method of first class");
		}

	}



