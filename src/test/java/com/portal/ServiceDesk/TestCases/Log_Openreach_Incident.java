package com.portal.ServiceDesk.TestCases;

import com.portal.ServiceDesk.support.BaseClass;
import com.portal.ServiceDesk.support.WebModel;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Log_Openreach_Incident extends BaseClass {
    WebModel webModel;

    public Log_Openreach_Incident(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        webModel = new WebModel();
    }

   //@Test(priority = 1)
    public void CPLogin_analogueSingle_Log_Incident(){
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByCLI("01142755141");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
        Assert.assertTrue(webModel.getIncidentDetailsPage().openReachIncident("Test Type Fault 1", "Test Symptom 1", "Test Category 1", "5", "Analogue Single Notes", "Analogue Single Summary"));
        webModel.getInstallationDetailsPage().obtainInstallationDetails("PSTN Single Line","1","1","No","No",true);
        webModel.getInstallationDetailsPage().fault_details("Bell Not Ringing","Analogue Single Fault Notes",58,"Smart Divert with Bypass Number",true,"1234",true,false,false,true);
        webModel.getInstallationDetailsPage().timeRelatedCharges("Band 1 - Up to 2 hours");
        webModel.getInstallationDetailsPage().serviceMaintenance("1",false);
        webModel.getInstallationDetailsPage().expediteCareLevel("Level 2.5");
        webModel.getInstallationDetailsPage().lineTest(true,"You are NOT advised to report this fault",false,"",false,"");
        webModel.getInstallationDetailsPage().appointment();
        webModel.getInstallationDetailsPage().siteInformation("Access Details","Hazard Notes",true,false);
        webModel.getInstallationDetailsPage().temporaryCallRouting("Call Divert",true);


    }

   // @Test(priority = 2)
    public void CPLogin_analogueMulti_Log_Incident(){
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByCLI("01142735257");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
        Assert.assertTrue(webModel.getIncidentDetailsPage().openReachIncident("Test Type Fault 1", "Test Symptom 1", "Test Category 1", "5", "Analogue MultiLine Notes", "Analogue MultiLine Summary"));
        webModel.getInstallationDetailsPage().obtainInstallationDetails("PSTN Multi Line Aux","14","2.5","No","No",true);
        webModel.getInstallationDetailsPage().fault_details("Bell Not Ringing","Analogue Multi-line Fault Notes",37,"Call Barring PIN Number Change",true,"1234",true,true,false,true);
        webModel.getInstallationDetailsPage().timeRelatedCharges("Band 2 - Up to 4 hours");
        webModel.getInstallationDetailsPage().serviceMaintenance("2.5",false);
        webModel.getInstallationDetailsPage().expediteCareLevel("Level 3");
        webModel.getInstallationDetailsPage().lineTest(false,"",true,"Pass",false,"");
        webModel.getInstallationDetailsPage().appointment();
        webModel.getInstallationDetailsPage().siteInformation("Access Details","Hazard Notes",false,false);
        webModel.getInstallationDetailsPage().temporaryCallRouting("Busy Out Line",false);

    }

  //  @Test(priority = 3)
    public void CPLogin_ISDN_Standard_Log_Incident(){
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByCLI("01142736092");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
        Assert.assertTrue(webModel.getIncidentDetailsPage().openReachIncident("Test Type Fault 1", "Test Symptom 1", "Test Category 1", "5", "ISDN Standard Notes", "ISDN Standard Summary"));
        webModel.getInstallationDetailsPage().obtainInstallationDetails("WLR3 ISDN 2e Standard","2","2","No","No",true);
        webModel.getInstallationDetailsPage().fault_details("Bell Not Ringing","ISDN Standard Fault Notes",30,"Carrier Pre Selection",false,"",false,false,false,true);
        webModel.getInstallationDetailsPage().timeRelatedCharges("Band 3 - Up to 6 hours");
        webModel.getInstallationDetailsPage().serviceMaintenance("2",false);
        webModel.getInstallationDetailsPage().expediteCareLevel("Level 4");
        webModel.getInstallationDetailsPage().lineTest(true,"You are NOT advised to report this fault",false,"",false,"");
        webModel.getInstallationDetailsPage().appointment();
        webModel.getInstallationDetailsPage().siteInformation("Access Details","Hazard Notes",true,false);
        webModel.getInstallationDetailsPage().temporaryCallRouting("Call Divert",false);

    }

    @Test(priority = 4)
    public void CPLogin_ISDN_System_Log_Incident(){
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByCLI("01202394520");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
        Assert.assertTrue(webModel.getIncidentDetailsPage().openReachIncident("Test Type Fault 1", "Test Symptom 1", "Test Category 1", "5", "ISDN System Notes", "ISDN System Summary"));
        webModel.getInstallationDetailsPage().obtainInstallationDetails("WLR3 ISDN 2e System","8","2","No","No",true);
        webModel.getInstallationDetailsPage().fault_details("Bell Not Ringing","ISDN System Fault Notes",30,"Indirect Access Call Barring",false,"",false,false,false,true);
        webModel.getInstallationDetailsPage().timeRelatedCharges("Band 4 - Unlimited");
        webModel.getInstallationDetailsPage().serviceMaintenance("2",false);
        webModel.getInstallationDetailsPage().lineTest(false,"",false,"",true,"No response from Line test dialogue service");
        webModel.getInstallationDetailsPage().appointment();
        webModel.getInstallationDetailsPage().siteInformation("Access Details","Hazard Notes",false,false);
        webModel.getInstallationDetailsPage().temporaryCallRouting("None",false);

    }

  //  @Test(priority = 5)
    public void CPLogin_ISDN_30_Log_Incident(){
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByCLI("01142734808");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
        Assert.assertTrue(webModel.getIncidentDetailsPage().openReachIncident("Test Type Fault 1", "Test Symptom 1", "Test Category 1", "5", "ISDN 30 Notes", "ISDN 30 Summary"));
        webModel.getInstallationDetailsPage().obtainInstallationDetails("WLR3 ISDN 30 ETSI","8","2","No","No",true);
        webModel.getInstallationDetailsPage().fault_details("Bell Not Ringing","ISDN 30 Fault Notes",29,"Anonymous Call Reject",false,"",false,false,true,true);
        webModel.getInstallationDetailsPage().serviceMaintenance("2",true);
        webModel.getInstallationDetailsPage().siteInformation("Access Details","Hazard Notes",false,true);
        webModel.getInstallationDetailsPage().temporaryCallRouting("Busy Out Line",false);

    }

  //  @Test(priority = 6)
    public void CPLogin_ISDN_30DASS_Log_Incident(){
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByCLI("01202348970");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
        Assert.assertTrue(webModel.getIncidentDetailsPage().openReachIncident("Test Type Fault 1", "Test Symptom 1", "Test Category 1", "5", "ISDN 30 DASS Notes", "ISDN 30 DASS Summary"));
        webModel.getInstallationDetailsPage().obtainInstallationDetails("WLR3 ISDN 30 DASS","8","2","No","Yes",true);
        webModel.getInstallationDetailsPage().fault_details("Bell Not Ringing","ISDN 30 DASS Fault Notes",29,"Customer Controlled Channel Busying",true,"1234",false,false,true,true);
        webModel.getInstallationDetailsPage().serviceMaintenance("2",true);
        webModel.getInstallationDetailsPage().temporaryCallRouting("Call Divert",true);
        webModel.getInstallationDetailsPage().siteInformation("Access Details","Hazard Notes",true,true);

    }

   // @Test(priority = 7)
    public void CPLogin_CR_Log_Incident(){
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByCLI("01142759393");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
        Assert.assertTrue(webModel.getIncidentDetailsPage().openReachIncident("Test Type Fault 1", "Test Symptom 1", "Test Category 1", "5", "CR Notes", "CR Summary"));
        webModel.getInstallationDetailsPage().obtainInstallationDetails("WLR CR","","","No","Yes",false);
        webModel.getInstallationDetailsPage().fault_details("Exchange Fault","CR Fault Notes",0,"",false,"",false,false,false,false);
    }

    //@Test(priority = 8)
    public void CPLogin_RCF_Log_Incident(){
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByCLI("01142759387");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
        Assert.assertTrue(webModel.getIncidentDetailsPage().openReachIncident("Test Type Fault 1", "Test Symptom 1", "Test Category 1", "5", "RCF Notes", "RCF Summary"));
        webModel.getInstallationDetailsPage().obtainInstallationDetails("WLR RCF","","","No","Yes",false);
        webModel.getInstallationDetailsPage().fault_details("Exchange Fault","RCF Fault Notes",0,"",false,"",false,false,false,false);
    }

    //  @Test(priority = 9)
    public void CPLogin_ISDN_30_Service_Level_Log_Incident(){
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByCLI("01142736113");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
        Assert.assertTrue(webModel.getIncidentDetailsPage().openReachIncident("Test Type Fault 1", "Test Symptom 1", "Test Category 1", "5", "ISDN 30 Notes", "ISDN 30 Summary"));
        webModel.getInstallationDetailsPage().obtainInstallationDetails("WLR3 ISDN 30 ETSI","8","2.5","No","No",true);
        webModel.getInstallationDetailsPage().fault_details("Bell Not Ringing","ISDN 30 Fault Notes",29,"Anonymous Call Reject",false,"",false,false,true,true);
        webModel.getInstallationDetailsPage().serviceMaintenance("2.5",false);
        webModel.getInstallationDetailsPage().expediteCareLevel("Level 4");
        webModel.getInstallationDetailsPage().siteInformation("Access Details","Hazard Notes",false,true);
        webModel.getInstallationDetailsPage().temporaryCallRouting("Busy Out Line",false);
    }

   // @Test(priority = 10)
    public void CPLogin_analogueSingle_LineTest_Fail_Log_Incident(){
        webModel.getLoginPage().loginAsCP();
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByCLI("01202339258");
        webModel.getServiceDeskPage().verifyLogButton();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
        Assert.assertTrue(webModel.getIncidentDetailsPage().openReachIncident("Test Type Fault 1", "Test Symptom 1", "Test Category 1", "5", "Analogue Single Notes", "Analogue Single Summary"));
        webModel.getInstallationDetailsPage().obtainInstallationDetails("PSTN Single Line","1","2.5","No","No",true);
        webModel.getInstallationDetailsPage().fault_details("Bell Not Ringing","Analogue Single Fault Notes",58,"Smart Divert with Bypass Number",true,"1234",true,false,false,true);
        webModel.getInstallationDetailsPage().timeRelatedCharges("Band 4 - Unlimited");
        webModel.getInstallationDetailsPage().serviceMaintenance("2.5",false);
        webModel.getInstallationDetailsPage().expediteCareLevel("Level 4");
        webModel.getInstallationDetailsPage().lineTest(true,"You are advised to report this fault",false,"",false,"");
        webModel.getInstallationDetailsPage().siteInformation("Access Details","Hazard Notes",true,false);
        webModel.getInstallationDetailsPage().temporaryCallRouting("Call Divert",true);

    }


  //  @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
