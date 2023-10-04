package demo1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
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
		}
}
