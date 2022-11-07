package stepsDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	
	public Login(WebDriver driver){
		this.driver=driver;
	}
	
	public void enterusername() {
	    driver.findElement(By.name("username"))
	    .sendKeys("ahmadirfansethi360@gmail.com");
	}
	
	public void enterpassword() {
		driver.findElement(By.name("password"))
		.sendKeys("arsenal360");
	}
	
	public void clicklogin() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[2]/div/div[2]/div/form/div[4]/button/div"))
		.click();
	}
	
	public void clicknewtab() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/div[2]/span[1]/button/div"))
		.click();
	}
	
	public void loginvaliduser( ) {
		driver.findElement(By.name("username"))
	    .sendKeys("ahmadirfansethi360@gmail.com");
		driver.findElement(By.name("password"))
		.sendKeys("arsenal360");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[2]/div/div[2]/div/form/div[4]/button/div"))
		.click();
	}
}