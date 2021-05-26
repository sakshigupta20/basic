package test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


 	public class practice
 	{
 		//String baseURL="https://www.amazon.com";
 		 public WebDriver driver;
 		
 		@Test
 		public void setDriver()
 		{
 			System.setProperty("webdriver.chrome.driver","C:\\Work\\chromedriver.exe");
 			driver=new ChromeDriver();
 			driver.manage().window().maximize();
 			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 			//driver.manage().window().maximize();
 			
 		}
 		@Test(dependsOnMethods= {"setDriver"})
 		public void openBrowser() throws InterruptedException
 		{
 			System.out.println("---verify---");
 			//driver.get(baseURL);
 			//System.setProperty("webdriver.driver.chrome","C:\\Work\\chromedriver.exe");
 			//driver=new ChromeDriver();
 			//driver.get(baseURL);
 			driver.get("https://phptravels.com");
 			driver.findElement(By.xpath("//*[text()='Demo']")).click();
 			Thread.sleep(4000);
 			driver.findElement(By.xpath("//*[text()='http://www.phptravels.net']")).click();
 			
 			//Thread.sleep(5000);
 		
 			//driver.findElement(By.xpath("//*[text()='Search.by.Hotel.or.City.Name']")).click();
 			//driver.findElement(By.className("div.dropdown dropdown-login dropdown-tab")).click();
 		}
 		
 		
}
 

