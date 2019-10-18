package testngFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeMethod
	public void UseridGeneration() {
		System.out.println("testngFiles / Annotaions UseridGeneration @BeforeMethod");
	}

	@BeforeTest
	public void Cookies() {
		System.out.println("testngFiles / Annotaion Cookies @BeforeTest ");
		// delete cookies
	}

	@AfterTest
	public void Cookiesclose() {
		System.out.println("testngFiles / Annotaion Cookiesclose @AfterTest");
		// close the browesers
	}

	@AfterMethod
	public void Reportadding() {
		System.out.println("testngFiles / Annotaion Reportadding @AfterMethod");
	}

	@Test
	public void OpeningBrowser() {
		// This opens the Browser
		System.out.println("testngFiles / Annotaion OpeningBrowser @test");

	}

	@Test
	@Parameters({ "adminUserid" })

	public void FlightBooking(String Userid) {
		System.out.println("testngFiles / Annotaion FlightBooking Userid : " + Userid);
		System.out.println("testngFiles / Annotaion FlightBooking @test with @Parameters({ \"adminUserid\" })");
	}

}