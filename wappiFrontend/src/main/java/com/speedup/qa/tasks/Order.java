package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterfaces.HomeInterface.*;

public class Order implements Task {
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(ORDER_PRODUCT_BUTTON));
        actor.attemptsTo(Click.on(CONFIRM_PRODUCT_BUTTON));
    }
    public static Order order() {
        return new Order();
    }
}
