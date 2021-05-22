package com.roofstacks.stepDefinitions;

import com.roofstacks.pages.CareerPage;
import com.roofstacks.pages.GoogleSearchPage;
import com.roofstacks.pages.TesterPage;
import com.roofstacks.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class applyAsATesterStepDefs {
    GoogleSearchPage googleSearchPage=new GoogleSearchPage();
    CareerPage careerPage=new CareerPage();
    TesterPage testerPage=new TesterPage();

    @Given("the applicant search {string} site on google")
    public void the_applicant_search_site_on_google(String searchItem) {
    googleSearchPage.googleSearch(searchItem);
    }

    @When("the applicant go to the desired page")
    public void the_applicant_go_to_the_desired_page() { googleSearchPage.clickDesiredPage(); }

    @When("the applicant navigate to career tab")
    public void the_applicant_navigate_to_career_tab() {
        careerPage.openCareer();
    }

    @When("the applicant select {string} position")
    public void the_applicant_select_position(String jobTitle) {
        careerPage.openProductPage();
        careerPage.selectJobTitle(jobTitle);
    }

    @Then("verify selection")
    public void verify_selection() {
      String actualResult=Driver.get().getTitle();
      Assert.assertTrue(actualResult.contains("Lead Product Tester"));
    }

    @When("the applicant upload CV")
    public void the_applicant_upload_CV() throws InterruptedException {
    testerPage.uploadCV();
    }

    @Then("the applicant apply for correct position")
    public void the_applicant_apply_for_correct_position() {
   String actualFileName=Driver.get().findElement(By.cssSelector("#file")).getText();
   String actualValue=Driver.get().findElement(By.xpath("//*[@id=\"progressBar\"]")).getText();
   // Assert.assertEquals("100%",actualValue);
        Assert.assertFalse(actualValue.contains("%"));
    }

}



