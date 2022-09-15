package com.speedup.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyOrdersInterface {

    public static final Target CLICK_ON_MY_ORDERS = Target
            .the("The user clicks on my orders")
            .located(By.xpath("//a[normalize-space()='Mis pedidos']"));
}
