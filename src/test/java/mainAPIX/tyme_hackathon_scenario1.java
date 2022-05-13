package mainAPIX;

import java.net.MalformedURLException;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class tyme_hackathon_scenario1 {
	public static WebDriver driver = null;
	public static WebDriverWait waitVar = null;

	public static String baseURL = "https://apix:brankasv2@hackathontyme.apix.global/hackathon";
	//public static String baseURL = "https://hackathontyme.apixplatform.com/hackathon";
	
	public static String baseURL2 = "https://www.gmail.com";
	
	public void createDriver() throws MalformedURLException, InterruptedException {
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is: " + projectPath);

		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get(baseURL);

	}
	
	public void loginBUtton() {
		driver.findElement(By.xpath("/html/body/header/nav/div/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void login_toSubmitProp() {
		//User enter email
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+t1@brank.as");
		
		//User enter password
		driver.findElement(By.id("password")).sendKeys("12345678");
		
		//User clicks Login button
		driver.findElement(By.xpath("//*[@id=\"main-login\"]/form/button")).click();	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	public void login_toSubmitSol() {
		//User enter email
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+t1@brank.as");
		
		//User enter password
		driver.findElement(By.id("password")).sendKeys("12345678");
		
		//User clicks Login button
		driver.findElement(By.xpath("//*[@id=\"main-login\"]/form/button")).click();	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	public void login_completionReg() {
		//User enter email
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+t1@brank.as");
		
		//User enter password
		//driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.id("password")).sendKeys("12345678!");
		
		//User clicks Login button
		driver.findElement(By.xpath("//*[@id=\"main-login\"]/form/button")).click();	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	public void Login_as_admin() {
		//User enter email
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+tyme3@brank.as");
			
		//User enter password
		driver.findElement(By.id("password")).sendKeys("12345678");
		
		//driver.findElement(By.id("email")).sendKeys("laurensius+admin@brank.as");
		//String passWord = decodePassword("MTIzNDU2Nzgh");
		//driver.findElement(By.id("password")).sendKeys(passWord);
				
		//User clicks Login button
		driver.findElement(By.xpath("//*[@id=\"main-login\"]/form/button")).click();	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	public void Login_as_evaluator() {
		//User enter email
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+ct1@brank.as");
				
		//User enter password
		driver.findElement(By.id("password")).sendKeys("12345678");
				
		//User clicks Login button
		driver.findElement(By.xpath("//*[@id=\"main-login\"]/form/button")).click();	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	public void Login_as_judge() {
		//User enter email
		//driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+tyme4@brank.as");
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+ct2@brank.as");	
		//User enter password
		driver.findElement(By.id("password")).sendKeys("12345678");
				
		//User clicks Login button
		driver.findElement(By.xpath("//*[@id=\"main-login\"]/form/button")).click();	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	public void Login_as_NewEv() {
		//User enter email
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+ct1@brank.as");
				
		//User enter password
		driver.findElement(By.id("password")).sendKeys("12345678");
				
		//User clicks Login button
		driver.findElement(By.xpath("//*[@id=\"main-login\"]/form/button")).click();	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//enter TOS
		driver.findElement(By.id("register")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	public void Login_as_NewJudge() {
		//User enter email
		driver.findElement(By.id("email")).sendKeys("fadhilatun.nisa+ct2@brank.as");
				
		//User enter password
		driver.findElement(By.id("password")).sendKeys("12345678");
				
		//User clicks Login button
		driver.findElement(By.xpath("//*[@id=\"main-login\"]/form/button")).click();	
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//enter TOS
		driver.findElement(By.id("register")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	
	
	public static String decodePassword(String passWord) {
		byte[] decodePassword = Base64.getDecoder().decode(passWord);
		return new String(decodePassword);

	}
	public void Login_SSO_Gmail() {
		//User clicks continue with Google
		driver.findElement(By.xpath("/html/body/main/div/form/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String passWord = decodePassword("ZmEwMzEhKSkhKCE=");
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("fadhilatun.nisa@brank.as");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	
	/*
	 * public static String GithubPassword() { String decryptedPassword,
	 * encryptedPassword; encryptedPassword="ZmEwMzEhKSkhKCE="; byte[]
	 * decryptedPasswordBytes = Base64.getDecoder().decode(encryptedPassword);
	 * decryptedPassword = new String(decryptedPasswordBytes); return
	 * decryptedPassword; }
	 */
	
	public void Login_SSO_Github() {
		String passWord = decodePassword("ZmEwMzEhKSkhKCE=");
		 driver.findElement(By.xpath("/html/body/main/div/form/a[2]")).click();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		 driver.findElement(By.id("login_field")).sendKeys("fadhilatun.nisa@brank.as");
		 driver.findElement(By.id("password")).sendKeys(passWord);
		 driver.findElement(By.xpath("//*[@id=\"login\"]/form/div[4]/input[12]")).click();
		 //verify take code from email 
		 //driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/form/button")).click();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
	
	}
	
	
	public void registerButton() {
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	
	//--SUBMIT - REGISTRATION TO TYME HACKATHON--
	public void completeRegister_step1() {
		//User enter firstname
		driver.findElement(By.xpath("/html/body/main/section[2]/div/form/div[1]/input")).sendKeys("FAD");
		
		//User enter lastname
		driver.findElement(By.xpath("/html/body/main/section[2]/div/form/div[2]/input")).sendKeys("Challenge TYME UAT");
		
		//User enter email
		driver.findElement(By.xpath("/html/body/main/section[2]/div/form/div[3]/input")).sendKeys("fadhilatun.nisa+t1@brank.as");
		
		//User enter password
		driver.findElement(By.xpath("/html/body/main/section[2]/div/form/div[5]/input")).sendKeys("12345678");
				
		///User enter password confirm
		driver.findElement(By.xpath("/html/body/main/section[2]/div/form/div[6]/input")).sendKeys("12345678");
		
		//User clicks next button
		driver.findElement(By.xpath("/html/body/main/section[2]/div/form/div[8]/div[1]/button")).click();
				
		
	}
	public void NextIn1stStep() {
		//User clicks next button
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[5]/div[1]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	public void completeRegister_step2() {
		//User enter Organization name
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[1]/input")).sendKeys("C Tyme UAT");
		
		//User enter Organization desc
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[2]/textarea")).sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		
		//User select Country of Incorporation
		WebElement CountryDropdown = driver.findElement(By.id("operation-country"));
		Select countries = new Select(CountryDropdown);
		countries.selectByVisibleText("Global");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//User enter Countries of Operation
		driver.findElement(By.xpath("//html/body/main/section/div/form/div[4]/input")).sendKeys("SG");
				
		
		//User enter Organization website
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[5]/input")).sendKeys("https://www.brank.as");
		
		//User enter FB URL
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[6]/input")).sendKeys("https://facebook.com/CtymeUAT");
		
		//User enter LinkedIn URL
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[7]/input")).sendKeys("https://linkedin.com/CtymeUAT");
		
		//User enter Twitter URL
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[8]/input")).sendKeys("https://twitter.com/CtymeUAT");
		
		//User enter YT URL
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[9]/input")).sendKeys("https://youtube.com/CtymeUAT");
		
		//User cliks next button
		driver.findElement(By.xpath("/html/body/main/section/div/form/div[10]/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void completeRegister_step3() {
		//User enter Firstname
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/input")).sendKeys("C Tyme UAT");
		
		//User enter Last name
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/input")).sendKeys("NS1");
		
		//User enter Email address
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/input")).sendKeys("fadhilatun.nisa@brank.as");
		
		//User enter Phone number
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[4]/input")).sendKeys("628123324123");
		
		//User checklist/agree with the T&C
		WebElement TnCChkBox = driver.findElement(By.id("tos"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", TnCChkBox);

	}
	public void completeRegisterButton() {
		//User clicks register button
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[6]/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void verifyNotif() {
		//success notification
		String expectedMessage = "C Tyme UAT is successfully registered to this hackathon.";
		String message = driver.findElement(By.xpath("/html/body/div[5]/div")).getText();
		Assert.assertTrue("Error message", message.contains(expectedMessage));
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	
	//--SUBMIT - PROPOSAL TO TYME HACKATHON--
	public void fillProposal() {
		//User clicks submit proposal button
		driver.findElement(By.id("register-button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//GENERAL SECTION
		//User enter Proposal Title
		driver.findElement(By.xpath("//*[@id=\"Title\"]")).sendKeys("C TYME UAT");
		
		//User enter Short Desc
		driver.findElement(By.xpath("//*[@id=\"ShortDescription\"]")).sendKeys("Lorem ipsum is placeholder text commonly used in the graphic, print, and publishing industries for previewing layouts and visual mockups.");
		
		//User select Problem statement
		WebElement ProbDropdown = driver.findElement(By.xpath("//*[@id=\"ProblemStatement\"]"));
		Select probStat = new Select(ProbDropdown);
		probStat.selectByVisibleText("Challenge 1");
		//(Challenge 1 / Challenge 2 / Challenge 3 / Challenge 4)
		
		
		//PRODUCT/SERVICES DETAILS SECTION
		//user expand the product/services details tab
		driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[3]")).click();
		
		//User describe your product and/or service in detail
		driver.findElement(By.xpath("//*[@id=\"ProductDescription\"]")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		
		//User describe your development capabilities and preferences
		driver.findElement(By.xpath("//*[@id=\"DevDescription\"]")).sendKeys("Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ");
		
		//User select which stage is product/solution in
		WebElement ProdDropdown = driver.findElement(By.xpath("//*[@id=\"ProductStage\"]"));
		Select prodSol = new Select(ProdDropdown);
		prodSol.selectByVisibleText("Prototype");
		//(In Development / Prototype / POC / Pilot / In Production)
		
		//User enter What is the expected result from using your product/service
		driver.findElement(By.xpath("//*[@id=\"ExpectedResult\"]")).sendKeys("Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
		
		//User describe any high volume systems you have designed and the integrations process with external parties
		driver.findElement(By.xpath("//*[@id=\"HighVolumeSystem\"]")).sendKeys("From its medieval origins to the digital era, learn everything there is to know about the ubiquitous lorem ipsum passage.");
		
		//User describe your relevant experience in ASEAN
		driver.findElement(By.xpath("//*[@id=\"AseanExperience\"]")).sendKeys("“Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.”");
		
		//User describe your experience and approach with a regulated environment
		driver.findElement(By.xpath("//*[@id=\"RegulatedEnvironmentApproach\"]")).sendKeys("The purpose of lorem ipsum is to create a natural looking block of text (sentence, paragraph, page, etc.) that doesn't distract from the layout. A practice not without controversy, laying out pages with meaningless filler text can be very useful when the focus is meant to be on design, not content.");
		
		
		//UNIQUENESS AND CREATIVITY SECTION 
		//user expand the Uniqueness and creativity tab
		driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[5]/div[1]/span")).click();
		
		//User enter what other companies or organizations already offer the same product/service
		driver.findElement(By.xpath("//*[@id=\"Competition\"]")).sendKeys("The passage experienced a surge in popularity during the 1960s when Letraset used it on their dry-transfer sheets, and again during the 90s as desktop publishers bundled the text with their software.");
		
		//User enter what is your key competitive advantage
		driver.findElement(By.xpath("//*[@id=\"CompetitiveAdvantages\"]")).sendKeys(" Today it's seen all around the web; on templates, websites, and stock designs. Use our generator to get your own, or read on for the authoritative history of lorem ipsum.");
		
		//User enter what differentiates you with your competitors? What is your unique value proposition?
		driver.findElement(By.xpath("//*[@id=\"UniquePropositions\"]")).sendKeys("Until recently, the prevailing view assumed lorem ipsum was born as a nonsense text. “It's not Latin, though it looks like it, and it actually says nothing,” Before & After magazine answered a curious reader, “Its ‘words’ loosely approximate the frequency with which letters occur in English, which is why at a glance it looks pretty real.”");
		
		//User describe the types of partners you have worked with, including names if possible
		WebElement PartnerType = driver.findElement(By.id("Partners"));
		PartnerType.sendKeys("So there you have it. Lorem ipsum: the nonsense words unable to fully escape meaning.");
		PartnerType.sendKeys(Keys.ENTER);
		PartnerType.sendKeys(Keys.ENTER);
		PartnerType.sendKeys("Fully unlicensed legalese for those times you don't want to pay $400/hr.");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//TEAM SECTION
		//user expand the Team tab
		driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[7]/div[1]/h5")).click();
		
		//User share details about your core team members; name, designation, experience and their current role and contributions to team
		driver.findElement(By.id("TeamMembers")).sendKeys("So when is it okay to use lorem ipsum? First, lorem ipsum works well for staging. It's like the props in a furniture store—filler text makes it look like someone is home. The same Wordpress template might eventually be home to a fitness blog, a photography website, or the online journal of a cupcake fanatic. Lorem ipsum helps them imagine what the lived-in website might look like.");
				

		//RISKS AND CHALLENGES SECTION
		//User expand Risks and Challenges tab
		driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[9]/div[1]/h5")).click();
		
		//User explain about key risks
		driver.findElement(By.id("KeyRisks")).sendKeys("Second, use lorem ipsum if you think the placeholder text will be too distracting. For specific projects, collaboration between copywriters and designers may be best, however, like Karen McGrane said, draft copy has a way of turning any meeting about layout decisions into a discussion about word choice. So don't be afraid to use lorem ipsum to keep everyone focused.");
		
		//User explain about challenges
		driver.findElement(By.id("Challenges")).sendKeys("One word of caution: make sure your client knows that lorem ipsum is filler text. You don't want them wondering why you filled their website with a foreign language, and you certainly don't want anyone prematurely publishing it.");
		
		
		//HACKATHON RELATED QUESTIONS SECTION
		//User expand hackathon related question tab
		driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[11]/div[1]/h5")).click();
		
		//User explain about values and benefits
		driver.findElement(By.id("ValuesBenefits")).sendKeys("At vero eos et accusamus et iusto odio dignissimos ducimus, qui blanditiis praesentium voluptatum deleniti atque corrupti, quos dolores et quas molestias excepturi sint, obcaecati cupiditate non provident, similique sunt in culpa, qui officia deserunt mollitia animi, id est laborum et dolorum fuga");
		
		//User explain about engagement in commercial activities in ASEAN
		driver.findElement(By.id("CommercialEngagement")).sendKeys("Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio, cumque nihil impedit, quo minus id, quod maxime placeat, facere possimus, omnis voluptas assumenda est, omnis dolor repellendus.");
		
		//User click radiobutton of YES or NO for ready to engage in commercial discussions with Tyme
		//WebElement radioEngage = driver.findElement(By.xpath("//*[@id="CommercialReadyTrue"]"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", radioEngage);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//User if click yes, list countries 
		driver.findElement(By.id("ServiceCountries")).sendKeys("Malaysia, SG");
		
		//URLs SECTION
		//User expand URL's tab
		driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[13]/div[1]/h5")).click();
		
		//User enter URLs (optional)
		driver.findElement(By.id("URLs")).sendKeys("https://www.brank.as");
		
		//SUPPORTING DOCUMENTS SECTION
		//User expand supporting docs tab
		driver.findElement(By.xpath("//*[@id=\"MainForm\"]/div[15]/div[1]/span")).click();
		
		//User upload docs (optional)
		WebElement elem = driver.findElement(By.id("Documents-0"));
		elem.sendKeys("C:\\Users\\fadhi\\Downloads\\samples\\APIX2.0 - Security Feature.pdf");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement elem2 = driver.findElement(By.id("Documents-0"));
		elem2.sendKeys("C:\\Users\\fadhi\\Downloads\\samples\\30_Days_of_API_TestingV2.pdf");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		
		//User clicks go to top link
		driver.findElement(By.xpath("/html/body/main/section/div[2]/div/a")).click();
	}
	
	
	public void submitProposal() {
		//User clicks submit proposal button
		driver.findElement(By.xpath("//*[@id=\"submit-proposal-link\"]/div/div[2]/button")).click();
	}
	
	public void continueLater() {
		//User clicks continue later button
		driver.findElement(By.xpath("//*[@id=\"submit-proposal-link\"]/div/div[1]/button")).click();
	}

	
	//ADMIN INVITE EVALUATOR
	public void adminInviteEvaluator() {
		//Admin enter first name
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/input[2]")).sendKeys("EV");
		
		//Admin enter last name
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/input[3]")).sendKeys("C Tyme UAT");
		
		//Admin select role
		WebElement RoleDropdown = driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[1]/select"));
		Select role = new Select(RoleDropdown);
		role.selectByVisibleText("Evaluator");
		// Administrator / Evaluator
		
		//Admin enter phone number
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/input[4]")).sendKeys("61232131236");
		
		//Admin enter email address
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/input[5]")).sendKeys("fadhilatun.nisa+ct1@brank.as");
		
	}
	
	public void clickInviteUserButton() {
		
		//Admin clicks invite user button
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[3]/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void verifyNotif_invitedUser() {
		String expectedMessage = "Invitation sent.";
		String message = driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[2]")).getText();
		Assert.assertTrue("Error message", message.contains(expectedMessage));
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	//ADMIN INVITE JUDGE
	public void AdminClickHackathonList() {
		//Admin click Hackathon list menu
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[1]/a")).click();
	}
	
	public void AdminClickViewHackathon() {
		//Admin click View link 
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/table/tbody/tr/td[6]/a")).click();
	}
	
	public void InviteJudgeButton_OnList() {
		//Admin click inviteJudge button on list 
		WebElement invite = driver.findElement(By.xpath("/html/body/main/div/div/div/div[2]/a[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", invite);
		
	}
	
	public void fillInviteJudge() {
		//admin enter first name
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/input[2]")).sendKeys("Judge");
		
		//admin enter last name
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/input[3]")).sendKeys("C tyme UAT");
		
		//admin enter phone number
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/input[4]")).sendKeys("6165423112");
		
		//admin enter email address
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/input[5]")).sendKeys("fadhilatun.nisa+ct2@brank.as");
		
		//admin checklist assign problem statement
		WebElement ProbChkBox = driver.findElement(By.xpath("/html/body/main/div/div[2]/form/label[6]/span"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", ProbChkBox);
		
	}
	
	public void inviteJudgeButton_onDetail() {
		//admin clicks invite judge button 
		driver.findElement(By.xpath("/html/body/main/div/div[2]/form/div[2]/button")).click();
		
	}
	
	
	
	//EVALUATOR EVALUATE PROPOSAL
	public void viewProposalDetail() {
		//evaluator clicks view link
		driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/table/tbody/tr[1]/td[6]/a")).click();
		
	}
	
	public void EvaluatorClickEvaluateButton() {
		//evaluator clicks evaluate button
		WebElement evaluate = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", evaluate);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void EvaluatorFillFeedback() {
		//evaluator enter feedback
		//driver.findElement(By.xpath("//*[@id=\"drawer\"]/form/div[1]/textarea")).sendKeys("Auto Feedback reject 1");
		driver.findElement(By.xpath("//*[@id=\"drawer\"]/form/div[1]/textarea")).sendKeys("C TYME PROPOSAL Accepted");
		
		//evaluator clicks radioButton shortlist proposal
		//driver.findElement(By.xpath("//*[@id=\"drawer\"]/form/div[3]/label[2]/span[2]")).click();
		
	}
	
	public void submitEvaluateProp() {
		//evaluator clicks submit button 
		driver.findElement(By.xpath("//*[@id=\"drawer\"]/form/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	//JUDGE EVALUATE PROPOSAL
	public void JudgeClickProposalEvaluation() {
		//judge clicks proposal evaluation sidebar	
		driver.findElement(By.xpath("//*[@id=\"proposal-list\"]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void JudgeCLickViewLink() {
		//judge clicks view link
		WebElement view = driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/table/tbody/tr[1]/td[7]/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", view);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void JudgeClickEvaluateButton() {
		//judge clicks evaluate button
		WebElement evaluate = driver.findElement(By.xpath("/html/body/main/div/div[1]/div/a[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", evaluate);

	}
	
	public void JudgeFillCriteria() {
		//judge clicks radio button to Conflict of Interest (If yes, no fill criteria)
		//driver.findElement(By.xpath("//*[@id=\"conflict-drawer\"]/div[5]/label[1]/span[2]")).click();
		
		//judge clicks submit to fillCriteria
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"conflict-drawer\"]/div[6]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);
		
		//judge fill criteria 1 - select scoring
		WebElement Criteria1Dropdown = driver.findElement(By.id("criteria1-score"));
		Select criteria1 = new Select(Criteria1Dropdown);
		criteria1.selectByVisibleText("4");
		
		//judge fill criteria 1 - comment (optional)
		driver.findElement(By.xpath("//*[@id=\"criteria1-drawer\"]/div[5]/textarea")).sendKeys("C tyme UAT Criteria 1");
		
		//judge clicks next button
		driver.findElement(By.xpath("//*[@id=\"criteria1-drawer\"]/div[6]/button")).click();
		
		//judge fill criteria 2 - select scoring
		WebElement Criteria2Dropdown = driver.findElement(By.id("criteria2-score"));
		Select criteria2 = new Select(Criteria2Dropdown);
		criteria2.selectByVisibleText("2");
		
		//judge fill criteria 2 - comment (optional)
		driver.findElement(By.xpath("//*[@id=\"criteria2-drawer\"]/div[5]/textarea")).sendKeys("C tyme UAT Criteria 2");
		
		//judge clicks next button
		driver.findElement(By.xpath("//*[@id=\"criteria2-drawer\"]/div[6]/button")).click();
		
		
		
		//judge fill criteria 3 - select scoring
		WebElement Criteria3Dropdown = driver.findElement(By.id("criteria3-score"));
		Select criteria3 = new Select(Criteria3Dropdown);
		criteria3.selectByVisibleText("4");
		
		//judge fill criteria 3 - comment (optional)
		driver.findElement(By.xpath("//*[@id=\"criteria3-drawer\"]/div[5]/textarea")).sendKeys("C tyme UAT Criteria 3");
		
		//judge clicks next button
		driver.findElement(By.xpath("//*[@id=\"criteria3-drawer\"]/div[6]/button")).click();
		
				
		
		//judge fill criteria 4 - select scoring
		WebElement Criteria4Dropdown = driver.findElement(By.id("criteria4-score"));
		Select criteria4 = new Select(Criteria4Dropdown);
		criteria4.selectByVisibleText("3");
		
		//judge fill criteria 4 - comment (optional)
		driver.findElement(By.xpath("//*[@id=\"criteria4-drawer\"]/div[5]/textarea")).sendKeys("C tyme UAT Criteria 4");
		
		//judge clicks next button
		driver.findElement(By.xpath("//*[@id=\"criteria4-drawer\"]/div[6]/button")).click();
		
		
		
		
		//judge fill criteria 5 - select scoring
		WebElement Criteria5Dropdown = driver.findElement(By.id("criteria5-score"));
		Select criteria5 = new Select(Criteria5Dropdown);
		criteria5.selectByVisibleText("3");
		
		//judge fill criteria 5 - comment (optional)
		driver.findElement(By.xpath("//*[@id=\"criteria5-drawer\"]/div[5]/textarea")).sendKeys("C tyme UAT Criteria 5");
		
		//judge clicks next button
		driver.findElement(By.xpath("//*[@id=\"criteria5-drawer\"]/div[6]/button")).click();
		
				
		
		
		//judge fill criteria 6 - select scoring
		WebElement Criteria6Dropdown = driver.findElement(By.id("criteria6-score"));
		Select criteria6 = new Select(Criteria6Dropdown);
		criteria6.selectByVisibleText("5");
		
		//judge fill criteria 6 - comment (optional)
		driver.findElement(By.xpath("//*[@id=\"criteria6-drawer\"]/div[5]/textarea")).sendKeys("C tyme UAT Criteria 6");
		
		
		//judge clicks next button
		driver.findElement(By.xpath("//*[@id=\"criteria6-drawer\"]/div[6]/button")).click();
		
		
		
		//judge fill confirmation - comment feedback (optional)
		driver.findElement(By.xpath("//*[@id=\"general-comment\"]")).sendKeys("C tyme UAT Confirmed 1");
		
	
				
		
	}
	
	public void JudgeSubmitEvaluate() {
		//judge clicks submit evaluate proposal
		driver.findElement(By.id("valid-submit")).click();
	}
	
	
	
	//SUBMIT SOLUTION
	public void userMenu() {
		//user clicks usermenu
		driver.findElement(By.xpath("/html/body/header/nav/div/span")).click();
		
		//user clicks my proposals
		driver.findElement(By.xpath("/html/body/header/nav/div/div/ul/li[1]/a")).click();
	}
	
	
	public void submitSolutionLink() {
		//user clicks Submit Solution Link
		driver.findElement(By.xpath("/html/body/main/section/div/div[4]/div[2]/div[2]/div[2]/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void FillSolution() {
		//user enter solution desc
		driver.findElement(By.id("SolutionDescription")).sendKeys("From its medieval origins to the digital era, learn everything there is to know about the ubiquitous lorem ipsum passage.");
		
		//One of URL to solution, URL to video, or video must not be empty.
		//user enter URL to demonstration video
		//driver.findElement(By.id("SolutionVideoURL")).sendKeys("http://www.brank.as/solution1");
		
		//user upload video
		WebElement vid = driver.findElement(By.id("SolutionVideos-0"));
		vid.sendKeys("C:\\Users\\fadhi\\Downloads\\samples\\24 November, 2020 - Loom Recording.mp4");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//user enter URL to solution
		//driver.findElement(By.id("SolutionURL")).sendKeys("http://www.brank.as/solution2");
		
		//user upload  supporting documents
		WebElement doc = driver.findElement(By.id("SolutionDocuments-0"));
		doc.sendKeys("C:\\Users\\fadhi\\Downloads\\samples\\30_Days_of_API_TestingV2.pdf");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//user click go to top link
		driver.findElement(By.xpath("/html/body/main/section/div[1]/div[4]/div/a")).click();
	}
	
	public void ClickSubmitSolutionButton() {
		//user clicks submit solution button
		driver.findElement(By.xpath("/html/body/main/section/div[1]/div[2]/div/div[2]/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	public void SolutionSaveContinueLater() {
		//User enter usermenu button
		driver.findElement(By.xpath("/html/body/main/section/div[1]/div[2]/div/div[1]/button")).click();
		
		
		
	}
	
	
	//JUDGE EVALUATE SOLUTION
		public void JudgeClickSolutionEvaluation() {
			//judge clicks proposal evaluation sidebar	
			driver.findElement(By.xpath("//*[@id=\"solution-list\"]/a/span[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		
		public void JudgeCLickViewLink_OnSol() {
			//judge clicks view link
			driver.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/table/tbody/tr[1]/td[7]/a")).click();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		
		public void EvaluateButton_OnSol() {
			//judge clicks evaluate button on solution
			driver.findElement(By.xpath("/html/body/main/div/div[1]/div/a[2]")).click();
			
		}
		
		public void JudgeFillCriteria_OnSol() {
			//judge clicks radio button to Conflict of Interest (If yes, no fill criteria)
			//driver.findElement(By.xpath("//*[@id=\"conflict-drawer\"]/div[5]/label[1]/span[2]")).click();
			
			//judge clicks submit to fillCriteria
			WebElement submit = driver.findElement(By.xpath("//*[@id=\"conflict-drawer\"]/div[6]/button"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);
			
			//judge fill criteria 1 - select scoring
			WebElement Criteria1Dropdown = driver.findElement(By.id("criteria1-score"));
			Select criteria1 = new Select(Criteria1Dropdown);
			criteria1.selectByVisibleText("4");
			
			//judge fill criteria 1 - comment (optional)
			driver.findElement(By.xpath("//*[@id=\"criteria1-drawer\"]/div[5]/textarea")).sendKeys("C tyme UAT Solution Criteria 1");
			
			//judge clicks next button
			driver.findElement(By.xpath("//*[@id=\"criteria1-drawer\"]/div[6]/div/button")).click();
			
			//judge fill criteria 2 - select scoring
			WebElement Criteria2Dropdown = driver.findElement(By.id("criteria2-score"));
			Select criteria2 = new Select(Criteria2Dropdown);
			criteria2.selectByVisibleText("5");
			
			//judge fill criteria 2 - comment (optional)
			driver.findElement(By.xpath("//*[@id=\"criteria2-drawer\"]/div[5]/textarea")).sendKeys("C tyme UAT Solution Criteria 2");
			
			//judge clicks next button
			driver.findElement(By.xpath("//*[@id=\"criteria2-drawer\"]/div[6]/div/button")).click();
			
			
			
			//judge fill criteria 3 - select scoring
			WebElement Criteria3Dropdown = driver.findElement(By.id("criteria3-score"));
			Select criteria3 = new Select(Criteria3Dropdown);
			criteria3.selectByVisibleText("4");
			
			//judge fill criteria 3 - comment (optional)
			driver.findElement(By.xpath("//*[@id=\"criteria3-drawer\"]/div[5]/textarea")).sendKeys("C tyme UAT Solution Criteria 3");
			
			//judge clicks next button
			driver.findElement(By.xpath("//*[@id=\"criteria3-drawer\"]/div[6]/div/button")).click();
			
					
			
			//judge fill criteria 4 - select scoring
			WebElement Criteria4Dropdown = driver.findElement(By.id("criteria4-score"));
			Select criteria4 = new Select(Criteria4Dropdown);
			criteria4.selectByVisibleText("3");
			
			//judge fill criteria 4 - comment (optional)
			driver.findElement(By.xpath("//*[@id=\"criteria4-drawer\"]/div[5]/textarea")).sendKeys("C tyme UAT Solution Criteria 4");
			
			//judge clicks next button
			driver.findElement(By.xpath("//*[@id=\"criteria4-drawer\"]/div[6]/div/button")).click();
			
			
			//judge fill confirmation - comment feedback (optional)
			driver.findElement(By.id("general-comment")).sendKeys("C tyme UAT Solution Confirmed 1");
			
			
		}
		
		public void JudgeSubmitEvaluateSolution() {
			//judge clicks submit evaluate proposal
			driver.findElement(By.id("valid-submit")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		
		
		//SET NEW PASSWORD FROM EMAIL AS A EVALUATOR
		public void accessGMAIL() {
			String projectPath = System.getProperty("user.dir");
			System.out.println("Project path is: " + projectPath);

			System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

			driver = new ChromeDriver();

			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

			driver.manage().window().maximize();
			driver.get(baseURL2);
				
		}
		
		
		public void loginGmail() {
			String passWord = decodePassword("ZmEwMzEhKSkhKCE=");
			driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("fadhilatun.nisa@brank.as");
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys(passWord);
			driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}
		
		public void clickEmail() {
			//user enter email tyme hackathon
			/*
			 * List<WebElement> gmails =
			 * driver.findElements(By.cssSelector("div.xT>div.y6>span>b")); for(WebElement
			 * gmail : gmails){ if(gmail.getText().indexOf("Tyme Hackathon") != -1){
			 * gmail.click(); break; } }
			 */
			            List<WebElement> unreademail = driver.findElements(By.className("zE"));
			            System.out.println("Total No. of Unread Mails: " + unreademail.size());

			            // real logic starts here
			            for(int i=0;i<unreademail.size();i++){
			           // System.out.println(unreademail.get(i).getText());
			            }
			           unreademail.get(0).click();
			            
			           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			            
			
		}
		
		public void setNewPassword() {
			
		WebElement setClick = driver.findElement(By.cssSelector("//*[@id=\":ud\"]/div/table/tbody/tr/td/div/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/a"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", setClick);
		
	
			 
			String URL = "https://apix:brankasv2@hackathontyme.apix.global";
			driver.get(URL);
			 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			 driver.switchTo().alert().accept();
		
		}
		public void setButton() {
			Actions action= new Actions(driver);
			action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
			    
			//user enter new password
			driver.findElement(By.xpath("//*[@id=\"new-password\"]")).sendKeys("12345678");
			
			//user click reset button
			driver.findElement(By.xpath("//*[@id=\"forgot-password-form\"]/button")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
	
	
	public void logoutButton() {
		//User enter usermenu button
		driver.findElement(By.id("/html/body/header/nav/div/span")).click();
		
		//User enter usermenu button
		driver.findElement(By.id("logout")).click();
		
	}
	
	

	public void endAPIX() {
		driver.close();
		driver.quit();
	}
	
		
	}

	


