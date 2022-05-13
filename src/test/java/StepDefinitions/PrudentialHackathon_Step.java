package StepDefinitions;

import java.net.MalformedURLException;

import io.cucumber.java.en.*;
import mainAPIX.PrudentialHackathon_Scenario1;

public class PrudentialHackathon_Step {
	PrudentialHackathon_Scenario1 apx = new PrudentialHackathon_Scenario1();
	
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
	
//1. Register new participant 
	@Given("User Prud access to Prudential hackathon")
	public void user_Prud_access_to_Prudential_hackathon() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    apx.createDriver();
	}

	@And("User Prud click register button")
	public void user_Prud_click_register_button() {
	    // Write code here that turns the phrase above into concrete actions
		apx.registerButton();
	}

	@When("User Prud register to prud hackathon")
	public void user_Prud_register_to_prud_hackathon() {
	    // Write code here that turns the phrase above into concrete actions
		apx.completeRegister_step1();
		apx.completeRegister_step2();
		apx.schoolSection();
		apx.next2Button();
		apx.completeRegister_step3();
		apx.completeRegisterButton();
	}

	@Then("user_Prud created_new_account")
	public void user_prud_created_new_account() {
	    // Write code here that turns the phrase above into concrete actions
		apx.verifyNotif();
	}

	
	
	
	
//1.1 Register new exist participant  
	@Given("User Prud login with new register account")
	public void user_Prud_login_with_new_register_account() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		apx.login_completionReg();
	}

	@When("user Prud clicks register button to continue register")
	public void user_Prud_clicks_register_button_to_continue_register() {
	    // Write code here that turns the phrase above into concrete actions
		apx.registerButton();
	}

	@And("user Prud clicks all steps register")
	public void user_Prud_clicks_all_steps_register() {
	    // Write code here that turns the phrase above into concrete actions
		apx.NextIn1stStep();
		apx.schoolSection();
		apx.completeRegister_step2();
		apx.next2Button();
		apx.completeRegister_step3();
		apx.completeRegisterButton();
	}

	@Then("user Prud completed register")
	public void user_Prud_completed_register() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	
	
	
//2. Participant submit proposal  
	@Given("User access to prudential hackathon to submit proposal")
	public void user_access_to_prudential_hackathon_to_submit_proposal() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
	}

	@And("User Prud login to Prudential hackathon")
	public void user_Prud_login_to_Prudential_hackathon() {
	    // Write code here that turns the phrase above into concrete actions
		apx.loginBUtton();
		apx.login_toSubmitProp();
	}

	@When("User Prud click submit proposal button")
	public void user_Prud_click_submit_proposal_button() {
	    // Write code here that turns the phrase above into concrete actions
		apx.fillProposal();
		apx.submitProposal();
		//apx.continueLater();
	}

	@Then("User Prud has been created new proposal")
	public void user_Prud_has_been_created_new_proposal() {
	    // Write code here that turns the phrase above into concrete actions
		//apx.endAPIX();
	}
	

//3. Admin invite evaluator 
	@Given("User login as an admin Prud")
	public void user_login_as_an_admin_Prud() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		apx.Login_as_admin();
	}

	@When("admin fill invite user Prud")
	public void admin_fill_invite_user_Prud() {
	    // Write code here that turns the phrase above into concrete actions
		apx.adminInviteEvaluator();
	}

	@And("admin Prud clicks invite user button")
	public void admin_Prud_clicks_invite_user_button() {
	    // Write code here that turns the phrase above into concrete actions
		apx.clickInviteUserButton();
	}

	@Then("new evaluator Prud invited by admin")
	public void new_evaluator_Prud_invited_by_admin() {
	    // Write code here that turns the phrase above into concrete actions
		apx.verifyNotif_invitedUser();
		//apx.endAPIX();
	}
	
	
// 4. Evaluator evaluate proposal No.2 
	@Given("evaluator Prud, login to evaluate proposal")
	public void evaluator_Prud_login_to_evaluate_proposal() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		apx.Login_as_evaluator();
		//apx.Login_as_NewEv();
	}

	@When("evaluator Prud,click any proposal with status in review")
	public void evaluator_Prud_click_any_proposal_with_status_in_review() {
	    // Write code here that turns the phrase above into concrete actions
		apx.viewProposalDetail();
	}

	@When("evaluator Prud click evaluate button")
	public void evaluator_Prud_click_evaluate_button() {
	    // Write code here that turns the phrase above into concrete actions
		apx.EvaluatorClickEvaluateButton();
	}

	@When("fill feedback Prud")
	public void fill_feedback_Prud() {
	    // Write code here that turns the phrase above into concrete actions
		apx.EvaluatorFillFeedback();
	}

	@Then("evaluator Prud submit evaluate proposal")
	public void evaluator_Prud_submit_evaluate_proposal() {
	    // Write code here that turns the phrase above into concrete actions
		apx.submitEvaluateProp();
		//apx.endAPIX();
	}
	
	
//5. Admin invite judge
	@Given("User login as an admin to invite judge Prud")
	public void user_login_as_an_admin_to_invite_judge_Prud() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		apx.Login_as_admin();
	}

	@When("admin Prud click hackathon list")
	public void admin_Prud_click_hackathon_list() {
	    // Write code here that turns the phrase above into concrete actions
		apx.AdminClickHackathonList();
	}

	@And("view Prud hackathon detail")
	public void view_Prud_hackathon_detail() {
	    // Write code here that turns the phrase above into concrete actions
		apx.AdminClickViewHackathon();
	}

	@And("invite judge Prud")
	public void invite_judge_Prud() {
	    // Write code here that turns the phrase above into concrete actions
		apx.InviteJudgeButton_OnList();
	}

	@Then("admin fill invite judge Prud")
	public void admin_fill_invite_judge_Prud() {
	    // Write code here that turns the phrase above into concrete actions
		apx.fillInviteJudge();
	}

	@And("new judge Prud created")
	public void new_judge_Prud_created() {
	    // Write code here that turns the phrase above into concrete actions
		apx.inviteJudgeButton_onDetail();
		//apx.endAPIX();
	}
	
	
//6. Judge evaluate proposal No.2 
	@Given("User login as a Judge Prud to evaluate proposal")
	public void user_login_as_a_Judge_Prud_to_evaluate_proposal() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		apx.Login_as_judge();
		//apx.Login_as_NewJudge();
	}
	

	@When("judge Prud click any proposal with status in shortlisted")
	public void judge_Prud_click_any_proposal_with_status_in_shortlisted() {
	    // Write code here that turns the phrase above into concrete actions
		apx.JudgeClickProposalEvaluation();
		apx.JudgeCLickViewLink();
	}

	@And("judge Prud click evaluate button")
	public void judge_Prud_click_evaluate_button() {
	    // Write code here that turns the phrase above into concrete actions
		apx.JudgeClickEvaluateButton();
	}

	@And("fillCriteria Prud")
	public void fillcriteria_Prud() {
	    // Write code here that turns the phrase above into concrete actions
		apx.JudgeFillCriteria();
	}

	@Then("judge Prud submit evaluate proposal")
	public void judge_Prud_submit_evaluate_proposal() {
	    // Write code here that turns the phrase above into concrete actions
		apx.JudgeSubmitEvaluate();
		//apx.endAPIX();
	}
	
	
// 7. Participant submit solution 
	@Given("User login to Prud Hackathon to submit solution")
	public void user_login_to_Prud_Hackathon_to_submit_solution() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		apx.login_toSubmitSol();
	}

	@When("user Prud clicks my proposals in usermenu")
	public void user_Prud_clicks_my_proposals_in_usermenu() {
	    // Write code here that turns the phrase above into concrete actions
		apx.userMenu();
	}

	@And("user Prud submit solution")
	public void user_Prud_submit_solution() {
	    // Write code here that turns the phrase above into concrete actions
		 apx.submitSolutionLink();
	}

	@And("fill solution Prud")
	public void fill_solution_Prud() {
	    // Write code here that turns the phrase above into concrete actions
		 apx.FillSolution();
	}

	@Then("solution Prud has been submitted")
	public void solution_Prud_has_been_submitted() {
	    // Write code here that turns the phrase above into concrete actions
		apx.ClickSubmitSolutionButton();
		   //apx.SolutionSaveContinueLater();
		   //apx.endAPIX();
	}
	
	
//8.Judge evaluate solution no. 7
	@Given("user login as a Judge Prud to evaluate solution")
	public void user_login_as_a_Judge_Prud_to_evaluate_solution() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apx.createDriver();
		apx.loginBUtton();
		apx.Login_as_judge();
		//apx.Login_as_NewJudge();
	}

	@When("judge Prud click solution evaluation")
	public void judge_Prud_click_solution_evaluation() {
	    // Write code here that turns the phrase above into concrete actions
		  apx.JudgeCLickViewLink_OnSol();
	}

	@And("click any solution Prud with status in review")
	public void click_any_solution_Prud_with_status_in_review() {
	    // Write code here that turns the phrase above into concrete actions
		apx.EvaluateButton_OnSol();
	}

	@And("Solution Prud fillCriteria")
	public void solution_Prud_fillCriteria() {
	    // Write code here that turns the phrase above into concrete actions
		apx.JudgeFillCriteria_OnSol();
	}

	@Then("judge Prud submit evaluate solution")
	public void judge_Prud_submit_evaluate_solution() {
	    // Write code here that turns the phrase above into concrete actions
		apx.JudgeSubmitEvaluateSolution();
		//apx.endAPIX();
	}



}
