package steps;

import pages.*;


public class PageInitializer {


    public static LoginPage login;
    public static DashboardPage dashboard;

    public static AddEmployeePage addEmployee;

    public static AddEmployeeLanguagesPages languages;

    public static ContactDetailsPage contactDetails;
    public static EmployeeListPage employeeList;
    public static PersonalDetailsPage personalDetails;

    public static AddJobDetailsPage addJobDetails;
    public static CalendarPage calendar;
    public static TerminatingEmployeePage terminatingEmployee;


    public static void initializePageObjects() {


        login = new LoginPage();
        dashboard = new DashboardPage();
        addEmployee = new AddEmployeePage();
        contactDetails = new ContactDetailsPage();
        employeeList = new EmployeeListPage();
        personalDetails = new PersonalDetailsPage();
        addJobDetails = new AddJobDetailsPage();
        calendar = new CalendarPage();
        terminatingEmployee = new TerminatingEmployeePage();
        languages = new AddEmployeeLanguagesPages();

    }

}



