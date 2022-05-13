package mainAPIX;

import java.net.MalformedURLException;
import java.util.Base64;
import java.util.concurrent.TimeUnit;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class APIX_Scenario1 {
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;

	public static String baseURL1 = "https://apix:brankasv2@apix.global";
	//https://apix:brankasv2@apix.global
	//https://apix.global
	
	public static String baseURL2 = "https://hackolosseum.apix.global/host-hackathon";
	//https://apix:brankasv2@apix.global

	public void createDriver() throws MalformedURLException, InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");
		///Users/FN/Eclipse-workspace/APIX_AutomationTest/src/test/resources/drivers

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(baseURL1);
	}
		
	public void createDriverNonMember() throws MalformedURLException, InterruptedException {
			String projectPath = System.getProperty("user.dir");
			System.out.println("Project path is: " + projectPath);

			System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");

			driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			driver.manage().window().maximize();

			driver.get(baseURL2);
				

	}

	public void endAPIX() {
		driver.close();
		driver.quit();
	}

	public void GetStartedButton() {
		//Get started has been removed 7/4/21 - click Register here button
		WebElement GetStartedButton = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", GetStartedButton);
		
	}
	
	public void RegisterFromLoginPage() {
		//Get started has been removed 7/4/21 - click Register here button
		WebElement RegisterFromLoginPage = driver.findElement(By.xpath("//*[@id=\"contact-us\"]/form/a[4]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", RegisterFromLoginPage);
		
	}
	

	public static String decodePassword(String passWord) {
		byte[] decodePassword = Base64.getDecoder().decode(passWord);
		return new String(decodePassword);

	}

	public void RegisterViaEmail() {
		//user enter email FIN | CB
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+cc8@brank.as");
		
		//user enter password
		driver.findElement(By.id("new-password")).sendKeys("12345678");
		

	}
	
	public void RegisterViaEmail2() {
		//user enter email for FT | SI
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+ds9@brank.as");
		
		//user enter password
		driver.findElement(By.id("new-password")).sendKeys("12345678");
		

	}
	
	
	public void afterClickRegButton() {
		//user clicks register button
		driver.findElement(By.id("register")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	
		
	}

	//	REGISTER VIA GOOGLE
	public void RegisterViaGMAIL() {
		// user clicks continue with google
		driver.findElement(By.xpath("/html/body/main/div/form/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void EnterToGMAIL() {
		//user enter gmail account
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("fadhilatun.nisa@brank.as");
		//driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("clara.manik@brank.as");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//user enter gmail pass
		String passWord = decodePassword("ZmEwMzEhKSkhKCE=");
		//String passWord = decodePassword("Q2xhcmFAMTAxMA==");
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(passWord);
	}
	
	//user clicks continue gmail button
		public void afterClickContinueGmailButton() {
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	
	//	REGISTER VIA GITHUB
	public void RegisterViaGithub() { 
		//user clicks continue with github
	 driver.findElement(By.xpath("/html/body/main/div/form/a[2]")).click();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	}
	
	public void EnterToGithub() {
	//user enter email github
	 driver.findElement(By.id("login_field")).sendKeys("fadhilatun.nisa@brank.as");
	 
	// user enter pass github
	 String passWord = decodePassword("ZmEwMzEhKSkhKCE=");
	 driver.findElement(By.id("password")).sendKeys(passWord);
	}
	 
	 public void continueGithub() {
		 //user clicks sign in github button
	 driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[3]/input[12]")).click();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	 //enter token
	 //driver.findElement(By.xpath("")).sendKeys("c521c5cc8c720ac572aff76973ae678d559607d9");
	 //user clicks verify button
	// driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/form/button")).click();
	 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	  }
	 

	public void PreLogin() {
		//user enter prelogin button
		//driver.findElement(By.cssSelector("body > header > nav > div > a.text-base.mr-8.rounded.inline-block.text-center.text-blue-dark-5.hover\\:text-blue-light-15.font-semibold")).click();
	//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement PreLogin = driver.findElement(By.xpath("/html/body/header/nav/div/a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", PreLogin);
	}
		
	public void LoginFI() {
		//user login via email
		//FI
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+cc1@brank.as"); 
		
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\"contact-us\"]/form/button")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	public void LoginFT() {
		//FT
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+dcnonapi@brank.as");
		
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\"contact-us\"]/form/button")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	public void LoginToCreateAPI() {
		//create API
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+xxi@brank.as"); 
		
		
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//*[@id=\"contact-us\"]/form/button")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	public void CompleteRegister() {
		//user clicks complete register here link
		//driver.findElement(By.cssSelector("body > main > section.bg-blue-light-30 > div > a")).click();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		WebElement CompleteRegister = driver.findElement(By.xpath("/html/body/main/section[1]/div/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", CompleteRegister);

	}

	// ONBOARD NEW ORG
	public void AccountInfoTab() {
		//user complete account info
		//user enter first name field
		driver.findElement(By.name("firstName")).sendKeys("Mrs.");
		
		//user enter last name field
		driver.findElement(By.name("lastName")).sendKeys("Alexa CC 8");
	}
	
	public void clickNextInfo() {
		//user click next info button	
		WebElement nexbutton1 = driver.findElement(By.xpath("/html/body/main/section/div/div[3]/form/input[3]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", nexbutton1);
	}

	public void OrgInfo1Tab() {
		//user complete organization info
		//user enter org 
		driver.findElement(By.xpath("/html/body/main/section/div/div[3]/form/div[1]/div[1]/input")).sendKeys("PT ALEXA CC8");
		
		//user select org type
		Select drpOrgType = new Select(driver.findElement(By.id("orgType")));
		//FI
		drpOrgType.selectByVisibleText("Financial institution");  //Financial institution | Central bank | Other
		
	}
	
	public void OrgInfo12Tab() {
		//user complete organization info
		//user enter org 
		driver.findElement(By.xpath("/html/body/main/section/div/div[3]/form/div[1]/div[1]/input")).sendKeys("Alexa Dc 9 ORG");
		
		//user select org type
		Select drpOrgType = new Select(driver.findElement(By.id("orgType")));
		//FT | SI
		drpOrgType.selectByVisibleText("Fintech");
		// Fintech | System integrator

	}
	
	public void clickNextOrg1() {
		// note: if want to continue to org info tab2 (if new don't need it)
		//user clicks next org1 button
		WebElement clickNextOrg1 = driver.findElement(By.xpath("/html/body/main/section/div/div[3]/form/div[5]/div[1]/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickNextOrg1);

	}

	public void OrgInfo2Tab() {
		//user complete organization info 2 - FI | CB | OTHER
		// org address field
		driver.findElement(By.id("address")).sendKeys("123 East St");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// operation country field
		Select opCountry = new Select(driver.findElement(By.id("operation-country")));
		opCountry.selectByValue("SG");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//NEW FIELD - UEN
		driver.findElement(By.xpath("//*[@id=\"uen_registration_number\"]/input")).sendKeys("UEN1113414S");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		// Multiple select Org category field	
		//User click org category to open
		driver.findElement(By.xpath("//*[@id=\"org-info-start\"]/div[3]/div[1]/div/div[1]/span")).click();
				
		//User select Line of Business
		WebElement selectLine = driver.findElement(By.id("assetManagement")); 	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectLine);
		
		//User click org category to close
		driver.findElement(By.xpath("//*[@id=\"org-info-start\"]/div[3]/div[1]/div/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		//Select Subcategory -- used if OTHER ORG ONLY
			//	WebElement Subcategory = driver.findElement(By.name("SubCategory"));
			//	Select othersubcategory = new Select(Subcategory);
			//	othersubcategory.selectByValue("Fintech Association"); //Fintech Association // Promoter 
			//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		
		
		// sample deselect
		// orgCategory = new
		// Select(driver.findElement(By.xpath([@id=\"org-info-start\"]/div[2]/div/div[1]")));
		// orgCategory.deselectByVisibleText("Asset Management");
		// orgCategory.deselectByVisibleText("Central Banks");
		
	
		// select countries field
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"org-info-start\"]/div[5]/div/select"));
		Select countries = new Select(dropdown);
		countries.selectByVisibleText("Global");
		countries.selectByValue("SG");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// short desc field
		driver.findElement(By.name("shortDescription")).sendKeys("\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute ir");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// how did u hear about us field
		WebElement heardropdown = driver.findElement(By.xpath("//*[@id=\"org-info-end\"]/div[1]/div[2]/select"));
		Select howdropdown = new Select(heardropdown);
		howdropdown.selectByValue("Event"); //Event / Word of mouth / Association / Others
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// input tags field
		WebElement tag = driver.findElement(By.id("tagInput"));
		tag.sendKeys("betaauto");
		tag.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// upload file field
		WebElement elem = driver.findElement(By.xpath("//*[@id=\"input-0-company-logo\"]"));
		elem.sendKeys("/Users/FN/Downloads/samples/dummy-logo.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	public void OrgInfo22Tab() {
		//user complete organization info 22 - FT | SI
		// user enter org address field
		driver.findElement(By.id("address")).sendKeys("123 XX Bondi St");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// operation country field
		Select opCountry = new Select(driver.findElement(By.id("operation-country")));
		opCountry.selectByValue("SG");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// NEW FIELD - UEN
		driver.findElement(By.xpath("//*[@id=\"uen_registration_number\"]/input")).sendKeys("556789");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		// Multiple select Org category field
		//User click org category to open
		driver.findElement(By.xpath("//*[@id=\"org-info-start\"]/div[3]/div[1]/div/div[1]/span")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//WebElement clickcat = driver.findElement(By.xpath("///*[@id=\"org-info-start\"]/div[3]/div[1]/div/div[1]/span")); 	
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickcat);
		
	
				
		//User select Type
		//WebElement selectType0 = driver.findElement(By.id("aiMl")); 	
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectType0);
		
		WebElement selectType = driver.findElement(By.id("digitalCurrency")); 	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectType);
		
		//WebElement selectType1 = driver.findElement(By.id("feat")); 	
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectType1);
				
		
		//User select Line of Business
		WebElement selectLine = driver.findElement(By.id("assetManagement")); 	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectLine);
		
		
		//User select Business Processes
		WebElement selectBusiness = driver.findElement(By.id("prospecting")); 	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectBusiness);
		
		
		//User click org category to close
		driver.findElement(By.xpath("//*[@id=\"org-info-start\"]/div[3]/div[1]/div/div[1]")).click();
		//*[@id="org-info-start"]/div[3]/div
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		// user select which countries do you operate in?
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"org-info-start\"]/div[5]/div/select"));
		Select countries = new Select(dropdown);
		countries.selectByVisibleText("American Samoa");
		countries.selectByValue("SG");
		countries.selectByValue("ID");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// user enter short desc field
		driver.findElement(By.name("shortDescription")).sendKeys("\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute ir");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// user enter contact number
		driver.findElement(By.name("contactNumber")).sendKeys("614162501144");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// user enter org website
		driver.findElement(By.name("website")).sendKeys("https://brank.as");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//user click radio button are you legal entity?
		WebElement LegalRadiobutton = driver.findElement(By.id("yesLegal"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", LegalRadiobutton);
		
		// WebElement LegalRadiobutton = driver.findElement(By.id("yesLegal"));
		// ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", LegalRadiobutton);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		//user select Legal form of company
		WebElement legaldropdown = driver.findElement(By.id("legal-form"));
		Select legal = new Select(legaldropdown);
		legal.selectByVisibleText("Partnership");
		// Partnership | Sole Propietorship | Limited Partnership | General Partnership | Limited Liability |  Corporation
		
		//user enter date of incorporation
		 WebElement dateBox = driver.findElement(By.id("incorp-date"));
	     dateBox.sendKeys("25092013");
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     
	     //user select to please provide additional information/documentation on your organization�s incorporation
	     WebElement additionalDropdown = driver.findElement(By.id("additionalInformation"));
		 Select additional = new Select(additionalDropdown);
		 additional.selectByVisibleText("Provide details of any FinTech associations you are part of");
		// Upload company incorporation document | Provide registration number and country authority | Provide details of any FinTech associations you are part of
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		 	//if select upload
			//WebElement company = driver.findElement(By.id("upload-file-label-incorporation-document"));
			//company.sendKeys("/Users/FN/Downloads/samples/30_Days_of_API_TestingV2.pdf");
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//if select registration number
			//driver.findElement(By.xpath("//*[@id=\"registrationNumber\"]/textarea")).sendKeys("RN123");
			
			//if select details of FinTech
			driver.findElement(By.name("fintechAssociation")).sendKeys("SI123");
			
		//user select Org Size
		WebElement OrgSizeDropdown = driver.findElement(By.xpath("//*[@id=\"org-size\"]/select"));
		Select OrgSize = new Select(OrgSizeDropdown);
		OrgSize.selectByVisibleText("50 - 200");
		// < 50 | 50 - 200 | 200 - 1000 | > 1000
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					 
	  	
		// how did u hear about us field
		WebElement heardropdown = driver.findElement(By.xpath("//*[@id=\"org-info-end\"]/div[1]/div[2]/select"));
		Select howdropdown = new Select(heardropdown);
		howdropdown.selectByValue("Event"); //Event / Word of mouth / Association / Others
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		// input tag field
		WebElement tag = driver.findElement(By.id("tagInput"));
		tag.sendKeys("cbdc");
		tag.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// upload file field
		WebElement addFile = driver.findElement(By.id("input-0-company-logo"));
		addFile.sendKeys("/Users/FN/Downloads/samples/c.jpeg");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	public void clickNextOrgInfo2() {
		
		// //user clicks next org2 button
		driver.findElement(By.xpath("/html/body/main/section/div/div[3]/form/div[5]/div[1]/input")).submit();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void investmentInfoTab() {
		//FUNDING INFORMATION section
		//fund series
		WebElement selectFTSeries = driver.findElement(By.id("FundingStage"));
		Select fund = new Select(selectFTSeries);
		fund.selectByValue("Pre-Seed"); //Pre-Seed / Seed / A / B / C
		//association name
		driver.findElement(By.name("AssociationName")).sendKeys("Assoc Pre-Seed 1");
		//association number
		driver.findElement(By.name("AssociationNumber")).sendKeys("Assoc 11111");
		//select cloud
		WebElement cloud = driver.findElement(By.id("CloudCredit"));
		Select cloudCredit = new Select(cloud);
		cloudCredit.selectByValue("Google Cloud Platform"); //Amazon Web Services / Google Cloud Platform
		
		//PITCH TO CUSTOMER section
		//select countries
		WebElement selectpitchcountry = driver.findElement(By.id("PitchCountryRestricted"));
		Select pitchcountry = new Select(selectpitchcountry);
		pitchcountry.selectByValue("true"); //true / false
		//if yes - restricted reason
		driver.findElement(By.name("PitchRestrictedReason")).sendKeys("Anything");
		
		//select language support
		//User click language to open
		WebElement openLanguage = driver.findElement(By.xpath("//*[@id=\"pitch-customers\"]/div[3]/div/div[1]/div[1]/span")); 	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", openLanguage);
			
		//User select Type
		WebElement selectLanguage = driver.findElement(By.id("afrikaans")); 	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectLanguage);
					
		
		//User click language to close
		WebElement closeLanguage = driver.findElement(By.xpath("//*[@id=\"pitch-customers\"]/div[3]/div/div[1]/div[1]")); 	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeLanguage);
		
		

		//use case categories
		driver.findElement(By.name("PitchUseCaseCategories")).sendKeys("Use Case 2.1");
		
		//upload pitch use case categories
		WebElement usecasedoc = driver.findElement(By.id("input-0-pitch-document"));
		usecasedoc.sendKeys("/Users/FN/Downloads/samples/Brankas Statement Service - API Documentation 2.1.pdf");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//if others, pls specify
		driver.findElement(By.name("PitchOtherUseCase")).sendKeys("Use Case 2.2");
		//company�s unique value p
		driver.findElement(By.name("PitchUniqueValueProposition")).sendKeys("Unique Use Case 2.3");
		
		//disabled for testing optional field//
		//Upload your company unique value
		//WebElement companyFile = driver.findElement(By.id("input-0-proposition-document"));
		//companyFile.sendKeys("/Users/FN/Downloads/samples/Brankas Statement Service - API Documentation (2.2).pdf");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//select-Have you completed any PoCs with FIs
		WebElement PoCs = driver.findElement(By.id("PitchHaveCompletedPoc"));
		Select completed = new Select(PoCs);
		completed.selectByValue("Yes"); //true / false
		//select-Is your solution currently live?
		WebElement solution = driver.findElement(By.id("PitchIsLive"));
		Select live = new Select(solution);
		live.selectByValue("Yes"); //true / false
		
		//PRODUCT DETAILS section
		//click add new row link
		WebElement prodDetails= driver.findElement(By.xpath("//*[@id=\"product-details\"]/div[2]/div/div/div/div[2]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", prodDetails);
		
		//What are the products that your company plans to publish on APIX?
		driver.findElement(By.id("ProductNames")).sendKeys("Product Unique 1");
		//What are the stages of your company products?
		WebElement stages = driver.findElement(By.id("ProductStages"));
		Select companyProduct = new Select(stages);
		companyProduct.selectByValue("MVP"); //Production ready / Prototyping / MVP	
		
		//What are the types of your company products?
		WebElement types = driver.findElement(By.id("ProductTypes"));
		Select companyProduct2 = new Select(types);
		companyProduct2.selectByValue("Solution"); //Solution / API
		
		//REF KEY USERS section
		//click add new row link
		WebElement keyUser= driver.findElement(By.xpath("//*[@id=\"key-users\"]/div[2]/div/div/div/div[2]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", keyUser);
				
		//Name
		driver.findElement(By.name("KeyUsersNames")).sendKeys("Key Unique 1");
		//Email
		driver.findElement(By.name("KeyUsersEmails")).sendKeys("unique1@domain.com");
		//Designation
		driver.findElement(By.name("KeyUsersDesignations")).sendKeys("Engineer");
		
		//AWARD section
		//click add new row link
		WebElement award= driver.findElement(By.xpath("//*[@id=\"awards\"]/div[2]/div/div/div/div[2]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", award);
				
		//Award name
		driver.findElement(By.id("AwardsDescriptions")).sendKeys("AWARD UNIQUE 1");
		//Award year
		driver.findElement(By.id("AwardsYears")).sendKeys("2021");
		//Award link
		driver.findElement(By.id("AwardsLinks")).sendKeys("https://wwww.award2021.com");
		
		//TESTIMONIALS section
		//click add new row link
		WebElement testi = driver.findElement(By.xpath("//*[@id=\"testimonials\"]/div[2]/div/div/div/div[2]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", testi);
				
		// Client Name
		driver.findElement(By.name("TestimonialClientNames")).sendKeys("Client Unique 1");
		// Client Designation
		driver.findElement(By.name("TestimonialDesignations")).sendKeys("Developer");
		// Client Company
		driver.findElement(By.name("TestimonialCompanies")).sendKeys("PT.Brankas ID");
		// Client Description
		driver.findElement(By.name("TestimonialDescriptions")).sendKeys("QA");

	}
	
	public void clickNextInInvestmentTab() {
		// //user clicks next org3 button
				driver.findElement(By.xpath("/html/body/main/section/div/div[2]/form/div[7]/div[1]/input")).submit();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
		
	}

	public void PreviewTab() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// user check agree TnC
		WebElement yourChkBox = driver.findElement(By.id("tosAFIN"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", yourChkBox);

		WebElement yourChkBox2 = driver.findElement(By.id("tosUser"));
		executor.executeScript("arguments[0].click();", yourChkBox2);

	}
	
	public void nextPreview() {
		//user clicks next preview button
		WebElement next = driver.findElement(By.xpath("//*[@id=\"next\"]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", next);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	
	public void choosePaymentPlan() {
		//select payment
		
		//1
		//WebElement selectPayment = driver.findElement(By.id("payment-border-0")); 
		//2
		//WebElement selectPayment = driver.findElement(By.xpath("//*[@id=\"payment-border-1\"]/div[1]/span")); 
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectPayment);
		
		//enter promo code
	//	driver.findElement(By.id("promo-code")).sendKeys("RdmLmtd1"); //see on apix admin - manage promo codes (promo code column)
	
		//apply code
	//	WebElement applyCode = driver.findElement(By.xpath("/html/body/main/section/div/div[3]/form/div[3]/div[2]/a")); 
	//	((JavascriptExecutor) driver).executeScript("arguments[0].click();", applyCode);
		

	}
	
	public void choosePaymentPlan_FI() {
		//select payment
		//1
		WebElement selectPayment = driver.findElement(By.id("payment-border-0")); 
		//2
		//WebElement selectPayment = driver.findElement(By.xpath("//*[@id=\"payment-border-1\"]/div[1]/span")); 
		//WebElement selectPayment = driver.findElement(By.xpath("//*[@id=\"payment-border-1\"]/div[1]/span")); 
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectPayment);
		
		//enter promo code
	//	driver.findElement(By.id("promo-code")).sendKeys("RdmLmtd1"); //see on apix admin - manage promo codes (promo code column)
	
		//apply code
	//	WebElement applyCode = driver.findElement(By.xpath("/html/body/main/section/div/div[3]/form/div[3]/div[2]/a")); 
	//	((JavascriptExecutor) driver).executeScript("arguments[0].click();", applyCode);
		

	}
	
	public void PaymentPlanTab() {
		
		
		// enter the billing address
		driver.findElement(By.name("email")).sendKeys("fadhilatun.nisa@brank.as");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Firstname
		driver.findElement(By.name("FirstName")).sendKeys("FADauto");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// Lastname
		driver.findElement(By.name("LastName")).sendKeys("Ns");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	
	public void CompleteRegButton() {
		// COMPLETE REGISTRATION button
		driver.findElement(By.id("submit")).submit();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	
	
	
	// ONBOARD NEW API
	public void goToAPI() {
		// API link
		driver.findElement(By.xpath("/html/body/main/section[1]/div/a[2]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public void viewAllAPI_New() {
		// View All API link
		WebElement viewAllAPI = driver.findElement(By.xpath("/html/body/main/section[3]/div/div/div[1]/div/div[2]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewAllAPI);
	}
	
	public void viewAllAPI() {
		// View All API link
		WebElement viewAllAPI = driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div[1]/div/div[2]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewAllAPI);
		
	}

	public void OnboardAPI() {
		// View All APIs button
		driver.findElement(By.id("onboard-api")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void Complete_GeneralInfoTab_FIOther() {

		// --GENERAL INFORMATION TAB--
		// user enter API Name field
		driver.findElement(By.xpath("/html/body/main/form/div[1]/section[2]/div/div/div[1]/input")).sendKeys("XXI 123");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// user enter API Version field
		driver.findElement(By.xpath("/html/body/main/form/div[1]/section[2]/div/div/div[2]/input")).sendKeys("new aml feat 3");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//Select API CATEGORY IF FI/OTHER!
		// User click org category to open
		WebElement selectAPICat = driver.findElement(By.xpath("/html/body/main/form/div[1]/section[2]/div/div/div[3]/div/div[1]/span")); 	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectAPICat);
		
		//User select API category
		WebElement selectLine = driver.findElement(By.id("alternativeLending")); 	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectLine);
			
		// User click api category to close
		WebElement closeAPICat = driver.findElement(By.xpath("/html/body/main/form/div[1]/section[2]/div/div/div[3]/div/div[1]")); 	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeAPICat);
				
		
		
		// user enter API tag field
		WebElement tag = driver.findElement(By.id("tagInput"));
		tag.sendKeys("betaauto");
		tag.sendKeys(Keys.ENTER);
		WebElement tag2 = driver.findElement(By.id("tagInput"));
		tag2.sendKeys("betaapi");
		tag2.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// user enter short desc
		driver.findElement(By.xpath("/html/body/main/form/div[1]/section[2]/div/div/div[6]/textarea")).sendKeys("Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.");
		///html/body/main/form/div[1]/section[2]/div/div/div[5]/textarea
		///html/body/main/form/div[1]/section[2]/div/div/div[6]/textarea
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// user enter full desc
		driver.findElement(By.xpath("/html/body/main/form/div[1]/section[2]/div/div/div[7]/div/div[2]/div")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		///html/body/main/form/div[1]/section[2]/div/div/div[6]/div/div[2]/div
		///html/body/main/form/div[1]/section[2]/div/div/div[7]/div/div[2]/div
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// scroll page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// user upload API doc
		WebElement ApiDoc = driver.findElement(By.xpath("//*[@id=\"input-0-documentation\"]"));
		ApiDoc.sendKeys("/Users/FN/Downloads/samples/APIX2.0 - Security Feature.pdf");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	
	
	public void Complete_GeneralInfoTab_FTSI() {

		// --GENERAL INFORMATION TAB--
		// user enter API Name field
		driver.findElement(By.xpath("/html/body/main/form/div[1]/section[2]/div/div/div[1]/input")).sendKeys("XXI 123");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// user enter API Version field
		driver.findElement(By.xpath("/html/body/main/form/div[1]/section[2]/div/div/div[2]/input")).sendKeys("new aml feat 3");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		// user enter API tag field
		WebElement tag = driver.findElement(By.id("tagInput"));
		tag.sendKeys("betaauto");
		tag.sendKeys(Keys.ENTER);
		WebElement tag2 = driver.findElement(By.id("tagInput"));
		tag2.sendKeys("betaapi");
		tag2.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// user enter short desc
		driver.findElement(By.xpath("/html/body/main/form/div[1]/section[2]/div/div/div[6]/textarea")).sendKeys("Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.");
		///html/body/main/form/div[1]/section[2]/div/div/div[5]/textarea
		///html/body/main/form/div[1]/section[2]/div/div/div[6]/textarea
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// user enter full desc
		driver.findElement(By.xpath("/html/body/main/form/div[1]/section[2]/div/div/div[7]/div/div[2]/div")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		///html/body/main/form/div[1]/section[2]/div/div/div[6]/div/div[2]/div
		///html/body/main/form/div[1]/section[2]/div/div/div[7]/div/div[2]/div
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// scroll page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// user upload API doc
		WebElement ApiDoc = driver.findElement(By.xpath("//*[@id=\"input-0-documentation\"]"));
		ApiDoc.sendKeys("/Users/FN/Downloads/samples/APIX2.0 - Security Feature.pdf");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	
	
	public void nextAPItab1() {
		
		// user clicks next button
		driver.findElement(By.xpath("/html/body/main/form/div[1]/section[2]/div/div/div[9]/input[1]")).submit();
		///html/body/main/form/div[1]/section[2]/div/div/div[8]/input[1]
		///html/body/main/form/div[1]/section[2]/div/div/div[9]/input[1]
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	public void Complete_TechnicalInfoTab () {

		// --TECHNICAL INFORMATION TAB--
		// User select API spec
		WebElement APIspecDropdown = driver.findElement(By.id("specification"));
		Select apispec = new Select(APIspecDropdown);
		apispec.selectByVisibleText("Swagger 2.0");
		//Swagger 2.0 | Open API 3.0 | Other
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// scroll page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// user enter API context
		driver.findElement(By.id("api-context")).sendKeys("apiAMLFT");

		// user enter API version context
		driver.findElement(By.id("api-version")).sendKeys("v1");

		// user upload api spec
		WebElement apiSpec = driver.findElement(By.xpath("//*[@id=\"input-0-specs-file\"]"));
		//apiSpec.sendKeys("C:\\Users\\fadhi\\Downloads\\samples\\petstore-expanded.yaml");
		apiSpec.sendKeys("/Users/FN/Downloads/samples/petstore.yaml");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
		public void nextAPItab2() {
		// user clicks next button
		// another options:
		// driver.findElement(By.xpath("/html/body/main/form/div[2]/div/input[1]")).submit();
		WebElement next = driver.findElement(By.xpath("/html/body/main/form/div[2]/div/input[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", next);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		// user checklist acknowledge when endpoints failed
		WebElement acknowledgeChkcbox = driver.findElement(By.id("acknowledge-checkbox"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", acknowledgeChkcbox);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
		
		public void nextAPItab22() {	
		// user enter next button in sanity result
		WebElement next2 = driver.findElement(By.id("submitEnabled"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", next2);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	
	public void Complete_PrivSecTab () {
		// PRIVACY & SECURITY TAB

		// user select who can use the API
		WebElement seeAPIDropdown = driver.findElement(By.xpath("/html/body/main/form/div[4]/section/div[2]/div[1]/div[1]/div/select"));
		Select seeAPI = new Select(seeAPIDropdown);
		seeAPI.selectByVisibleText("All Platform User");
		//All Platform User/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// User choose - want to approve any subscription for the API?
		// select YES
		//WebElement radio = driver.findElement(By.id("approve-any-subscription-yes"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radio);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// User choose - Do API subscribers require credentials to access the API?
		//WebElement radio2 = driver.findElement(By.id("require-credentials-yes"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radio2);
		/*
		 * WebElement radioEle = driver.findElement(By.id("require-credentials-yes"));
		 * boolean select = radioEle.isSelected(); System.out.print(select); //
		 * performing click operation if element is not already selected if (select ==
		 * false) { radioEle.click(); }
		 */
		 

		/*
		 * // User Enter the link where credentials can be generated
		 * driver.findElement(By.xpath("/html/body/main/form/div[4]/section/div[2]/div[1]/div[3]/input")).sendKeys("http://www.apiauto.com"); 
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * 
		 * // User select Credential type WebElement credTyperopdown =
		 * driver.findElement(By.xpath("/html/body/main/form/div[4]/section/div[2]/div[1]/div[4]/div/select"));
		 * Select credType = new Select(credTyperopdown);
		 * credType.selectByVisibleText("External Credential");
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * 
		 * // User enter Specify instructions to access the API
		 * driver.findElement(By.id("instructions")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."); 
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 */

		// User check - confirm API 
		WebElement confirmAPIChkcbox = driver.findElement(By.id("security-confirmation"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", confirmAPIChkcbox);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void nextAPItab3() {	
		// user enter next button in sanity result
		WebElement next3 = driver.findElement(By.id("part-3-submit"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", next3);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	
	public void Complete_AgreementTab () {
		// Agreement TAB
		// User enter software license agreement
		driver.findElement(By.xpath("/html/body/main/form/div[5]/section/div[2]/div[1]/div/div/div[2]/div")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void previewButton() {	
		//user clicks preview API button
		driver.findElement(By.xpath("/html/body/main/form/div[5]/section/div[2]/div[2]/input[1]")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
	}
	
	public void PublishYourAPIButton() {	
		//user clicks publish your API button
		driver.findElement(By.xpath("/html/body/main/form/div[6]/section[1]/div/div[2]/input[3]")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	public void ContinueLaterAPIButton() {	
		//user clicks continue later button in last tab
		driver.findElement(By.xpath("/html/body/main/form/div[6]/section[1]/div/div[2]/input[2]")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}
	
	
	
	
	// ONBOARD SOLUTION
	public void goToSol() {
		// Solution link
		driver.findElement(By.xpath("/html/body/main/section[1]/div/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public void viewAllSolution() {
		// View All Solutions link
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250)"); //element at the bottom
		
		WebElement viewAllSolution= driver.findElement(By.xpath("/html/body/main/section[3]/div/div/div[1]/div/div[2]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewAllSolution);

		// /html/body/main/section[3]/div/div/div[1]/div/div[2]/a

	}

	public void OnboardSol() {
		//Onboard Solution button
		driver.findElement(By.id("onboard-api")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void GenInfoSolTab_FIOther() {
		//user enter solution name
		driver.findElement(By.id("name")).sendKeys("XXI Sol");
		
		//user solution tagline
		driver.findElement(By.id("tagline")).sendKeys("UAT tagline 1");
		
		//Select SOLUTION CATEGORY IF FI/OTHER!
				// User click org category to open
				WebElement selectSolCat = driver.findElement(By.xpath("//*[@id=\"org-info\"]/div[1]/div/div[1]/span")); 	
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectSolCat);
				
				//User select cat category
				WebElement selectType = driver.findElement(By.id("alternativeLending")); 	
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectType);
				
				//User select cat category
				WebElement selectLine = driver.findElement(By.id("assetManagement")); 	
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectLine);
				
				
				// User click api category to close
				WebElement closeSolCat = driver.findElement(By.xpath("//*[@id=\"org-info\"]/div[1]/div/div[1]")); 	
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeSolCat);
						
				
		
		//user select who can use your solution
		WebElement TypeUserDropdown = driver.findElement(By.id("user-type"));
		Select TypeUser = new Select(TypeUserDropdown);
		TypeUser.selectByVisibleText("All Platform User");
		// All Platform User | Financial Technology | Financial Insitution | System Integrator | Central Bank
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//user enter FB
		driver.findElement(By.id("facebook-url")).sendKeys("https://www.facebook.com/uatsol");
		
		//user enter YT
		driver.findElement(By.id("youtube-url")).sendKeys("https://www.youtube.com/uatsol");
		
		//user enter Twit
		driver.findElement(By.id("twitter-url")).sendKeys("https://www.twitter.com/uatsol");
		
		//user enter LinkedIn
		driver.findElement(By.id("linkedin-url")).sendKeys("https://www.linkedin.com/uatsol");
		
		//user enter solution tag
		WebElement SolTag = driver.findElement(By.id("tagInput"));
		SolTag.sendKeys("betaauto");
		SolTag.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//user select solution stage
		WebElement SolStageDropdown = driver.findElement(By.id("stage"));
		Select SolStage = new Select(SolStageDropdown);
		SolStage.selectByVisibleText("Concept");
		//Concept | Prototype | Application
		
		
		//user enter short description
		driver.findElement(By.xpath("//*[@id=\"shortDescription\"]/textarea")).sendKeys("lorem upsum short desc");
		
		//user enter full description
		driver.findElement(By.xpath("//*[@id=\"fullDescription\"]/div/div[2]/div")).sendKeys("lorem upsum long desc");
		
		//user solution image/video
		WebElement solimage = driver.findElement(By.id("input-0-documentation"));
		solimage.sendKeys("/Users/FN/Downloads/samples/dummy-logo.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement solimage2 = driver.findElement(By.id("input-0-documentation"));
		solimage2.sendKeys("/Users/FN/Downloads/samples/lozzby-150x150@2x.jpg");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement solvid = driver.findElement(By.id("input-0-documentation"));
		solvid.sendKeys("/Users/FN/Downloads/samples/24 November, 2020 - Loom Recording.mp4");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
	}
	
	public void GenInfoSolTab_FTSI() {
		//user enter solution name
		driver.findElement(By.id("name")).sendKeys("XXI Sol");
		
		//user solution tagline
		driver.findElement(By.id("tagline")).sendKeys("UAT tagline 1");
		
		
		//user select who can use your solution
		WebElement TypeUserDropdown = driver.findElement(By.id("user-type"));
		Select TypeUser = new Select(TypeUserDropdown);
		TypeUser.selectByVisibleText("All Platform User");
		// All Platform User | Financial Technology | Financial Insitution | System Integrator | Central Bank
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//user enter FB
		driver.findElement(By.id("facebook-url")).sendKeys("https://www.facebook.com/uatsol");
		
		//user enter YT
		driver.findElement(By.id("youtube-url")).sendKeys("https://www.youtube.com/uatsol");
		
		//user enter Twit
		driver.findElement(By.id("twitter-url")).sendKeys("https://www.twitter.com/uatsol");
		
		//user enter LinkedIn
		driver.findElement(By.id("linkedin-url")).sendKeys("https://www.linkedin.com/uatsol");
		
		//user enter solution tag
		WebElement SolTag = driver.findElement(By.id("tagInput"));
		SolTag.sendKeys("betaauto");
		SolTag.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//user select solution stage
		WebElement SolStageDropdown = driver.findElement(By.id("stage"));
		Select SolStage = new Select(SolStageDropdown);
		SolStage.selectByVisibleText("Concept");
		//Concept | Prototype | Application
		
		
		//user enter short description
		driver.findElement(By.xpath("//*[@id=\"shortDescription\"]/textarea")).sendKeys("lorem upsum short desc");
		
		//user enter full description
		driver.findElement(By.xpath("//*[@id=\"fullDescription\"]/div/div[2]/div")).sendKeys("lorem upsum long desc");
		
		//user solution image/video
		WebElement solimage = driver.findElement(By.id("input-0-documentation"));
		solimage.sendKeys("/Users/FN/Downloads/samples/dummy-logo.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement solimage2 = driver.findElement(By.id("input-0-documentation"));
		solimage2.sendKeys("/Users/FN/Downloads/samples/lozzby-150x150@2x.jpg");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement solvid = driver.findElement(By.id("input-0-documentation"));
		solvid.sendKeys("/Users/FN/Downloads/samples/24 November, 2020 - Loom Recording.mp4");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
	}
	
	
	public void nextGenInfoSolTab() {
		//user click next button in tab1
		WebElement nextInfoSol1 = driver.findElement(By.xpath("//*[@id=\"main-form\"]/section/div[2]/div[6]/div[1]/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextInfoSol1);

	}
	
	public void ContinueLaterGenInfoSolTab() {
		//user click continue later button in tab1
		WebElement ContinueLaterInfoSol1 = driver.findElement(By.xpath("//*[@id=\"main-form\"]/section/div[2]/div[6]/div[2]/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ContinueLaterInfoSol1);

	}
	

	public void CancelGenInfoSolTab() {
		//user cancel link in tab1
		WebElement CancelInfoSol1 = driver.findElement(By.xpath("//*[@id=\"main-form\"]/section/div[2]/div[6]/div[3]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", CancelInfoSol1);
		driver.switchTo().alert().accept();

	}
	
	
	public void SolInfoTab() {
		
		//user click add key feature button
		driver.findElement(By.id("keyFeaturesController")).click();
		
		//user enter Key features (Maximum of 6)
		driver.findElement(By.xpath("//*[@id=\"keyFeatures\"]/div[2]/div/input")).sendKeys("KEY FEATURE UAT 1");
		
		
		//user click add supporting doc button
		driver.findElement(By.id("supportDocumentsController")).click();
		
		//user enter Supporting document (Maximum of 3)
		//user enter title
		driver.findElement(By.xpath("//*[@id=\"supportDocumentTitle1\"]")).sendKeys("Support Doc for UAT 1");
		
		//user enter doc desc
		driver.findElement(By.xpath("//*[@id=\"supportDocumentDescription1\"]")).sendKeys("This is Support Doc for UAT 1");
		
		//user upload doc
		WebElement pdfFeature = driver.findElement(By.id("input-0-supporting-documents-1"));
		pdfFeature.sendKeys("/Users/FN/Downloads/samples/APIX2.0 - Security Feature.pdf");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		//user click add FAQ button
		//driver.findElement(By.id("faqFieldsController")).click();
		WebElement ClickFAQ = driver.findElement(By.id("faqFieldsController"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClickFAQ);

		
		//user enter FAQ - Optional
		//question1
		driver.findElement(By.id("faqQuestion1")).sendKeys("FAQ QUESTION 1");
		//answer1
		driver.findElement(By.id("faqAnswer1")).sendKeys("FAQ answer 1");
		
		WebElement ClickFAQ2 = driver.findElement(By.id("faqFieldsController"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClickFAQ2);
		
		//question2
		driver.findElement(By.id("faqQuestion2")).sendKeys("FAQ QUESTION 2");
		//answer2
		driver.findElement(By.id("faqAnswer2")).sendKeys("FAQ answer 2");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		
		//user click add Media button
		//driver.findElement(By.id("mediaFieldsController")).click();
		WebElement ClickMedia = driver.findElement(By.id("mediaFieldsController"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ClickMedia);

		
		//user enter Media - Optional
		//if type of media: Video URL
		driver.findElement(By.xpath("//*[@id=\"mediaFields\"]/div[2]/div/div[2]/input")).sendKeys("https://www.youtube.com/UATVideo"); // <- if this select, type Media at the below:Doc disabled
		
		//if type of media: Doc
		//Select typeMedia = new Select(driver.findElement(By.id("mediaType1")));
		//typeMedia.selectByValue("Documentation"); //or Video URL
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//upload type Media
		//WebElement uploadTypeMedia = driver.findElement(By.id("input-0-media-documents-1"));
		//uploadTypeMedia.sendKeys("C:\\Users\\fadhi\\Downloads\\samples\\APIX2.0 - Security Feature.pdf");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	
	public void nextSolInfoTab() {
		//user click next button in tab2
				WebElement nextSolInfoTab = driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[1]/section[2]/div/div/div/div[5]/div[1]/input"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextSolInfoTab);

	}
	
	
	public void ContinueLaterSolInfoTab() {
		//user click continue later button in tab2
				WebElement ContinueLaterSolInfoTab = driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[1]/section[2]/div/div/div/div[5]/div[2]/input"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", ContinueLaterSolInfoTab);

		
	}

	public void backSolInfoTab() {
		//user click back button in tab2
				WebElement backSolInfoTab = driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[1]/section[2]/div/div/div/div[5]/div[3]/a"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", backSolInfoTab);

	
	}
	
	
	public void APIsTab() {
		//myOnboarded API
		//checkbox myOnboarded API
		
		//WebElement myOnboardedChkcbox = driver.findElement(By.xpath("//*[@id=\"onboardedApis\"]/div[2]/div[2]/div[1]/div/label/input"));
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].click();", myOnboardedChkcbox);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//if click view link on api checkbox
		
		//WebElement viewdetail = driver.findElement(By.xpath("//*[@id=\"onboardedApis\"]/div[2]/div[2]/div[1]/div/a"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewdetail);

		
		
		//mySubscribed API
		
		//if user select mySubscribed API tab
		//WebElement mySubscribed = driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[2]/section[2]/div/div/div[1]/button[2]"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", mySubscribed);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//select / sort by A-Z or Z-A
		//Select sortby = new Select(driver.findElement(By.id("subscribed-api-sort")));
		//sortby.selectByValue("desc"); //or asc
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//if search api
		//driver.findElement(By.id("subscribed-api-search-term")).sendKeys("UAT");
		
		
		
		
		//checkbox mySubscribed API
		//WebElement mySubscribedChkcbox = driver.findElement(By.xpath("//*[@id=\"subscribedApis\"]/div[2]/div[2]/div[1]/div[1]/label/input"));
		//executor.executeScript("arguments[0].click();", mySubscribedChkcbox);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


	}
	
	public void nextAPIsTab() {
		//user click next button in tab3
				WebElement nextAPIsTab = driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[2]/section[2]/div/div/div[4]/div[1]/input"));
					((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextAPIsTab);

	}
	
	
	public void ContinueLaterAPIsTab() {
		//user click continue later button in tab3
				WebElement ContinueLaterAPIsTab = driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[2]/section[2]/div/div/div[4]/div[2]/input"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", ContinueLaterAPIsTab);

		
	}

	public void backAPIsTab() {
		//user click back button in tab3
				WebElement backAPIsTab = driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[2]/section[2]/div/div/div[4]/div[3]/a"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", backAPIsTab);

	
	}

	
	public void agreementSolTab() {
		//user enter software license agreement
		driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[3]/section/div/div[5]/div/div[1]/div[2]/div")).sendKeys("Software agreement desc");
		
	}
	
	public void previewAgreementSolTab() {
		//user click next button in tab4
				WebElement previewAgreementSolTab = driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[3]/section/div/div[5]/div/div[2]/input[1]"));
					((JavascriptExecutor) driver).executeScript("arguments[0].click();", previewAgreementSolTab);

	}
	
	
	public void ContinueLateragreementSolTab() {
		//user click continue later button in tab4
				WebElement ContinueLateragreementSolTab = driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[3]/section/div/div[5]/div/div[2]/input[2]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", ContinueLateragreementSolTab);

		
	}

	public void backagreementSolTab() {
		//user click back button in tab4
				WebElement backagreementSolTab = driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[3]/section/div/div[5]/div/div[2]/a"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", backagreementSolTab);

	
	}
	
	
	public void PreviewScreen() {
		//user click next button in publishTab
		WebElement PreviewScreen = driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[4]/div[1]/div/div/div[2]/div[2]/input[3]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", PreviewScreen);

	}


	public void ContinueLaterPreviewScreen() {
		//user click continue later button in publishTab
		WebElement ContinueLaterPreviewScreen = driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[4]/div[1]/div/div/div[2]/div[2]/input[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ContinueLaterPreviewScreen);


	}

	public void backPreviewScreen() {
		//user click back button in publishTab
		WebElement backPreviewScreen = driver.findElement(By.xpath("//*[@id=\"main-form\"]/div[4]/div[1]/div/div/div[2]/div[2]/input[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", backPreviewScreen);


	}

		
	// ONBOARD PROBLEM
		public void goToProb() {
			// Problem link
			driver.findElement(By.xpath("/html/body/main/section[1]/div/a[3]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
		
		public void viewAllProblem() {
			// View All Problem link
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("scroll(0, 950)"); //element at the bottom
			
			WebElement viewAllProb= driver.findElement(By.xpath("/html/body/main/section[5]/div/div/div[1]/div/div[2]/a"));
			// /html/body/main/section[4]/div/div/div[1]/div/div[2]/a
			// /html/body/main/section[5]/div/div/div[1]/div/div[2]/a
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewAllProb);

		}

		public void OnboardProb() {
			//Onboard Problem button
			driver.findElement(By.id("onboard-api")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		public void probStatForm() {
			//User enter Problem Statement title
			driver.findElement(By.id("name")).sendKeys("Problem Statement - View CB DC DRAFT");
			
			//User select Problem Statement Category
			//User click org category to open
			driver.findElement(By.xpath("/html/body/main/form/section/div[2]/div[1]/div[2]/div[1]/div/div[1]/span")).click();
					
			//User select Type
			WebElement selectType = driver.findElement(By.id("digitalCurrency")); 	
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectType);
					
			
			//User select Line of Business
			WebElement selectLine = driver.findElement(By.id("centralBanks")); 	
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectLine);
			
					
			//User click org category to close
			driver.findElement(By.xpath("/html/body/main/form/section/div[2]/div[1]/div[2]/div[1]/div/div[1]/span")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			
			//user select who can use your Problem
			WebElement TypeUserDropdown = driver.findElement(By.id("user-type"));
			Select TypeUser = new Select(TypeUserDropdown);
			TypeUser.selectByVisibleText("Central Bank");
			// All Platform User | Financial Technology | Financial Institution | System Integrator | Central Bank | Other (no other now)
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			//User enter tags
			WebElement tag = driver.findElement(By.id("tagInput"));
			tag.sendKeys("betaauto");
			tag.sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			
			//User enter short desc
			driver.findElement(By.xpath("//*[@id=\"shortDescription\"]/textarea")).sendKeys("uat problem statement short desc");
			
			//User enter full desc
			driver.findElement(By.xpath("//*[@id=\"fullDescription\"]/div/div[2]/div")).sendKeys("this is uat problem statement full");
			
			//User upload problem image(s)video(s)
			WebElement solimage = driver.findElement(By.id("input-0-images-videos"));
			solimage.sendKeys("/Users/FN/Downloads/samples/test.jpeg");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		
		public void NextProbStatForm() {
			//user click previewYourProblem button in preview page
			WebElement previewYourProblemButton = driver.findElement(By.xpath("/html/body/main/form/section/div[2]/div[5]/div[1]/input"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", previewYourProblemButton);

		}


		public void ContinueLaterProbStatForm() {
			//user click continue later button in preview page
			WebElement ContinueLaterProbStatForm = driver.findElement(By.xpath("/html/body/main/form/section/div[2]/div[5]/div[2]/input"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", ContinueLaterProbStatForm);


		}

		public void CancelProbStatForm() {
			//user click cancel button in preview page
			WebElement CancelProbStatForm = driver.findElement(By.xpath("/html/body/main/form/section/div[2]/div[5]/div[3]/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", CancelProbStatForm);


		}
		
		
		
		public void publishProblem() {
			//user click next button in publishTab
		WebElement publishProblem = driver.findElement(By.xpath("/html/body/main/form/div/div/div/div/div[2]/div[2]/input[3]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", publishProblem);

		}


		public void ContinueLaterpublishProblem() {
			//user click continue later button in publishTab
			WebElement ContinueLaterpublishProblem = driver.findElement(By.xpath("/html/body/main/form/div/div/div/div/div[2]/div[2]/input[2]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", ContinueLaterpublishProblem);


		}

		public void BackPublishProblem() {
			//user click back button in publishTab
			WebElement BackPublishProblem = driver.findElement(By.xpath("/html/body/main/form/div/div/div/div/div[2]/div[2]/input[1]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", BackPublishProblem);


		}
		
		
		//USER MANAGEMENT
		
		public void userManagement() {
			//user click dropdown user menu header
			driver.findElement(By.xpath("/html/body/header/nav/div/div/a")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//user click usermanagement button
			driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div[4]/a[2]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		
		public void inviteTeamMember() {
			//user enter invite team member button
			driver.findElement(By.xpath("/html/body/main/section[2]/div/div[2]/div[2]/a")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		public void inviteUsrMgmt() {
			//User enter first name 
			driver.findElement(By.id("firstName")).sendKeys("FAD");
			
			//user enter last name
			driver.findElement(By.id("lastName")).sendKeys("invite8");
			
			//user enter email
			driver.findElement(By.id("emailAddress")).sendKeys("fadhilatun.nisa+invite8@brank.as");
			
			//user enter phone numb
			driver.findElement(By.id("phoneNumber")).sendKeys("342131231232");
			
			//User select role
			Select roleUser = new Select(driver.findElement(By.id("userRole")));
			roleUser.selectByValue("8"); //1. 3rd party dev | 2. API Mgr | 3. Account Manager | 4. Developer | 5. Product Leader | 6. Project Leader | 7. Admin | 8. Org Admin
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		
		public void sendInvite() {
			//user clicks send invite button
			driver.findElement(By.xpath("/html/body/main/section[2]/div/div[2]/form/div[2]/input")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

	public void LogOutAPIX() {
		driver.findElement(By.xpath("/html/body/header/nav/div/div/span")).click();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.findElement(By.xpath("/html/body/header/nav/div/div/div/div[5]/a")).click();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}
	
	
	//CREATE NEW HACKATHON FOR NON MEMBER
	
		public void CreateNewHackathonNonMember() {
			//General Informaiton
			//Admin enter First Name
			driver.findElement(By.id("firstName")).sendKeys("Mr.");
			
			//Admin enter Last Name
			driver.findElement(By.id("lastName")).sendKeys("Jonathan EDU");
			
			//Admin enter Organization Name
			driver.findElement(By.id("orgName")).sendKeys("PT John EDU Pte Ltd");
			
			//Admin enter Email address
			driver.findElement(By.id("emailAddress")).sendKeys("fadhilatun.nisa+johedu@brank.as");
			
			//Admin enter Code - Country Number
			driver.findElement(By.id("PhoneNumberCountry")).sendKeys("021");
			
			//Admin enter Phone Number - Contact Number
			driver.findElement(By.id("phoneNumber")).sendKeys("5512212341");
			
			//Hackathon List
			//Admin enter Hackathon Name
			driver.findElement(By.id("hackathonName")).sendKeys("JOHN EDU2 Hackathon");
			
			//Admin enter Expected Date of Hackathon Launch
			WebElement dateBox = driver.findElement(By.id("hackathonLaunch"));
		     dateBox.sendKeys("05042021");
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    
		  //Admin enter Hackathon URL
		    driver.findElement(By.id("URL")).sendKeys("johnedu2");
		  	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  	  
		  //new field 12/03/2021 - What is your intended audience of the hackathon?
		  	Select intendedAudience = new Select(driver.findElement(By.id("IntendedAudience")));
		  	intendedAudience.selectByValue("Educational institution"); //Educational institution / Institution
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			//Admin enter Hackathon scope
			driver.findElement(By.xpath("//*[@id=\"ScopeMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("Create a Movement\r\n"
					+ "The potential solutions that can come from hackathons are endless. With the creative input of a team, any product created can be used for good as part of a wider movement. Whether you are interested in education, healthcare or environmental responsibility, the best causes are usually those that appeal to people�s hearts.\r\n"
					+ "\r\n"
					+ "In Indonesia, hackathons are used to give public health the kick start it needs in finding solutions. In the NITI Aayog Pune Smart City Hackathon, Anashwar Tech came up with a water disinfection container cover plate that uses digital purification from UV-C light to purify water containers. Governments and NGOs are recognizing hackathons as authentic change makers, with India, USA, Canada, and UK ranking as top hosts.");
			
			//Admin Upload files to support
			WebElement uploadFileSupport = driver.findElement(By.id("input-0-SupportDocs"));
			uploadFileSupport.sendKeys("/Users/FN/Downloads/samples/30_Days_of_API_TestingV2.pdf");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//Admin check in hackathon features
			//WebElement myOnboardedChkcbox = driver.findElement(By.xpath("//*[@id=\"onboardedApis\"]/div[2]/div[2]/div[1]/div/label/input"));
			//JavascriptExecutor executor = (JavascriptExecutor) driver;
			//executor.executeScript("arguments[0].click();", myOnboardedChkcbox);
			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			
		}
		
		public void CancelButton_CreateHackathonNonMbr() {
			//Admin clicks add hackathon button on hackathon list
			driver.findElement(By.xpath("/html/body/main/div/form/div/div[3]/button[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		public void SubmitButton_CreateHackathonNonMbr() {
			//Admin clicks add hackathon button on hackathon list
			driver.findElement(By.xpath("/html/body/main/div/form/div/div[3]/button[2]")).submit();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		

}
