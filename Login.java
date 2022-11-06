package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Login {

WebDriver driver;
	
	public Login(WebDriver driver){
		this.driver=driver;
	}
	
	public void enterusername() {
	    driver.findElement(By.name("username"))
	    .sendKeys("tehreemshahid86@gmail.com");
	}
	
	public void enterpassword() {
		driver.findElement(By.name("password"))
		.sendKeys("yesimfine360");
	}
	
	public void user_clicks_signin() {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[2]/div/div[2]/div/form/div[4]/button/div/div"))
		.click();
	}
	
}
