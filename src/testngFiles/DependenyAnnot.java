package testngFiles;

import org.testng.annotations.Test;

public class DependenyAnnot {

	@Test
	public void OpeningBrowser() {
		// This opens the Browser
		System.out.println("testngFiles DependenyAnnot OpeningBrowser");

	}

	@Test(dependsOnMethods = { "OpeningBrowser" }, alwaysRun = true)
	public void FlightBooking() {
		System.out.println("testngFiles dependsOnMethods:OpeningBrowser FlightBooking");
	}

	@Test(timeOut = 45000)
	public void Timerelated() {
//This opens the Browser
		System.out.println("testngFiles Timerelated");

	}

	@Test(enabled = false)
	public void Payment() {
//This opens the Browser
		System.out.println("testngFiles Payment enabled = false");

	}

}
