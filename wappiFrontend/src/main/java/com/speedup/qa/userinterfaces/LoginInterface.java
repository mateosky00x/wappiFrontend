package com.speedup.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginInterface {

    public static final Target CLICK_ON_USER = Target
            .the("The user clicks on login")
            .located(By.xpath("//input[@id='username']"));
    public static final Target USER_INPUT = Target
            .the("The user clicks on login")
            .located(By.xpath("//input[@id='username']"));
    public static final Target CLICK_ON_PASSWORD = Target
            .the("The user clicks on password")
            .located(By.xpath("//input[@id='password']"));
    public static final Target PASSWORD_INPUT = Target
            .the("The user clicks on password")
            .located(By.xpath("//input[@id='password']"));
    public static final Target LOGIN_BUTTON = Target
            .the("The user clicks on login button")
            .located(By.id("button-login"));

}
