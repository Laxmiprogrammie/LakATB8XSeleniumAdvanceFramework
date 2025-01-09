package com.thetestingacademy.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Testselenium {
    @Test
    public void test_VWOlogin()
    {
        WebDriver driver =new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();

    }
}
