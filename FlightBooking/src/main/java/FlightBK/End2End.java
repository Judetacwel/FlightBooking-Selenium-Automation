package FlightBK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class End2End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\judet\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
