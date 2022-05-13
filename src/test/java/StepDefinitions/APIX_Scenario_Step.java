package StepDefinitions;

import java.net.MalformedURLException;

import mainAPIX.APIX_Scenario1;

import io.cucumber.java.en.*;

public class APIX_Scenario_Step {
	APIX_Scenario1 apx = new APIX_Scenario1();

	// SCENARIO:
	// 1 PARTICIPANT REGISTER VIA EMAIL for FI
	// 2. PARTICIPANT REGISTER VIA GOOGLE
	// 3. PARTICIPANT REGISTER VIA GITHUB
	// 4. PARTICIPANT ONBOARD ORG FI/CB
	// 5. PARTICIPANT ONBOARD ORG FT/SI
	// 6. PARTICIPANT ONBOARD API
	// 7. PARTICIPANT ONBOARD Solution
	// 8. PARTICIPANT ONBOARD Problem Statement
	
	 //9. PARTICIPANT INVITE ANOTHER USER THROUGH USER MANAGEMENT

	// 1.1 PARTICIPANT REGISTER VIA EMAIL for FI
	@Given("user is on apix page to reg via email FI")
	public void user_is_on_apix_page_to_reg_via_email_FI() throws MalformedURLException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		apx.createDriver();
	}

	@When("user clicks Get Started button to reg via email FI")
	public void user_clicks_Get_Started_button_to_reg_via_email_FI() {
		// Write code here that turns the phrase above into concrete actions
		apx.GetStartedButton();
	}

	@And("register via EMAIL FI")
	public void register_via_EMAIL_FI() {
		// Write code here that turns the phrase above into concrete actions
		apx.RegisterViaEmail();
	}

	@Then("it navigated user to apix landing page FI")
	public void it_navigated_user_to_apix_landing_page_FI() {
		// Write code here that turns the phrase above into concrete actions
		apx.afterClickRegButton();
	}
	
	
	
	// 2. PARTICIPANT REGISTER VIA GOOGLE
	@Given("user access to apix register page")
	public void user_access_to_apix_register_page() throws MalformedURLException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.GetStartedButton();
	}

	@When("user click continue with Google button")
	public void user_click_continue_with_Google_button() {
		// Write code here that turns the phrase above into concrete actions
		apx.RegisterViaGMAIL();
		apx.EnterToGMAIL();
	}

	@Then("user registered to apix via google")
	public void user_registered_to_apix_via_google() {
		// Write code here that turns the phrase above into concrete actions
		apx.afterClickContinueGmailButton();
	}
	
	
	
	// 3. PARTICIPANT REGISTER VIA GITHUB
	@Given("user access to apix using github")
	public void user_access_to_apix_using_github() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.GetStartedButton();
	}

	@When("user access GITHUB")
	public void user_access_GITHUB() {
	    // Write code here that turns the phrase above into concrete actions
	    apx.RegisterViaGithub();
	    apx.EnterToGithub();
	}

	@Then("user registered to apix via github")
	public void user_registered_to_apix_via_github() {
	    // Write code here that turns the phrase above into concrete actions
	    apx.continueGithub();
	}
	
	
	// 4. PARTICIPANT ONBOARD ORG FI/CB
	@Given("user is on apix to login")
	public void user_is_on_apix_to_login() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		
		
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		apx.PreLogin();
	}

	@And("login via email")
	public void login_via_email() {
	    // Write code here that turns the phrase above into concrete actions
		//apx.LoginFI();
		
		
		apx.RegisterFromLoginPage();
		apx.RegisterViaEmail();
		apx.afterClickRegButton();
	}

	@And("user completing steps onboard org")
	public void user_completing_steps_onboard_org() {
	    // Write code here that turns the phrase above into concrete actions
		apx.CompleteRegister();
		
		apx.AccountInfoTab();
		apx.clickNextInfo();
		
		apx.OrgInfo1Tab();
		//apx.clickNextOrg1();
		
		apx.OrgInfo2Tab();
		apx.clickNextOrgInfo2();
		
		
		apx.PreviewTab();
		apx.nextPreview();
		
		apx.choosePaymentPlan_FI();
		apx.PaymentPlanTab();
	
	}

	@Then("it navigated user to complete page")
	public void it_navigated_user_to_complete_page() {
	    // Write code here that turns the phrase above into concrete actions
		apx.CompleteRegButton();
	}

	
	
	//5. PARTICIPANT ONBOARD ORG FT/SI
	@Given("user access to APIX to onboard org FT")
	public void user_access_to_APIX_to_onboard_org_FT() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		
		apx.PreLogin();
		//apx.LoginFT();
		
		apx.RegisterFromLoginPage();
		//apx.GetStartedButton(); //register email for FT
		apx.RegisterViaEmail2();
		apx.afterClickRegButton();
		
		
	}

	@And("user completing steps onboard org FT")
	public void user_completing_steps_onboard_org_FT() {
	    // Write code here that turns the phrase above into concrete actions
		apx.CompleteRegister();
		
		apx.AccountInfoTab();
		apx.clickNextInfo();
		
		apx.OrgInfo12Tab();
		//apx.clickNextOrg1();
		apx.OrgInfo22Tab();
		apx.clickNextOrgInfo2();
		
		apx.investmentInfoTab();
		apx.clickNextInInvestmentTab();
		
		apx.PreviewTab();
		apx.nextPreview();
		
		apx.choosePaymentPlan();
		apx.PaymentPlanTab();
	
	}
	

	@Then("it navigated user to complete{int} page")
	public void it_navigated_user_to_complete_page(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		apx.CompleteRegButton();
	}


	
	
	
	
	
	
	// // 6. PARTICIPANT ONBOARD API
	@Given("user access apix to onboard API")
	public void user_access_apix_to_onboard_API() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.PreLogin();
		apx.LoginToCreateAPI();
		
	}

	@When("user click API link")
	public void user_click_API_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //apx.goToAPI();
	    apx.viewAllAPI_New();
	   // apx.viewAllAPI();
	}

	@And("user click Onboard API button")
	public void user_click_Onboard_API_button() {
	    // Write code here that turns the phrase above into concrete actions
	   apx.OnboardAPI();
	}

	@And("user completing steps onboard API")
	public void user_completing_steps_onboard_API() {
	    // Write code here that turns the phrase above into concrete actions
	   apx.Complete_GeneralInfoTab_FIOther();
	   //apx.Complete_GeneralInfoTab_FTSI();
	   apx.nextAPItab1();
	   
	   apx.Complete_TechnicalInfoTab();
	   apx.nextAPItab2();
	   
	   apx.nextAPItab22();
	   
	   apx.Complete_PrivSecTab();
	   apx.nextAPItab3();
	   
	   apx.Complete_AgreementTab();
	   apx.previewButton();
	   
	   
	}

	@Then("it navigated user to API list page")
	public void it_navigated_user_to_API_list_page() {
	    // Write code here that turns the phrase above into concrete actions
		apx.PublishYourAPIButton();
		//apx.ContinueLaterAPIButton();
		
		//result it goes to landing page(marketplace)
		
		
	}


	//7. PARTICIPANT ONBOARD Solution
	@Given("user access apix to onboard Solution")
	public void user_access_apix_to_onboard_Solution() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.PreLogin();
		apx.LoginToCreateAPI();
	}

	@When("user click Solution link")
	public void user_click_Solution_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // apx.goToSol();
		apx.viewAllSolution();
		
	}

	@When("user click Onboard Solution button")
	public void user_click_Onboard_Solution_button() {
	    // Write code here that turns the phrase above into concrete actions
		apx.OnboardSol();
	}

	@When("user completing steps onboard Solution")
	public void user_completing_steps_onboard_Solution() {
	    // Write code here that turns the phrase above into concrete actions
	   apx.GenInfoSolTab_FIOther();
	   //apx.GenInfoSolTab_FTSI();
	   apx.nextGenInfoSolTab();
	   //apx.ContinueLaterGenInfoSolTab(); //continue later
	   //apx.CancelGenInfoSolTab(); //cancel link
	   
	   apx.SolInfoTab();
	   apx.nextSolInfoTab();
	   //apx.ContinueLaterSolInfoTab();
	   //apx.backSolInfoTab();
	   
	   apx.APIsTab();
	   apx.nextAPIsTab();
	  // apx.ContinueLaterAPIButton();
	  // apx.backAPIsTab();
	   
	   apx.agreementSolTab();
	   apx.previewAgreementSolTab();
	   //apx.ContinueLateragreementSolTab();
	   //apx.backagreementSolTab();
	   
	}

	@Then("it navigated user to Solution list page")
	public void it_navigated_user_to_Solution_list_page() {
	    // Write code here that turns the phrase above into concrete actions
			apx.PreviewScreen();
		   //apx.ContinueLaterPreviewScreen();
		   //apx.backPreviewScreen();
	}


	//8. PARTICIPANT ONBOARD Problem Statement
	@Given("user access apix to onboard Problem")
	public void user_access_apix_to_onboard_Problem() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.PreLogin();
		apx.LoginToCreateAPI();
	}

	@When("user click Problem link")
	public void user_click_Problem_link() {
	    // Write code here that turns the phrase above into concrete actions
	   // apx.goToProb();
		apx.viewAllProblem();
		
	}

	@When("user click Onboard Problem button")
	public void user_click_Onboard_Problem_button() {
	    // Write code here that turns the phrase above into concrete actions
		apx.OnboardProb();
	}

	@When("user completing steps onboard Problem")
	public void user_completing_steps_onboard_Problem() {
	    // Write code here that turns the phrase above into concrete actions
		apx.probStatForm();
		apx.NextProbStatForm();
		//apx.ContinueLaterProbStatForm();
		//apx.CancelProbStatForm();
		  
	   
	}

	@Then("it navigated user to Problem list page")
	public void it_navigated_user_to_Problem_list_page() {
	    // Write code here that turns the phrase above into concrete actions
		//apx.publishProblem();
		apx.ContinueLaterpublishProblem();
		//apx.BackPublishProblem();
	}
	
	
	
	 //9. PARTICIPANT INVITE ANOTHER USER THROUGH USER MANAGEMENT
	@Given("admin access to user management page")
	public void admin_access_to_user_management_page() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.PreLogin();
		apx.LoginFI();

		apx.userManagement();
	}
	
	@When("admin invite user")
	public void admin_invite_user() {
		// Write code here that turns the phrase above into concrete actions
		apx.inviteTeamMember();
		apx.inviteUsrMgmt();
		
	}	
	@Then("admin sent invitation to user")
	public void admin_sent_nvitation_to_user() {
		// Write code here that turns the phrase above into concrete actions
		apx.sendInvite();
	}	
	
	
	//10. Host Hackathon Non Member
	@Given("user access to host member url")
	public void user_access_to_host_member_url() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriverNonMember();
	}

	@When("user fill the host hackathon form")
	public void user_fill_the_host_hackathon_form() {
	    // Write code here that turns the phrase above into concrete actions
	    apx.CreateNewHackathonNonMember();
	}

	@Then("host hackathon has been created")
	public void host_hackathon_has_been_created() {
	    // Write code here that turns the phrase above into concrete actions
	   // apx.SubmitButton_CreateHackathonNonMbr();
		//apx.CancelButton_CreateHackathonNonMbr();
	}


	
}