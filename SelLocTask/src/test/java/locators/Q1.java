package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.close();
	}

}
