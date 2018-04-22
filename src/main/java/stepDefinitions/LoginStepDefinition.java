//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class LoginStepDefinition {
//	
//	public static WebDriver driver;
//	
//	
//	@Given("^user is already on login page$")
//	public void user_is_already_on_login_page()
//	{
//		System.setProperty("webdriver.chrome.driver", "D:\\MyWorkspace_0328\\FreeCRMTestBDDFramework\\src\\chromedriver_win32\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//	
//		driver.get("https://www.freeCRM.com");
//		
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() 
//	{
//		String title=driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("Free CRM in the cloud software boosts sales", title);
//				
//	}
//	//\"([^\"]*)\"
//	// \"(.*)\"
//	
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_password(String username, String password)  {
//		
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//		// driver.findElement(By.xpath("//input[@type='submit']")).submit(); 
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button()   {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.xpath("//input[@type='submit']")).submit();
////	  WebElement Loginbtn = driver.findElement(By.xpath("//input[@type='submit']"));
////	  JavascriptExecutor js=(JavascriptExecutor)driver;
////	  js.executeScript("argument[0].click():*", Loginbtn);
// 
//	  System.out.println("i am taversing to homepage");
//	  
//	  	
//	}
//	
//	@Then("^user is on home page$")
//	public void user_is_on_home_page()
//	{
//		System.out.println("I am on homepage");
//		String title1=driver.getTitle();
//		System.out.println(title1);
//		Assert.assertEquals("CRMPRO", title1);
//	}
//	@Then("^user moves to new Contact page$")
//	public void user_moves_to_new_Contact_page()  {
//		//System.out.println("I am in home page");
//		//driver.switchTo().frame("Contact");
//		driver.switchTo().frame("mainpanel");
//		System.out.println("I am trying to open contacts page");
//		Actions action=new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]"))).perform();
//		driver.findElement(By.xpath("//a[contains(text(), 'Contacts')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(), 'New Contact')]")).click();
//	}
//
//	@Then("^user enters contacts details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_contacts_details_and_and(String firstname, String lastname, String position)  {
//		System.out.println("Passing fn, ln and postion");
//		try {
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys(firstname);
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id='surname']")).sendKeys(lastname);
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//*[@id='company_position']")).sendKeys(position);
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//		Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	@Then("^Close the browser$")
//	public void Close_the_browser()
//	{
//		driver.quit();
//	}
//
//}
