package com.speedup.qa.stepdefinitions;

import com.speedup.qa.models.UpdateData;
import com.speedup.qa.tasks.UpdateProfile;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class updateProfileStepDefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Mateo Castillo");
    }

    @When("^user clicks on personal information, updates info and clicks on save$")
    public void userClicksOnPersonalInformationUpdatesInfoAndClicksOnSave(List<UpdateData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(UpdateProfile.withData(data.get(0)));
        OnStage.theActorInTheSpotlight().attemptsTo();

    }

    @Then("^the user should see the changes in his profile$")
    public void theUserShouldSeeTheChangesInHisProfile() {
    }

}
