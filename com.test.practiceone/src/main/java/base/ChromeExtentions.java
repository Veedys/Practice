package base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class ChromeExtentions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sibghatullahveedy/Downloads/chromedriver");		
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("dictionary.crx"));
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("file:///Users/sibghatullahveedy/Downloads/extension_4_1_8_0/browser_action.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		

		
		WebElement optiolnk = driver.findElement(By.id("options-link"));
		optiolnk.click();
		
		Set <String> windoID = driver.getWindowHandles();
		List <String> list = new ArrayList<String>(windoID);
		String parentTab = list.get(0);
		String childTab = list.get(1);
		
		System.out.println("Parent Window ID = " + parentTab);
		System.out.println("Child Windo ID = " + childTab);
		
		driver.switchTo().window(childTab);
		WebElement language = driver.findElement(By.id("language-selector"));
		Select select = new Select(language);
		select.selectByVisibleText("French");
		Thread.sleep(5000);
		WebElement save = driver.findElement(By.id("save-btn"));
		save.click();
		driver.close();
		
		driver.switchTo().window(parentTab);
		WebElement search = driver.findElement(By.id("query-field"));
		search.sendKeys("Book");
		WebElement define = driver.findElement(By.id("define-btn"));
		define.click();
		Thread.sleep(5000);
		driver.quit();
		driver.close();
	}

}
