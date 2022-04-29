package base;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ProxyNewway {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "/Users/sibghatullahveedy/Downloads/geckodriver");
		
		
		WebDriver driver = new FirefoxDriver();
		
		Proxy proxy = new Proxy();
		proxy.setSocksProxy("localhost:4711");
		DesiredCapabilities descap = new DesiredCapabilities();
		descap.setCapability(CapabilityType.PROXY, proxy);
		driver.get("https://qc-opsware.republicwireless.com");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	
	
		
	}

}
