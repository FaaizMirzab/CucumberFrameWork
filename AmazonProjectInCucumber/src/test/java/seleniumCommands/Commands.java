package seleniumCommands;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Commands {
	
	public static WebDriver driver;
	
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}
	public WebElement elementFind(String Xpath) {
		WebElement element = driver.findElement(By.xpath(Xpath));
		return element;
	}
	public void sendKeys(String Xpath ,String data) {
		WebElement element = elementFind(Xpath);
		if(element.isDisplayed()) {
			element.sendKeys(data);
		}
	}
	public void click(String Xpath) {
		WebElement element = elementFind(Xpath);
		if(element.isDisplayed()) {
			element.click();
		}
	}
	public void switchMethod() {
		ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}
	public void quit() {
		driver.quit();
	}
}
