package steps;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;

import org.openqa.selenium.By;

public class Password {
	
WebDriver driver;
	
	public Password(WebDriver driver){
		this.driver=driver;
	}	
	
	public void user_clicks_Passwords() {
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[1]/div[2]/label[2]/div/span")).click();
	}
	
	public void user_enter_Current_password() {
	    driver.findElement(By.xpath("//*[@id=\"formField-old_password\"]/div[2]/div/input")).sendKeys("yesimfine360");
	}

	public void user_enter_create_password_and_confirm_password(String s1 , String s2) {
	    driver.findElement(By.xpath("//*[@id=\"formField-password\"]/div[2]/div/input")).sendKeys(s1);
	    driver.findElement(By.xpath("//*[@id=\"formField-password_confirm\"]/div[2]/div/input")).sendKeys(s2);
	  	}


	public void user_clicks_save(){
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[2]/form/div[4]/button/div/div")).click();
	}

	

}
