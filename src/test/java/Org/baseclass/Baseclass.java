package Org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;
	
	
	public static WebDriver browserLaunch(String browsername) {
		
		switch (browsername) {
		
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			break;
			
        case "Firefox":
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		
			break;
        case "edge":
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
			break;
			
			
		}
		return driver;

	}
	
	public static  void urllanch(String url) {
		
		driver.get(url);
		}
	
	public static void maximize() {
		
		driver.manage().window().maximize();
		

	}
	
	public static void implcitywait(long sec) {
		
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		
	}
	

}
