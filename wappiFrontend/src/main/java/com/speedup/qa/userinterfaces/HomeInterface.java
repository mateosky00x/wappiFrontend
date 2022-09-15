package com.speedup.qa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.apache.tools.ant.taskdefs.Tar;
import org.openqa.selenium.By;

public class HomeInterface {

    public static final Target VALIDATE_HOME_MATCH = Target
            .the("Validate home match")
            .located(By.xpath("//a[@class='nav-bar-link active']"));
    public static final Target ORDER_PRODUCT_BUTTON = Target
            .the("Validate order product")
            .located(By.xpath("//tr[@id='offer-0']//button[@class='button success offers-table-block-button'][normalize-space()='Pedir']"));
    public static final Target CONFIRM_PRODUCT_BUTTON = Target
            .the("Validate confirm product")
            .located(By.xpath("//button[@id='order-confirm']"));
    public static final Target VALIDATE_ORDER_MESSAGE_MATCH = Target
            .the("Validate order message match")
            .located(By.xpath("//p[@class='confirmation-modal-info']"));
    public static final Target CLOSE_CONFIRM_PRODUCT_MESSAGE = Target
            .the("Validate close confirm product message")
            .located(By.xpath("//div[@id='confirmation-modal']//span[@class='close'][normalize-space()='×']"));
    public static final Target CLICK_ON_COUPON = Target
            .the("Click on welcome coupon")
            .located(By.id("welcome-coupon"));
    public static final Target GET_COUPON_CODE = Target
            .the("Get coupon code")
            .locatedBy("//span[@id='coupon-code']");
    public static final Target CLOSE_COUPON_POPUP = Target
            .the("Close coupon pop up")
            .located(By.xpath("//div[@id='coupon-modal']//span[@class='close'][normalize-space()='×']"));
    public static final Target CLICK_ON_HOME = Target
            .the("Click on home ")
            .located(By.xpath("//a[normalize-space()='Inicio']"));
    public static final Target COUPON_INPUT = Target
            .the("Enter coupon code")
            .locatedBy("//input[@id='coupon']");

}
