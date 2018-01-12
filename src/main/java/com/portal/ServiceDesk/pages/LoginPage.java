package com.portal.ServiceDesk.pages;

import com.portal.ServiceDesk.support.BaseClass;
import com.portal.ServiceDesk.support.ElementsUtils;
import com.portal.ServiceDesk.support.WebModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{

    ElementsUtils utils = new ElementsUtils();

    @FindBy(id="UserName")
    WebElement USERNAME;

    @FindBy(id="Password")
    WebElement PASSWORD;

    @FindBy(className="DivButton")
    WebElement SIGN_IN;


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    public void loginAsCP(){
        utils.waitForElementVisibility(USERNAME);
        USERNAME.sendKeys("adamr");
        PASSWORD.sendKeys("password");
        SIGN_IN.click();
    }

    public void loginAsReseller(){
        USERNAME.sendKeys("adam.reseller");
        PASSWORD.sendKeys("password");
        SIGN_IN.click();
    }

    public void loginAsAgent(){
        USERNAME.sendKeys("sukhn");
        PASSWORD.sendKeys("123");
        SIGN_IN.click();

    }


}
