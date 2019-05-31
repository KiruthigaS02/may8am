package org.tcs;

public class GitFristDay {
	
	public void emp() {
		System.out.println("tcs");

	}
	
	public void empid() {
		System.out.println("123456");
		
	}
	
		
	
	private void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\KiruthigaSelenium\\tt\\Tata\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
			
	}

	
	
}
