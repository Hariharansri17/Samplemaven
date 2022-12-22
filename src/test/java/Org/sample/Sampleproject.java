package Org.sample;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sampleproject {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://www.flipkart.com/");
	   
	   driver.manage().window().maximize();
		
		WebElement Close = driver.findElement(By.xpath("//button [@class='_2KpZ6l _2doB4z']"));
		Close.click();
		
		WebElement txtsearch = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		txtsearch.sendKeys("iphone12");
		
		WebElement btnsearch = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		btnsearch.click();
		
	    List<WebElement> iphone_tagname = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	    
	    for(int i=0;i<iphone_tagname.size();i++) {
		   
		   
		   String Tagename = iphone_tagname.get(i).getText();
		   
		   System.out.println(Tagename);
		   
		   
		   System.out.println(Tagename);
		   System.out.println(Tagename);
		   
	   }
	    
	    
		
		}

}
