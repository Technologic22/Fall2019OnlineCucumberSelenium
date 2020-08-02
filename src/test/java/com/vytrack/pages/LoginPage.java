package com.vytrack.pages;


import com.vytrack.utilities.BrowserUtilities;
import com.vytrack.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPageBase{

    @FindBy(id="prependedInput")
    private WebElement username;

    //if Find By not used:  public WebElement username2 = Driver.getDriver().findElement(By.id("prependedInput"));

    @FindBy(id= "prependedInput2")
    private WebElement password;

    @FindBy(id="_submit")
    private WebElement login;

    @FindBy(linkText= "Forgot your password?")
    private WebElement forgotPassword;

    @FindBy(css = "div[class='alert alert-error']")
    private WebElement warningMessage;

    public String getWarningMessageText(){
        return warningMessage.getText();
    }
    /**
     *  Method to login, version #1
     *  login as 'specific' user
     * @param usernameValue
     * @param passwordValue
     */
    public void login(String usernameValue, String passwordValue){
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
        BrowserUtilities.wait(3);
    }

    /**
     * Method to login, version #2
     * Login as a default user
     * Credentials retrieved from configuration.properties file
     */
    public void login(){
        username.sendKeys(ConfigurationReader.getProperty("store_manager"));
        password.sendKeys(ConfigurationReader.getProperty("password"), Keys.ENTER);
        BrowserUtilities.wait(3);
    }

    /**
     * this method stands for login based on user's role
     *if parameter equals to to driver, user will login as a driver
     * If role parameter is not correct, method will throw exception
     * @param role - driver, sales manager, or store manager
     *
     */
    public void login(String role){
     String userName="";
     if (role.equalsIgnoreCase("driver")){
        userName="user15";
     }else if (role.equalsIgnoreCase("sales manager")){
         userName="salesmanager110";
     }else if (role.equalsIgnoreCase("Store manager")){
         userName="store_manager85";
     }else { throw new RuntimeException("Invalid role!");
     }
        System.out.println("Login as "+role);
     login(userName, "UserUser123");

    }

}
