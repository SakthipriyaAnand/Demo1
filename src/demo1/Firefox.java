package demo1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Firefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\al khat al asfar\\Desktop\\selenium chrome\\firefox\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
		WebDriver driver = new FirefoxDriver();// we can use both the methods
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
//		WebElement men = driver.findElement(By.className("desktop-main"));
//		men.click();
		
		WebElement women = driver.findElement(By.linkText("/shop/women"));
		women.click();

	}

}
