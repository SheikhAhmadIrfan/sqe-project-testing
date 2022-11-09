package steps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class loginsteps {
	
	WebDriver driver = null; tehreem
	Login webLogin;
	Setting webSetting;
	Password password;main
	@Given("browser is open")
	
	public void browser_is_open() throws InterruptedException {
		String projectPath=System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    Thread.sleep(4000);
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	    driver.navigate().to("http://localhost:3000");
	    Thread.sleep(4000);
	}

	@When("user enters email and password")
	public void user_enters_email_and_password() throws InterruptedException {

	   webLogin = new Login (driver);
	   webLogin.enterusername();
	   webLogin.enterpassword();
	   driver.findElement(By.xpath("//*[@id=\"formField-username\"]/div[2]/div/input")).sendKeys("tehreemshahid86@gmail.com");
	   driver.findElement(By.xpath("//*[@id=\"formField-password\"]/div[2]/div/input")).sendKeys("arsenal360"); main
	   Thread.sleep(4000);
	}
	
	@And("user clicks signin")
	public void user_clicks_signin() throws InterruptedException {

		webLogin.user_clicks_signin();

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[2]/div/div[2]/div/form/div[4]/button/div/div")).click();

		Thread.sleep(4000);
	}


	@And("user clicks on setting")
	public void user_clicks_on_setting() throws InterruptedException {

	    webSetting = new Setting(driver);
	    webSetting.user_clicks_on_setting();

	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/div[3]/div/div/button")).click();

	    Thread.sleep(4000);
	}

	@And("user clicks on Account settings")
	public void user_clicks_on_Account_settings() throws InterruptedException {

	    webSetting.user_clicks_on_Account_settings();

	    driver.findElement(By.xpath("/html/body/span/span/div/div/div/ol/li[1]/a/div/span")).click();

	    Thread.sleep(4000);
	}

	@And("user clicks Passwords")
	public void user_clicks_Passwords() throws InterruptedException {

	    password = new Password (driver);
	    password.user_clicks_Passwords();

	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[1]/div[2]/label[2]/div/span")).click();

	    Thread.sleep(4000);
	}
	
	@And("user enter Current password")
	public void user_enter_Current_password() throws InterruptedException {

	    password.user_enter_Current_password();
	    Thread.sleep(4000);
	}

	@And("^user enter (.*) and (.*)$")
	public void user_enter_create_password_and_confirm_password(String s1 , String s2) throws InterruptedException {
	    password.user_enter_create_password_and_confirm_password(s1, s2);

	    driver.findElement(By.xpath("//*[@id=\"formField-old_password\"]/div[2]/div/input")).sendKeys("arsenal360");
	    Thread.sleep(4000);
	}

	@And("user enter create password and confirm password")
	public void user_enter_create_password_and_confirm_password() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"formField-password\"]/div[2]/div/input")).sendKeys("arsenal365");
	    driver.findElement(By.xpath("//*[@id=\"formField-password_confirm\"]/div[2]/div/input")).sendKeys("arsenal365");

	    Thread.sleep(4000);
	}


	@And("user clicks save")
	public void user_clicks_save() throws InterruptedException {

	    password.user_clicks_save();

	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div[2]/form/div[4]/button/div/div")).click();

	    Thread.sleep(4000);
	}

	@And("password is changed")
	public void password_is_changed() throws InterruptedException {
		Thread.sleep(4000);
	}
	@Then("User navigate to login page")
	public void user_navigate_to_login_page() throws InterruptedException {
	    driver.navigate().to("http://localhost:3000/auth/login");
	    Thread.sleep(4000);
	    driver.close();
	    driver.quit();
	}
}

