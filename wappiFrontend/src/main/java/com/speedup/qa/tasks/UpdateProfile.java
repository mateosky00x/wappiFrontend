package com.speedup.qa.tasks;

import com.codoid.products.fillo.Update;
import com.speedup.qa.models.UpdateData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.SendKeysIntoBy;

import static com.speedup.qa.userinterfaces.UpdateProfileInterface.*;

public class UpdateProfile implements Task {

    private UpdateData updateData;

    public UpdateProfile (UpdateData updateData) {this.updateData = updateData;}

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(CLICK_ON_MY_PERSONAL_INFO));
        actor.attemptsTo(Click.on(CLICK_ON_NAME));
        actor.attemptsTo(Enter.theValue(updateData.getName()).into(CLICK_ON_NAME));
        actor.attemptsTo(Click.on(CLICK_ON_LASTNAME));
        actor.attemptsTo(Enter.theValue(updateData.getLastname()).into(CLICK_ON_LASTNAME));
        actor.attemptsTo(Click.on(CLICK_ON_BIRTHDATE));
        actor.attemptsTo(Enter.theValue(updateData.getBirthdate()).into(CLICK_ON_BIRTHDATE));
        actor.attemptsTo(Click.on(CLICK_ON_COUNTRY));
    }
    public static UpdateProfile withData(UpdateData updateData) {
        return new UpdateProfile(updateData);
    }

}
