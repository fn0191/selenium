package StepDefinitions;

import java.net.MalformedURLException;

import io.cucumber.java.en.*;
import mainAPIX.tyme_hackathon_scenario1;

public class tyme_hackathon_step {
	tyme_hackathon_scenario1 apx = new tyme_hackathon_scenario1();
	
	
	/*
	 * SCENARIO END TO END: 
	 * 1. Register new participant 
	 * 2. Participant submit proposal 
	 * 3. Admin invite evaluator 
	 * 4. Evaluator evaluate proposal No.2 
	 * 5. Admin invite judge
	 * 6. Judge evaluate proposal No.2 
	 * 7. Participant submit solution 
	 * 8.Judge evaluate solution no. 7
	 */
	

	// 1. REGISTER NEW PARTICIPANT
	@Given("User access to tyme hackathon")
	public void user_access_to_tyme_hackathon() throws MalformedURLException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		apx.createDriver();
	}

	@And("User click register button")
	public void user_click_register_button() {
		// Write code here that turns the phrase above into concrete actions
		apx.registerButton();
	}

	@When("User register to tyme hackathon")
	public void user_register_to_tyme_hackathon() {
		// Write code here that turns the phrase above into concrete actions
		apx.completeRegister_step1();
		apx.completeRegister_step2();
		apx.completeRegister_step3();
		apx.completeRegisterButton();
	}

	@Then("user_created_new_account")
	public void user_created_new_account() {
		// Write code here that turns the phrase above into concrete actions
		apx.verifyNotif();

	}

	@And("logout after registered")
	public void logout_after_registered() {
		// Write code here that turns the phrase above into concrete actions
		//apx.logoutButton();
		apx.endAPIX();
	}

	// COMPLETE REGISTER WITH EXISTING NEW REG ACCOUNT
	@Given("User login with new register account")
	public void user_login_with_new_register_account() throws MalformedURLException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		apx.login_completionReg();
	}

	@When("user clicks register button to continue register")
	public void user_clicks_register_button_to_continue_register() {
		// Write code here that turns the phrase above into concrete actions
		apx.registerButton();
	}

	@And("user clicks all steps register")
	public void user_clicks_all_steps_register() {
		// Write code here that turns the phrase above into concrete actions
		apx.NextIn1stStep();
		apx.completeRegister_step2();
		apx.completeRegister_step3();
	}

	@Then("user completed register")
	public void user_completed_register() {
		// Write code here that turns the phrase above into concrete actions
		apx.completeRegisterButton();
		//apx.verifyNotif();
		//apx.endAPIX();

	}

	
	
	// 2. PARTICIPANT SUBMIT PROPOSAL
	@Given("User access to tyme hackathon to submit proposal")
	public void user_access_to_tyme_hackathon_to_submit_proposal() throws MalformedURLException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		apx.createDriver();
	}

	@And("User login to tyme hackathon")
	public void user_login_to_tyme_hackathon() {
		// Write code here that turns the phrase above into concrete actions
		apx.loginBUtton();
		apx.login_toSubmitProp();
	}

	@When("User click submit proposal button")
	public void user_click_submit_proposal_button() {
		// Write code here that turns the phrase above into concrete actions
		apx.fillProposal();
		apx.submitProposal();
		// apx.continueLater();
	}

	@Then("User has been created new proposal")
	public void user_has_been_created_new_proposal() {
		// Write code here that turns the phrase above into concrete actions

		//apx.endAPIX();
	}
	
	

	// 3. ADMIN INVITE EVALUATOR
	@Given("User login as an admin")
	public void user_login_as_an_admin() throws MalformedURLException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		apx.Login_as_admin();

	}

	@When("admin fill invite user")
	public void admin_fill_invite_user() {
		// Write code here that turns the phrase above into concrete actions
		apx.adminInviteEvaluator();
	}

	@And("clicks invite user button")
	public void clicks_invite_user_button() {
		// Write code here that turns the phrase above into concrete actions
		apx.clickInviteUserButton();
	}

	@Then("new evaluator invited by admin")
	public void new_evaluator_invited_by_admin() {
		// Write code here that turns the phrase above into concrete actions
		apx.verifyNotif_invitedUser();
		//apx.endAPIX();
	}
	
	

	// 4. EVALUATOR EVALUATE PROPOSAL
	@Given("evaluator login to evaluate proposal")
	public void evaluator_login_to_evaluate_proposal() throws MalformedURLException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		//apx.Login_as_evaluator();
		apx.Login_as_NewEv();
	}

	@When("evaluator click any proposal with status in review")
	public void evaluator_click_any_proposal_with_status_in_review() {
		// Write code here that turns the phrase above into concrete actions
		apx.viewProposalDetail();
	}

	@And("click evaluate button")
	public void click_evaluate_button() {
		// Write code here that turns the phrase above into concrete actions
		apx.EvaluatorClickEvaluateButton();
	}

	@And("fill feedback")
	public void fill_feedback() {
		// Write code here that turns the phrase above into concrete actions
		apx.EvaluatorFillFeedback();
	}

	@Then("submit evaluate proposal")
	public void submit_evaluate_proposal() {
		// Write code here that turns the phrase above into concrete actions
		apx.submitEvaluateProp();
		//apx.endAPIX();
	}
	
	

	// 5. ADMIN INVITE JUDGE
	@Given("User login as an admin to invite judge")
	public void user_login_as_an_admin_to_invite_judge() throws MalformedURLException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		apx.Login_as_admin();
	}

	@When("admin click hackathon list")
	public void admin_click_hackathon_list() {
		// Write code here that turns the phrase above into concrete actions
		apx.AdminClickHackathonList();
	}

	@And("view hackathon detail")
	public void view_hackathon_detail() {
		// Write code here that turns the phrase above into concrete actions
		apx.AdminClickViewHackathon();
	}

	@And("invite judge")
	public void invite_judge() {
		// Write code here that turns the phrase above into concrete actions
		apx.InviteJudgeButton_OnList();
	}

	@Then("admin fill invite judge")
	public void admin_fill_invite_judge() {
		// Write code here that turns the phrase above into concrete actions
		apx.fillInviteJudge();
	}

	@And("new judge created")
	public void new_judge_created() {
		// Write code here that turns the phrase above into concrete actions
		apx.inviteJudgeButton_onDetail();
		//apx.endAPIX();
	}

	// 6.JUDGE EVALUATE PROPOSAL
	@Given("User login as a Judge to evaluate proposal")
	public void user_login_as_a_Judge_to_evaluate_proposal() throws MalformedURLException, InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		//apx.Login_as_judge();
		apx.Login_as_NewJudge();
	}

	@When("judge click any proposal with status in shortlisted")
	public void judge_click_any_proposal_with_status_in_shortlisted() {
		// Write code here that turns the phrase above into concrete actions
		apx.JudgeClickProposalEvaluation();
		apx.JudgeCLickViewLink();
	}
	
	@And("judge click evaluate button")
	public void judge_click_evaluate_button() {
		// Write code here that turns the phrase above into concrete actions
		apx.JudgeClickEvaluateButton();
	}

	@And("fillCriteria")
	public void fillcriteria() {
		// Write code here that turns the phrase above into concrete actions
		apx.JudgeFillCriteria();
		
	}

	@Then("judge submit evaluate proposal")
	public void judge_submit_evaluate_proposal() {
		// Write code here that turns the phrase above into concrete actions
		apx.JudgeSubmitEvaluate();
		//apx.endAPIX();
	}
	
	
	//7. PARTICIPANT SUBMIT SOLUTION
	@Given("User login to tyme Hackathon to submit solution")
	public void user_login_to_tyme_Hackathon_to_submit_solution() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		apx.login_toSubmitSol();
	}

	@When("user clicks my proposals in usermenu")
	public void user_clicks_my_proposal_in_usermenu() {
	    // Write code here that turns the phrase above into concrete actions
		apx.userMenu();
	}

	@And("user submit solution")
	public void user_submit_solution() {
	    // Write code here that turns the phrase above into concrete actions
	    apx.submitSolutionLink();
	}

	@And("fill solution")
	public void fill_solution() {
	    // Write code here that turns the phrase above into concrete actions
	    apx.FillSolution();
	}

	@Then("solution has been submitted")
	public void solution_has_been_submitted() {
	    // Write code here that turns the phrase above into concrete actions
	   apx.ClickSubmitSolutionButton();
	   //apx.SolutionSaveContinueLater();
	   //apx.endAPIX();
	}

	
	//8. JUDGE EVALUATE SOLUTION
	@Given("user login as a Judge to evaluate solution")
	public void user_login_as_a_Judge_to_evaluate_solution() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		apx.Login_as_judge();
		//apx.Login_as_NewJudge();
	}

	@When("judge click solution evaluation")
	public void judge_click_solution_evaluation() {
	    // Write code here that turns the phrase above into concrete actions
		//apx.JudgeClickSolutionEvaluation();
		  apx.JudgeCLickViewLink_OnSol();
	}

	@And("click any solution with status in review")
	public void click_any_solution_with_status_in_review() {
	    // Write code here that turns the phrase above into concrete actions
	 
	   apx.EvaluateButton_OnSol();
	   
	}
	

	@And("Solution fillCriteria")
	public void solution_fillCriteria() {
	    // Write code here that turns the phrase above into concrete actions
	   apx.JudgeFillCriteria_OnSol();
	}

	@Then("judge submit evaluate solution")
	public void judge_submit_evaluate_solution() {
	    // Write code here that turns the phrase above into concrete actions
		apx.JudgeSubmitEvaluateSolution();
		//apx.endAPIX();
	}



	
	
	//8.EVALUATOR SET NEW PASSWORD
		@Given("evaluator access gmail")
		public void evaluator_access_gmail() {
		    // Write code here that turns the phrase above into concrete actions
			apx.accessGMAIL();
		}

		@When("login gmail")
		public void login_gmail() {
		    // Write code here that turns the phrase above into concrete actions
			apx.loginGmail();
			apx.clickEmail();
			
			
		}
		

		@And("click reset button in gmail")
		public void click_reset_button_in_gmail() {
		    // Write code here that turns the phrase above into concrete actions
			apx.setNewPassword();
		}

		@Then("click reset password button in set new password page evaluator set new password")
		public void click_reset_password_button_in_set_new_password_page_evaluator_set_new_password() {
		  apx.setButton();
			
			
		}
	

}
