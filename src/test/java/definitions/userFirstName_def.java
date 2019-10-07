package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import static org.assertj.core.api.Assertions.assertThat;

import static support.TestContext.getDriver;

public class userFirstName_def {

    @And("^I type first name \"([^\"]*)\"$")
    public void iTypeFirstName(String FName) throws Throwable {

        getDriver().findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys(FName);
    }

    @And("^I type last name \"([^\"]*)\"$")
    public void iTypeLastName(String LName) throws Throwable {
        getDriver().findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys(LName);

    }


    @And("^I type group code \"([^\"]*)\"$")
    public void iTypeGroupCode(String group) throws Throwable {
        getDriver().findElement(By.xpath("//*[@placeholder='Group Code']")).sendKeys(group);
    }

    @And("^I type Confirm password \"([^\"]*)\"$")
    public void iTypeConfirmPassword(String ConfirmPass) throws Throwable {
        getDriver().findElement(By.xpath("//*[@placeholder='Confirm Password']")).sendKeys(ConfirmPass);

    }

    @And("^I click on Register me button$")
    public void iClickOnRegisterMeButton() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Register Me')]")).submit();
        Thread.sleep(2000);
    }

    @Then("^message \"([^\"]*)\" appears$")
    public void messageAppears(String message) throws Throwable {
        String result = getDriver().findElement(By.xpath("//*[contains(text(),'"+message+"')]")).getText();
        assertThat(result).containsIgnoringCase(message);
    }
}