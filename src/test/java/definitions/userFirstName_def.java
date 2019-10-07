package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;


import static support.TestContext.getDriver;
public class userFirstName_def {


    @And("I type first name {string}")
    public void iTypeFirstName(String FName) {
        getDriver().findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys(FName);
    }

    @And("I type last name {string}")
    public void iTypeLastName(String LName) {
        getDriver().findElement(By.xpath("//*[@formcontrolname='lastName']")).sendKeys(LName);
    }

    @And("I type group code {string}")
    public void iTypeGroupCode(String group) {
        getDriver().findElement(By.xpath("//*[@placeholder='Group Code']")).sendKeys(group);
    }

    @And("I type confirm password {string}")
    public void iTypeConfirmPassword(String cPassword) {
        getDriver().findElement(By.xpath("//*[@placeholder='Confirm Password']")).sendKeys(cPassword);
    }

    @And("I click Register me button")
    public void iClickRegisterMeButton() throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(),'Register Me')]")).click();
        Thread.sleep(2000);
    }

    @Then("message {string} appears")
    public void messageAppears(String message) {
        String result = getDriver().findElement(By.xpath("//*[contains(text(),'"+message+"')]")).getText();
        assertThat(result).containsIgnoringCase(message);

    }
}
