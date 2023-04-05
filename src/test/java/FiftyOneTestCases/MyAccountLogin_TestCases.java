package FiftyOneTestCases;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyAccountLogin_TestCases {

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
		
//		4) Enter registered username in username textbox
		
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Email.click();
		Email.sendKeys("jeff.bezos@gmail.com");
		
//		5) Enter password in password textbox
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.click();
		Password.sendKeys("S3ntimient0");
		
//		6) Click on login button
		
		WebElement RegisterButton=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
		RegisterButton.click();
		
//		7) User must successfully login to the web page
	}	
	
	@Test @Ignore
	public void IncorrectLogin() {
		
		//3) Click on My Account
		WebElement MyAccount=driver.findElement(By.xpath("//li[@id='menu-item-50']"));
		MyAccount.click();
		
		//stupid ad workaround
		driver.navigate().back();
		MyAccount.click();
		
//		4) Enter incorrect username in username textbox
		
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Email.click();
		Email.sendKeys("jeff.besos@gmail.com");
		
//		5) Enter incorrect password in password textbox.
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.click();
		Password.sendKeys("id0ntc4r3");
		
//		6) Click on login button
		
		WebElement RegisterButton=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
		RegisterButton.click();
		
//		7) Proper error must be displayed(ie Invalid username) and prompt to enter login again
	}	
	
	@Test @Ignore
	public void EmptyPassword() {
		
		//3) Click on My Account
		WebElement MyAccount=driver.findElement(By.xpath("//li[@id='menu-item-50']"));
		MyAccount.click();
		
		//stupid ad workaround
		driver.navigate().back();
		MyAccount.click();
		
//		4) Enter valid username in username textbox
		
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Email.click();
		Email.sendKeys("jeff.bezos@gmail.com");
		
//		5) Now enter empty password in the password textbox
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.click();
		Password.sendKeys("");
		
//		6) Click on login button
		
		WebElement RegisterButton=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
		RegisterButton.click();
		
//		7) Proper error must be displayed(ie Invalid password) and prompt to enter login again
	}	

	@Test @Ignore
	public void EmptyUsername() {
		
		//3) Click on My Account
		WebElement MyAccount=driver.findElement(By.xpath("//li[@id='menu-item-50']"));
		MyAccount.click();
		
		//stupid ad workaround
		driver.navigate().back();
		MyAccount.click();
		
//		4) Enter empty username in username textbox
		
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Email.click();
		Email.sendKeys("");
		
//		5) Now enter valid password in the password textbox
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.click();
		Password.sendKeys("S3ntimient0");
		
//		6) Click on login button
		
		WebElement RegisterButton=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
		RegisterButton.click();
		
//		7) Proper error must be displayed(ie Invalid username) and prompt to enter login again
	}	
	
	@Test @Ignore
	public void EmptyUsernamePassword() {
		
		//3) Click on My Account
		WebElement MyAccount=driver.findElement(By.xpath("//li[@id='menu-item-50']"));
		MyAccount.click();
		
		//stupid ad workaround
		driver.navigate().back();
		MyAccount.click();
		
//		4) Enter empty username in username textbox
		
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Email.click();
		Email.sendKeys("");
		
//		5) Now enter empty password in the password textbox
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.click();
		Password.sendKeys("");
		
//		6) Click on login button
		
		WebElement RegisterButton=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
		RegisterButton.click();
		
//		7) Proper error must be displayed(ie Invalid username) and prompt to enter login again
	}	
	

	@Test @Ignore
	public void MaskedPassword() {
		
		//3) Click on My Account
		WebElement MyAccount=driver.findElement(By.xpath("//li[@id='menu-item-50']"));
		MyAccount.click();
		
		//stupid ad workaround
		driver.navigate().back();
		MyAccount.click();
		
//		4) Enter the password field with some characters.
		
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.click();
		Password.sendKeys("hello");
		
//		5) The password field should display the characters in asterisks or bullets such that the password is not visible on the screen
	}	
	
	@Test @Ignore
	public void CaseSensitive() {
		
		//3) Click on My Account
		WebElement MyAccount=driver.findElement(By.xpath("//li[@id='menu-item-50']"));
		MyAccount.click();
		
		//stupid ad workaround
		driver.navigate().back();
		MyAccount.click();
		
//		4) Enter the case changed username in username textbox
		
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Email.click();
		Email.sendKeys("JEFF.BEZOS@GMAIL.COM");
		
//		5) Enter the case changed password in the password tetxbox
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.click();
		Password.sendKeys("S3NTIMIENT0");
		
//		6) Click on login button
		
		WebElement RegisterButton=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
		RegisterButton.click();
		
//		7) Login must fail saying incorrect username/password.
	}	
	
	@Test
	public void LoginAuthentication() {
		
		//3) Click on My Account
		WebElement MyAccount=driver.findElement(By.xpath("//li[@id='menu-item-50']"));
		MyAccount.click();
		
		//stupid ad workaround
		driver.navigate().back();
		MyAccount.click();
		
//		4) Enter registered username in username textbox
		
		WebElement Email=driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Email.click();
		Email.sendKeys("jeff.bezos@gmail.com");
		
//		5) Enter password in password textbox
		WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Password.click();
		Password.sendKeys("S3ntimient0");
		
//		6) Click on login button
		
		WebElement RegisterButton=driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[3]/input[3]"));
		RegisterButton.click();
		
//		7) Once your are logged in, sign out of the site
		WebElement Signout=driver.findElement(By.xpath("//*[@id=\"page-36\"]/div/div[1]/div/p[1]/a"));
		Signout.click();
		
//		8) Now press back button
		driver.navigate().back();
		
//		9) User shouldn’t be signed in to his account rather a general webpage must be visible
	}
	
	
}
