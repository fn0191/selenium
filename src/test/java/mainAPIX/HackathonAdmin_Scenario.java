package mainAPIX;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HackathonAdmin_Scenario {
	
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;

	public static String baseURL = "https://hackolosseum.apix.global/admin/hackathon/list";

	public void createDriver() throws MalformedURLException, InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(baseURL);

	}
	
	public void login() {
		//admin enter email
		driver.findElement(By.id("email")).sendKeys(" fadhilatun.nisa+jenifer1@brank.as");
		
		//admin enter pass
		driver.findElement(By.id("password")).sendKeys("12345678");
		
		//admin click login button
		driver.findElement(By.xpath("//*[@id=\"contact-us\"]/form/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	public void addHackathonButtonOnList() {
		//Admin clicks add hackathon button on hackathon list
		driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[4]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void BackToHackathonList() {
		//Admin clicks add hackathon button on hackathon list
		driver.findElement(By.xpath("/html/body/main/div/div[1]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	//CREATE NEW HACKATHON
	
	public void CreateNewHackathonForm() {
		//General Informaiton
		//Admin enter First Name
		driver.findElement(By.id("firstName")).sendKeys("Mrs.");
		
		//Admin enter Last Name
		driver.findElement(By.id("lastName")).sendKeys("Katy");
		
		//Admin enter Organization Name
		driver.findElement(By.id("orgName")).sendKeys("Sharon Ltd");
		
		//Admin enter Email address
		driver.findElement(By.id("emailAddress")).sendKeys("fadhilatun.nisa+jenifer1@brank.as");
		
		//Admin enter Code - Country Number
		driver.findElement(By.id("PhoneNumberCountry")).sendKeys("021");
		
		//Admin enter Phone Number - Contact Number
		driver.findElement(By.id("phoneNumber")).sendKeys("567890111");
		
		//Hackathon List
		//Admin enter Hackathon Name
		driver.findElement(By.id("hackathonName")).sendKeys("Decode Hackathon");
		
		//Admin enter Expected Date of Hackathon Launch
		WebElement dateBox = driver.findElement(By.id("hackathonLaunch"));
	     dateBox.sendKeys("09092021");
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	  //Admin enter Hackathon URL
	    driver.findElement(By.id("URL")).sendKeys("decode");
	  	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  	  
	  //new field 12/03/2021 - What is your intended audience of the hackathon?
	  	Select intendedAudience = new Select(driver.findElement(By.id("IntendedAudience")));
	  	intendedAudience.selectByValue("Institution"); //Educational institution / Institution
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//Admin enter Hackathon scope
		driver.findElement(By.xpath("//*[@id=\"ScopeMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("Create a Movement\r\n"
				+ "The potential solutions that can come from hackathons are endless. With the creative input of a team, any product created can be used for good as part of a wider movement. Whether you are interested in education, healthcare or environmental responsibility, the best causes are usually those that appeal to people�s hearts.\r\n"
				+ "\r\n"
				+ "In Indonesia, hackathons are used to give public health the kick start it needs in finding solutions. In the NITI Aayog Pune Smart City Hackathon, Anashwar Tech came up with a water disinfection container cover plate that uses digital purification from UV-C light to purify water containers. Governments and NGOs are recognizing hackathons as authentic change makers, with India, USA, Canada, and UK ranking as top hosts.");
		
		//Admin Upload files to support
		WebElement uploadFileSupport = driver.findElement(By.id("input-0-SupportDocs"));
		uploadFileSupport.sendKeys("/Users/FN/Downloads/samples/test.pdf");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Admin check in hackathon features
		//WebElement myOnboardedChkcbox = driver.findElement(By.xpath("//*[@id=\"onboardedApis\"]/div[2]/div[2]/div[1]/div/label/input"));
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("arguments[0].click();", myOnboardedChkcbox);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
	}
	
	public void CancelButton_CreateHackathon() {
		//Admin clicks add hackathon button on hackathon list
		driver.findElement(By.xpath("/html/body/main/div/form/div/div[3]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void SubmitButton_CreateHackathon() {
		//Admin clicks add hackathon button on hackathon list
		driver.findElement(By.xpath("/html/body/main/div/form/div/div[3]/button[2]")).submit();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void gotohackathonpopup () {
		//click go to hackathon list on successful created hackathon popup
		driver.findElement(By.xpath("//*[@id=\"create-success-modal\"]/div/div/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	//FILTER
	public void sortByRecentlyAdded() {
		//admin filter by sortby - Recently Added
		Select SortBy = new Select(driver.findElement(By.id("order-select")));
		SortBy.selectByValue("newest");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	//OR
	
	public void searchHackathonOnHackathonList() {
		//admin search hackathon
		driver.findElement(By.id("search-term")).sendKeys("decode");
		WebElement textbox = driver.findElement(By.id("search-term"));
		textbox.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	public void updateLink() {
		//admin clicks update link on admin hackathon list
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/table/tbody/tr[1]/td[7]/a[2]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	public void viewLink() {
		//admin clicks view link on admin hackathon list
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/table/tbody/tr[1]/td[7]/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin click edit link on about tab
		driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div[1]/a/span")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	//DRAFT INFO TAB
	public void filldraftform() {
		
		//INFORMATION section
		//admin enter hackathon short title
		driver.findElement(By.id("ShortTitle")).sendKeys("Sharon Decode");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin enter tagline
		driver.findElement(By.id("hackathonTagline")).sendKeys("Tagline: Decode Hack");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Hackathon Short Title - AUTO FILL OUT IN CREATE HACKATHON
		
		//Hackathon URL - AUTO FILL OUT IN CREATE HACKATHON
		
		//admin enter tag
		WebElement tag = driver.findElement(By.xpath("//*[@id=\"information\"]/div[6]/div/input"));
		tag.sendKeys("decode");
		tag.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		//admin enter hackathon desc
		driver.findElement(By.xpath("//*[@id=\"DescriptionMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("Co-Creating a Adventure and Wealthier world\r\n"
				+ "At A Hack, our purpose is Innovating to Help Everyone Live Well.\r\n"
				+ "\r\n"
				+ "2020 has been an extraordinary year. With a global pandemic still affecting millions of lives and livelihoods, we are opening up our annual PruFintegrate Open Innovation Challenge beyond the usual FinTechs, HealthTechs and MedTechs to the Design, student and other communities as well.\r\n"
				+ "\r\n"
				+ "Tell us how you think we can help entire national populations, or a particular demographic group, to lead healthier lives, or manage their wealth with more resilience. Or perhaps share your solutions on how a large MNC like Prudential with a global footprint and strong local presence might partner SMEs and help them build better, stronger, more digitalized businesses that will thrive, not just survive.\r\n"
				+ "\r\n"
				+ "Prudential is looking to build an ecosystem of partners who can work with us to solve social and business challenges with creative solutions. So, whether you have a full fledged solution you can let us test out through APIs on the APIX platform, or just an idea of what could be, we invite you to be part of our PruFintegrate journey.\r\n"
				+ "\r\n"
				+ "For the selected tech players, we offer paid Proof of Concept opportunities and the potential to pitch directly to senior regional executives to rapidly scale up your solutions across our markets globally. For students, we offer internship opportunities.");
		
		
		//admin enter card short title
		driver.findElement(By.id("CardDescription")).sendKeys("Decode H");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin enter Problem Statements Summary
		driver.findElement(By.xpath("//*[@id=\"ProblemStatementsSummaryMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("Co-Creating a Healthier and Wealthier world\r\n"
				+ "At A Hack, our purpose is Innovating to Help Everyone Live Well.\r\n"
				+ "\r\n"
				+ "2020 has been an extraordinary year. With a global pandemic still affecting millions of lives and livelihoods, we are opening up our annual PruFintegrate Open Innovation Challenge beyond the usual FinTechs, HealthTechs and MedTechs to the Design, student and other communities as well.\r\n"
				+ "\r\n"
				+ "Tell us how you think we can help entire national populations, or a particular demographic group, to lead healthier lives, or manage their wealth with more resilience. Or perhaps share your solutions on how a large MNC like Prudential with a global footprint and strong local presence might partner SMEs and help them build better, stronger, more digitalized businesses that will thrive, not just survive.\r\n"
				+ "\r\n"
				+ "Prudential is looking to build an ecosystem of partners who can work with us to solve social and business challenges with creative solutions. So, whether you have a full fledged solution you can let us test out through APIs on the APIX platform, or just an idea of what could be, we invite you to be part of our PruFintegrate journey.\r\n"
				+ "\r\n"
				+ "For the selected tech players, we offer paid Proof of Concept opportunities and the potential to pitch directly to senior regional executives to rapidly scale up your solutions across our markets globally. For students, we offer internship opportunities.");
		
		
		//Winner Announcement Title
		driver.findElement(By.id("Title")).sendKeys("The Winner of DC Hackathon");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Winner Announcement Description
		driver.findElement(By.xpath("/html/body/main/div/form/div[1]/div[11]/div/div/div[2]/div/div[2]/div/div[1]")).sendKeys("writing a full description about the winner announcement");
		
		
		//admin enter hackathon hero section font color
		driver.findElement(By.id("heroSectionFontColor")).clear();
		driver.findElement(By.id("heroSectionFontColor")).sendKeys("#0432ff");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//--
		
		//admin enter hackathon primary color
		driver.findElement(By.id("primaryColor")).clear();
		driver.findElement(By.id("primaryColor")).sendKeys("#40a432");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// admin enter primary font  color
		driver.findElement(By.id("primaryFontColor")).clear();
		driver.findElement(By.id("primaryFontColor")).sendKeys("#630b75");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//--

		
		//admin enter hackathon secondary color
		driver.findElement(By.id("secondaryColor")).clear();
		driver.findElement(By.id("secondaryColor")).sendKeys("#8A8891");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		// admin enter secondary font  color
		driver.findElement(By.id("secondaryFontColor")).clear();
		driver.findElement(By.id("secondaryFontColor")).sendKeys("#290f0f");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//--
		
		
		// admin enter Description Primary Color
		driver.findElement(By.id("descriptionPrimaryColor")).clear();
		driver.findElement(By.id("descriptionPrimaryColor")).sendKeys("#ee1111");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter Description font color
		driver.findElement(By.id("descriptionFontColor")).clear();
		driver.findElement(By.id("descriptionFontColor")).sendKeys("#929090");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//--
		
		
		// admin enter Prize Primary Color
		driver.findElement(By.id("prizePrimaryColor")).clear();
		driver.findElement(By.id("prizePrimaryColor")).sendKeys("#9a6a80");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter Prize Font Color
		driver.findElement(By.id("prizeFontColor")).clear();
		driver.findElement(By.id("prizeFontColor")).sendKeys("#444045");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//--
		
		
		// admin enter Eligibility Primary Color
		driver.findElement(By.id("eligibilityPrimaryColor")).clear();
		driver.findElement(By.id("eligibilityPrimaryColor")).sendKeys("#fc03df");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter Eligibility Font Color
		driver.findElement(By.id("eligibilityFontColor")).clear();
		driver.findElement(By.id("eligibilityFontColor")).sendKeys("#786379");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//--
		
		// admin enter Faq Primary Color
		driver.findElement(By.id("faqPrimaryColor")).clear();
		driver.findElement(By.id("faqPrimaryColor")).sendKeys("#d30fd7");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter Faq Font Color
		driver.findElement(By.id("faqFontColor")).clear();
		driver.findElement(By.id("faqFontColor")).sendKeys("#a66e9f");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//--
		
		
		// admin enter Section 1 Primary Color Primary Color
		driver.findElement(By.id("section1PrimaryColor")).clear();
		driver.findElement(By.id("section1PrimaryColor")).sendKeys("#4e2b55");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter Section 1 Primary Color Font Color
		driver.findElement(By.id("section1FontColor")).clear();
		driver.findElement(By.id("section1FontColor")).sendKeys("#f9f6f6");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//--
		
		
		// admin enter Section 2 Primary Color Primary Color
		driver.findElement(By.id("section2PrimaryColor")).clear();
		driver.findElement(By.id("section2PrimaryColor")).sendKeys("#8b2783");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter Section 2 Primary Color Font Color
		driver.findElement(By.id("section2FontColor")).clear();
		driver.findElement(By.id("section2FontColor")).sendKeys("#f2bfea");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		
		// admin enter Section 3 Primary Color Primary Color
		driver.findElement(By.id("section3PrimaryColor")).clear();
		driver.findElement(By.id("section3PrimaryColor")).sendKeys("#480a37");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter Section 3 Primary Color Font Color
		driver.findElement(By.id("section3FontColor")).clear();
		driver.findElement(By.id("section3FontColor")).sendKeys("#ebe5ea");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		
		// admin enter Organized by Primary Color
		driver.findElement(By.id("organizedByPrimaryColor")).clear();
		driver.findElement(By.id("organizedByPrimaryColor")).sendKeys("#EFF2F5");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter Organized by Font Color
		driver.findElement(By.id("organizedByFontColor")).clear();
		driver.findElement(By.id("organizedByFontColor")).sendKeys("#000000");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		
		// admin enter Partnership Color Primary Color
		driver.findElement(By.id("partnershipPrimaryColor")).clear();
		driver.findElement(By.id("partnershipPrimaryColor")).sendKeys("#EFF2F5");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter Partnership by Font Color
		driver.findElement(By.id("partnershipFontColor")).clear();
		driver.findElement(By.id("partnershipFontColor")).sendKeys("#b6b6b6");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
				
				
		// admin enter Supported by Primary Color
		driver.findElement(By.id("supportedByPrimaryColor")).clear();
		driver.findElement(By.id("supportedByPrimaryColor")).sendKeys("#c2f4f0");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter Supported by Font Color
		driver.findElement(By.id("supportedByFontColor")).clear();
		driver.findElement(By.id("supportedByFontColor")).sendKeys("#b6b6b6");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
				
				
		// admin enter Powered by Primary Color
		driver.findElement(By.id("poweredByPrimaryColor")).clear();
		driver.findElement(By.id("poweredByPrimaryColor")).sendKeys("#c2f4f0");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter Powered by Font Color
		driver.findElement(By.id("poweredByFontColor")).clear();
		driver.findElement(By.id("poweredByFontColor")).sendKeys("#b6b6b6");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --	
		
		
		// admin enter Winner Announcement Color
		driver.findElement(By.id("winnerAnnouncementColor")).clear();
		driver.findElement(By.id("winnerAnnouncementColor")).sendKeys("#EFF2F5");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter Winner Announcement Font Color
		driver.findElement(By.id("winnerAnnouncementFontColor")).clear();
		driver.findElement(By.id("winnerAnnouncementFontColor")).sendKeys("#cbc6cc");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		
		// admin upload Image cover (desktop, tablet)
		WebElement uploadImageCover = driver.findElement(By.id("input-0-ImageCover"));
		uploadImageCover.sendKeys("/Users/FN/Downloads/samples/0_MAy-AAe6YWBERdAE.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin upload Image cover small (mobile)
		WebElement uploadImageCover2 = driver.findElement(By.id("input-0-BackgroundImage"));
		uploadImageCover2.sendKeys("/Users/FN/Downloads/samples/c1920_hackathonheader-155450.jpg");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// scroll page
		//((JavascriptExecutor)driver).executeScript("scroll(0, 250);");       
		
		
				
		//HOST SECTION
		//1
		//admin upload host icon url
		WebElement uploadHostIconUrl = driver.findElement(By.id("input-0-ImageHost"));
		uploadHostIconUrl.sendKeys("/Users/FN/Downloads/samples/MAS_OFFICIAL_LOGO.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin enter host icon URL
		driver.findElement(By.id("ImageHostURL")).sendKeys("https://www.iconers.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//--

		//2
		// admin upload host icon url2
		WebElement uploadHostIconUrl2 = driver.findElement(By.id("input-0-ImageHost1"));
		uploadHostIconUrl2.sendKeys("/Users/FN/Downloads/samples/MAS_OFFICIAL_LOGO.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter host icon URL2
		driver.findElement(By.id("ImageHost1URL")).sendKeys("https://www.iconers.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//3
		// admin upload host icon url3
		WebElement uploadHostIconUrl3 = driver.findElement(By.id("input-0-ImageHost2"));
		uploadHostIconUrl3.sendKeys("/Users/FN/Downloads/samples/MAS_OFFICIAL_LOGO.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter host icon URL3
		driver.findElement(By.id("ImageHost2URL")).sendKeys("https://www.iconers.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//4
		// admin upload host icon url4
		WebElement uploadHostIconUrl4 = driver.findElement(By.id("input-0-ImageHost3"));
		uploadHostIconUrl4.sendKeys("/Users/FN/Downloads/samples/MAS_OFFICIAL_LOGO.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter host icon URL4
		driver.findElement(By.id("ImageHost3URL")).sendKeys("https://www.iconers.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//5
		// admin upload host icon url5
		WebElement uploadHostIconUrl5 = driver.findElement(By.id("input-0-ImageHost4"));
		uploadHostIconUrl5.sendKeys("/Users/FN/Downloads/samples/MAS_OFFICIAL_LOGO.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter host icon URL5
		driver.findElement(By.id("ImageHost4URL")).sendKeys("https://www.iconers.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//6
		// admin upload host icon url6
		WebElement uploadHostIconUrl6 = driver.findElement(By.id("input-0-ImageHost5"));
		uploadHostIconUrl6.sendKeys("/Users/FN/Downloads/samples/MAS_OFFICIAL_LOGO.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter host icon URL6
		driver.findElement(By.id("ImageHost5URL")).sendKeys("https://www.iconers.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//7
		// admin upload host icon url7
		WebElement uploadHostIconUrl7 = driver.findElement(By.id("input-0-ImageHost6"));
		uploadHostIconUrl7.sendKeys("/Users/FN/Downloads/samples/MAS_OFFICIAL_LOGO.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter host icon URL7
		driver.findElement(By.id("ImageHost6URL")).sendKeys("https://www.iconers.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//8
		// admin upload host icon url8
		WebElement uploadHostIconUrl8 = driver.findElement(By.id("input-0-ImageHost7"));
		uploadHostIconUrl8.sendKeys("/Users/FN/Downloads/samples/MAS_OFFICIAL_LOGO.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter host icon URL8
		driver.findElement(By.id("ImageHost7URL")).sendKeys("https://www.iconers.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//9
		// admin upload host icon url9
		WebElement uploadHostIconUrl9 = driver.findElement(By.id("input-0-ImageHost8"));
		uploadHostIconUrl9.sendKeys("/Users/FN/Downloads/samples/MAS_OFFICIAL_LOGO.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter host icon URL9
		driver.findElement(By.id("ImageHost8URL")).sendKeys("https://www.iconers.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//10
		// admin upload host icon url10
		WebElement uploadHostIconUrl10 = driver.findElement(By.id("input-0-ImageHost9"));
		uploadHostIconUrl10.sendKeys("/Users/FN/Downloads/samples/MAS_OFFICIAL_LOGO.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter host icon URL10
		driver.findElement(By.id("ImageHost9URL")).sendKeys("https://www.iconers.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//SPONSOR SECTION
		//1
		//admin upload Sponsor icon 1
		WebElement uploadSponsorIcon1 = driver.findElement(By.id("input-0-ImageSponsor1"));
		uploadSponsorIcon1.sendKeys("/Users/FN/Downloads/samples/sfa_logo_web2.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin enter icon 1 url
		driver.findElement(By.id("ImageSponsor1URL")).sendKeys("https://www.iconers1.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//--
		
		//2
		//admin upload Sponsor icon 2
		WebElement uploadSponsorIcon2 = driver.findElement(By.id("input-0-ImageSponsor2"));
		uploadSponsorIcon2.sendKeys("/Users/FN/Downloads/samples/sfa_logo_web2.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin enter icon 2 url
		driver.findElement(By.id("ImageSponsor2URL")).sendKeys("https://www.iconers2.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//--
		
		//3
		//admin upload Sponsor icon 3
		WebElement uploadSponsorIcon3 = driver.findElement(By.id("input-0-ImageSponsor3"));
		uploadSponsorIcon3.sendKeys("/Users/FN/Downloads/samples/sfa_logo_web2.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin enter icon 3 url
		driver.findElement(By.id("ImageSponsor3URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//--
		
		//4
		// admin upload Sponsor icon 4
		WebElement uploadSponsorIcon4 = driver.findElement(By.id("input-0-ImageSponsor4"));
		uploadSponsorIcon4.sendKeys("/Users/FN/Downloads/samples/sfa_logo_web2.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 4 url
		driver.findElement(By.id("ImageSponsor4URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);				
		//--
		
		//5
		// admin upload Sponsor icon 5
		WebElement uploadSponsorIcon5 = driver.findElement(By.id("input-0-ImageSponsor5"));
		uploadSponsorIcon5.sendKeys("/Users/FN/Downloads/samples/sfa_logo_web2.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 5 url
		driver.findElement(By.id("ImageSponsor5URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//6
		// admin upload Sponsor icon 6
		WebElement uploadSponsorIcon6 = driver.findElement(By.id("input-0-ImageSponsor6"));
		uploadSponsorIcon6.sendKeys("/Users/FN/Downloads/samples/sfa_logo_web2.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 6 url
		driver.findElement(By.id("ImageSponsor6URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//7
		// admin upload Sponsor icon 7
		WebElement uploadSponsorIcon7 = driver.findElement(By.id("input-0-ImageSponsor7"));
		uploadSponsorIcon7.sendKeys("/Users/FN/Downloads/samples/sfa_logo_web2.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 7 url
		driver.findElement(By.id("ImageSponsor7URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//8
		// admin upload Sponsor icon 8
		WebElement uploadSponsorIcon8 = driver.findElement(By.id("input-0-ImageSponsor8"));
		uploadSponsorIcon8.sendKeys("/Users/FN/Downloads/samples/sfa_logo_web2.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 8 url
		driver.findElement(By.id("ImageSponsor8URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//9
		// admin upload Sponsor icon 9
		WebElement uploadSponsorIcon9 = driver.findElement(By.id("input-0-ImageSponsor9"));
		uploadSponsorIcon9.sendKeys("/Users/FN/Downloads/samples/sfa_logo_web2.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 4 url
		driver.findElement(By.id("ImageSponsor9URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//10
		// admin upload Sponsor icon 10
		WebElement uploadSponsorIcon10 = driver.findElement(By.id("input-0-ImageSponsor10"));
		uploadSponsorIcon10.sendKeys("/Users/FN/Downloads/samples/sfa_logo_web2.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 4 url
		driver.findElement(By.id("ImageSponsor10URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//PARTNER SECTION
		//1
		// admin upload Partnership icon 1
		WebElement uploadPartnershipIcon1 = driver.findElement(By.id("input-0-ImagePartnership1"));
		uploadPartnershipIcon1.sendKeys("/Users/FN/Downloads/samples/AWS.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 1 url
		driver.findElement(By.id("ImagePartnership1URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//2
		// admin upload Partnership icon 2
		WebElement uploadPartnershipIcon2 = driver.findElement(By.id("input-0-ImagePartnership2"));
		uploadPartnershipIcon2.sendKeys("/Users/FN/Downloads/samples/AWS.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 2 url
		driver.findElement(By.id("ImagePartnership2URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		
		//3
		// admin upload Partnership icon 3
		WebElement uploadPartnershipIcon3 = driver.findElement(By.id("input-0-ImagePartnership3"));
		uploadPartnershipIcon3.sendKeys("/Users/FN/Downloads/samples/AWS.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 3 url
		driver.findElement(By.id("ImagePartnership3URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//4
		// admin upload Partnership icon 4
		WebElement uploadPartnershipIcon4 = driver.findElement(By.id("input-0-ImagePartnership4"));
		uploadPartnershipIcon4.sendKeys("/Users/FN/Downloads/samples/AWS.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 4 url
		driver.findElement(By.id("ImagePartnership4URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//5
		// admin upload Partnership icon 5
		WebElement uploadPartnershipIcon5 = driver.findElement(By.id("input-0-ImagePartnership5"));
		uploadPartnershipIcon5.sendKeys("/Users/FN/Downloads/samples/AWS.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 5 url
		driver.findElement(By.id("ImagePartnership5URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//6
		// admin upload Partnership icon 6
		WebElement uploadPartnershipIcon6 = driver.findElement(By.id("input-0-ImagePartnership6"));
		uploadPartnershipIcon6.sendKeys("/Users/FN/Downloads/samples/AWS.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 6 url
		driver.findElement(By.id("ImagePartnership6URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//7
		// admin upload Partnership icon 7
		WebElement uploadPartnershipIcon7 = driver.findElement(By.id("input-0-ImagePartnership7"));
		uploadPartnershipIcon7.sendKeys("/Users/FN/Downloads/samples/AWS.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 7 url
		driver.findElement(By.id("ImagePartnership7URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//8
		// admin upload Partnership icon 8
		WebElement uploadPartnershipIcon8 = driver.findElement(By.id("input-0-ImagePartnership8"));
		uploadPartnershipIcon8.sendKeys("/Users/FN/Downloads/samples/AWS.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 8 url
		driver.findElement(By.id("ImagePartnership8URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//9
		// admin upload Partnership icon 9
		WebElement uploadPartnershipIcon9 = driver.findElement(By.id("input-0-ImagePartnership9"));
		uploadPartnershipIcon9.sendKeys("/Users/FN/Downloads/samples/AWS.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 9 url
		driver.findElement(By.id("ImagePartnership9URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//10
		// admin upload Partnership icon 10
		WebElement uploadPartnershipIcon10 = driver.findElement(By.id("input-0-ImagePartnership10"));
		uploadPartnershipIcon10.sendKeys("/Users/FN/Downloads/samples/AWS.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 10 url
		driver.findElement(By.id("ImagePartnership10URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//POWERED SECTION
		//1
		// admin upload Powered icon 1
		WebElement uploadPoweredIcon1 = driver.findElement(By.id("input-0-ImagePoweredBy1"));
		uploadPoweredIcon1.sendKeys("/Users/FN/Downloads/samples/UNCDF.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 1 url
		driver.findElement(By.id("ImagePoweredBy1URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//2
		// admin upload Powered icon 2
		WebElement uploadPoweredIcon2 = driver.findElement(By.id("input-0-ImagePoweredBy2"));
		uploadPoweredIcon2.sendKeys("/Users/FN/Downloads/samples/UNCDF.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 2 url
		driver.findElement(By.id("ImagePoweredBy2URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//3
		// admin upload Powered icon 3
		WebElement uploadPoweredIcon3 = driver.findElement(By.id("input-0-ImagePoweredBy3"));
		uploadPoweredIcon3.sendKeys("/Users/FN/Downloads/samples/UNCDF.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 3 url
		driver.findElement(By.id("ImagePoweredBy3URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//4
		// admin upload Powered icon 4
		WebElement uploadPoweredIcon4 = driver.findElement(By.id("input-0-ImagePoweredBy4"));
		uploadPoweredIcon4.sendKeys("/Users/FN/Downloads/samples/UNCDF.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 4 url
		driver.findElement(By.id("ImagePoweredBy4URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//5
		// admin upload Powered icon 5
		WebElement uploadPoweredIcon5 = driver.findElement(By.id("input-0-ImagePoweredBy5"));
		uploadPoweredIcon5.sendKeys("/Users/FN/Downloads/samples/UNCDF.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 5 url
		driver.findElement(By.id("ImagePoweredBy5URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//6
		// admin upload Powered icon 6
		WebElement uploadPoweredIcon6 = driver.findElement(By.id("input-0-ImagePoweredBy6"));
		uploadPoweredIcon6.sendKeys("/Users/FN/Downloads/samples/UNCDF.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 1 url
		driver.findElement(By.id("ImagePoweredBy6URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//7
		// admin upload Powered icon 7
		WebElement uploadPoweredIcon7 = driver.findElement(By.id("input-0-ImagePoweredBy7"));
		uploadPoweredIcon7.sendKeys("/Users/FN/Downloads/samples/UNCDF.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 7 url
		driver.findElement(By.id("ImagePoweredBy7URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//8
		// admin upload Powered icon 8
		WebElement uploadPoweredIcon8 = driver.findElement(By.id("input-0-ImagePoweredBy8"));
		uploadPoweredIcon8.sendKeys("/Users/FN/Downloads/samples/UNCDF.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 8 url
		driver.findElement(By.id("ImagePoweredBy8URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//9
		// admin upload Powered icon 9
		WebElement uploadPoweredIcon9 = driver.findElement(By.id("input-0-ImagePoweredBy9"));
		uploadPoweredIcon9.sendKeys("/Users/FN/Downloads/samples/UNCDF.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 9 url
		driver.findElement(By.id("ImagePoweredBy9URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		//10
		// admin upload Powered icon 10
		WebElement uploadPoweredIcon10 = driver.findElement(By.id("input-0-ImagePoweredBy10"));
		uploadPoweredIcon10.sendKeys("/Users/FN/Downloads/samples/UNCDF.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// admin enter icon 10 url
		driver.findElement(By.id("ImagePoweredBy1URL")).sendKeys("https://www.iconers3.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// --
		
		
		//TIMELINE section
		//admin select timezone
		Select Timezone = new Select(driver.findElement(By.id("Timezone")));
		Timezone.selectByValue("+07:00"); //hawai -10:00 / AU +10:00 / JKT +07:00
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin enter Registration start date
		driver.findElement(By.id("RegistrationStart")).sendKeys("10092021");
		
		//admin enter Registration end date
		driver.findElement(By.id("RegistrationEnd")).sendKeys("12092021");
		
		//admin enter Proposal submission start date
		driver.findElement(By.id("ProposalStart")).sendKeys("14092021");
		
		//admin enter Proposal submission end date
		driver.findElement(By.id("ProposalEnd")).sendKeys("16092021");
		
		//admin enter Proposal screening start date
		driver.findElement(By.id("ProposalScreeningStart")).sendKeys("18092021");
		
		//admin enter Proposal screening end date
		driver.findElement(By.id("ProposalScreeningEnd")).sendKeys("20092021");
		
		//admin enter Judge - Proposal evaluation start date
		driver.findElement(By.id("ProposalEvaluationStart")).sendKeys("22092021");
		
		//admin enter Judge - Proposal evaluation end date
		driver.findElement(By.id("ProposalEvaluationEnd")).sendKeys("24092021");
		
		//admin enter Judge - Solution evaluation start date (optional)
		driver.findElement(By.id("SolutionEvaluationStart")).sendKeys("26092021");
		
		//admin enter Judge - Solution evaluation end date (optional)
		driver.findElement(By.id("SolutionEvaluationEnd")).sendKeys("28092021");
		
		//admin enter Winning announcement date
		driver.findElement(By.id("HackathonEnd")).sendKeys("29092021");
		
		
		//JOURNEY section
		//admin enter journey title
		driver.findElement(By.id("JourneyTitle")).sendKeys("We Handle It with PG");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin enter reg desc
		driver.findElement(By.id("JourneyRegistration")).sendKeys("Register to kickstart your PRU Fintegrate Journey. We will provide more details of the opportunity statements shared by the owners, and a channel for you to clarify queries.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin submit prop desc
		driver.findElement(By.id("JourneyProposalSubmit")).sendKeys("Participating teams submit proposed solutions to one or more Opportunity Statements. You can indicate if this is an idea only (Category A) or if you also have the capability to build out a prototype/ Proof of Concept out on the APIX platform (Category B). Solutions will be evaluated on a rolling basis, so early submission gives you the best runway to get selected, and you also get more time to prepare for your pitch.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin enter pitching desc
		driver.findElement(By.id("JourneyPitching")).sendKeys("Shortlisted individuals/ teams will be invited to pitch to a panel of senior Prudential executives during the Singapore FinTech Festival, Shark Tank style. The winning Category A team(s) will be announced at this event. Prudential will offer successful Category B teams the opportunity to take on paid Proof of Concepts on the APIX platform.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin enter sol submission dec
		driver.findElement(By.id("JourneySolutionSubmit")).sendKeys("Proof of Concepts are submitted on the APIX platform");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin enter winner announc desc
		driver.findElement(By.id("JourneyWinner")).sendKeys("Hyrbrid Grand Finale celebration event where the overall winner is announced. Whatever stage your proposed solution has made it to, you are now a part of the Prudential innovation community where you get access to even more opportunities to network, learn and co-create.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		//ELIGIBILITY section
		//admin enter Eligibility
		driver.findElement(By.xpath("//*[@id=\"EligibilityMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("Indonesia based companies which are eligible for the $40,000 Business Growth Grants\r\n"
				+ "FinTechs, HealthTechs, MedTechs, Design professionals and students\r\n"
				+ "Companies which are market-ready or have a minimum viable product\r\n"
				+ "Female-led business and teams are encouraged to submit");
		
		
		//AWARDS section
		//admin select Number of winners per problem statement
		Select numbwinner = new Select(driver.findElement(By.id("NumberOfWinners")));
		numbwinner.selectByVisibleText("3");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//admin enter Benefit in Registering Title
		driver.findElement(By.id("BenefitTitle")).sendKeys("We Do It with Cookies?");
		
		//admin enter Benefit Description
		driver.findElement(By.id("BenefitDescription")).sendKeys("Shortlisted proposals will get a chance to:");
		
		//admin enter First prize title
		driver.findElement(By.id("Prize1Title")).sendKeys("Showcase Your Idea or Solution at FinTech Festival 2020");
		
		//admin enter First prize description
		driver.findElement(By.id("Prize1Description")).sendKeys("Pitch directly to senior decision makers who make national/ global purchasing decisions");
		
		//admin enter Second prize title
		driver.findElement(By.id("Prize2Title")).sendKeys("Up to $40,000 grant for prototyping on APIX.");
		
		//admin enter Second prize description
		driver.findElement(By.id("Prize2Description")).sendKeys("Build out your proposed solutions with grants from APIX. Or win $3,000 cash just for having the best ideas.");
		
		//admin enter Third prize title
		driver.findElement(By.id("Prize3Title")).sendKeys("Be part of the Prudential Innovation Community");
		
		//admin enter Third prize description
		driver.findElement(By.id("Prize3Description")).sendKeys("Continue to network and co-create together with Prudential and our partners even after this Hackathon");
		
		//NEW -- PARTICIPANT JUDGE section
		//Do you want to display participating judge(s) profile? - radio button click YES
		WebElement clickYes = driver.findElement(By.xpath("/html/body/main/div/form/div[6]/div[1]/label/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickYes);
		
		//Select clickYes = new Select(driver.findElement(By.xpath("/html/body/main/div/form/div[6]/div[1]/label")));
		//clickYes.selectByValue("1");
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		//MEDIA CENTRE section
		//admin enter Video URL
		driver.findElement(By.id("VideoURL")).sendKeys("https://www.youtube.com/education");
		
		//admin enter Video Description
		driver.findElement(By.id("VideoDescription")).sendKeys("Video center");
		
		
		// scroll page
		//((JavascriptExecutor)driver).executeScript("scroll(0, 250);");       
				
		
		//FAQ section
		//admin add plus button
		WebElement add = driver.findElement(By.id("addfaq"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", add);
		
		//admin enter Question 1
		driver.findElement(By.id("faq0-question")).sendKeys("Can I take part in this Hackathon if I only have an idea but not the capability to build out the solution?");
		
		//admin enter Answer 1
		driver.findElement(By.id("faq0-answer")).sendKeys("Yes, we are crowdsourcing novel ideas and design hacks (Category A) as much as we are looking for the technical folks to build out actual solutions for us (Category B).");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//admin add plus button
		WebElement add2 = driver.findElement(By.id("addfaq"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", add2);
				
		//admin enter Question 2
		driver.findElement(By.id("faq1-question")).sendKeys("How do we get more context on the opportunity statements?");
				
		//admin enter Answer 2
		driver.findElement(By.id("faq1-answer")).sendKeys("We are keen to set you up for success. For more context on the problem statements, do check out our specially curated resource pack here: https://bit.ly/391ksM4");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//admin add plus button
		WebElement add3 = driver.findElement(By.id("addfaq"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", add3);
		
		//admin enter Question 3
		driver.findElement(By.id("faq2-question")).sendKeys("How should I prepare for the pitch?");
		
		//admin enter Answer 3
		driver.findElement(By.id("faq2-answer")).sendKeys("The judging criteria will be shared with you in the email where we invite you to pitch. Please ensure that you prepare your pitch to meet these criteria, which will be along the lines of how user-centric the solution is, whether it is technologically feasible to implement and also whether it makes business sense for Prudential, our partners and/ or our customers. For Categroy B pitches, where you will also be expected to build out the prototype on the APIX platform, you will also have to demonstrate that your team has the capability to build out the solution.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//admin add plus button
		WebElement add4 = driver.findElement(By.id("addfaq"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", add4);
		
		//admin enter Question 4
		driver.findElement(By.id("faq3-question")).sendKeys("Does my solution need to be primarily a financial solution?");
		
		//admin enter Answer 4	
		driver.findElement(By.id("faq3-answer")).sendKeys("We are seeking solutions inspired by every discipline and industry. However, if you are a Singapore-based company presenting a financial solution, you may be eligible for the Business Growth Grant for Proof of Concepts done with Prudential, and this makes it easier for our judges to offer you a paid POC.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//admin add plus button
		WebElement add5 = driver.findElement(By.id("addfaq"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", add5);
		
		//admin enter Question 5
		driver.findElement(By.id("faq4-question")).sendKeys("Can I sign up as an individual?");
		
		//admin enter Answer 5
		driver.findElement(By.id("faq4-answer")).sendKeys("Yes, you are welcome to sign up either in a team representing an organization or as an individual. If you are signing up as an individual, please fill in \"NA\" in the mandatory fields asking for company or school details. In the column for Team Leader Details, please fill in your personal contact details.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		//NEW SECTIONS:
		//Section 1
		//Title
		driver.findElement(By.id("Section1Title")).sendKeys("Section 1");
		//Description
		driver.findElement(By.xpath("//*[@id=\"Section1DescriptionMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("HISTORY, PURPOSE AND USAGE\r\n"
				+ "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book. It usually begins with:");
		
		
		// Section 2
		// Title
		driver.findElement(By.id("Section2Title")).sendKeys("Section 2");
		// Description
		driver.findElement(By.xpath("//*[@id=\"Section2DescriptionMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("HEDONIST ROOTS\r\n"
				+ "Until recently, the prevailing view assumed lorem ipsum was born as a nonsense text. �It's not Latin, though it looks like it, and it actually says nothing,� Before & After magazine answered a curious reader,");
		
		// Section 3
		// Title
		driver.findElement(By.id("Section3Title")).sendKeys("Section 3");	
		// Description
		driver.findElement(By.xpath("//*[@id=\"Section3DescriptionMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("REMIXING A CLASSIC\r\n"
				+ "So how did the classical Latin become so incoherent? According to McClintock, a 15th century typesetter likely scrambled part of Cicero's De Finibus in order to provide placeholder text to mockup various fonts for a type specimen book.");
		
		
		//CONTACT SUPPORT section
		//admin enter Hackathon contact email
		driver.findElement(By.id("HackathonEmail")).sendKeys("fadhilatun.nisa+jenifer1@brank.as");
		
		//admin enter Hackolosseum contact email
		driver.findElement(By.id("HackolosseumEmail")).sendKeys("apixsupport@afin.tech");
		
	}
	
	public void saveInformationDraftButton() {
		//admin click save information button on hackathon information
		driver.findElement(By.xpath("/html/body/main/div/form/div[13]/button")).submit();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void cancelInformationDraftButton() {
		//admin click cancel button on hackathon information
		driver.findElement(By.xpath("/html/body/main/div/form/div[13]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	//NOTE mandatory field on hackathon draft:
	//Hackathon Short Title
	//Hackathon Description
	//Card Short Description
	//Problem Statements Summary
	//All dates in Timezone section
	//Journey Descriptions
	//Benefit in Registering Title
	//Benefit Description
	//Hackathon contact email

	
	
	
	//DRAFT - PROBLEM STATEMENT
	
	public void probstatTab() {
	//admin click problem statement tab
		WebElement probStatTab = driver.findElement(By.xpath("/html/body/main/div/div[2]/div[4]/div[2]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", probStatTab);
	}
	
	public void probStatLink() {
	//admin click add new problem statement link
		WebElement addNewProb = driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addNewProb);
		
	}
	
	public void probStatForm_Ins() {
		//admin enter problem statement title
		driver.findElement(By.id("Title")).sendKeys("Cyber - Create solutions to minimize the item #1"); //Create solutions to minimize the item returns and parcel service charges.
		//Come up with more product ideas made of sustainable and renewable resources / Create in-store touchpoints that would delight the customer
		
		//admin enter Short Description
		driver.findElement(By.xpath("//*[@id=\"ShortDescriptionMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("How might we utilise a platform that enables investors and retail consumers to make sustainability considerations either in their respective (i) personal consumption or (ii) investment decision- making process and/ SDG investment portfolio building?");
		//admin enter Detailed Description
		driver.findElement(By.xpath("//*[@id=\"DetailedDescriptionMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("More Details\r\n"
				+ "Theme: Mobilise Capital\r\n"
				+ "\r\n"
				+ "Sustainability-linked instruments have recently surfaced as a popular way for businesses to tie Cost of Capital to specific sustainability Key Performance Indicators such as greenhouse gas emissions. \r\n"
				+ "How might market participants ensure that businesses continue to progress in their overall sustainability performance and not focused only on the agreed KPI?");
		
		//admin select Categories
		WebElement selectCat = driver.findElement(By.xpath("/html/body/main/div/div[5]/div/form/div/div[4]/div/div[1]/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectCat);
		
		//IF INSTITUTION:
		//User select Type
		WebElement selectType = driver.findElement(By.id("chatbot"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectType);
				
		//User select Line of Business
		WebElement selectLine = driver.findElement(By.id("insuranceReinsurance"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectLine);
		
		
		//IF EDUCATION:
		// User select Type
		// WebElement selectTypeEdu = driver.findElement(By.id("decentralisedFinanceBasTribeAccelerator"));
		// ((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectTypeEdu);
		
		// WebElement selectTypeEdu2 = driver.findElement(By.id("smartFinanceTibco"));
		// ((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectTypeEdu2);

		//Close Categories
		WebElement closeCat = driver.findElement(By.xpath("/html/body/main/div/div[5]/div/form/div/div[4]/div/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeCat);
		
		
		
		//admin enter Problem Statement Tags
		WebElement tagProbStat = driver.findElement(By.xpath("/html/body/main/div/div[5]/div/form/div/div[6]/div/input"));
		
		tagProbStat.sendKeys("systemintegrator");
		tagProbStat.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//admin Upload supporting file for problem statement
		WebElement uploadFileSupportProbStat = driver.findElement(By.id("input-0-Support"));
		uploadFileSupportProbStat.sendKeys("/Users/FN/Downloads/samples/Brankas Statement Service - API Documentation 2.1.pdf");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin Upload problem statement icon
		WebElement uploadProbStatIcon = driver.findElement(By.id("input-0-Icon"));
		uploadProbStatIcon.sendKeys("/Users/FN/Downloads/samples/brankas.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	public void probStatForm_Edu() {
		//admin enter problem statement title
		driver.findElement(By.id("Title")).sendKeys("TBH - Create solutions to minimize the item #2"); //Create solutions to minimize the item returns and parcel service charges.
		//Come up with more product ideas made of sustainable and renewable resources / Create in-store touchpoints that would delight the customer
		
		//admin enter Short Description
		driver.findElement(By.xpath("//*[@id=\"ShortDescriptionMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("How might we utilise a platform that enables investors and retail consumers to make sustainability considerations either in their respective (i) personal consumption or (ii) investment decision- making process and/ SDG investment portfolio building?");
		//admin enter Detailed Description
		driver.findElement(By.xpath("//*[@id=\"DetailedDescriptionMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("More Details\r\n"
				+ "Theme: Mobilise Capital\r\n"
				+ "\r\n"
				+ "Sustainability-linked instruments have recently surfaced as a popular way for businesses to tie Cost of Capital to specific sustainability Key Performance Indicators such as greenhouse gas emissions. \r\n"
				+ "How might market participants ensure that businesses continue to progress in their overall sustainability performance and not focused only on the agreed KPI?");
		
		//admin select Categories
		WebElement selectCat = driver.findElement(By.xpath("/html/body/main/div/div[5]/div/form/div/div[4]/div/div[1]/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectCat);
		
		//IF INSTITUTION:
		//User select Type
		WebElement selectType = driver.findElement(By.id("decentralisedFinanceBasTribeAccelerator"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectType);
				
		//User select Line of Business
		WebElement selectLine = driver.findElement(By.id("smartFinanceTibco"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectLine);
		
		
		//IF EDUCATION:
		// User select Type
		// WebElement selectTypeEdu = driver.findElement(By.id("decentralisedFinanceBasTribeAccelerator"));
		// ((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectTypeEdu);
		
		// WebElement selectTypeEdu2 = driver.findElement(By.id("smartFinanceTibco"));
		// ((JavascriptExecutor) driver).executeScript("arguments[0].click();", selectTypeEdu2);

		//Close Categories
		WebElement closeCat = driver.findElement(By.xpath("/html/body/main/div/div[5]/div/form/div/div[4]/div/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeCat);
		
		
		
		//admin enter Problem Statement Tags
		WebElement tagProbStat = driver.findElement(By.xpath("/html/body/main/div/div[5]/div/form/div/div[6]/div/input"));
		
		tagProbStat.sendKeys("systemintegrator");
		tagProbStat.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//admin Upload supporting file for problem statement
		WebElement uploadFileSupportProbStat = driver.findElement(By.id("input-0-Support"));
		uploadFileSupportProbStat.sendKeys("/Users/FN/Downloads/samples/Brankas Statement Service - API Documentation 2.1.pdf");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//admin Upload problem statement icon
		WebElement uploadProbStatIcon = driver.findElement(By.id("input-0-Icon"));
		uploadProbStatIcon.sendKeys("/Users/FN/Downloads/samples/brankas.png");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	
	
	public void saveInformationProbStatButton() {
		//admin click save information button on hackathon information
		driver.findElement(By.xpath("/html/body/main/div/div[5]/div/form/div/div[9]/button")).submit();
		
	}
	
	public void cancelInformationProbStatButton() {
		//admin click cancel button on hackathon information
		driver.findElement(By.xpath("/html/body/main/div/div[5]/div/form/div/div[9]/a")).click();
	}
	
	
	//DRAFT - SUBMIT PROPOSAL CUSTOM QUESTION
	
	public void customQTab() {
	//admin click submit proposal question tab
		WebElement customQTab = driver.findElement(By.xpath("/html/body/main/div/div[2]/div[4]/div[3]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", customQTab);
	}
	
	public void customQLink() {
	//admin click add new problem statement link
		WebElement addNewcustomQ = driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div[1]/div/a[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", addNewcustomQ);
		
	}
	
	public void customQForm() {
		
		//admin enter question
		driver.findElement(By.id("questionTitle")).sendKeys("Solution Details: Themes?"); //"What is problem unique idea? - "What is your solution unique idea?
		
		//admin enable question required
		driver.findElement(By.xpath("/html/body/main/div/div[4]/div/form/div/div[1]/div/label/div[1]")).click();
		
		//admin select type
		Select QType = new Select(driver.findElement(By.id("questionType")));
		QType.selectByValue("Paragraph"); // Short Answer / Paragraph / Multiple Choice / Dropdown / Scale
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//if multiple/dropdown
		//driver.findElement(By.xpath("//*[@id=\"optionBoxContainer\"]/div/input")).sendKeys("Solution A");
		//WebElement addNewOptions = driver.findElement(By.xpath("//*[@id=\"addOption\"]/svg"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", addNewOptions);
		//driver.findElement(By.xpath("//*[@id=\"optionBoxContainer\"]/div[2]/input")).sendKeys("Solution B");
		
		
		//admin select category
		Select QCategory = new Select(driver.findElement(By.id("questionCategory")));
		QCategory.selectByValue("general");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void saveInformationCustomQButton() {
		//admin click save information button on hackathon information
		driver.findElement(By.xpath("/html/body/main/div/div[4]/div/form/div/div[4]/div[2]/button")).submit();
	}
	
	public void cancelInformationCustomQButton() {
		//admin click cancel button on hackathon information
		driver.findElement(By.xpath("/html/body/main/div/div[4]/div/form/div/div[4]/div[1]/a")).click();
	}
	
	
	//DRAFT - SUBMIT SOLUTION CUSTOM QUESTION
	
		public void customSolQTab() {
		//admin click submit proposal question tab
			WebElement customSolQTab = driver.findElement(By.xpath("/html/body/main/div/div[2]/div[4]/div[4]/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", customSolQTab);
		}
		
		public void customSolQLink() {
		//admin click add new problem statement link
			WebElement addNewcustomSolQ = driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div[1]/div/a[2]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", addNewcustomSolQ);
			
		}
		
		
	
	//DRAFT - CRITERIA
	public void criteriaTab() {
		
		//admin click criteria main tab
			WebElement criteriaTab = driver.findElement(By.xpath("/html/body/main/div/div[2]/div[4]/div[5]/a"));	
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", criteriaTab);
		}
	//evaluation proposal screening
	//----no need click tab
	//Judge Proposal Screening
	public void judgecriteriatab() {

		// admin click criteria tab
		WebElement judgecriteriatab = driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div[2]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", judgecriteriatab);
	}
	
	
	//Judge Solution Screening
	public void judgesolutioncriteriatab() {

		// admin click criteria tab
		WebElement judgesolutioncriteriatab = driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div[3]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", judgesolutioncriteriatab);
	}

	
	
		
		public void criteriaLink() {
		//admin click add new problem statement link
			WebElement addNewCriteria = driver.findElement(By.xpath("/html/body/main/div/div[4]/div/div[1]/a")); //--/html/body/main/div/div[4]/div/div[1]/a or [2]/a / 3 / 4
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", addNewCriteria);
			
		}
		
		public void criteriaForm() {
			
			//admin enter criteria title
			driver.findElement(By.id("criteriaTitle")).sendKeys("Business Value"); //Business value / Integration / Innovation / Creativity
			
			//admin enter criteria desc
			driver.findElement(By.xpath("//*[@id=\"criteriaDescriptionMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("1 - No evidence/ No clarity\r\n"
					+ "2 - Somewhat clear\r\n"
					+ "3 - Good evidence\r\n"
					+ "4 - Strong evidence\r\n"
					+ "5- Outstanding");
			
			//admin select minimum score
			Select QType = new Select(driver.findElement(By.id("criteriaMinimumScore")));
			QType.selectByValue("1");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//admin select maximum score
			Select QCategory = new Select(driver.findElement(By.id("criteriaMaximumScore")));
			QCategory.selectByValue("5");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//admin enter weight
			driver.findElement(By.id("Weight")).sendKeys("100"); // 25 / 50 / 75
			
			
			//admin enter Score definitions
			driver.findElement(By.xpath("//*[@id=\"criteriaNotesMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("Min - 1\r\n"
					+ "Max - 5");
			
			
		}
		
		public void saveInformationCriteriaButton() {
			//admin click save information button on hackathon information
			driver.findElement(By.xpath("/html/body/main/div/div[6]/div/form/div/div[6]/div[2]/button")).submit();
			
		}
		
		public void cancelInformationCriteriaButton() {
			//admin click cancel button on hackathon information
			driver.findElement(By.xpath("/html/body/main/div/div[6]/div/form/div/div[6]/div[1]/a")).click();
		}
		
		
		
		
	
		//DRAFT - TERM & CONDITIONS
		public void tncTab() {
			//admin click tnc tab
				WebElement tncTab = driver.findElement(By.xpath("/html/body/main/div/div[2]/div[4]/div[6]/a"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", tncTab);
			}
			
		public void tncLink() {
			//admin click add new problem statement link
				WebElement editNewTnc = driver.findElement(By.id("participant-term-cond-btn"));
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", editNewTnc);
				
			}
			
		public void tncForm() {
			//admin enter Participant Terms and Conditions
			driver.findElement(By.xpath("//*[@id=\"participantTermsDescriptionMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("Here is a list of frequently asked questions that you may find useful.\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "1. Is a Terms and Conditions agreement required?\r\n"
					+ "A Terms and Conditions agreement is�not�legally required. However, having one comes with a number of important benefits for both you and your users/customers.\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "The benefits include increasing your control over your business/platform, while helping your users understand your rules, requirements and restrictions.\r\n"
					+ "\r\n"
					+ "");
			
			}
		
			
		public void saveInformationTncButton() {
				//admin click save information button on hackathon information
				driver.findElement(By.xpath("//*[@id=\"participant-term-cond-form\"]/form/div/div[2]/div/button")).submit();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			
		public void cancelInformationTncButton() {
				//admin click cancel button on hackathon information
				driver.findElement(By.id("participant-term-cond-btn")).click();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
		
		
		public void tncJudege() {
			//admin click Judge/Evaluator Terms and Conditions tab
			WebElement tncJudgeTab = driver.findElement(By.xpath("/html/body/main/div/div[3]/div/div[2]/button"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", tncJudgeTab);
		
			//admin editTncJudgeLink
			WebElement tncJudgeLink = driver.findElement(By.id("admin-term-cond-btn"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", tncJudgeLink);
		
			//admin enter Judge/Evaluator Terms and Conditions
			driver.findElement(By.xpath("//*[@id=\"adminTermsDescriptionMarkdown\"]/div/div[2]/div/div[2]/div/div[1]")).sendKeys("Here is a list of frequently asked questions that you may find useful.\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "1. Is a Terms and Conditions agreement required?\r\n"
					+ "A Terms and Conditions agreement is�not�legally required. However, having one comes with a number of important benefits for both you and your users/customers.\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "The benefits include increasing your control over your business/platform, while helping your users understand your rules, requirements and restrictions.\r\n"
					+ "\r\n"
					+ "");	
			
			//admin click save information button on hackathon information for tnc judge
			driver.findElement(By.xpath("//*[@id=\"admin-term-cond-form\"]/form/div/div[2]/div/button")).submit();
			
		}
		
		public void cancelInformationTncButtonForJudge() {
			//admin click cancel button on hackathon information
			driver.findElement(By.id("admin-term-cond-btn")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		

		
		
		public void SubmitForApproval() {
				WebElement submitApproval = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div/div[2]/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitApproval);
			
		}
		
		
		
		
	
		
		//USER MANAGEMENT MENU
	public void userManagement() {
		//admin click user management menu
		WebElement clickUserMgt = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[5]/a/div[2]"));
		//*[@id="sidebar"]/ul/li[5]/a/div[2] OR //*[@id=\"sidebar\"]/ul/li[8]/a/div[2]
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickUserMgt);
		
		//admin click invite user button
		WebElement clickInviteUser = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/div[4]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickInviteUser);
	}
	
	public void inviteButton() {
		// admin click invite user button on invite user page
		WebElement inviteButton = driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[9]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", inviteButton);
		}
		
	
	public void cancelLinkOnInvite() {
		// admin click cancel link on invite user page
		WebElement cancelLinkOnInvite = driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[9]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", cancelLinkOnInvite);
	}
		
	
		
		//Admin invite admin role
	public void inviteAdmin() {
		//user enter First name
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[1]/input")).sendKeys("Edu 2");
		
		//user enter Last name
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[2]/input")).sendKeys("Auto Admin");
		
		//user select Role
		Select role = new Select(driver.findElement(By.id("role")));
		role.selectByValue("admin"); //single value admin/ evaluator/ judge
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//user enter Phone number
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[5]/input")).sendKeys("62 123 456 654");
		
		//user enter Email address
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[6]/input")).sendKeys("fadhilatun.nisa+adminedu@brank.as");
		
	}
	
	public void inviteEvaluator() {
		// user enter First name
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[1]/input")).sendKeys("Edu 2");


		// user enter Last name
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[2]/input")).sendKeys("Auto Eva");

		// user select Role
		Select role = new Select(driver.findElement(By.id("role")));
		role.selectByValue("evaluator"); // single value admin/ evaluator/ judge
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//user pick hackathon
		Select pickH = new Select(driver.findElement(By.id("hackathon-id")));
		pickH.selectByValue("77"); //single value 1 - 44 (itc - 42, betaurmind - 49)
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		// user enter Phone number
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[5]/input")).sendKeys("62 123 456 654");

		// user enter Email address
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[6]/input")).sendKeys("fadhilatun.nisa+edueva@brank.as");
		
	}
	
	public void inviteJudge() {
		// user enter First name
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[1]/input")).sendKeys("Edu 2");

		// user enter Last name
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[2]/input")).sendKeys("Auto Judge");

		// user select Role
		Select role = new Select(driver.findElement(By.id("role")));
		role.selectByValue("judge"); // single value admin/ evaluator/ judge
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// user pick hackathon
		Select pickH = new Select(driver.findElement(By.id("hackathon-id")));
		pickH.selectByValue("77"); // single value 1 - 44 (itc - 42) / revo 51
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// user enter Phone number
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[5]/input")).sendKeys("62 123 456 654");

		// user enter Email address
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[6]/input")).sendKeys("fadhilatun.nisa+edujud@brank.as");
		
		//user checklist assigned problem statement
		WebElement checkProbStat = driver.findElement(By.xpath("//*[@id=\"assigned-problem-statement\"]/div[1]/div/label/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkProbStat);
		
		WebElement checkProbStat2 = driver.findElement(By.xpath("//*[@id=\"assigned-problem-statement\"]/div[3]/div/label/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkProbStat2);
		
		WebElement checkProbStat3 = driver.findElement(By.xpath("//*[@id=\"assigned-problem-statement\"]/div[5]/div/label/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkProbStat3);
		
		
	}
	
	
	
	
	
	

	public void endAdminHackathon() {
		driver.close();
		driver.quit();

	}
}

