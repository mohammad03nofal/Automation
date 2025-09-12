import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCheckout {

	WebDriver driver = new EdgeDriver();
	String Website="https://www.saucedemo.com/";
	
	@BeforeTest
	
	public void SetUp()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(Website);	
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	public void LoginWithNormalUser()
	{
		String UserName="standard_user";
		String Password="secret_sauce";
		
	WebElement username=driver.findElement(By.id("user-name"));
	WebElement password=driver.findElement(By.id("password"));
	WebElement loginButton=driver.findElement(By.id("login-button"));
	username.sendKeys(UserName);
	password.sendKeys(Password);
	loginButton.click();	
	}
	
	@Test(priority=2)
	
	public void AddTwoRandomItems() 
	{
		Random rand = new Random();
		int RandomItem1= rand.nextInt(0,2);
		int RandomItem2= rand.nextInt(2,4);
		int RandomItem3= rand.nextInt(4,6);
		
		System.out.println(RandomItem1);
		System.out.println(RandomItem2);
		System.out.println(RandomItem3);
		List <WebElement> AddItemsButton = driver.findElements(By.className("btn"));
		List <WebElement> ItemsName = driver.findElements(By.className("inventory_item_name"));
		AddItemsButton.get(RandomItem1).click();
		AddItemsButton.get(RandomItem2).click();
		AddItemsButton.get(RandomItem3).click();
        System.out.println(ItemsName.get(RandomItem1).getText()+" has been added to the cart");
        System.out.println(ItemsName.get(RandomItem2).getText()+" has been added to the cart");
        System.out.println(ItemsName.get(RandomItem3).getText()+" has been added to the cart");
	}
	
	@Test(priority=3,enabled=false)
	
	public void Checkout() 
	{
		WebElement CartButton = driver.findElement(By.className("shopping_cart_link"));
		CartButton.click();
	    WebElement CheckoutButton = driver.findElement(By.id("checkout"));
	    CheckoutButton.click();
		WebElement FirstName = driver.findElement(By.id("first-name"));
		WebElement LastName = driver.findElement(By.id("last-name"));
		WebElement PostalCode = driver.findElement(By.id("postal-code"));
		FirstName.sendKeys("Mohammad");
		LastName.sendKeys("Nofal");
		PostalCode.sendKeys("20034");
		WebElement ContinueButton = driver.findElement(By.id("continue"));
		ContinueButton.click();
		WebElement FinishButton = driver.findElement(By.id("finish"));
		FinishButton.click();
	}

	
	
	
	
}
