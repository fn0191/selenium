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

public class GenericHackathon_Scenario {
	
	
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;

	public static String baseURL = "https://hackolosseum.apix.global/hackathon/adventurethackathon ";

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
	
	

	public void registerButtonOnLandingPage() {
		//user click register button
		driver.findElement(By.id("register-button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void ssoRegister() {
		//user enter email
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+adv-1@brank.as");
		
		//user enter pass
		driver.findElement(By.id("new-password")).sendKeys("12345678");
		
		//user click register button on sso
		driver.findElement(By.id("register")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void RegisterFromLanding() {
		driver.findElement(By.id("register-button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	public void fillRegisterAccountGH() {
		//REGISTER STEP 1
		//user enter first name
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[1]/input")).sendKeys("Mrs.");
		
		//user enter last name
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[2]/input")).sendKeys("Adv 1");
	}
	
	public void clickNextInStep1() {
		//user click next button in step 1
		WebElement nextStep1 = driver.findElement(By.xpath("/html/body/main/section/div/form/div[4]/div[1]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextStep1);
		
	}
		
		
	public void clickCancelInStep1() {
		//user click cancel link in step 1
		WebElement cancelStep1 = driver.findElement(By.xpath("/html/body/main/section/div/form/div[4]/div[2]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", cancelStep1);
		
	}
	
	public void fillRegisterOrgGH() {
		//REGISTER STEP 2
		//user enter Organization name
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[1]/input")).sendKeys("Adv 1 Co");
		
		//user enter Organization description
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[2]/textarea")).sendKeys("Adv using Automation test");
		
		//user enter Organization address
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[3]/input")).sendKeys("East St");
		
		//user select Operation country
		Select selOpCountry = new Select(driver.findElement(By.id("operation-country")));
		selOpCountry.selectByValue("ID"); //single value Global/SG/ID/AU/TH/IN
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//user enter Organization website
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[5]/input")).sendKeys("https://www.brank.as");
		
		
		//user enter Facebook URL - Optional
		driver.findElement(By.name("Facebook")).sendKeys("https://www.facebook.com/CTC");
		
		//user enter Linkedin URL - Optional
		driver.findElement(By.name("Linkedin")).sendKeys("https://www.linkedin.com/CTC");
		
		//user enter Twitter URL - Optional
		driver.findElement(By.name("Twitter")).sendKeys("https://www.twitter.com/CTC");
		
		//user enter Youtube URL - Optional
		driver.findElement(By.name("Youtube")).sendKeys("https://www.youtube.com/JFF");
		
	}
	
	public void fillRegisterOrgGH2() {
		//REGISTER STEP 2
		//user enter Organization name
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[1]/input")).sendKeys("CK H1 ORG");
		
		//user enter Organization description
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[2]/textarea")).sendKeys("CK using Automation test");
		
		//user enter Organization address
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[3]/input")).sendKeys("East St");
		
		//user select Operation country
		Select selOpCountry = new Select(driver.findElement(By.id("operation-country")));
		selOpCountry.selectByValue("ID"); //single value Global/SG/ID/AU/TH/IN
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//user enter Organization website
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[5]/input")).sendKeys("https://www.brank.as");
	
		
		//IF EDUCATION HACKATHON FILL THIS
		//NEW FIELD: School Name
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[6]/input")).sendKeys("School JFF");
		
		//NEW FIELD: Course Name
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[7]/input")).sendKeys("Project");
		//
		
		
		
		//user enter Facebook URL - Optional
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[8]/input")).sendKeys("https://www.facebook.com/JFF");
		
		//user enter Linkedin URL - Optional
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[9]/input")).sendKeys("https://www.linkedin.com/JFF");
		
		//user enter Twitter URL - Optional
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[10]/input")).sendKeys("https://www.twitter.com/JFF");
		
		//user enter Youtube URL - Optional
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[11]/input")).sendKeys("https://www.youtube.com/JFF");
		
	}
	
	public void clickNextInStep2() {
		//user click next button in step 2
		WebElement nextStep2 = driver.findElement(By.xpath("/html/body/main/section/div/form/div[10]/div[1]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextStep2);
	}
	
	public void clickNextEDU2() {
		//user click next button in step 2
		WebElement nextStep2 = driver.findElement(By.xpath("/html/body/main/section/div/form/div[12]/div[1]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextStep2);
		}
		
		
	public void clickCancelInStep2() {
		//user click cancel link in step 2
		WebElement cancelStep2 = driver.findElement(By.xpath("/html/body/main/section/div/form/div[10]/div[2]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", cancelStep2);
		
	}
	
	
	public void clickBackToStep1() {
		//user click Back to Account information link on step 2 page
		WebElement clickBackToStep1 = driver.findElement(By.xpath("/html/body/main/section/div/div[1]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickBackToStep1);
		
	}
	
	
	public void fillRegisterTL() {
		//REGISTER STEP 3
		//user enter First name
		driver.findElement(By.name("FirstName")).sendKeys("Ctc");
		
		//user enter Last name
		driver.findElement(By.name("LastName")).sendKeys("Doe");
		
		//user select Gender
		Select selGender = new Select (driver.findElement(By.name("Gender")));
		selGender.selectByValue("F"); //single value F / M
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//user enter Nationality
		driver.findElement(By.name("Nationality")).sendKeys("ID");
		
		//user enter Designation
		driver.findElement(By.name("Designation")).sendKeys("QA");
		
		//user enter Email address
		driver.findElement(By.name("Email")).sendKeys("fadhilatun.nisa@brank.as");
		
		//user enter Phone number
		driver.findElement(By.name("PhoneNumber")).sendKeys("62 812 344 12211");
		
		//TEAM MEMBER (NEW FIELDS)
		//add new row
		WebElement teamrow = driver.findElement(By.xpath("//*[@id=\"btnAdd\"]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", teamrow);
		//first name
		driver.findElement(By.name("TeamMemberFirstName")).sendKeys("Team A");
		//last name
		driver.findElement(By.name("TeamMemberLastName")).sendKeys("CVD");
		//email
		driver.findElement(By.name("TeamMemberEmail")).sendKeys("fadhilatun.nisa@brank.as");
		//phone number
		driver.findElement(By.name("TeamMemberPhone")).sendKeys("62 812 344 12211");
		
		
		//user checklist TnC
		WebElement checkTnC = driver.findElement(By.id("tos"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkTnC);
		
	}
	
	public void fillRegisterTL2() {
		//REGISTER STEP 3
		//
		//IF EDUCATION HACKATHON FILL THIS
		//NEW FIELD: Lecturer First name
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/input")).sendKeys("Lecture JENIA");
				
		//NEW FIELD: Lecturer Last name
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/input")).sendKeys("Test");

		// NEW FIELD: Lecturer Email
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/input")).sendKeys("laurensius+admin@brank.as");
		
		
		//user enter First name
		driver.findElement(By.name("FirstName")).sendKeys("MARCH");
		
		//user enter Last name
		driver.findElement(By.name("LastName")).sendKeys("Doe");
		
		//user select Gender
		Select selGender = new Select (driver.findElement(By.name("Gender")));
		selGender.selectByValue("F"); //single value F / M
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//user enter Nationality
		driver.findElement(By.name("Nationality")).sendKeys("ID");
		
		//user enter Designation
		driver.findElement(By.name("Designation")).sendKeys("QA");
		
		//user enter Email address
		driver.findElement(By.name("Email")).sendKeys("fadhilatun.nisa@brank.as");
		
		//user enter Phone number
		driver.findElement(By.name("PhoneNumber")).sendKeys("62 812 344 12211");
		
		//TEAM MEMBER (NEW FIELDS)
		//add new row
		WebElement teamrow = driver.findElement(By.xpath("//*[@id=\"btnAdd\"]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", teamrow);
		//first name
		driver.findElement(By.name("TeamMemberFirstName")).sendKeys("Team A");
		//last name
		driver.findElement(By.name("TeamMemberLastName")).sendKeys("AA");
		//email
		driver.findElement(By.name("TeamMemberEmail")).sendKeys("fadhilatun.nisa@brank.as");
		//phone number
		driver.findElement(By.name("TeamMemberPhone")).sendKeys("62 812 344 12211");
		
		
		//user checklist TnC
		WebElement checkTnC = driver.findElement(By.id("tos"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkTnC);
		
	}
	
	public void clickRegisterInStep3() {
		//user click next button in step 3
		WebElement registerStep3 = driver.findElement(By.xpath("//*[@id=\"form\"]/div[11]/div[1]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", registerStep3);
	}
	
	public void clickRegisterEdu3() {
		//user click next button in step 3
		WebElement registerStep3 = driver.findElement(By.xpath("//*[@id=\"form\"]/div[14]/div[1]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", registerStep3);
		
	}
		
		
	public void clickCancelInStep3() {
		//user click cancel link in step 3
		WebElement cancelStep3 = driver.findElement(By.xpath("//*[@id=\"form\"]/div[11]/div[2]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", cancelStep3);
		
	}
	
	public void clickBackToStep2() {
		//user click Back to Organization information link on step 3 page
		WebElement clickBackToStep2 = driver.findElement(By.xpath("/html/body/main/section/div/div[1]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickBackToStep2);
		
	}
	
	
	
	
	public void logintoGH() {
		//user clicks login button on generic hackathon landing page
		driver.findElement(By.xpath("/html/body/header/nav/div/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	
	public void ssoLogin() {
		
		//https://apix:brankasv2@apix.global
		
		
		
			//user enter email
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+adv-1@brank.as");
				
		//user enter pass
		driver.findElement(By.id("password")).sendKeys("12345678");
				
	}
	
	public void loginButtonSSO() {
		//user click login button on sso
		driver.findElement(By.xpath("//*[@id=\"contact-us\"]/form/button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void gotoProposalList() {
		//click my proposals on userdropdown list
		WebElement gotoProposalList = driver.findElement(By.xpath("/html/body/header/nav/div/div[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", gotoProposalList);
				
		
		//user clicks my proposals
		WebElement gotoProposalList2 = driver.findElement(By.xpath("/html/body/header/nav/div/div[2]/ul/li[1]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", gotoProposalList2);
	
	}
	
	public void clickSubmitProposalOnProposalList() {
		//click my proposals on userdropdown list
		driver.findElement(By.xpath("//*[@id=\"submit-proposal-link\"]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	public void submitProposalOnGHLandingPage() {
		//user clicks submit proposal on Generic Hackathon Landing page
		driver.findElement(By.id("proposals-button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void fillSubmitProposal() {
		//GENERAL SECTION
			//Proposal title
			driver.findElement(By.id("Title")).sendKeys("ADV 1 - Develop cyber - Proposal #1"); //Hack & Change - Proposal Baby 3 / Develop a mechanism to monitor water /  Digitization plan of action for pipelines 
		
			//Proposal description
			driver.findElement(By.id("Description")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. \r\n"
					+ "\r\n"
					+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
			
			//Select Problem Statement
			Select probStat = new Select(driver.findElement(By.id("ProblemStatement")));
			probStat.selectByValue("198"); //value 200-2
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
			//Custom Question
			//driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[2]/div[4]/textarea")).sendKeys("June Hackathon is dummy hack \r\n"
				//	+ "\r\n"
				//	+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ");
			
		
		//Product/Service Details section
			//user expand the Product/Service Details section
			WebElement prodService = driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[3]/div[1]/span"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", prodService);
			
			
			//Please describe your idea, product and/or service in detail. How does it align with the above problem statement?
			driver.findElement(By.id("ProductDescription")).sendKeys("Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book. It usually begins with:\r\n"
					+ "\r\n"
					+ "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
			
			//Select Which stage is your product/solution at:
			Select selStage = new Select(driver.findElement(By.id("ProductStage")));
			selStage.selectByValue("idea"); //value: idea / inDevelopment / prototype / POC / pilot / inProduction
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//What is the expected result from using your idea, product and/ or service? If you have already achieved a result, please provide details, providing quantitative data wherever possible.
			driver.findElement(By.id("ExpectedResult")).sendKeys("The purpose of lorem ipsum is to create a natural looking block of text (sentence, paragraph, page, etc.) that doesn't distract from the layout.\r\n"
					+ "\r\n"
					+ " A practice not without controversy, laying out pages with meaningless filler text can be very useful when the focus is meant to be on design, not content.");
			
			//Choose Category
			Select selCategory = new Select(driver.findElement(By.id("ProductCategory")));
			selCategory.selectByValue("categoryB"); //value categoryA -B
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//Please briefly outline the critical success factors, and steps, required to bring this idea to life, and a reasonable timeline in which this can be achieved. You may set these out in bullet point.
			driver.findElement(By.id("SuccessFactors")).sendKeys("Success factors:\r\n"
					+ "\r\n"
					+ "The passage experienced a surge in popularity during the 1960s when Letraset used it on their dry-transfer sheets, and again during the 90s as desktop publishers bundled the text with their software. Today it's seen all around the web; on templates, websites, and stock designs. Use our generator to get your own, or read on for the authoritative history of lorem ipsum.");
			
			//What are the key benefits to the wider community if we were to go ahead to implement your proposed solution?
			driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[4]/div[6]/textarea")).sendKeys("Community:\r\n"
					+ "\r\n"
					+ "Until recently, the prevailing view assumed lorem ipsum was born as a nonsense text. It's not Latin, though it looks like it, and it actually says nothing, Before & After magazine answered a curious reader, Its words loosely approximate the frequency with which letters occur in English, which is why at a glance it looks pretty real.");
			
		
		//Uniqueness and creativity section
			//user expand the Uniqueness and creativity section
			WebElement expandUniqueness = driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[5]/div[1]/span"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", expandUniqueness);
			
			
			//What other companies or organizations already offer a similar solution?
			driver.findElement(By.id("Competition")).sendKeys("As Cicero would put it, Um, not so fast.");
			
			//What are the key competitive advantages that your team and your proposed solution have over your competitors?
			driver.findElement(By.id("CompetitiveAdvantages")).sendKeys("The placeholder text, beginning with the line Lorem ipsum dolor sit amet, consectetur adipiscing elit, looks like Latin because in its youth, centuries ago, it was Latin.");
			
			//What differentiates your solution from your competitors? What is your unique value proposition?
			driver.findElement(By.id("UniquePropositions")).sendKeys("In particular, the garbled words of lorem ipsum bear an unmistakable resemblance to sections 1.10.3233 of Cicero's work, with the most notable passage excerpted below:");
			
		//Team section
			//user expand the Team section
			WebElement expandTeam = driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[7]/div[1]/span"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", expandTeam);
			
			
			//Please share details about your core team members; name, designation, experience and their current role and contributions to your team.
			driver.findElement(By.id("TeamMembers")).sendKeys("Dr.John\r\n"
					+ "- 27 years of international working experience in USA\r\n"
					+ "- PhD in Measurement, USA\r\n"
					+ "- President of Malaysian\r\n"
					+ "- Director of a National Analytics\r\n"
					+ "\r\n"
					+ "Dr.Rense\r\n"
					+ "Role : Chief Data\r\n"
					+ "Experience: 35 years of International\r\n"
					+ "\r\n"
					+ "Kok Mun Yee\r\n"
					+ "Role: Behavioural\r\n"
					+ "Experience: 10 years");
			
		//Risks and Challenges section
			//user expand the Risks and Challenges section
			WebElement expandRisks = driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[9]/div[1]/span"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", expandRisks);
			
			
			//What are the key risks if this idea is implemented and how can they be mitigated?
			driver.findElement(By.id("KeyRisks")).sendKeys("Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem.");
			
			//What are the challenges that you anticipate in implementing/providing this solution, and how will you overcome them?
			driver.findElement(By.id("Challenges")).sendKeys("McClintock's eye for detail certainly helped narrow the whereabouts of lorem ipsum's origin, however, the how and when still remain something of a mystery, with competing theories and timelines.");
			
		
		//Hackathon Related Questions section
			//user expand the Hackathon Related Questions section
			WebElement expandHackathonRelated = driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[11]/div[1]/span"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", expandHackathonRelated);
			
			//What value or benefits are you expecting from your participation in the hackathon?
			driver.findElement(By.id("ValuesBenefits")).sendKeys("So how did the classical Latin become so incoherent? According to McClintock, a 15th century typesetter likely scrambled part of Cicero's De Finibus in order to provide placeholder text to mockup various fonts for a type specimen book.");
			
			//What technical capabilities does your team have that will enable you to create a functional prototype on the APIX platform?
			driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[12]/div[2]/textarea")).sendKeys("Whether a medieval typesetter chose to garble a well-known (but non-Biblical\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "that would have been sacrilegious) text, or whether a quirk in the 1914 Loeb Edition inspired a graphic designer, it's admittedly an odd way for Cicero to sail into the 21st century.");
			
			//If selected, would you/your team be available to pitch virtually?
			Select selPitching = new Select(driver.findElement(By.id("PitchingAvailability")));
			selPitching.selectByValue("true"); //value true-false
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			
		//URLs section
			//user expand the URLs section
			WebElement expandURL = driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[13]/div[1]/span"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", expandURL);
			
			
			//Please provide URLs to your demos (optional)
			driver.findElement(By.id("URLs")).sendKeys("https://www.brank.as");
			
		//Supporting Documents section
			//user expand the Supporting Documents section
			WebElement expandDoc = driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[15]/div[1]/span"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", expandDoc);
			
			
			//Upload files to support
			WebElement uploadImageSupport = driver.findElement(By.id("input-0-Documents"));
			uploadImageSupport.sendKeys("/Users/FN/Downloads/samples/test.pdf");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		//click go to top link
			WebElement goToTop = driver.findElement(By.xpath("/html/body/main/section/div/div[4]/div/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", goToTop);
			

	}
	
	public void submitProposalButtonOnForm() {
		//click submit proposal button
		WebElement submitProposal = driver.findElement(By.xpath("//*[@id=\"submit-proposal-link\"]/div/div[2]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitProposal);
		
	}
	
	public void continueLaterButtonOnForm() {
		//click continue later button
		WebElement cancelProposal = driver.findElement(By.xpath("//*[@id=\"submit-proposal-link\"]/div/div[1]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", cancelProposal);
	}
	
	
	//SUBMIT SOLUTION
	public void submitSolutionOnList() {
		// click submit proposal button on list
		WebElement submitSolution = driver.findElement(By.xpath("/html/body/main/section/div/div[7]/div[2]/div[2]/div[2]/a")); 
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitSolution);
		
		//1st - /html/body/main/section/div/div[4]/div[2]/div[2]/div[2]/a
		//2nd - /html/body/main/section/div/div[5]/div[2]/div[2]/div[2]/a
		//3rd - /html/body/main/section/div/div[6]/div[2]/div[2]/div[2]/a
		
			
	}
	
	public void fillSolutionForm() {
		//enter Solution description
		driver.findElement(By.id("SolutionDescription")).sendKeys("HOW TO HANDLE 1 - USR 2: Solution of the Swedish hackathon in the Community category,\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "CoronaFree is the brainchild 2");
		
		//enter URL to demonstration video
		driver.findElement(By.id("SolutionVideoURL")).sendKeys("https://www.solutionhack.com");
				
		//Upload Video
		WebElement uploadVideo = driver.findElement(By.id("SolutionVideos-0"));
		uploadVideo.sendKeys("/Users/FN/Downloads/samples/24 November, 2020 - Loom Recording.mp4");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//enter URL to demonstration video
		driver.findElement(By.id("SolutionURL")).sendKeys("https://www.solutionhack.com");
		
		//supporting Document
		WebElement supportDoc = driver.findElement(By.id("SolutionDocuments-0"));
		supportDoc.sendKeys("/Users/FN/Downloads/samples/APIX2.0 - Security Feature.pdf");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Custom Solution Question
		// driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[10]/textarea")).sendKeys("So how did the classical Latin become so incoherent? According to McClintock, a 15th century typesetter likely scrambled part of Cicero's De Finibus in order to provide placeholder text to mockup various fonts for a type specimen book.\r\n"
		//		+ "\r\n"
		//		+ "It's difficult to find examples of lorem ipsum in use before Letraset made it popular as a dummy text in the 1960s");
		
		//click Go To Top link
		WebElement gototop = driver.findElement(By.xpath("/html/body/main/section/div[1]/div[4]/div/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", gototop);
		
				
	}
	
	public void submitSolution() {
		WebElement submitSolution = driver.findElement(By.xpath("/html/body/main/section/div[1]/div[2]/div/div[2]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitSolution);
		
		
	}
	
	public void saveContinueLaterSolution() {
		WebElement saveContinueLaterSolution = driver.findElement(By.xpath("/html/body/main/section/div[1]/div[2]/div/div[1]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveContinueLaterSolution);
		
		
	}
		
	
	
	//EVALUATOR
	//login as evaluator
	public void loginEv() {
		driver.findElement(By.xpath("/html/body/header/nav/div/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//user enter email
		driver.findElement(By.id("email")).sendKeys(" fadhilatun.nisa+ctc-e1@brank.as");
				
		//user enter pass
		driver.findElement(By.id("password")).sendKeys("12345678");
				
		//user click login button on sso
		driver.findElement(By.xpath("//*[@id=\"contact-us\"]/form/button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void EvAcceptTos() {
		//ev agree
		driver.findElement(By.xpath("//*[@id=\"register\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void EvRejectTos() {
		//ev back to login
		driver.findElement(By.xpath("/html/body/main/div/form/div/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	
	public void clickEvaluatorAdministratorOnUserMenu() {
		//click Evaluator Administrator On UserMenu
		driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void searchProp() {
		// ev search proposal
		driver.findElement(By.id("filter")).sendKeys("March 3-2");
		WebElement textbox = driver.findElement(By.id("filter"));
		textbox.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
	
	
	public void clickViewLinkEv() {
		WebElement viewbutton = driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/table/tbody/tr[1]/td[6]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewbutton);
		// /html/body/main/div/div[2]/div/div[1]/table/tbody/tr[7]/td[6]/a
		// /html/body/main/div/div[2]/div/div[1]/table/tbody/tr[1]/td[6]/a
		
	}
	
	public void evEvaluateProp() {
		//ev click evaluate button
		driver.findElement(By.xpath("/html/body/main/div/div[1]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//ev click submit conflict of interest
		driver.findElement(By.xpath("//*[@id=\"conflict-drawer\"]/div[6]/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void evaluatePropForm() {
		//Criteria 1
		//select score
		Select drpScoring = new Select(driver.findElement(By.id("criteria1-score")));
		drpScoring.selectByVisibleText("5");	
		//Comment Criteria 1
		driver.findElement(By.xpath("//*[@id=\"criteria1-drawer\"]/div[5]/textarea")).sendKeys("auto evaluated by Jb1-j1");
		//click next button 
		WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"criteria1-drawer\"]/div[6]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextButton);
		
		// Criteria 2
		// select score
		//Select drpScoring2 = new Select(driver.findElement(By.id("criteria2-score")));
		//drpScoring2.selectByVisibleText("4");
		// Comment Criteria 2
		//driver.findElement(By.xpath("//*[@id=\"criteria2-drawer\"]/div[5]/textarea")).sendKeys("auto comment criteria 2 -  good proposal");
		// click next button
		//WebElement nextButton2 = driver.findElement(By.xpath("//*[@id=\"criteria2-drawer\"]/div[6]/button[2]"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextButton2);
		
		
		// Comment General 
		driver.findElement(By.id("general-comment")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\r\n"
				+ "The purpose of lorem ipsum is to create a natural looking block of text (sentence, paragraph, page, etc.) that doesn't distract from the layout. A practice not without controversy, laying out pages with meaningless filler text can be very useful when the focus is meant to be on design, not content."); //Overall - good proposal
		// click next button
		WebElement SubmitButton = driver.findElement(By.id("valid-submit"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", SubmitButton);
	}
	
	public void SaveContinueButtonInEvaluatePropForm() {
		//click save & continue later button
		driver.findElement(By.xpath("//*[@id=\"continue-later\"]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	
	
	//JUDGE
		//login as Judge
		public void loginJd() {
			driver.findElement(By.xpath("/html/body/header/nav/div/a")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//user enter email
			driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+ctc-j1@brank.as");
					
			//user enter pass
			driver.findElement(By.id("password")).sendKeys("12345678");
					
			//user click login button on sso
			driver.findElement(By.xpath("//*[@id=\"contact-us\"]/form/button")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		
		public void JdAcceptTos() {
			//ev agree
			driver.findElement(By.xpath("//*[@id=\"register\"]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		public void JdRejectTos() {
			//ev back to login
			driver.findElement(By.xpath("/html/body/main/div/form/div/a")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		public void searchPropJd() {
			// ev search proposal
			driver.findElement(By.id("filter")).sendKeys("March 3-2");
			WebElement textbox = driver.findElement(By.id("filter"));
			textbox.sendKeys(Keys.ENTER);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
			
		
		
		public void clickViewLinkJd() {
	
			WebElement viewbutton = driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/table/tbody/tr[5]/td[6]/a"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewbutton);
		
			// /html/body/main/div/div[2]/div/div[1]/table/tbody/tr[1]/td[6]/a
			
		}
		
		public void jdEvaluateProp() {
			//ev click evaluate button
			driver.findElement(By.xpath("/html/body/main/div/div[1]/div/a[2]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			//ev click submit conflict of interest
			driver.findElement(By.xpath("//*[@id=\"conflict-drawer\"]/div[6]/button")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		public void evaluatePropFormJd() {
			//Criteria 1
			//select score
			Select drpScoring = new Select(driver.findElement(By.id("criteria1-score")));
			drpScoring.selectByVisibleText("5");	
			//Comment Criteria 1
			driver.findElement(By.xpath("//*[@id=\"criteria1-drawer\"]/div[5]/textarea")).sendKeys("auto evaluated by Dika judge 1");
			//click next button 
			WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"criteria1-drawer\"]/div[6]/button"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextButton);
			
			// Criteria 2
			
			// select score
			//Select drpScoring2 = new Select(driver.findElement(By.id("criteria2-score")));
			//drpScoring2.selectByVisibleText("5");
			
			// Comment Criteria 2
			//driver.findElement(By.xpath("//*[@id=\"criteria2-drawer\"]/div[5]/textarea")).sendKeys("auto comment criteria 2 - not good proposal");
			
			// click next button
			//WebElement nextButton2 = driver.findElement(By.xpath("//*[@id=\"criteria2-drawer\"]/div[6]/button[2]"));
			//((JavascriptExecutor) driver).executeScript("arguments[0].click();", nextButton2);
			
			
			// Comment General 
			driver.findElement(By.id("general-comment")).sendKeys("As Cicero would put it, �Um, not so fast.�\r\n"
					+ "\r\n"
					+ "The placeholder text, beginning with the line �Lorem ipsum dolor sit amet, consectetur adipiscing elit�, looks like Latin because in its youth, centuries ago, it was Latin."); //Overall - good proposal
			// click next button
			WebElement SubmitButton = driver.findElement(By.id("valid-submit"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", SubmitButton);
		}
		
		public void SaveContinueButtonInEvaluatePropFormJd() {
			//click save & continue later button
			driver.findElement(By.xpath("//*[@id=\"continue-later\"]/div/button")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		
		
		
	}
	

	
	
	
	
	

