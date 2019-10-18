package testngFiles2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeMethod
	public void UseridGeneration() {
		System.out.println("testngFiles2 Annotations UseridGeneration @BeforeMethod");
	}

	@BeforeTest
	public void Cookies() {
		System.out.println("testngFiles2 Annotations Cookies @BeforeTest");
		// delete cookies
	}

	@AfterTest
	public void Cookiesclose() {
		System.out.println("testngFiles2 Annotations Cookiesclose @AfterTest");
		// close the browesers
	}

	@AfterMethod
	public void Reportadding() {
		System.out.println("testngFiles2 Annotations Reportadding @AfterMethod");
	}

	@Test
	public void OpeningBrowser() {
		// This opens the Browser
		System.out.println("testngFiles2 Annotations OpeningBrowser");

	}

	@Test
	public void FlightBooking() {
		System.out.println("testngFiles2 Annotations FlightBooking");
	}

}