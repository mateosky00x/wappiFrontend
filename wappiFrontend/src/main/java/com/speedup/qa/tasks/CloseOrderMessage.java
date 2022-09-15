package com.speedup.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterfaces.HomeInterface.CLOSE_CONFIRM_PRODUCT_MESSAGE;

public class CloseOrderMessage implements Task {
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(CLOSE_CONFIRM_PRODUCT_MESSAGE));
    }
    public static CloseOrderMessage closeOrderMessage() {
        return new CloseOrderMessage();
    }
}
