/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.costa.firstseleniumusingmaven;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 *
 * @author jcosta
 */
public class FirstSeleniumUsingMaven {

    public static void main(String[] args) {
        System.out.println("Please enter the Browser you want:");
        //get user input 
        Scanner input = new Scanner(System.in);
        String browser = input.next();
        //call browser
        input.close();
       
     WebElementPart1 examples = new WebElementPart1();
    

        // open browser
        WebDriver driver = null;
        if((browser.equalsIgnoreCase("chrome")||
        (browser.equalsIgnoreCase("safari"))||
        (browser.equalsIgnoreCase("firefox"))))
            examples.handleIframe(browser);
        else
        System.out.println("Browser not supported"+ browser);
        //open website
        //driver.get("www.facebook.com");
    
     
        }
    
    }

