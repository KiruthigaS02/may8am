package org.tcs;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selenium1 {

	
	public static void main(String[] args) {
		
		WebDriver driver;
		@BeforeClass
		private void beforeClass() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\KiruthigaSelenium\\tt\\Tata\\driver\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
				
		}
		@AfterClass
		private void afterClass() {
			driver.quit();

		}
		@Test
		private void Test1() {
	WebElement fristname = driver.findElement(By.id("firstName"));
	fristname.sendKeys("kiruthiga");

	WebElement lastname = driver.findElement(By.id("lastName"));
	lastname.sendKeys("ShanmugaSundaram");
	 
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("KiruthigaS");

	WebElement Passwd = driver.findElement(By.name("Passwd"));
	Passwd.sendKeys("12345678");

	WebElement ConfirmPasswd = driver.findElement(By.name("ConfirmPasswd"));
	ConfirmPasswd.sendKeys("12345678");

	WebElement btnclick = driver.findElement(By.className("RveJvd snByac"));
	btnclick.click();

		}
		@BeforeMethod
		private void beforeMethod() {
			Date d=new Date();
			System.out.println(d);
		}
		@AfterMethod
		private void afterMethod() {
			Date d=new Date();
			System.out.println(d);
			}

		
		
	
		
	}
}
