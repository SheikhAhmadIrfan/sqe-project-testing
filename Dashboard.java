package stepsDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {
	
	WebDriver driver;
	
	public Dashboard(WebDriver driver){
		this.driver=driver;
	}
	
	public void clickdashboard() {
		driver.findElement(By.xpath("/html/body/span/span/div/div/div/ol/li[3]/div/div/span"))
		.click();
	}
	
	public void enterdashboard(String dashboard) {
		driver.findElement(By.xpath("//*[@id=\"formField-name\"]/div[2]/div/input"))
		.sendKeys(dashboard);
	}
	
	public void enterdescription() {
		driver.findElement(By.xpath("//*[@id=\"formField-description\"]/div[2]/textarea"))
		.sendKeys("hello and welcome to my dashboard of metabase");
	}
	
	public void clickcreate() {
		driver.findElement(By.xpath("//html/body/div[5]/div/div/div/div/div/div[2]/div/form/div[4]/button[1]/div/div"))
		.click();
	}
}

