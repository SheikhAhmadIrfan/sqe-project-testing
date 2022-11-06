# sqe-assignment

**Introduction to UI components**
User Interface is the visual part of a software application that obviously determines how a user interacts with an application, or a website, and how information is displayed on the screen.
Of course,  UI contains, for example, buttons, menus, text fields and all other controls those users interact with when using an application
Therefore, UI tests are scripts that verify an application as the end-user would.
Indeed they mimic actions, such as clicking on a control, entering text, scrolling a page and so on, by also checking that the software does what it should of course.
So, UI tests are so powerful because they go end to end, from the UI layer down.
End-to-end means testing all the different parts of an application from the beginning (the user interface) to the end (the underlying services, the database connectivity, etc.).
Briefly, what makes UI tests so good is that they walk through all the layers of the application being tested, ensuring for key application workflows that everything is indeed hooked up and behaves as expected.

**We choose Java Cumcumber BDD**

**Cucumber** is a widely used tool for Behaviour Driven Development because it provides an easily understandable testing script for system acceptance and automation testing.

**BDD (Behavioral Driven Development)**_ is a software development approach that was developed from Test Driven Development (TDD).
BDD includes test case development on the basis of the behavior of software functionalities. All test cases are written in the form of simple English statements inside a feature file, which is human-generated. Acceptance test case statements are entirely focused on user actions.

*XML Declaration* XML is widely used in which allows developers to easily reuse existing functionalities and add customizations. Compared to XML layouts, UI components use a more semantical approach to declare and configure the user interface. An instance of a UI component is usually based on the hierarchy of child UI components. For example:


JAVA class The code below shows how the Java class of a UI component is implemented.

	WebDriver driver = null;
	Login webLogin;
	Setting webSetting;
	Password password;
	@Given("browser is open")
	
	public void browser_is_open() throws InterruptedException {
		String projectPath=System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    Thread.sleep(4000);
	}
	@When("user enters email and password")
	public void user_enters_email_and_password() throws InterruptedException {
	   webLogin = new Login (driver);
	   webLogin.enterusername();
	   webLogin.enterpassword();
	   Thread.sleep(4000);
	}
	
	@And("user clicks signin")
	public void user_clicks_signin() throws InterruptedException {
		webLogin.user_clicks_signin();
		Thread.sleep(4000);
	}

_**Running tests from within Eclipse**_
Correctness tests can be run from within the Eclipse IDE using a "JUnit Plug-in Test" launch configuration:

1 - In the Package Explorer, select the test or test suite you want to run. Each test package typically contains a TestSuite class that contains all the tests in that package. Suites from multiple packages are then aggregated into higher level suites. Here are some useful suites to know about:
 org.eclipse.ui.tests.UiTestSuite - runs all UI tests
 org.eclipse.core.tests.runtime.AutomatedTests - runs all runtime tests
 org.eclipse.core.tests.resources.AutomatedTests - runs all resource tests
2 - Select Run > Run...
3 - Choose the "JUnit Plug-in Test" category, and click the button to create a new test
4 - On the "Main" tab, select the appropriate application for that test. Here are some important applications to know about:
  [No Application] - Headless Mode - for running headless core (runtime, osgi, resource) tests
   org.eclipse.ui.ide.workbench - for running UI tests
5 - Click Run.
  
_**Getting the required bundles**_
Check out the test plugin containing the tests you want to run, along with any prerequisite plug-ins. Here are some plug-ins you will likely need:

1 - org.junit - The JUnit test framework
2 - org.eclipse.test - The basic infrastructure for running Eclipse tests
3 - org.eclipse.core.tests.harness - Various utility pieces used by many tests
4 - org.eclipse.core.tests.runtime - Tests for the runtime component
5 - org.eclipse.core.tests.resources - Tests for the resources component
6 - org.eclipse.ui.tests.harness - Various utility pieces used by UI tests
7 - org.eclipse.ui.tests - Tests for the Eclipse UI 

**Testing on Java 7**
In some Java 7 implementations, the order of methods returned by java.lang.Class#getDeclaredMethods() is not consistent across runs. This method is used by JUnit to discover test methods, which means test order may change across executions. Generally each test method should be coded to not depend on test execution order, which also makes it easier for people to run individual tests when debugging and get consistent results. In some rare cases separate tests rely on each other, in which case you can use the test suite to hard-code a test execution order. There is also a convenience class OrderedTestSuite.java that you can use or copy for this purpose.
**
Code coverage**
Platform uses JaCoCo as code-coverage tool. JaCoCo doesn't require additional configuration than setting up a Java agent, and doesn't require to modify any class file on the filesystem. There's a Maven plugin to enable it, which works perfectly with tycho-surefire.

**Generate JaCoCo coverage data with Maven/Tycho**
Parent pom for Platform defines a coverage profile that enables and configures the jacoco-maven-plugin for tests. So you can simply run mvn clean verify -Pjacoco ... and you'll get the jacoco.exec report file in the tests/target folder (or just target/ if there is no tests module).

The location where this .exec file is generated can be overriden by command line settings: -Djacoco.destFile=/some/better/path. As the coverage data gets appended to the output file, you should usually make sure that there is no such file already before running tests to ensure it's only going to contain data from your current build, not a previous one. Concretely, that means that you should delete the jacoco file before running any build.

In **Selenium UI testing** is to perform the automated web browser interaction with the help of writing test scripts to perform various user activities on web applications and user interface also it’s a known for the ideal for UI testing performance activities as well as cross-browser script testing because it can run with the same tests on different browsers and versions based on the requirement. The UI testing is also known as GUI testing; it can be tested with any type of software features that can be interact with users to ensure the criteria.
  
  

Introduction to the _**Metabase Testing Framework**_

Metabase allows you to create dashboards that can contain KPIs and other relevant metrics used in the organization. It also gives updates based on the metrics.
An enterprise making use of this software has users. These users perform certain actions – buying, subscribing, abandoning a cart, etc. Its dashboard provides resources to query those data and arrive at logical conclusions for improvement.
The publishing of analysis results in every company might require additional activities and support. These could have to do with coding the interface or requiring non-technical users to interact with tools like Matlab/Julia etc. It allows sharing links to dashboards with other users and embedding links.

***Audience***
Companies using Metabase for analytics are majorly from United States with 236 customers. 33.81% of Metabase customers are from the United States.

**Entering dependencies in POM.XML file**
  
  <dependencies>
  <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>5.7.0</version>
</dependency>
<!-- https://mvnrepository.com/artifact/junit/junit -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13</version>
    <scope>test</scope>
</dependency> 
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>5.7.0</version>
    <scope>test</scope>
</dependency> 
<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.0.0-alpha-5</version>
</dependency>
  </dependencies>

**Creating Runner File**__
Runner file is used to run many test cases at a same time.

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"steps"},
monochrome=true,
plugin={"pretty","junit:target/JUnitReports/report.xml"
		,"json:target/JSONReports/report.json",
		"html:target/HtmlReports/report.html"}

                                                  Writing Testable Code
This topic does not aim to be a replacement for existing documentation about testing, but rather tries to highlight some thoughts on the subject. Although the truth of anything depends somewhat on the context, this topic attempts to provide information that is applicable in most situations.

  Tests should be simple
Tests should be trivial to write. Simple, small classes with few collaborators are easy to test. If testing a class is difficult, the class probably has grown too large and does too much. Split the class into several classes, each of which does only one thing.

  Manage dependencies
A big part of making code testable is managing its dependencies. Dependencies can take many forms and they can be clearly stated or hidden. The fewer dependencies a class has and the more obvious they are, the easier it is to maintain and test the class. At the same time, the class is less likely to break because of future changes.

  Creating new instances
We strongly recommend you do not: Use new to instantiate new objects, because that removes the flexibility the seleium-cumcumber dependency configuration offers. Use the ObjectManager directly in production code.


