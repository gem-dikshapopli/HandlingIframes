package org.example;

import org.openqa.selenium.By;

public class Locators {
    public static final By iframeButton=By.xpath("//*[contains(@href,'#Multiple')]");

    public static final By outterIFrame=By.cssSelector("[src='MultipleFrames.html']");

    public static final By innerIFrame=By.cssSelector("[src='SingleFrame.html']");

    public static final By inputBox=By.xpath("//div[@class='col-xs-6 col-xs-offset-5']/child::input[@type='text']");

    public static final By numberOfFrames=By.tagName("iframe");

    public static final By mainFrame=By.id("frame1");
    public static final By childFrame=By.id("frame3");
    public static final By checkBox=By.id("a");

    public static final By mainFrame2=By.id("frame2");
    public static final By dropdown=By.id("animals");
}
