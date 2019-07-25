package Cucumber.CS_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CS_01 {
	WebDriver driver;
	
	@Given("To register in TestMeApp")
	public void to_register_in_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		 System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("http://10.232.237.143:443/TestMeApp");
		 driver.manage().window().maximize();
		WebElement signup= driver.findElement(By.xpath("//a[contains(text(), 'SignUp')]"));
		 signup.click();
	}

	@Then("I Provided Username")
	public void i_Provided_Username() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		 driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("bbnmjkliop");
		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("bnm");
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("jkl");
	}

	@Then("Provide Password")
	public void provide_Password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("bnmjkliop890");
	}

	@Then("Confirm Password by Re-entering")
	public void confirm_Password_by_Re_entering() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("bnmjkliop890");
	}
	

@Then("Select Gender")
public void select_Gender() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
	 driver.findElement(By.xpath("//span[text()='Female']")).click();
}

@Then("Email address")
public void email_address() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
    driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("bnmjkliop@ajkj.com");
}

	@When("Enter mobile number")
	public void enter_mobile_number() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("8837349480");
	}
	
	@Then("DOB and Address")
	public void dob_and_Address() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("03/10/1996");
		 driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Ramnagar");
	}

	@Then("Security question and its Answer")
	public void security_question_and_its_Answer() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.xpath("//select[@name='securityQuestion']")).sendKeys("What is your favourite color?");
		 driver.findElement(By.xpath("//input[@name='answer']")).sendKeys("black");
	}

	@Then("Click on Submit")
	public void click_on_Submit() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}


}
