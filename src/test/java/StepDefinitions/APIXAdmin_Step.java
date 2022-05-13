package StepDefinitions;

import java.net.MalformedURLException;

import io.cucumber.java.en.*;
import mainAPIX.APIXAdmin_Scenario;

public class APIXAdmin_Step {
	APIXAdmin_Scenario apxadm = new APIXAdmin_Scenario();
	
	//SCENARIO:
	//1. Create CMS-NEWS
	
	
	@Given("admin is on apix platform to login to CMS news")
	public void admin_is_on_apix_platform_to_login_to_CMS_news() throws MalformedURLException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		apxadm.createDriver();
	}

	@When("user clicks member log in btn to CMS news")
	public void user_clicks_member_log_in_btn_to_CMS_news() {
	    // Write code here that turns the phrase above into concrete actions
	   apxadm.PreLogin();
	   apxadm.LoginAsAdmin();
	}

	@When("click apix admin button on usermenu to go to CMS news")
	public void click_apix_admin_button_on_usermenu_to_go_to_CMS_news() {
	    // Write code here that turns the phrase above into concrete actions
	   apxadm.ApixAdminMenu();
	}

	@When("select CMS menu to go to news tab")
	public void select_CMS_menu_to_go_to_news_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    apxadm.CMS_menu();
	    apxadm.NewsTab();
	}

	@When("click add news button")
	public void click_add_news_button() {
	    // Write code here that turns the phrase above into concrete actions
	    apxadm.AddNewsBtn();
	}

	@When("fill the news form")
	public void fill_the_news_form() {
	    // Write code here that turns the phrase above into concrete actions
	    apxadm.NewsForm();
	}

	@Then("news has been created")
	public void news_has_been_created() {
	    // Write code here that turns the phrase above into concrete actions
	    apxadm.SubmitNewsBtn();
	    //apxadm.CancelNewsBtn();
	}


}
