package com.speedup.qa.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.speedup.qa.userinterfaces.HomeInterface.VALIDATE_ORDER_MESSAGE_MATCH;

public class OrderMessageMatch implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the((VALIDATE_ORDER_MESSAGE_MATCH), WebElementStateMatchers.isVisible()));
        return Text.of(VALIDATE_ORDER_MESSAGE_MATCH).viewedBy(actor).asString();
    }
    public static OrderMessageMatch matchResponse () {
        return new OrderMessageMatch();
    }

}
