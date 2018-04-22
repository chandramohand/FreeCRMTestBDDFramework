package stepDefinitions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealStepDefinition {
	
	private static final TimeUnit SECONDS = null;
	public static WebDriver driver;
	
	
	@Given("^user is already on login page$")
	public void user_is_already_on_login_page()
	{
//		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
//		LoggingPreferences loginpref = new LoggingPreferences();
//		loginpref.enable(LogType.BROWSER, Level.ALL);
//		capabilities.setCapability(CapabilityType.LOGGING_PREFS, loginpref);
		
		System.setProperty("webdriver.chrome.driver", "D:\\MyWorkspace_0328\\FreeCRMTestBDDFramework\\src\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			driver.get("https://www.freeCRM.com");		
			// Waiting 30 seconds for an element to be present on the page, checking
			 
			  // for its presence once every 5 seconds.
			
			 //driver.manage().timeouts().setScriptTimeout(15,SECONDS);
			
	}
		@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() 
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Free CRM in the cloud software boosts sales", title);
				
	}
	//\"([^\"]*)\"
	// \"(.*)\"
		@Then("^user enters the username and password$")
	public void user_enters_the_username_and_password(DataTable credentials) throws InterruptedException   {
		    List<List<String>> data=credentials.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
		// driver.findElement(By.xpath("//input[@type='submit']")).submit(); 
		Thread.sleep(1000);
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException    {
		Thread.sleep(2000);
	  WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
	  JavascriptExecutor js=((JavascriptExecutor)driver);
	  js.executeScript("arguments[0].click();", Loginbtn);
		//driver.findElement(By.xpath("//input[@type='submit']")).submit(); 
		Thread.sleep(9000);
		//System.out.println("after"); 	
	}
		@Then("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException
	{
		System.out.println("I am on homepage");
		
		String title1=driver.getTitle();
		System.out.println(title1);
		Thread.sleep(2000);
		Assert.assertEquals("CRMPRO", title1);
		Thread.sleep(1000);
	}
	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() throws InterruptedException  {
		//System.out.println("I am in deal page");
		//driver.switchTo().frame("Contact");
		Thread.sleep(100);
		driver.manage().window().maximize();
		driver.switchTo().frame("mainpanel");
		System.out.println("I am trying to open contacts page");
		Actions action=new Actions(driver);
		Thread.sleep(1000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Deal')]"))).perform();
		driver.findElement(By.xpath("//a[contains(text(), 'Deals')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'New Deal')]")).click();
		Thread.sleep(1000);
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable data)  {
		System.out.println("Passing title, amount, probability and commission");
		try {
		List<List<String>> datalist=data.raw();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='title']")).sendKeys(datalist.get(0).get(0));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='amount']")).sendKeys(datalist.get(0).get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='probability']")).sendKeys(datalist.get(0).get(2));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='commission']")).sendKeys(datalist.get(0).get(3));
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
		Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Then("^Close the browser$")
	public void Close_the_browser()
	{
		driver.quit();
	}

}
