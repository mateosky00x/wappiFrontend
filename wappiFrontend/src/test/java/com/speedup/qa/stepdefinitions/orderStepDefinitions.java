package com.speedup.qa.stepdefinitions;

import com.speedup.qa.questions.HomeMatch;
import com.speedup.qa.questions.OrderMessageMatch;
import com.speedup.qa.tasks.CloseOrderMessage;
import com.speedup.qa.tasks.Order;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class orderStepDefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Mateo Castillo");
    }
    @When("^user clicks on order a product and confirms product$")
    public void userClicksOnOrderAProductAndConfirmsProduct() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Order.order());

    }

    @Then("^The user should see the confirmation message and close message (.*)$")
    public void theUserShouldSeeTheConfirmationMessageAndCloseMessage(String orderMessageMatch) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(OrderMessageMatch.matchResponse(),org.hamcrest.Matchers.is(orderMessageMatch)));
        OnStage.theActorInTheSpotlight().wasAbleTo(CloseOrderMessage.closeOrderMessage());

    }
}
