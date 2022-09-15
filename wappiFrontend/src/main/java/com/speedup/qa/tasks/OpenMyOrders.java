package com.speedup.qa.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.speedup.qa.userinterfaces.MyOrdersInterface.CLICK_ON_MY_ORDERS;

public class OpenMyOrders implements Task {

        public <T extends Actor> void performAs(T actor){
            actor.attemptsTo(Click.on(CLICK_ON_MY_ORDERS));
        }

    public static OpenMyOrders openMyOrders() {
        return new OpenMyOrders();
    }
}

