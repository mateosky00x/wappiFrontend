package com.speedup.qa.stepdefinitions;
import com.speedup.qa.models.LoginData;
import com.speedup.qa.questions.HomeMatch;
import com.speedup.qa.tasks.LoginInput;
import com.speedup.qa.tasks.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class loginStepDefinitions {

    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Mateo Castillo");
    }

    @Given("^user opens browser and enters page$")
    public void userOpensBrowserAndEntersPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^user enters the credencials and clicks on login button$")
    public void userEntersTheCredencialsAndClicksOnLoginButton(List<LoginData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginInput.withData(data.get(0)));

    }
    @Then("^The user should see the home page (.*)$")
    public void theUserShouldSeeTheHomePage(String homeMatch){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(HomeMatch.matchResponse(),org.hamcrest.Matchers.is(homeMatch)));
    }
}
