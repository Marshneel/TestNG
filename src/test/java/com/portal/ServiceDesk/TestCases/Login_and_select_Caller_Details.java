package com.portal.ServiceDesk.TestCases;

import com.portal.ServiceDesk.support.BaseClass;
import com.portal.ServiceDesk.support.WebModel;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_and_select_Caller_Details extends BaseClass {

    WebModel webModel;
    public Login_and_select_Caller_Details(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        webModel = new WebModel();
    }

    @Test (priority = 1)
    public void CPLogin_selectContactWithTelephoneNumber(){
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByAccountNumber("Adam As A Reseller");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().contactPageValidations();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
    }

    @Test (priority = 2)
    public void CPLogin_selectContactWithoutTelephoneNumber(){
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByAccountNumber("Adam As A Reseller");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().contactPageValidations();
        webModel.getContactDetailsPage().selectContactWithoutTelephone("Adam Reed (adam.reed@unionstreet.uk.com)");
    }

    @Test (priority = 3)
    public void CPLogin_selectThirdPartyContact(){
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByAccountNumber("Adam As A Reseller");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().selectThirdPartyContact();
    }

    @AfterMethod()
    public void teardown(){
        driver.close();
        driver.quit();
    }

}
