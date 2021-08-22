package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadCreation {
	
public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Login
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Choose create lead
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Filling details in Create Lead page
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test1");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vijay");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		driver.findElement(By.name("firstNameLocal")).sendKeys("viji");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("K");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/04/87");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Vijay");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("dept");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("150");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("IC100");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$$");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Desc");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Notes");
				
		WebElement dD1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sDD1 = new Select(dD1);
		sDD1.selectByValue("LEAD_EMPLOYEE");
		
		WebElement dD2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sDD2 = new Select(dD2);
		sDD2.selectByValue("CATRQ_CAMPAIGNS");
		
		WebElement dD3 = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select sDD3 = new Select(dD3);
		sDD3.selectByVisibleText("INR - Indian Rupee");
		
		WebElement dD4 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select sDD4 = new Select(dD4);
		sDD4.selectByValue("IND_SOFTWARE");
		
		WebElement dD5 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sDD5 = new Select(dD5);
		sDD5.selectByValue("OWN_PROPRIETOR");
		
		
		//Contact Information
		WebElement phoneCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		phoneCode.clear();
		phoneCode.sendKeys("+91");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("2800");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("2000");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("158");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("vijay");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vijay.velu64@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps");
		
		
		//Primary Address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Vijay");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Name");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Address line1, New");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Address line1, New");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("New City");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("12345698");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("56");
		
		//Choose country first
		WebElement dDA = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select pDD1 = new Select(dDA);
		pDD1.selectByValue("IND");
		
		
		WebElement dDB = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select pDD2 = new Select(dDB);
		pDD2.selectByValue("IN-TN");
		
		String firstName = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println("First name value captured using getAttribute(): " +firstName);
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		if(title.equalsIgnoreCase("View Lead | opentaps CRM")) {
			System.out.println("Title of the page has been captured correctly using getTitle(): " +title);
		}
		
		else
			System.out.println("Title is not captured correctly: " +title);
		

	}


}
