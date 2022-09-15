package com.speedup.qa.stepdefinitions;

import com.speedup.qa.tasks.CloseOrderMessage;
import com.speedup.qa.tasks.OpenMyOrders;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class checkOrderStepDefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Mateo Castillo");
    }

    @When("^user clicks on close order, enters my orders tab$")
    public void userClicksOnCloseOrderEntersMyOrdersTab() {
        OnStage.theActorInTheSpotlight().wasAbleTo(CloseOrderMessage.closeOrderMessage());

    }

    @Then("^the user can compare the product info with the order$")
    public void theUserCanCompareTheProductInfoWithTheOrder() {

    }
}
