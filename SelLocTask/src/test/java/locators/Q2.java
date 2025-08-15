package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		String Title = driver.getTitle();
		
		String ExceptedTitle = "STORE";
		
		if(Title.equals(ExceptedTitle)) {
			
			System.out.println("Page landed on correct website");
			
		} else
			
			System.out.println("Page not landed on correct website");
			
			driver.quit();

	}
		

	}


