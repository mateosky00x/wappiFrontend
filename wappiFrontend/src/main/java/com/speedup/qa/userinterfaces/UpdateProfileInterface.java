package com.speedup.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UpdateProfileInterface {

    public static final Target CLICK_ON_MY_PERSONAL_INFO = Target
            .the("CLick on personal info")
            .located(By.xpath("//a[normalize-space()='Información personal']"));
    public static final Target CLICK_ON_NAME = Target
            .the("CLick on name")
            .located(By.xpath("//input[@id='name']"));
    public static final Target CLICK_ON_LASTNAME= Target
            .the("CLick on lastname")
            .located(By.xpath("//input[@id='lastName']"));
    public static final Target CLICK_ON_BIRTHDATE= Target
            .the("CLick on birthdate")
            .located(By.xpath("//input[@id='bornDate']"));
    public static final Target CLICK_ON_COUNTRY= Target
            .the("CLick on country")
            .located(By.xpath("//select[@id='country']//option[@value='3']"));

}
