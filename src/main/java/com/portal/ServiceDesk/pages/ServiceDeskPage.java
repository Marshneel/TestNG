package com.portal.ServiceDesk.pages;

import com.portal.ServiceDesk.support.BaseClass;
import com.portal.ServiceDesk.support.ElementsUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServiceDeskPage extends BaseClass{

    ElementsUtils utils = new ElementsUtils();

    @FindBy(id="search_Account_Number")
    WebElement SEARCH_BY_ACCOUNT_NUMBER_FIELD;


    @FindBy(xpath="//input[@id='search_Account_Number']/following-sibling::span//button")
    WebElement SEARCH_BY_ACCOUNT_NUMBER_BUTTON;

    @FindBy(id="search_Account_Name")
    WebElement SEARCH_BY_ACCOUNT_NAME_FIELD;

    @FindBy(xpath="//input[@id='search_Account_Name']/following-sibling::span//button")
    WebElement SEARCH_BY_ACCOUNT_NAME_BUTTON;

    @FindBy(id="search_CLI")
    WebElement SEARCH_BY_CLI_FIELD;

    @FindBy(xpath="//input[@id='search_CLI']/following-sibling::span//button")
    WebElement SEARCH_BY_CLI_BUTTON;

    @FindBy(xpath="//table[@id='SD-accounts']//td[1]")
    WebElement RESULT_ACCOUNT_NUMBER_FIELD;

    @FindBy(xpath="//table[@id='SD-accounts']//td[2]")
    WebElement RESULT_ACCOUNT_NAME_FIELD;

    @FindBy(xpath="//table[@id='SD-accounts']//td[3]")
    WebElement RESULT_COMPANY;

    @FindBy(xpath="//table[@id='SD-accounts']//td[4]")
    WebElement RESULT_ADDRESS;

    @FindBy(xpath="//table[@id='SD-accounts']//td[5]")
    WebElement RESULT_TEL;

    @FindBy(xpath="//*[@id='AccountDetailsContent']//following::h4")
    WebElement COMPANY_NAME;

    @FindBy(xpath="//h5[contains(text(),' Account Notes')]/following-sibling::p")
    WebElement ACCOUNT_NOTES;

    @FindBy(xpath="//dt[contains(text(),'Contacts')]/following-sibling::dd[1]")
    WebElement CONTACTS;

    @FindBy(xpath="//dt[contains(text(),' Account Manager')]/following-sibling::dd")
    WebElement ACCOUNT_MANAGER;

    @FindBy(xpath="//dt[contains(text(),'Agent')]/following-sibling::dd")
    WebElement AGENT;

    @FindBy(xpath="//div[@class='stats-info']//following::p")
    WebElement ACCOUNT_STATUS;

    @FindBy(xpath="//h4[contains(text(),'sla')]/following-sibling::p")
    WebElement SLA_STATUS;

    @FindBy(id="SD-incidents_info")
    WebElement RECENT_INCIDENTS;

    @FindBy(xpath="//span[contains(text(),'Log an Incident')]")
    WebElement LOG_AN_INCIDENT_BUTTON;

    @FindBy(id="modal-alert-label")
    WebElement ALERT_HEADER;

    @FindBy(xpath="//div[@class='modal-body']//p")
    WebElement ALERT_MESSAGE;

    @FindBy(xpath="//button[@class='btn btn-default btn-white']")
    WebElement ALERT_BUTTON;

    @FindBy(xpath="//form[@id='newincidentForm_Contact']//following::legend[contains(text(),'Account Contact')]")
    WebElement ACCOUNT_CONTACT_HEADER;



    public ServiceDeskPage(){
        PageFactory.initElements(driver,this);
    }


    public void searchByAccountNumber(String accountNumber){
        utils.waitForElementVisibility(SEARCH_BY_ACCOUNT_NUMBER_FIELD);
        SEARCH_BY_ACCOUNT_NUMBER_FIELD.sendKeys(accountNumber);
        SEARCH_BY_ACCOUNT_NUMBER_BUTTON.click();

    }

    public void searchByAccountName(String accountName){
        utils.waitForElementVisibility(SEARCH_BY_ACCOUNT_NAME_FIELD);
        SEARCH_BY_ACCOUNT_NAME_FIELD.sendKeys(accountName);
        SEARCH_BY_ACCOUNT_NAME_BUTTON.click();

    }

    public void searchByCLI(String CLI){
        utils.waitForElementVisibility(SEARCH_BY_CLI_FIELD);
        SEARCH_BY_CLI_FIELD.sendKeys(CLI);
        SEARCH_BY_CLI_BUTTON.click();

    }



    public boolean verifySearchResults(String accountNumber,String accountName,String company,String address,String tel) {
        utils.waitForElementVisibility(SEARCH_BY_ACCOUNT_NUMBER_FIELD);
        RESULT_ACCOUNT_NUMBER_FIELD.click();
        utils.waitForElementVisibility(SEARCH_BY_ACCOUNT_NUMBER_FIELD);
        return(( (RESULT_ACCOUNT_NUMBER_FIELD.getText().equals(accountNumber))
              && (RESULT_ACCOUNT_NAME_FIELD.getText().equals(accountName)))
              && (RESULT_COMPANY.getText().equals(company))
              && (RESULT_ADDRESS.getText().equals(address))
              && (RESULT_TEL.getText().equals(tel)));
    }

    public boolean verifyAccountDetails(String companyName,String accountNotes,String contacts,String accountManager,String agent,String accountStatus,String sla,String recentIncidents){

        utils.waitForElementVisibility(RECENT_INCIDENTS);

        return(( (COMPANY_NAME.getText().equals(companyName))
                && (ACCOUNT_NOTES.getText().equals(accountNotes))
                && (CONTACTS.getText().equals(contacts))
                && (ACCOUNT_MANAGER.getText().equals(accountManager))
                && (AGENT.getText().equals(agent)))
                && (ACCOUNT_STATUS.getText().equals(accountStatus))
                && (SLA_STATUS.getText().equals(sla))
                && (RECENT_INCIDENTS.getText().contains(recentIncidents)));

    }

    public boolean verifyLogButton() {
        boolean Result = false;
        utils.waitForElementVisibility(LOG_AN_INCIDENT_BUTTON);
        if (SLA_STATUS.getText().equals("No SLA Assigned")) {
            LOG_AN_INCIDENT_BUTTON.click();
            utils.waitForElementVisibility(ALERT_HEADER);
            if (ALERT_MESSAGE.getText().equals("You can not create a ticket for this account because there is no SLA in place.Please contact your Service Desk administrator."))
                ;
            ALERT_BUTTON.click();
            Result = true;

        } else if (ACCOUNT_STATUS.getText().equals("On Hold")) {
            LOG_AN_INCIDENT_BUTTON.click();
            utils.waitForElementVisibility(ALERT_HEADER);
            if (ALERT_MESSAGE.getText().equals("This account has been flagged as being on hold. Would you still like to log an Incident?")) {
                ALERT_BUTTON.click();
                Result = true;
            }


        } else if (ACCOUNT_STATUS.getText().equals("Ok")) {
            LOG_AN_INCIDENT_BUTTON.click();
            utils.waitForElementVisibility(ACCOUNT_CONTACT_HEADER);
            Result = true;
        }
        return Result;
    }
}
