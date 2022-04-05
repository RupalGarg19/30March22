package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Task1 {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void SetDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.ndtv.com/");  
		driver.manage().window().maximize();
		driver.findElement(By.id("h_sub_menu")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'WEATHER')]")).click();  
		
	}
	
	@AfterTest
	public void closedriver(){
		
		System.out.println(driver.findElement(By.xpath("//body/div[@id='map_canvas']/div[1]/div[4]/div[12]/div[1]/div[1]/span[1]")).getText());	
		Assert.assertEquals("39?",driver.findElement(By.xpath("//body/div[@id='map_canvas']/div[1]/div[4]/div[12]/div[1]/div[1]/span[1]")).getText());

		driver.close();
	}

}
