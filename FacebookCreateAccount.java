package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookCreateAccount {
	
	
	 public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Click Create Account
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		//Enter first & last names
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sekar");
		
		//Enter mobile number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("+91 9600197646");
		
		//Enter password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("1qaz2wsx_64");
		
		//Enter DOB
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select date_DOB = new Select(day);
		date_DOB.selectByValue("11");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select month_DOB = new Select(month);
		month_DOB.selectByValue("3");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select year_DOB = new Select(year);
		year_DOB.selectByValue("1991");
		
		//Choose gender
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		
		

	}

}
