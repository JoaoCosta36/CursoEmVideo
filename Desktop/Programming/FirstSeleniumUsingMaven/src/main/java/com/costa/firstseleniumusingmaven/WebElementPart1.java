package com.costa.firstseleniumusingmaven;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebElementPart1 {
    
    public void handleIframe(String browser){
        
        WebDriver driver = new SafariDriver();
        //open iframe
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
        // click on html link
        String cookieaccept = "//*[@id='accept-choices']";
        driver.findElement(By.xpath(cookieaccept)).click();
        driver.findElement(By.linkText("LEARN HTML")).click();
    }
}
