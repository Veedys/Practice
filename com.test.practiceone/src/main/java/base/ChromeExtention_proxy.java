package base;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeExtention_proxy {



			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "/Users/sibghatullahveedy/Downloads/chromedriver");		
				ChromeOptions options = new ChromeOptions();
				options.addExtensions(new File("proxy.crx"));
				WebDriver driver = new ChromeDriver(options);
				WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/button[1]"));
				element.click();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
	}

}
	
