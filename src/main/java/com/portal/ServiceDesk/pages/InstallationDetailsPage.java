package com.portal.ServiceDesk.pages;

import com.portal.ServiceDesk.support.BaseClass;
import com.portal.ServiceDesk.support.ElementsUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class InstallationDetailsPage extends BaseClass {
    ElementsUtils utils = new ElementsUtils();

    @FindBy(id="obtainOrderDetails")
    WebElement OBTAIN_DETAILS_BUTTON;

    @FindBy(xpath="//div[@id='installationDetailsContainer']/div/h4/following-sibling::div/div[4]/div/label/strong/label")
    WebElement CPS_PRESENT_NONVIRTUAL;

    @FindBy(xpath="//div[@id='installationDetailsContainer']/div/h4/following-sibling::div/div[2]/div/label/strong/label")
    WebElement CPS_PRESENT_VIRTUAL;

    @FindBy(id="cliProduct")
    WebElement PRODUCT;

    @FindBy(xpath="//div[@id='installationDetailsContainer']/div/div/div[2]/div/label/strong")
    WebElement LINES;

    @FindBy(xpath="//div[@id='installationDetailsContainer']/div/div/div[3]/div/label/strong")
    WebElement MAINTENANCE_LEVEL;

    @FindBy(xpath="//div[@id='installationDetailsContainer']/div/div/div[5]/div/label/strong/label")
    WebElement NETWORK_FEATURES_NONVIRTUAL;

    @FindBy(xpath="//div[@id='installationDetailsContainer']/div/div/div[3]/div/label/strong/label")
    WebElement NETWORK_FEATURES_VIRTUAL;

    @FindBy(id="StructuredQueryCodeId")
    WebElement SQC_DROPDOWN;

    @FindBy(id="IntermittentFault")
    WebElement INTERMITTENT_FAULT;

    @FindBy(id="AvailableNetworkFeatureId")
    WebElement FEATURE;

    @FindBy(id="Pin")
    WebElement PIN;

    @FindBy(id="Line")
    WebElement LINE_DROPDOWN;

    @FindBy(xpath="//input[@id=\'SampleCalls_0__SampleCallDate\']//following-sibling::span//span")
    WebElement SAMPLE_CALL_DATE_BUTTON;

    @FindBy(xpath=".//*[@id='sampleCallsContainer']/div[2]/div[1]/div/ul/li[1]/div/div[1]/table/tbody/tr[1]/td[1]")
    WebElement SAMPLE_CALL_DATE_SELECTION;

    @FindBy(xpath="//*[@id='sampleCallsContainer']/div[2]/div[2]/span/span")
    WebElement SAMPLE_CALL_TIME_BUTTON;

    @FindBy(xpath=".//*[@id='sampleCallsContainer']/div[2]/div[2]/div/ul/li[2]/div/div[1]/table/tbody/tr[1]/td[1]/a/span")
    WebElement SAMPLE_CALL_TIME_SELECTION;

    @FindBy(id="SampleCalls_0__SampleCallCLI")
    WebElement SAMPLE_CALL_AFFECTED_CLI;

    @FindBy(id="SampleCalls_0__SampleCallDialledFromTo")
    WebElement SAMPLE_CALL_DIALLED_FROM_TO;

    @FindBy(xpath="//*[@id='sampleCallsContainer']/div[3]/div[4]/a/i")
    WebElement SAMPLE_CALL_DELETE_BUTTON;

    @FindBy(id="FaultNotes")
    WebElement FAULT_NOTES;

    @FindBy(id="wlr3_down_time")
    WebElement DOWNTIME;

    @FindBy(id="TRCId")
    WebElement TRC_DROPDOWN;

    @FindBy(id="wlr3_access_arrangements")
    WebElement ACCESS_DETAILS;

    @FindBy(id="wlr3_hazard_notes")
    WebElement HAZARD_NOTES;

    @FindBy(xpath="//*[@id='newincidentForm_OpenreachDetails_FaultDetails']/fieldset[6]/div[3]/div/div/div/ul/li[1]/a")
    WebElement SITE_ACCESSIBLE_NO;

    @FindBy(xpath="//*[@id='SiteAccessiblePanel']/div/div/div/div[1]/div[1]/span/span")
    WebElement SITE_ACCESSIBLE_FROM_DATE_BUTTON;

    @FindBy(xpath=".//*[@id='SiteAccessiblePanel']/div/div/div/div[3]/div[1]/span/span")
    WebElement SITE_ACCESSIBLE_UNTIL_DATE_BUTTON;

    @FindBy(id="AvailFromTime")
    WebElement SITE_ACCESSIBLE_FROM_TIME;

    @FindBy(id="AvailToTime")
    WebElement SITE_ACCESSIBLE_UNTIL_TIME;

    @FindBy(id="TCRId")
    WebElement TCR_DROPDOWN;

    @FindBy(id="TCRDivertTo")
    WebElement TCR_DIVERT;

    @FindBy(id="wizardButton_SaveIncident")
    WebElement SAVE_AND_SUBMIT_BUTTON;

    @FindBy(xpath="//span[contains(text(),'To must be no more than 16 characters')]")
    WebElement TCR_DIVERT_VALIDATION;

    @FindBy(xpath="//*[@id='SuspendCPSOptionYes']/a")
    WebElement SUSPEND_CPS_BUTTON;

    @FindBy(id="CareLvlCurrentLvl")
    WebElement CURRENT_CARE_LEVEL;

    @FindBy(id="CareLvlEstFixDate")
    WebElement TARGET_FIX_DATE;

    @FindBy(xpath="//i[contains(text(),' Openreach will not permit expedition of repairs on products currently at Service Maintenance Level 2.')]")
    WebElement DIGITAL_LINE_SERVICELEVEL_INFO;

    @FindBy(xpath="//label[contains(text(),'Would you like to expedite this fault (may incur additional charge)?')]//following-sibling::ul//a[contains(text(),'Yes')]")
    WebElement EXPEDITE_CARE_LEVEL_BUTTON;

    @FindBy(xpath="//label[contains(text(),'Select the Service Level this fault should be regarded as')]")
    WebElement EXPEDITE_LEVEL_MESSAGE;

    @FindBy(id="SelectedCareLevel")
    WebElement EXPEDITE_CARE_LEVEL_DROPDOWN;

    @FindBy(id="AccessAvailability")
    WebElement ACCESS_AVAILABILITY;

    @FindBy(id="LineTestNotRequired")
    WebElement NO_TEST;

    @FindBy(id="WLR3NoTestReasonId")
    WebElement NO_TEST_REASON_DROPDOWN;

    @FindBy(xpath=".//*[@id='lineTestSubmission']/div[1]/p[2]/a[1]")
    WebElement LINE_TEST_BUTTON;

    @FindBy(xpath=".//*[@id='lineTestSubmission']/div[1]/p[2]/a[2]")
    WebElement OVERNIGHT_LINE_TEST_BUTTON;

    @FindBy(xpath="//h4[contains(text(),'Line Test Results')]")
    WebElement LINE_TEST_RESULT_HEADER;

    @FindBy(xpath="//*[@id='lineTestResult']//following::div[@class='form-group']//h3")
    WebElement LINE_TEST_RESULT;

    @FindBy(xpath="//*[@id='lineTestResult']/div/div[2]/div/h5/strong")
    WebElement OVERNIGHT_LINE_TEST_RESULT;

    @FindBy(id="showAppointmentModal")
    WebElement SELECT_APPOINTMENT_BUTTON;

    @FindBy(xpath="//*[@id='slotContent']/div[5]/div[2]/div/div[1]/a[1]")
    WebElement APPOINTMENNT_SLOT;

    @FindBy(id="reserveAppointment")
    WebElement RESERVE_APPOINTMENT_BUTTON;

    @FindBy(xpath="//h5[contains(text(),'Appointment Reserved')]")
    WebElement APPOINTMENT_RESERVED_HEADER;

    @FindBy(xpath="//small[contains(text(),'View and Amend Details')]")
    WebElement VIEW_AND_AMEND;

    public InstallationDetailsPage(){
        PageFactory.initElements(driver,this);
    }

    public void obtainInstallationDetails(String product,String lines,String maintenanceLevel,String cps,String networkFeatures,boolean nonVirtual){
        OBTAIN_DETAILS_BUTTON.click();
        if(nonVirtual){
            utils.waitForElementVisibilityOID(CPS_PRESENT_NONVIRTUAL);
            Assert.assertEquals(PRODUCT.getText(),product);
            Assert.assertEquals(LINES.getText(),lines);
            Assert.assertEquals(MAINTENANCE_LEVEL.getText(),maintenanceLevel);
            Assert.assertEquals(CPS_PRESENT_NONVIRTUAL.getText(),cps);
            Assert.assertEquals(NETWORK_FEATURES_NONVIRTUAL.getText(),networkFeatures);
        }
        else{
            utils.waitForElementVisibilityOID(CPS_PRESENT_VIRTUAL);
            Assert.assertEquals(PRODUCT.getText(),product);
            Assert.assertEquals(CPS_PRESENT_VIRTUAL.getText(),cps);
            Assert.assertEquals(NETWORK_FEATURES_VIRTUAL.getText(),networkFeatures);
        }
    }

    public void fault_details(String SQC,String faultNotes,int featureSize,String feature,boolean pinRequired,String pin,boolean analogue,boolean multi,boolean digital,boolean nonvirtual){
        utils.waitForElementVisibility(SQC_DROPDOWN);
        Assert.assertEquals(utils.getSelectedOption(SQC_DROPDOWN),SQC);
        FAULT_NOTES.sendKeys(faultNotes);
        if(nonvirtual)
        {
            Assert.assertEquals(utils.getDropdownsize(FEATURE),featureSize);
            utils.selectByVisibleText(FEATURE,feature);
            if(pinRequired)
            {
                utils.waitForElementVisibility(PIN);
                PIN.sendKeys(pin);
            }
        }
        if(analogue){
            INTERMITTENT_FAULT.click();
        }
        if(multi){
            utils.selectByVisibleText(LINE_DROPDOWN,"7");
        }
        if(digital){
            SAMPLE_CALL_DATE_BUTTON.click();
            SAMPLE_CALL_DATE_SELECTION.click();
            SAMPLE_CALL_TIME_BUTTON.click();
            SAMPLE_CALL_TIME_SELECTION.click();
            SAMPLE_CALL_AFFECTED_CLI.sendKeys("02012345678");
            SAMPLE_CALL_DIALLED_FROM_TO.sendKeys("02022334455");
            SAMPLE_CALL_DELETE_BUTTON.click();
            DOWNTIME.sendKeys("DownTime");

        }
    }

    public void lineTest(boolean lineTest,String lineTestResult,boolean overnight,String overnightLineTestResult,boolean noTest,String noTestReason){
        if(lineTest)
        {
           LINE_TEST_BUTTON.click();
           utils.waitForElementVisibilityLineTest(LINE_TEST_RESULT_HEADER);
          Assert.assertEquals(LINE_TEST_RESULT.getText(),lineTestResult);

        }

        if(overnight)
        {
            OVERNIGHT_LINE_TEST_BUTTON.click();
            utils.waitForElementVisibilityLineTest(LINE_TEST_RESULT_HEADER);
            Assert.assertEquals(OVERNIGHT_LINE_TEST_RESULT.getText(),overnightLineTestResult);

        }

        if(noTest){
            NO_TEST.click();
            utils.waitForElementVisibility(NO_TEST_REASON_DROPDOWN);
            Assert.assertEquals(utils.getDropdownsize(NO_TEST_REASON_DROPDOWN),7);
            utils.selectByVisibleText(NO_TEST_REASON_DROPDOWN,noTestReason);
        }

    }

    public void timeRelatedCharges(String band){
        Assert.assertEquals(utils.getSelectedOption(TRC_DROPDOWN),"Band 0 - No authorisation");
        utils.selectByVisibleText(TRC_DROPDOWN,band);
    }

    public void appointment(){
        SELECT_APPOINTMENT_BUTTON.click();
        utils.waitForElementVisibilityOID(APPOINTMENNT_SLOT);
        APPOINTMENNT_SLOT.click();
        utils.waitForElementVisibilityOID(RESERVE_APPOINTMENT_BUTTON);
        RESERVE_APPOINTMENT_BUTTON.click();
        utils.waitForElementVisibilityOID(SAVE_AND_SUBMIT_BUTTON);
        utils.waitForElementVisibility(APPOINTMENT_RESERVED_HEADER);

    }

    public void siteInformation(String accessDetails,String hazardNotes,boolean siteNotAccesible,boolean digital){

            ACCESS_DETAILS.sendKeys(accessDetails);
            HAZARD_NOTES.sendKeys(hazardNotes);
            if(siteNotAccesible)
            {
                SITE_ACCESSIBLE_NO.click();
                utils.waitForElementVisibility(SITE_ACCESSIBLE_FROM_DATE_BUTTON);
                SITE_ACCESSIBLE_FROM_DATE_BUTTON.click();
                SITE_ACCESSIBLE_UNTIL_DATE_BUTTON.click();
                SITE_ACCESSIBLE_FROM_TIME.sendKeys("16:00");
                SITE_ACCESSIBLE_UNTIL_TIME.sendKeys("20:00");
            }
            if(digital)
            {
                ACCESS_AVAILABILITY.sendKeys("Access Availability");
            }
    }

    public void temporaryCallRouting(String tcrOption,boolean suspendCPS){
        Assert.assertEquals(utils.getSelectedOption(TCR_DROPDOWN),"None");
        utils.selectByVisibleText(TCR_DROPDOWN,tcrOption);
        if(tcrOption.equals("Call Divert"))
        {
            utils.waitForElementVisibility(TCR_DIVERT);
            TCR_DIVERT.sendKeys("001122334455667788");
            SAVE_AND_SUBMIT_BUTTON.click();
            utils.waitForElementVisibility(TCR_DIVERT_VALIDATION);
            TCR_DIVERT.clear();
            TCR_DIVERT.sendKeys("0201122334");
            if(suspendCPS)
            {
                SUSPEND_CPS_BUTTON.click();
            }
        }
    }

    public void serviceMaintenance(String currentLevel,boolean digitalTwo){
        Assert.assertTrue(CURRENT_CARE_LEVEL.getText().endsWith(currentLevel));
        if(digitalTwo){
            utils.waitForElementVisibility(DIGITAL_LINE_SERVICELEVEL_INFO);
         Assert.assertEquals(TARGET_FIX_DATE.getText(), getTargetFixDate(currentLevel));

        }
        else
        {
            Assert.assertEquals(TARGET_FIX_DATE.getText(), getTargetFixDate(currentLevel));
        }


    }

    public String getTargetFixDate(String currentLevel)
    {

        DateFormat df = new SimpleDateFormat("EEEE");
        Calendar cal = new GregorianCalendar();
        String day = String.valueOf(cal.get(GregorianCalendar.DAY_OF_WEEK));
        if (currentLevel.equals("1"))
        {
            if(day.equals("7")) {

                DateFormat df1s = new SimpleDateFormat("EEEE, d MMMM yyyy");
                Calendar cal_1s = new GregorianCalendar();
                cal_1s.add(Calendar.DAY_OF_MONTH, 3);
                String Target_fix_date_level1s = df1s.format(cal_1s.getTime()) + " 23:59";
                return Target_fix_date_level1s;
            }
            if(day.equals("6") || day.equals("5"))
            {
                DateFormat df1f = new SimpleDateFormat("EEEE, d MMMM yyyy");
                Calendar cal_1f = new GregorianCalendar();
                cal_1f.add(Calendar.DAY_OF_MONTH,4);
                String Target_fix_date_level1f = df1f.format(cal_1f.getTime())+" 23:59";
                return Target_fix_date_level1f;
            }
            else
            {
                DateFormat df1n = new SimpleDateFormat("EEEE, d MMMM yyyy");
                Calendar cal_1n = new GregorianCalendar();
                cal_1n.add(Calendar.DAY_OF_MONTH,2);
                String Target_fix_date_level1n = df1n.format(cal_1n.getTime())+" 23:59";
                return Target_fix_date_level1n;
            }
        }
        else
        {
            if (day.equals("7"))
            {
                DateFormat df2 = new SimpleDateFormat("EEEE, d MMMM yyyy");
                Calendar cal_2 = new GregorianCalendar();
                cal_2.add(Calendar.DAY_OF_MONTH, 2);
                String Target_fix_date_level2 = df2.format(cal_2.getTime()) + " 23:59";
                return Target_fix_date_level2;

            } else
            {

                DateFormat df2 = new SimpleDateFormat("EEEE, d MMMM yyyy");
                Calendar cal_2 = new GregorianCalendar();
                cal_2.add(Calendar.DAY_OF_MONTH, 1);
                String Target_fix_date_level2 = df2.format(cal_2.getTime()) + " 23:59";
                return Target_fix_date_level2;

            }
        }

    }

    public void expediteCareLevel(String newCareLevel) {

        EXPEDITE_CARE_LEVEL_BUTTON.click();
        utils.waitForElementVisibility(EXPEDITE_LEVEL_MESSAGE);
        utils.selectByVisibleText(EXPEDITE_CARE_LEVEL_DROPDOWN, newCareLevel);

        DateFormat df = new SimpleDateFormat("EEEE");
        Calendar cal = new GregorianCalendar();
        String day = String.valueOf(cal.get(GregorianCalendar.DAY_OF_WEEK));


        if (day.equals("7")) {

            if (newCareLevel.endsWith("2") || newCareLevel.endsWith("2.5")) {
                DateFormat df2 = new SimpleDateFormat("EEEE, d MMMM yyyy");
                Calendar cal_2 = new GregorianCalendar();
                cal_2.add(Calendar.DAY_OF_MONTH, 2);
                String Target_fix_date_level2 = df2.format(cal_2.getTime()) + " 23:59";
                Assert.assertEquals(TARGET_FIX_DATE.getText(), Target_fix_date_level2);
            }

            if (newCareLevel.endsWith("3")) {
                DateFormat df3 = new SimpleDateFormat("HH");
                Calendar cal3 = new GregorianCalendar();
                String current_time = df3.format(cal3.getTime());
                int hour = Integer.parseInt(current_time);

                if (hour < 13) {
                    DateFormat df3a = new SimpleDateFormat("EEEE, d MMMM yyyy");
                    Calendar cal3a = new GregorianCalendar();
                    String Target_fix_date_level3a = df3a.format(cal3a.getTime()) + " 23:59";
                    Assert.assertEquals(TARGET_FIX_DATE.getText(), Target_fix_date_level3a);
                } else {
                    DateFormat df3b = new SimpleDateFormat("EEEE, d MMMM yyyy");
                    Calendar cal3b = new GregorianCalendar();
                    cal3b.add(Calendar.DAY_OF_MONTH, 2);
                    String Target_fix_date_level3b = df3b.format(cal3b.getTime()) + " 13:00";
                    Assert.assertEquals(TARGET_FIX_DATE.getText(), Target_fix_date_level3b);
                }
            }

            if (newCareLevel.endsWith("4")) {
                DateFormat df_4 = new SimpleDateFormat("EEEE, d MMMM yyyy HH");
                Calendar cal_4 = new GregorianCalendar();
                cal_4.add(Calendar.HOUR_OF_DAY, 6);
                String Target_fix_date_level4 = df_4.format(cal_4.getTime());
                Assert.assertTrue(TARGET_FIX_DATE.getText().contains(Target_fix_date_level4));
            }
        } else {

            if (newCareLevel.endsWith("2") || newCareLevel.endsWith("2.5")) {
                DateFormat df2 = new SimpleDateFormat("EEEE, d MMMM yyyy");
                Calendar cal_2 = new GregorianCalendar();
                cal_2.add(Calendar.DAY_OF_MONTH, 1);
                String Target_fix_date_level2 = df2.format(cal_2.getTime()) + " 23:59";
                Assert.assertEquals(TARGET_FIX_DATE.getText(), Target_fix_date_level2);
            }
            if (newCareLevel.endsWith("3")) {
                DateFormat df3 = new SimpleDateFormat("HH");
                Calendar cal3 = new GregorianCalendar();
                String current_time = df3.format(cal3.getTime());
                int hour = Integer.parseInt(current_time);

                if (hour < 13) {
                    DateFormat df3a = new SimpleDateFormat("EEEE, d MMMM yyyy");
                    Calendar cal3a = new GregorianCalendar();
                    String Target_fix_date_level3a = df3a.format(cal3a.getTime()) + " 23:59";
                    Assert.assertEquals(TARGET_FIX_DATE.getText(), Target_fix_date_level3a);
                } else {
                    DateFormat df3b = new SimpleDateFormat("EEEE, d MMMM yyyy");
                    Calendar cal3b = new GregorianCalendar();
                    cal3b.add(Calendar.DAY_OF_MONTH, 1);
                    String Target_fix_date_level3b = df3b.format(cal3b.getTime()) + " 13:00";
                    Assert.assertEquals(TARGET_FIX_DATE.getText(), Target_fix_date_level3b);
                }
            }


            if (newCareLevel.endsWith("4")) {

                DateFormat df_4 = new SimpleDateFormat("EEEE, d MMMM yyyy HH");
                Calendar cal_4 = new GregorianCalendar();
                cal_4.add(Calendar.HOUR_OF_DAY, 6);
                String Target_fix_date_level4 = df_4.format(cal_4.getTime());
                Assert.assertTrue(TARGET_FIX_DATE.getText().contains(Target_fix_date_level4));
            }


        }
    }

    public void saveAndSubmit(){
        SAVE_AND_SUBMIT_BUTTON.click();
        utils.waitForElementVisibility(VIEW_AND_AMEND);
    }
}
