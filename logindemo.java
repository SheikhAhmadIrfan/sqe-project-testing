/*
 * package stepsDefinitions; import io.cucumber.java.en.*; import
 * java.util.concurrent.TimeUnit; import org.openqa.selenium.By; import
 * org.openqa.selenium.Keys; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver; public class logindemo { WebDriver
 * driver=null;
 * 
 * @Given("browser is open") public void browser_is_open() throws
 * InterruptedException { String projectPath=System.getProperty("user.dir");
 * System.setProperty("webdriver.chrome.driver",projectPath+
 * "/src/test/resources/drivers/chromedriver.exe"); driver=new ChromeDriver();
 * driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 * driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
 * Thread.sleep(2000); }
 * 
 * @And("user is on login page") public void user_is_on_login_page() throws
 * InterruptedException { driver.navigate().to("http://localhost:3000/");
 * Thread.sleep(2000); }
 * 
 * @When("user enters username and password") public void
 * user_enters_username_and_password() throws InterruptedException {
 * driver.findElement(By.xpath(
 * "//*[@id=\"formField-username\"]/div[2]/div/input")).sendKeys(
 * "ahmadirfansethi360@gmail.com");
 * driver.findElement(By.name("password")).sendKeys("arsenal360");
 * Thread.sleep(2000); }
 * 
 * @And("user clicks login") public void user_clicks_login() throws
 * InterruptedException { driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div/div/main/div/div[2]/div/div[2]/div/form/div[4]/button/div"
 * )).click(); Thread.sleep(2000); }
 * 
 * @And("user clicks new tab") public void user_clicks_new_tab() throws
 * InterruptedException { driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div/header/div/div[2]/div[2]/span[1]/button/div")).click()
 * ; Thread.sleep(2000); }
 * 
 * @And("user clicks dashboard") public void user_clicks_dashboard() throws
 * InterruptedException { driver.findElement(By.xpath(
 * "/html/body/span/span/div/div/div/ol/li[3]/div/div/span")).click();
 * Thread.sleep(2000); }
 * 
 * @And("^user enter name of the (.*) and (.*)$") public void
 * user_enter_name_of_the_dashboad_and_description(String db,String dash) throws
 * InterruptedException {
 * driver.findElement(By.xpath("//*[@id=\"formField-name\"]/div[2]/div/input")).
 * sendKeys(db); driver.findElement(By.xpath(
 * "//*[@id=\"formField-description\"]/div[2]/textarea")).sendKeys(dash);
 * Thread.sleep(2000); }
 * 
 * @And("user clicks create") public void user_clicks_create() throws
 * InterruptedException { driver.findElement(By.xpath(
 * "//html/body/div[5]/div/div/div/div/div/div[2]/div/form/div[4]/button[1]/div/div"
 * )).click(); Thread.sleep(2000); }
 * 
 * @Then("dashboard is created and can be viewed in my analytics") public void
 * dashboard_is_created_and_can_be_viewed_in_my_analytics()throws
 * InterruptedException { driver.findElement(By.xpath(
 * "//*[@id=\"root\"]/div/div/main/div/div/div/header/div/div[1]/div[2]/button[2]/div/div"
 * )).isDisplayed(); Thread.sleep(2000); driver.close(); driver.quit(); } }
 */