package TestNGFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDataProvider {
	
	
	WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="Login")
	public void LoginTest(String user,String pwd, String exp)
	{
		System.out.println(user + ":"  +pwd +":" +exp);
	}
	@DataProvider(name="Login")
	public String[][] getData()
	{
		String loginData[][]= {
			{"Test@test.com","123","Valid"},
			{"Test@test1.com","123","Valid"},
			{"Test@test2.com","123","Valid"},
			{"Test@test3.com","123","Valid"},
			{"Test@test4.com","123","Valid"},
			{"Test@test5.com","123","Valid"},
		};
		return loginData;

}
	@AfterClass
	void tearDown()
	{
		driver.close();
	}
	}
	

