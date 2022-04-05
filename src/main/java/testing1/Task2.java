package testing1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import testing.Task1;

public class Task2 extends Task1{
	
	@Test
	public static void Test() {
		
	    driver.findElement(By.id("searchBox")).sendKeys("Ajmer");
	    driver.findElement(By.xpath("//input[@id='Ajmer']")).click();
		
	}

}
