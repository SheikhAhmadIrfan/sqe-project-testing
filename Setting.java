package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class Setting {
	
WebDriver driver;
	
	public Setting(WebDriver driver){
		this.driver=driver;
	}
	
	public void user_clicks_on_setting() {
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/div[3]/div/div/button")).click();
		 
	}
	
	public void user_clicks_on_Account_settings() {
		driver.findElement(By.xpath("/html/body/span/span/div/div/div/ol/li[1]/a/div/span")).click();
	}
}
