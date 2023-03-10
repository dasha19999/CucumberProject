package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {
    @FindBy(xpath ="//input[@id='txtUsername']")
    public WebElement userNameField;

    @FindBy(id="txtPassword")
    public WebElement passWordField;

    @FindBy(xpath="//input[@id='btnLogin']")
    public WebElement loginButton;


    @FindBy (id="spanMessage")
    public WebElement errorMessage;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }
}