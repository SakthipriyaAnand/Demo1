package demo1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Firefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Users\\al khat al asfar\\Desktop\\selenium chrome\\firefox\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
		WebDriver driver = new FirefoxDriver();// we can use both the methods webDriver/FirefoxDriver
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement women = driver.findElement(By.linkText("women"));
		women.click();
		WebElement men = driver.findElement(By.linkText("https://assets.myntassets.com/w_196,c_limit,fl_progressive,dpr_2.0/assets/images/2020/8/31/e72c82f2-cfd5-4f9a-b1b0-ba9e2b3e51251598892519506-W.jpg"));
		men.click();
		
		

	}

}
