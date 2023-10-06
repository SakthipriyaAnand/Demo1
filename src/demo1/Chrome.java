package demo1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Chrome {
	
	public static void main(String[] args) {
														//path of drivers/chromedriver.exe folder
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\al khat al asfar\\eclipse-workspace\\Demo1\\drivers\\chromedriver.exe");
		ChromeOptions options =new ChromeOptions();
														//path of chrome browser
		options.setBinary("C:\\Users\\al khat al asfar\\Desktop\\selenium chrome\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement Username= driver.findElement(By.id("email"));
		Username.sendKeys("bsakthipriya@gmail.com");
		

		WebElement password = driver.findElement(By.name("pass"));//find element using name
		password.sendKeys("12345");//giving input to password using sendkeys
		
		WebElement loginbtn= driver.findElement(By.name("login"));//find elements using name
		loginbtn.click();//click login button
		
		String exptitle = "Facebook";
		System.out.println("Expected Title of the page: "+exptitle);
		String acctitle= driver.getTitle();
		System.out.println("Acctual Title of the page: "+acctitle);
		
		if(exptitle.equals(acctitle)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		}
}
