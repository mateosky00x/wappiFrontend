package com.speedup.qa.stepdefinitions;
import com.speedup.qa.tasks.OrderWithCoupon;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class orderWithCouponStepDefinitions {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnStage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Mateo Castillo");
    }
    @When("^user clicks on get coupon, copies coupon and closes coupon pop up, enter on order a product, selects product, pastes code and confirms order$")
    public void userClicksOnGetCouponCopiesCouponAndClosesCouponPopUpEnterOnOrderAProductSelectsProductPastesCodeAndConfirmsOrder() {
        OnStage.theActorInTheSpotlight().attemptsTo(OrderWithCoupon.orderWithCoupon());

    }

}
