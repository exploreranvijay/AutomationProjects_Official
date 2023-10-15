package VerificationsAndReportings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		String actualLink=driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String expectedLink="Customer Servi";
		System.out.println("Actual Link :" +actualLink);
		System.out.println("Expected Link :" +expectedLink);
		
//		if(actualLink.equals(expectedLink))
//	    if(actualLink.equalsIgnoreCase(expectedLink))
		if(actualLink.contains(expectedLink)) 
			
			System.out.println("Both Links are Matched");
			else
			System.out.println("Both Links are not Matched");
		}
		
		
		
		
		
		
		
		
		
		

	}


