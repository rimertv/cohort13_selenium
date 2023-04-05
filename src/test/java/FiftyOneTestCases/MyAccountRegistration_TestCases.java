package FiftyOneTestCases;

import java.util.concurrent.TimeUnit;

//import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyAccountRegistration_TestCases {

WebDriver driver;
	
	@Before
	public void BeforeMethod() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		
	   //1) Open the browser
       //2) Enter the URL “http://practice.automationtesting.in/”
		driver.get("https://practice.automationtesting.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test @Ignore
	public void ClickMyAccount() {
		
		//3) Click on My Account
		WebElement MyAccount=driver.findElement(By.xpath("//li[@id='menu-item-50']"));
		MyAccount.click();
		
		//stupid ad workaround
		driver.navigate().back();
		MyAccount.click();
		
		//4) Enter registered Email Address in Email-Address textbox
		
		WebElement Email=driver.findElement(By.xpath("//input[@type='email']"));
		Email.click();
		Email.sendKeys("jeff.bezos@gmail.com");
		
		//5) Enter your own password in password textbox
		WebElement Password=driver.findElement(By.xpath("//*[@id='reg_password']"));
		Password.click();
		Password.sendKeys("Amazing");
		
		//6) Click on Register button
		
		WebElement RegisterButton=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]"));
		RegisterButton.click();
		
		//7) User will be registered successfully and will be navigated to the Home page
	}

	@Test @Ignore
	public void invalidEmail () {
		
		//3) Click on My Account
		WebElement MyAccount=driver.findElement(By.xpath("//li[@id='menu-item-50']"));
		MyAccount.click();
		
		//stupid ad workaround
		driver.navigate().back();
		MyAccount.click();
		
		//4) Enter invalid Email Address in Email-Address textbox		
		WebElement Email=driver.findElement(By.xpath("//input[@type='email']"));
		Email.click();
		Email.sendKeys("jeff.bezos");
		
		//5) Enter your own password in password textbox
		WebElement Password=driver.findElement(By.xpath("//*[@id='reg_password']"));
		Password.click();
		Password.sendKeys("Amazing");
		
		//6) Click on Register button
		WebElement RegisterButton=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]"));
		RegisterButton.click();
		
		//7) Registration must fail with a warning message(ie You must enter a valid email address)
		
	}
			
	@Test @Ignore
	public void emptyEmail() {
		
		//3) Click on My Account
		WebElement MyAccount=driver.findElement(By.xpath("//li[@id='menu-item-50']"));
		MyAccount.click();
		
		//stupid ad workaround
		driver.navigate().back();
		MyAccount.click();
		
		//4) Enter empty Email Address in Email-Address textbox		
		WebElement Email=driver.findElement(By.xpath("//input[@type='email']"));
		Email.click();
		Email.sendKeys("");
		
		//5) Enter your own password in password textbox
		WebElement Password=driver.findElement(By.xpath("//*[@id='reg_password']"));
		Password.click();
		Password.sendKeys("Amazing");
		
		//6) Click on Register button
		WebElement RegisterButton=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]"));
		RegisterButton.click();
		
		//7) Registration must fail with a warning message(ie please provide valid email address)
	}
	
	@Test @Ignore
	public void emptyPassword() {
		
		//3) Click on My Account
		WebElement MyAccount=driver.findElement(By.xpath("//li[@id='menu-item-50']"));
		MyAccount.click();
		
		//stupid ad workaround
		driver.navigate().back();
		MyAccount.click();
		
		//4) Enter Email Address in Email-Address textbox		
		WebElement Email=driver.findElement(By.xpath("//input[@type='email']"));
		Email.click();
		Email.sendKeys("jeff.bezos@gmail.com");
		
		//5) Enter empty password in password textbox
		WebElement Password=driver.findElement(By.xpath("//*[@id='reg_password']"));
		Password.click();
		Password.sendKeys("");
		
		//6) Click on Register button
		WebElement RegisterButton=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]"));
		RegisterButton.click();
		
		//7) Registration must fail with a warning message(ie please enter an account password)
	}
	
	@Test
	public void emptyUsernameAndPassword() {
		
		//3) Click on My Account
		WebElement MyAccount=driver.findElement(By.xpath("//li[@id='menu-item-50']"));
		MyAccount.click();
		
		//stupid ad workaround
		driver.navigate().back();
		MyAccount.click();
		
		//4) Enter empty Email Address in Email-Address textbox		
		WebElement Email=driver.findElement(By.xpath("//input[@type='email']"));
		Email.click();
		Email.sendKeys("");
		
		//5) Enter empty password in password textbox
		WebElement Password=driver.findElement(By.xpath("//*[@id='reg_password']"));
		Password.click();
		Password.sendKeys("");
		
		//6) Click on Register button
		WebElement RegisterButton=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[3]/input[3]"));
		RegisterButton.click();
		
		//7) Registration must fail with a warning message(ie please enter an account password)
	}
	
	
	
//    @After
//	public void AfterTest() {
//		driver.close();
//	}

	
	
}
