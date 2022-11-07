package stepsDefinitions;
import io.cucumber.java.en.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UItesting {
	
	WebDriver driver=null;
	Login L;
	Dashboard D;
	
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		String projectPath=System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    Thread.sleep(2000);
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	    driver.navigate().to("http://localhost:3000/");
	    Thread.sleep(2000);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		L=new Login(driver);
		L.enterusername();
		L.enterpassword();
	    Thread.sleep(2000);
	}

	@And("user clicks login")
	public void user_clicks_login() throws InterruptedException {
		L.clicklogin();
		Thread.sleep(2000);
	}
	@And("user clicks new tab")
	public void user_clicks_new_tab() throws InterruptedException {
		L.clicknewtab();
		Thread.sleep(2000);
	}

	@And("user clicks dashboard")
	public void user_clicks_dashboard() throws InterruptedException {
		D=new Dashboard(driver);
		D.clickdashboard();
		Thread.sleep(2000);
	}

	@And("^user enter name of the (.*)$")
	public void user_enter_name_of_the_dashboad(String db) throws InterruptedException {
		D.enterdashboard(db);
		Thread.sleep(2000); 
	}
	@And("^user enter nam of the description")
	public void user_enter_name_of_the_description() throws InterruptedException {
		D.enterdescription();
		Thread.sleep(2000); 
	}
	
	@And("user clicks create")
	public void user_clicks_create() throws InterruptedException {
		D.clickcreate();
		Thread.sleep(2000);
	}
	
	@Then("dashboard is created and can be viewed in my analytics")
	public void dashboard_is_created_and_can_be_viewed_in_my_analytics()throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/div/div/header/div/div[1]/div[2]/button[2]/div/div")).isDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}