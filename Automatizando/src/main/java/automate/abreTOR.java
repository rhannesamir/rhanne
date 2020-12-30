package automate;

import java.awt.Window;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;



public class abreTOR {
	public static void main(String[] args) throws InterruptedException {
		
	/*	File torProfileDir = new File("C:\\Users\\Qintess\\Desktop\\Tor Browser\\Browser\\TorBrowser\\Data\\Browser\\profile.default");
			FirefoxBinary binary = new FirefoxBinary(new File("C:\\Users\\Qintess\\Desktop\\Tor Browser\\Browser\\firefox.exe"));
			FirefoxProfile torProfile = new FirefoxProfile(torProfileDir);
			torProfile.setPreference("webdriver.load.strategy", "unstable");
			torProfile.setPreference("network.proxy.type", 1);
			torProfile.setPreference("network.proxy.socks", "127.0.0.1");
			torProfile.setPreference("network.proxy.socks_port", 9150);

			try {
			  binary.startProfile(torProfile, torProfileDir, "https://www.ferendum.com/pt/PID568637PSD384911811");
			  new Thread().sleep(10000);
			} catch (IOException e) {
			  e.printStackTrace();
			}*/
		System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
			 File file = new File("C:\\Users\\Qintess\\Desktop\\Tor Browser\\Browser\\TorBrowser\\Data\\Browser\\profile.default");
			    DesiredCapabilities dc = DesiredCapabilities.firefox();
			    FirefoxProfile profile = new FirefoxProfile(file);
			    profile.setPreference("webdriver.load.strategy", "unstable");
			    profile.setPreference("network.proxy.type", 1);
			    profile.setPreference("network.proxy.socks", "127.0.0.1");
			    profile.setPreference("network.proxy.socks_port", 9150);
			    dc.setCapability(FirefoxDriver.PROFILE, profile);
			    FirefoxDriver driver = new FirefoxDriver(dc);
			    driver.get("https://www.ferendum.com/pt/PID568637PSD384911811");
			    new Thread().sleep(10000);
			    driver.close();
			/*
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
	        FirefoxDriver driver = new FirefoxDriver();
	        new Thread().sleep(10000);

	        driver.switchTo().window(driver.getWindowHandle());
	        String teste = "/html/body/spamtrap/main/div[3]/div[3]/div/div/table/tbody/tr[4]/td[1]/input";
	        driver.findElementByXPath(teste).click();
	        new Thread().sleep(10000);
			driver.close();
		*/
			
	}	
}
