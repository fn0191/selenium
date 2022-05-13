package StepDefinitions;

import java.net.MalformedURLException;

import io.cucumber.java.en.*;
import mainAPIX.HackathonAdmin_Scenario;

public class HackathonAdmin_Step {
	HackathonAdmin_Scenario ah = new HackathonAdmin_Scenario();
	//SCENARIO
	// 1. Admin create hackathon
	// 2. Admin update draft info
	// 3. Admin add new problem statement
	// 4. Admin add new submit proposal custom question
	//4.1 Admin add new submit solution custom question
	// 5. Admin add criteria
	// 6. Admin edit Term & conditions
	// 7. Admin invite admin role
	// 8. Admin invite evaluator role
	// 9. Admin invite judge role
	
	//Admin create hackathon
	@Given("admin is on hackathon list page to create hackathon")
	public void admin_is_on_hackathon_list_page_to_create_hackathon() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   ah.createDriver();
	   ah.login();
	}

	@When("admin clicks add hackathon button")
	public void admin_clicks_add_hackathon_button() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.addHackathonButtonOnList();
	}

	@When("create hackathon")
	public void create_hackathon() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.CreateNewHackathonForm();
	}

	@Then("it created new hackathon")
	public void it_created_new_hackathon() {
	    // Write code here that turns the phrase above into concrete actions
	  ah.SubmitButton_CreateHackathon();
	  ah.gotohackathonpopup();
	}



	//Admin update draft info	
	@Given("admin is on hackathon list page to update draft info")
	public void admin_is_on_hackathon_list_page_to_update_draft_info() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 ah.createDriver();
		 ah.login();
		 ah.searchHackathonOnHackathonList();
		 //ah.sortByRecentlyAdded();
	}

	@When("admin clicks update link")
	public void admin_clicks_update_link() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.updateLink();
	}

	@When("fill draft info form")
	public void fill_draft_info_form() {
	    // Write code here that turns the phrase above into concrete actions
		ah.filldraftform();
	}

	@Then("it updated draft info")
	public void it_updated_draft_info() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.saveInformationDraftButton();	}

	

	//Admin add new problem statement
	@Given("admin is on hackathon list page to update draft problem statement")
	public void admin_is_on_hackathon_list_page_to_update_draft_problem_statement() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ah.createDriver();
		ah.login();
		//ah.sortByRecentlyAdded();
		ah.searchHackathonOnHackathonList();
	}

	@When("admin clicks update link with problem statement tab")
	public void admin_clicks_update_link_with_problem_statement_tab() {
	    // Write code here that turns the phrase above into concrete actions
		 //ah.updateLink();
		 ah.viewLink();
		 ah.probstatTab();
	}

	@And("add new problem statement")
	public void add_new_problem_statement() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.probStatLink();
	}

	@And("fill the probstat form")
	public void fill_the_probstat_form() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.probStatForm_Ins();
	    //ah.probStatForm_Edu();
	}

	@Then("added new problem statement")
	public void added_new_problem_statement() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.saveInformationProbStatButton();
	    //ah.cancelInformationProbStatButton();
	}
	
	//Admin add new submit proposal custom question
	@Given("admin is on hackathon list page to update draft custom question")
	public void admin_is_on_hackathon_list_page_to_update_draft_custom_question() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ah.createDriver();
		ah.login();
		ah.searchHackathonOnHackathonList();
		//ah.sortByRecentlyAdded();
	}

	@When("admin clicks update link with submit proposal question tab")
	public void admin_clicks_update_link_with_submit_proposal_question_tab() {
	    // Write code here that turns the phrase above into concrete actions
		 ah.updateLink();
		// ah.viewLink();
		 ah.customQTab();
	}

	@And("add new custom question")
	public void add_new_custom_question() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.customQLink();
	}

	@And("fill the custom question form")
	public void fill_the_custom_question_form() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.customQForm();
	}

	@Then("added new custom question")
	public void added_new_custom_question() {
	    // Write code here that turns the phrase above into concrete actions
	   ah.saveInformationCustomQButton();
	   //ah.cancelInformationCustomQButton();
	}


	//new submit solution custom question
	@Given("admin is on hackathon list page to update solution custom question")
	public void admin_is_on_hackathon_list_page_to_update_solution_custom_question() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ah.createDriver();
		ah.login();
		ah.searchHackathonOnHackathonList();
		//ah.sortByRecentlyAdded();
	}

	@When("admin clicks update link with submit solution question tab")
	public void admin_clicks_update_link_with_submit_solution_question_tab() {
	    // Write code here that turns the phrase above into concrete actions
		 ah.updateLink();
			// ah.viewLink();
			 ah.customSolQTab();
	}

	@And("add new solution custom question")
	public void add_new_solution_custom_question() {
	    // Write code here that turns the phrase above into concrete actions
		 ah.customSolQLink();
	}

	@And("fill the solution custom question form")
	public void fill_the_solution_custom_question_form() {
	    // Write code here that turns the phrase above into concrete actions
		ah.customQForm();
	}

	@Then("added new solution custom question")
	public void added_new_solution_custom_question() {
	    // Write code here that turns the phrase above into concrete actions
		 ah.saveInformationCustomQButton();
		   //ah.cancelInformationCustomQButton();
	}


	
	//Admin add criteria
	@Given("admin is on hackathon list page to update draft criteria")
	public void admin_is_on_hackathon_list_page_to_update_draft_criteria() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ah.createDriver();
		ah.login();
		ah.searchHackathonOnHackathonList();
		//ah.sortByRecentlyAdded();
	}

	@When("admin clicks update link with criteria tab")
	public void admin_clicks_update_link_with_criteria_tab() {
	    // Write code here that turns the phrase above into concrete actions
		 ah.updateLink();
		 //ah.viewLink();
		 ah.criteriaTab();
	}

	@And("add new criteria")
	public void add_new_criteria() {
	    // Write code here that turns the phrase above into concrete actions
		ah.criteriaLink();
	}

	@And("fill the criteria form")
	public void fill_the_criteria_form() {
	    // Write code here that turns the phrase above into concrete actions
		 ah.criteriaForm();
	}

	@Then("added new criteria")
	public void added_new_criteria() {
	    // Write code here that turns the phrase above into concrete actions
		 ah.saveInformationCriteriaButton();
		   //ah.cancelInformationcriteriaButton();
		 
		 //others criteria
		 ah.judgecriteriatab();
		 ah.criteriaLink();
		 ah.criteriaForm();
		 ah.saveInformationCriteriaButton();
		 
		//others criteria2
		 ah.judgesolutioncriteriatab();
		 ah.criteriaLink();
		 ah.criteriaForm();
		 ah.saveInformationCriteriaButton();
	}
	
	//Admin edit Term & conditions
	@Given("admin is on hackathon list page to update draft tnc")
	public void admin_is_on_hackathon_list_page_to_update_draft_tnc() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ah.createDriver();
		ah.login();
		ah.searchHackathonOnHackathonList();
		//ah.sortByRecentlyAdded();
	}

	@When("admin clicks update link with tnc tab")
	public void admin_clicks_update_link_with_tnc_tab() {
	    // Write code here that turns the phrase above into concrete actions
		ah.updateLink();
		//ah.viewLink();
		 ah.tncTab();
	}

	@And("add new tnc")
	public void add_new_tnc() {
	    // Write code here that turns the phrase above into concrete actions
		ah.tncLink();
	}

	@And("fill the tnc form")
	public void fill_the_tnc_form() {
	    // Write code here that turns the phrase above into concrete actions
		ah.tncForm();
	}

	@Then("added new tnc")
	public void added_new_tnc() {
	    // Write code here that turns the phrase above into concrete actions
		ah.saveInformationTncButton();
		   //ah.cancelInformationTncButton();
		
	}
	@Then("added new tnc judge")
	public void added_new_tnc_judge() {
		ah.tncJudege();
		//ah.cancelInformationTncButtonForJudge();
		
		ah.SubmitForApproval();
	}
	

	
	
	
	
	
	//Admin invite admin role
	@Given("admin login to admin page to invite admin")
	public void admin_login_to_admin_page_to_invite_admin() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ah.createDriver();
		ah.login();
	}

	@When("admin access user management to invite admin")
	public void admin_access_user_management_to_invite_admin() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.userManagement();
	}

	@And("Fill the invite user form role admin")
	public void fill_the_invite_user_form_role_admin() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.inviteAdmin();
	}

	@Then("admin user invited")
	public void admin_user_invited() {
	    // Write code here that turns the phrase above into concrete actions
		 ah.inviteButton();
		    //ah.cancelLinkOnInvite();
	}

	
	
	//Admin invite evaluator role
	@Given("admin login to admin page to invite evaluator")
	public void admin_login_to_admin_page_to_invite_evaluator() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ah.createDriver();
		ah.login();
	}

	@When("admin access user management to invite evaluator")
	public void admin_access_user_management_to_invite_evaluator() {
	    // Write code here that turns the phrase above into concrete actions
		ah.userManagement();
	}

	@And("Fill the invite user form role evaluator")
	public void fill_the_invite_user_form_role_evaluator() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.inviteEvaluator();
	}

	@Then("evaluator user invited")
	public void evaluator_user_invited() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.inviteButton();
	    //ah.cancelLinkOnInvite();
	}
	
	
	//Admin invite judge role

	@Given("admin login to admin page to invite judge")
	public void admin_login_to_admin_page_to_invite_judge() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		ah.createDriver();
		ah.login();
	}

	@When("admin access user management to invite judge")
	public void admin_access_user_management_to_invite_judge() {
	    // Write code here that turns the phrase above into concrete actions
		ah.userManagement();
	}
	
	@And("Fill the invite user form role judge")
	public void fill_the_invite_user_form_role_judge() {
	    // Write code here that turns the phrase above into concrete actions
	    ah.inviteJudge();
	}

	@Then("judge user invited")
	public void judge_user_invited() {
	    // Write code here that turns the phrase above into concrete actions
		 ah.inviteButton();
		    //ah.cancelLinkOnInvite();
	}


	
	

}
