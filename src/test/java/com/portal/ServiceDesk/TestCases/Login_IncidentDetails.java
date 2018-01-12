package com.portal.ServiceDesk.TestCases;

import com.portal.ServiceDesk.support.BaseClass;
import com.portal.ServiceDesk.support.WebModel;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_IncidentDetails extends BaseClass {
    WebModel webModel;

    public Login_IncidentDetails() {
        super();
    }

    @BeforeMethod
    public void setup() {
        initialization();
        webModel = new WebModel();
    }

    @Test(priority = 1)
    public void CPLogin_NonOpenReach_Incident() {
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByAccountNumber("Adam As A Reseller");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
        Assert.assertTrue(webModel.getIncidentDetailsPage().incidentPageValidation("Adam Reed"));
        webModel.getIncidentDetailsPage().nonOpenReachIncident("Billing Enquiries", "Account query", "Billing error", "1", "Last month error", "Extra 15 pounds");
    }

    @Test(priority = 2)
    public void CPLogin_OpenReach_Incident() {
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByAccountNumber("Adam As A Reseller");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
        Assert.assertTrue(webModel.getIncidentDetailsPage().incidentPageValidation("Adam Reed"));
        Assert.assertTrue(webModel.getIncidentDetailsPage().openReachIncident("Test Type Fault 1", "Test Symptom 1", "Test Category 1", "5", "PBX Fault", "Short Circuit"));
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}