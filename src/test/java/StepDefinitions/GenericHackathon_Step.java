package StepDefinitions;

import java.net.MalformedURLException;

import io.cucumber.java.en.*;
import mainAPIX.GenericHackathon_Scenario;

public class GenericHackathon_Step {
	GenericHackathon_Scenario gh = new GenericHackathon_Scenario();
	
	
	//UserRegisterGenericHackathon
	//UserLoginGenericHackathon	
	//submitProposalGenericHackathon
	//submitProposalGenericHackathon
	//submitSolutionGenericHackathon
	//EvaluatorEvaluateProposal
	//JudgeEvaluateProposal
	
	//UserRegisterGenericHackathon
	@Given("user access to generic hackathon to register")
	public void user_access_to_generic_hackathon_to_register() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    gh.createDriver();
	}

	@When("user clicks register button on generic hackathon")
	public void user_clicks_register_button_on_generic_hackathon() {
	    // Write code here that turns the phrase above into concrete actions
	    
		//REGISTER
		gh.registerButtonOnLandingPage();
		
		//LOGIN
		//gh.logintoGH();
	}

	@When("proceed sso register")
	public void proceed_sso_register() {
	    // Write code here that turns the phrase above into concrete actions
		
		//REGISTER
		gh.ssoRegister();
		
		//LOGIN
		//gh.ssoLogin();
		//gh.loginButtonSSO();
		//gh.registerButtonOnLandingPage();
	}

	@And("fill register account on generic hackathon")
	public void fill_register_account_on_generic_hackathon() {
	    // Write code here that turns the phrase above into concrete actions
		
		gh.fillRegisterAccountGH();
		gh.clickNextInStep1();
		//gh.clickCancelInStep1();
		
		//INSTITUTION
		 gh.fillRegisterOrgGH();
	    gh.clickNextInStep2();
	    
		//EDU
	   // gh.fillRegisterOrgGH2();
	    //gh.clickNextEDU2();
	  
	    //gh.clickCancelInStep2();
	    //gh.clickBackToStep1();
	 
	    //INSTITUTION
	   gh.fillRegisterTL();
	    
	    //EDU
	  // gh.fillRegisterTL2();
	    
	}

	@Then("user has been registered on generic hackathon")
	public void user_has_been_registered_on_generic_hackathon() {
	    // Write code here that turns the phrase above into concrete actions
		
		//INSTITUTION
		gh.clickRegisterInStep3();
		
		//EDU
		//gh.clickRegisterEdu3();
		
		
		//gh.clickCancelInStep3();
		//gh.clickBackToStep2();
	    
	}
	
	

	//UserLoginGenericHackathon	
	@Given("user access to generic hackathon to login")
	public void user_access_to_generic_hackathon_to_login() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		gh.createDriver();
	}

	@When("user clicks login button on generic hackathon")
	public void user_clicks_login_button_on_generic_hackathon() {
	    // Write code here that turns the phrase above into concrete actions
	    gh.logintoGH();
	}

	@And("proceed sso login")
	public void proceed_sso_login() {
	    // Write code here that turns the phrase above into concrete actions
	    gh.ssoLogin();
	}

	@Then("user logged in to generic hackathon")
	public void user_logged_in_to_generic_hackathon() {
	    // Write code here that turns the phrase above into concrete actions
	   gh.loginButtonSSO();
	   
	   gh.RegisterFromLanding();
	   gh.fillRegisterAccountGH();
	   gh.clickNextInStep1();
	   gh.fillRegisterOrgGH();
	   gh.clickNextInStep2();
	   gh.fillRegisterTL();
	   gh.clickRegisterInStep3();
	   
	}
	
	
	
	//submitProposalGenericHackathon
	@Given("user access to generic hackathon to submit proposal")
	public void user_access_to_generic_hackathon_to_submit_proposal() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		gh.createDriver();
		gh.logintoGH();
		
		
		gh.ssoLogin();
		gh.loginButtonSSO();
	}

	@When("user clicks submit proposal button on generic hackathon")
	public void user_clicks_submit_proposal_button_on_generic_hackathon() {
	    // Write code here that turns the phrase above into concrete actions
	   // gh.gotoProposalList();
	    //gh.clickSubmitProposalOnProposalList();
		
		gh.submitProposalOnGHLandingPage();
	}

	@And("fill submit proposal form")
	public void fill_submit_proposal_form() {
	    // Write code here that turns the phrase above into concrete actions
		 gh.fillSubmitProposal();
	}

	@Then("new proposal submitted to generic hackathon")
	public void new_proposal_submitted_to_generic_hackathon() {
	    // Write code here that turns the phrase above into concrete actions
		gh.submitProposalButtonOnForm();
	    //gh.continueLaterButtonOnForm();
	}
	
	
	
	//submitSolutionGenericHackathon
	@Given("user access to generic hackathon to submit solution")
	public void user_access_to_generic_hackathon_to_submit_solution() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		gh.createDriver();
		gh.logintoGH();
		
		gh.ssoLogin();
		gh.loginButtonSSO();
	}

	@When("user clicks submit solution button on generic hackathon")
	public void user_clicks_submit_solution_button_on_generic_hackathon() {
	    // Write code here that turns the phrase above into concrete actions
		gh.gotoProposalList();
		gh.submitSolutionOnList();
	}

	@When("fill submit solution form")
	public void fill_submit_solution_form() {
	    // Write code here that turns the phrase above into concrete actions
	   gh.fillSolutionForm();
	}

	@Then("new solution submitted to generic hackathon")
	public void new_solution_submitted_to_generic_hackathon() {
	    // Write code here that turns the phrase above into concrete actions
	    gh.submitSolution();
	    //gh.saveContinueLaterSolution();
	}


	//EvaluatorEvaluateProposal
	@Given("evaluator access to generic hackathon to evaluate proposal")
	public void evaluator_access_to_generic_hackathon_to_evaluate_proposal() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		gh.createDriver();
		gh.loginEv();
		
		//new evaluator approve TOS
		//gh.EvAcceptTos();
		//gh.EvRejectTos();
	}

	@When("evaluator clicks view proposal")
	public void evaluator_clicks_view_proposal() {
	    // Write code here that turns the phrase above into concrete actions
		//gh.searchProp();
		//gh.clickEvaluatorAdministratorOnUserMenu();
		gh.clickViewLinkEv();
	}

	@And("click evaluate")
	public void click_evaluate() {
	    // Write code here that turns the phrase above into concrete actions
	    gh.evEvaluateProp();
	}

	@And("fill submit evaluation form")
	public void fill_submit_evaluation_form() {
	    // Write code here that turns the phrase above into concrete actions
	    gh.evaluatePropForm();
	   	   
	}

	@Then("proposal has been evaluated by evaluator")
	public void proposal_has_been_evaluated_by_evaluator() {
	    // Write code here that turns the phrase above into concrete actions
		// gh.SaveContinueButtonInEvaluatePropForm();
	}

	
	
	//JudgeEvaluateProposal
	@Given("Judge access to generic hackathon to evaluate proposal")
	public void judge_access_to_generic_hackathon_to_evaluate_proposal() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		gh.createDriver();
		gh.loginJd();
		
		// new evaluator approve TOS
		//gh.JdAcceptTos();
		//gh.EvRejectTos();
	}

	@When("Judge clicks view proposal")
	public void judge_clicks_view_proposal() {
	    // Write code here that turns the phrase above into concrete actions
		//gh.searchPropJd();
		gh.clickViewLinkJd();
	}

	@And("click evaluate proposal judge")
	public void click_evaluate_proposal_judge() {
	    // Write code here that turns the phrase above into concrete actions
		 gh.jdEvaluateProp();
	}
	
	@And("fill submit evaluation form judge")
	public void fill_submit_evaluation_form_judge() {
	    // Write code here that turns the phrase above into concrete actions
	    gh.evaluatePropFormJd();
	   	   
	}

	@Then("proposal has been evaluated by Judge")
	public void proposal_has_been_evaluated_by_Judge() {
	    // Write code here that turns the phrase above into concrete actions
		//gh.SaveContinueButtonInEvaluatePropFormJd();
	}



}
	
	