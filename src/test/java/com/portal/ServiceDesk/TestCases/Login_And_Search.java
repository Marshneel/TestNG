package com.portal.ServiceDesk.TestCases;

import com.portal.ServiceDesk.pages.LoginPage;
import com.portal.ServiceDesk.support.BaseClass;
import com.portal.ServiceDesk.support.WebModel;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_And_Search extends BaseClass {

   WebModel webModel;


    public Login_And_Search(){
        super();
    }


    @BeforeMethod
    public void setup(){
        initialization();
        webModel = new WebModel();

    }

    @Test
    public void CPLogin_search(){

        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();


        webModel.getServiceDeskPage().searchByAccountNumber("Chiswick");
        Assert.assertTrue(webModel.getServiceDeskPage().verifySearchResults("Chiswick","AR & Co","AR & Co / Chiswick","1 Chiswick Lane,Chiswick,London,W4 1WW","01234567899"));
        Assert.assertTrue(webModel.getServiceDeskPage().verifyAccountDetails("AR & Co","SLA needs to be upgraded. Bills pendings.","Agent","Rob Bristow","3Enigma","Ok","Test Level","Showing 1 to 5 of 5 entries"));


        webModel.getServiceDeskPage().searchByAccountNumber("3Enigma");
        Assert.assertTrue(webModel.getServiceDeskPage().verifyLogButton());

        webModel.getServiceDeskPage().searchByAccountName("A New Sage Ref Co");
        Assert.assertTrue(webModel.getServiceDeskPage().verifySearchResults("A New Sage Ref Co","A New Sage Ref Co","A New Sage Ref Co / A New Sage Ref Co","2 Sheen Road,Richmond,London,SW14 06B","0201122334"));
        Assert.assertTrue(webModel.getServiceDeskPage().verifyAccountDetails("A New Sage Ref Co","Company Billing","A A","Adam Reed","3Enigma","On Hold","Level 1","Showing 1 to 2 of 2 entries"));
        Assert.assertTrue(webModel.getServiceDeskPage().verifyLogButton());

        webModel.getServiceDeskPage().searchByCLI("01142755141");
        Assert.assertTrue(webModel.getServiceDeskPage().verifySearchResults("Adam As A Reseller","Adam As A Reseller","Adam As A Reseller / Adam As A Reseller","3 Milton Road,Richmond,London,SW14 8JP","01234569891"));
        Assert.assertTrue(webModel.getServiceDeskPage().verifyAccountDetails("Adam As A Reseller","Care Level 4 for this Company.\n" + "Tariff Plan : Gold Standard","Adam Reseller","Adam Reed","3Enigma","Ok","Default","Showing 1 to 5 of"));
        Assert.assertTrue(webModel.getServiceDeskPage().verifyLogButton());

    }


    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }

}
