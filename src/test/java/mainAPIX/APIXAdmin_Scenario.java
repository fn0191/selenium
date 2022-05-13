package mainAPIX;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class APIXAdmin_Scenario {
	
		public static WebDriver driver = null;
		public static WebDriverWait waitVar = null;

		public static String baseURL = "https://apix.global";
		//https://apix:brankasv2@apix.global
		
		public void createDriver() throws MalformedURLException, InterruptedException {
			String projectPath = System.getProperty("user.dir");
			System.out.println("Project path is: " + projectPath);

			//System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", projectPath + "/Users/FN/Eclipse-workspace/APIX_AutomationTest/src/test/resources/drivers/chromedriver");

			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			driver.manage().window().maximize();

			driver.get(baseURL);
		}
		
		public void endAPIX() {
			driver.close();
			driver.quit();
		}
		
		public void PreLogin() {
			//user enter prelogin button
			//driver.findElement(By.cssSelector("body > header > nav > div > a.text-base.mr-8.rounded.inline-block.text-center.text-blue-dark-5.hover\\:text-blue-light-15.font-semibold")).click();
		//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			WebElement PreLogin = driver.findElement(By.xpath("/html/body/header/nav/div/a[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", PreLogin);
		}
		
		public void LoginAsAdmin() {
			//user login via email
			//FI
			driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+revoa@brank.as"); 
			
			driver.findElement(By.id("password")).sendKeys("12345678");
			driver.findElement(By.xpath("//*[@id=\"contact-us\"]/form/button")).click();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		}
		
		public void ApixAdminMenu() {
			//select apix admin btn on user menu list
			WebElement apixadminbtn = driver.findElement(By.xpath("/html/body/header/nav/div/div/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", apixadminbtn);
			
			WebElement apixadminbtn2 = driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div[4]/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", apixadminbtn2);
		
		}
		
		public void CMS_menu() {
			//select CMS menu
			driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[16]/a/div[2]")).click();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		}
		
		public void NewsTab( ) {
			//select news tab
			WebElement newstab = driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div/div[2]/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", newstab);
		
		}
		
		public void AddNewsBtn() {
			//click add news btn
			WebElement addnewsbtn = driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div/div/div/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", addnewsbtn);
		}
		
		public void NewsForm() {
			//News title
			driver.findElement(By.name("Title")).sendKeys("What is Lorem Ipsum?");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			//Short description
			driver.findElement(By.name("ShortDescription")).sendKeys("Findec, Sweden's Hub for Fintechs, with a purpose to boost Sweden's financial technology ecosystem through network, knowledge and collaboration, has signed a partnership agreement with the ASEAN Financial Innovation Network to facilitate greater integration between Fintech hubs across the Sweden region as well as Asia. Visit www.findec.co for more information.");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			//Paragraph
			driver.findElement(By.xpath("//*[@id=\"ParagraphMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("�Our partnership with the ASEAN Financial Innovation Network will strengthen the bridge between Sweden and ASEAN in the field of fintech and innovation. Southeast Asia has been one of the main strategic markets for us, and we look forward to more collaboration in the region.�, notes Mats Holmfeldt, Founder and Chairman of Findec.\r\n"
					+ "\r\n"
					+ " \r\n"
					+ "\r\n"
					+ "Through this partnership, Findec and AFIN will mutually work on supporting the development of financial inclusion in both regions. Together, both parties will strive for greater collaboration, including sharing market knowledge and insights with each other on matters relating to the fintech industry, both parties� events and initiatives.\r\n"
					+ "\r\n"
					+ " \r\n"
					+ "\r\n"
					+ "�We are delighted to partner with Findec, an association that shares the same values and passion to improve financial inclusion in the Financial industry. With this partnership, we are certain and look forward to jointly build an environment that boosts the growth of the Fintech ecosystem across the Asian and Sweden region.� concludes Manish Diwaan, Managing Director at ASEAN Financial Innovation Network.\r\n"
					+ "\r\n"
					+ "");
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			//Background Image
			WebElement backimage = driver.findElement(By.id("input-0-BackgroundImage"));
			backimage.sendKeys("C:\\Users\\fadhi\\Downloads\\samples\\sample-logo-design-png-3-2.png");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		public void SubmitNewsBtn() {
			//click submit news btn
			WebElement SubmitNewsBtn = driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[4]/button"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", SubmitNewsBtn);	
			
		}
		
		public void CancelNewsBtn() {
			//click cancel news btn
			WebElement SubmitNewsBtn = driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[4]/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", SubmitNewsBtn);	
			
			
		}

	}

