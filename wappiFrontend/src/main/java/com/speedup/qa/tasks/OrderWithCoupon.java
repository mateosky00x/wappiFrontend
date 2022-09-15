package com.speedup.qa.tasks;
import com.speedup.qa.userinterfaces.HomeInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.speedup.qa.userinterfaces.HomeInterface.*;


public class OrderWithCoupon implements Task {


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(CLICK_ON_COUPON));
        String couponCode = BrowseTheWeb.as(actor).findBy(HomeInterface.GET_COUPON_CODE.getCssOrXPathSelector()).getText();
        actor.attemptsTo(Click.on(CLOSE_COUPON_POPUP));
        actor.attemptsTo(Click.on(CLICK_ON_HOME));
        actor.attemptsTo(Click.on(ORDER_PRODUCT_BUTTON));
        actor.attemptsTo(Enter.theValue(couponCode).into(COUPON_INPUT));
        actor.attemptsTo(Click.on(CONFIRM_PRODUCT_BUTTON));
    }
    public static OrderWithCoupon orderWithCoupon() { return new OrderWithCoupon(); }
}
