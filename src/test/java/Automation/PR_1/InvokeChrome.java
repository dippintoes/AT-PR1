package Automation.PR_1;

import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChrome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\AXIS_TRAINING\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

}
