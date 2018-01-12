package com.portal.ServiceDesk.pages;

import com.portal.ServiceDesk.support.BaseClass;
import com.portal.ServiceDesk.support.ElementsUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BaseClass{

    ElementsUtils utils = new ElementsUtils();


    @FindBy(xpath="//span[text()=' Service Desk']")
    WebElement SERVICE_DESK_BRANCH;

    @FindBy(xpath="//a[text()=' Log an Incident']")
    WebElement LOG_AN_INCIDENT_MENU;

    public DashBoardPage(){
        PageFactory.initElements(driver,this);
    }

    public void loginServiceDesk(){
        utils.waitForElementVisibility(SERVICE_DESK_BRANCH);
        SERVICE_DESK_BRANCH.click();
        utils.waitForElementVisibilityOID(LOG_AN_INCIDENT_MENU);
        LOG_AN_INCIDENT_MENU.click();


    }
}
