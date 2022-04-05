package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Rupal.Garg
 * @date   Mar 31, 2022
 * @project MyMavenProject
 */


public class Task3 {
	
	WebDriver driver;
	
	public void setup(WebDriver driver){

        this.driver = driver;

    }

	public void set(){

		driver.navigate().to("https://www.ndtv.com/");  
		driver.manage().window().maximize();
		
		driver.findElement(By.id("h_sub_menu")).click();
	    driver.findElement(By.xpath("//a[contains(text(),'WEATHER')]")).click();  

	}
	public void set2(){

		driver.findElement(By.id("searchBox")).sendKeys("Ajmer");
	    driver.findElement(By.xpath("//input[@id='Ajmer']")).click();

	}
	
	public void closedriver(){
		
		System.out.println(driver.findElement(By.xpath("//body/div[@id='map_canvas']/div[1]/div[4]/div[12]/div[1]/div[1]/span[1]")).getText());
		driver.close();
	}
	
}
