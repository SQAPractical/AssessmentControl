package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import static support.TestContext.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class userFirstName_def {
    @And("I type first name {string}")
    public void iTypeFirstName(String fName) {
        getDriver().findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys(fName);
    }

    @And("I type last name {string}")
    public void iTypeLastName(String lName) {
        getDriver().findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys(lName);
    }

    @And("I type group code {string}")
    public void iTypeGroupCode(String gCode) {
        getDriver().findElement(By.xpath("//*[@placeholder='Group Code']")).sendKeys(gCode);
    }

    @And("I type confirm password {string}")
    public void iTypeConfirmPassword(String cPassword) {
        getDriver().findElement(By.xpath("//*[@placeholder='Confirm Password']")).sendKeys(cPassword);
    }

    @And("I click Register Me button")
    public void iClickRegisterMeButton() throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(), 'Register')]")).submit();
        Thread.sleep(1000);
    }

    @Then("assert the message {string} appears")
    public void assertTheMessageAppears(String rMessage) {
        String result = getDriver().findElement(By.xpath("//*[contains(text(),'"+rMessage+"')]")).getText();
        assertThat(result).containsIgnoringCase(rMessage);
    }
}
