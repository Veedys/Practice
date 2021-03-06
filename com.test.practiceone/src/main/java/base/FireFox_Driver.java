package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class FireFox_Driver {

	public static void main(String [] args) throws InterruptedException{
		
		
		
		System.setProperty("webdriver.gecko.driver", "/Users/sibghatullahveedy/Downloads/geckodriver");
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.vans.com/en-us");
		String windoID1 = driver.getWindowHandle();
		System.out.println(windoID1);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String title = driver.getTitle();
		System.out.println("-------" + title + "--------");
		System.out.println();
		if (title.equals("Vans® | Official Site | Free Shipping & Returns")){
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Title is wrong");
		}
		WebElement customsbtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[1]/div[1]/div[2]/div/div/header/div[1]/nav/div[4]/a"));
	
		customsbtn.click();
		

		WebElement getStartedbtn = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div[1]/ul/li[6]/a/div"));

		getStartedbtn.click();
		
		Thread.sleep(5000);
		driver.quit();
		driver.close();
		
	}

	
}
