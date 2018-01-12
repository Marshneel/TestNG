package com.portal.ServiceDesk.support;

import com.portal.ServiceDesk.pages.*;

public class WebModel {

    private LoginPage loginPage;
    private DashBoardPage dashBoardPage;
    private ServiceDeskPage serviceDeskPage;
    private ContactDetailsPage contactDetailsPage;
    private IncidentDetailsPage incidentDetailsPage;
    private InstallationDetailsPage installationDetailsPage;

    public WebModel(){
        loginPage = new LoginPage();
        dashBoardPage = new DashBoardPage();
        serviceDeskPage = new ServiceDeskPage();
        contactDetailsPage = new ContactDetailsPage();
        incidentDetailsPage = new IncidentDetailsPage();
        installationDetailsPage = new InstallationDetailsPage();

    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public DashBoardPage getDashBoardPage() {
        return dashBoardPage;
    }

    public ServiceDeskPage getServiceDeskPage() {
        return serviceDeskPage;
    }

    public ContactDetailsPage getContactDetailsPage() {
        return contactDetailsPage;
    }

    public IncidentDetailsPage getIncidentDetailsPage() {
        return incidentDetailsPage;
    }

    public InstallationDetailsPage getInstallationDetailsPage() {
        return installationDetailsPage;
    }
}
