package com.speedup.qa.tasks;

import com.speedup.qa.models.LoginData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterfaces.LoginInterface.*;

public class LoginInput implements Task {

    private LoginData loginData;

    public LoginInput (LoginData loginData) {this.loginData = loginData;}
    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(CLICK_ON_USER));
        actor.attemptsTo(Enter.theValue(loginData.getUser()).into(USER_INPUT));
        actor.attemptsTo(Click.on(CLICK_ON_PASSWORD));
        actor.attemptsTo(Enter.theValue(loginData.getPassword()).into(PASSWORD_INPUT));
        actor.attemptsTo(Click.on((LOGIN_BUTTON)));
    }
    public static LoginInput withData (LoginData loginData) {
        return new LoginInput(loginData);
    }

}
