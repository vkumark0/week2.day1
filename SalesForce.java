package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Enter First Name
		driver.findElement(By.name("UserFirstName")).sendKeys("Vijay");
		
		//Enter Last Name
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Kumar");

		//Enter work email
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("vijay.velu64@gmail.com");
		
		//Choose Job Title
		WebElement title = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select ttl = new Select(title);
		ttl.selectByValue("Developer");
		
		//Enter Company
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Hexaware");
		
		//Choose Employees
		WebElement cmpyemp = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select emp = new Select(cmpyemp);
		emp.selectByValue("1600");
		
		//Enter Phone
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9600197646");
		
		//Choose Country
		WebElement country = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select cty = new Select(country);
		cty.selectByValue("IN");
		
		//Check agreement box
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div")).click();
		
		//Thread.sleep(100000);
		
		driver.quit();
	}

}
