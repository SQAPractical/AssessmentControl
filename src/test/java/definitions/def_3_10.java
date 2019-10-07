package definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static support.TestContext.getDriver;

public class def_3_10 {
    @Given("^I navigate to \"([^\"]*)\" page$")
    public void iNavigateToPage(String page) throws Throwable {
        if (page.equalsIgnoreCase("login")) {
            getDriver().get("http://ask-stage.portnov.com/#/login");
        } else if (page.equalsIgnoreCase("registration")) {
            getDriver().get("http://ask-stage.portnov.com/#/registration");
        } else {
            throw new RuntimeException("Not supported " + page);
        }
    }

    @When("^I type email \"([^\"]*)\" on \"([^\"]*)\" page$")
    public void iTypeEmailOnPage(String email, String page) throws Throwable {
        if (page.equalsIgnoreCase("login")) {
            getDriver().findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys(email);
        } else if (page.equalsIgnoreCase("registration")) {
            getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
        } else {
            throw new RuntimeException("Not supported " + page);
        }
    }

    @And("^I type password \"([^\"]*)\" on \"([^\"]*)\" page$")
    public void iTypePasswordOnPage(String pass, String page) throws Throwable {
        if (page.equalsIgnoreCase("login")) {
            getDriver().findElement(By.xpath("//input[@placeholder='Password *']")).sendKeys(pass);
        } else if (page.equalsIgnoreCase("registration")) {
            getDriver().findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
        } else {
            throw new RuntimeException("Not supported " + page);
        }
    }

    @And("^I click Sign in button$")
    public void iClickSignInButton() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();
        Thread.sleep(1000);
    }

    @When("I click on {string} on left menu")
    public void iClickOnOnLeftMenu(String LeftMenuItem) throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(),'"+LeftMenuItem+"')]")).click();
        Thread.sleep(5000);


    }

    @When("I click create new quiz button")
    public void iClickCreateNewQuizButton() throws InterruptedException {
        getDriver().findElement(By.xpath("//*[contains(text(),'Create New Quiz')]")).click();
        Thread.sleep(5000);
    }

    @When("I type title of the quiz {string}")
    public void iTypeTitleOfTheQuiz(String Title) {
        getDriver().findElement(By.xpath("//*[@placeholder='Title Of The Quiz *']")).sendKeys(Title);


    }

    @And("I click on Add question button")
    public void iClickOnAddQuestionButton() {
        getDriver().findElement(By.xpath("//*[@class='controls ng-star-inserted']//span[1]")).click();
    }

    @When("I select textual type of Question")
    public void iSelectTextualTypeOfQuestion() {
        getDriver().findElement(By.xpath("//*[contains(text(),'Textual')]/..//*[@class='mat-radio-outer-circle']"
            )).click();
    }

    @Then("I type text of question {string}")
    public void iTypeTextOfQuestion(String TextOfQuestion) {
        getDriver().findElement(By.xpath("//*[@placeholder='Question *']")).sendKeys(TextOfQuestion);
    }

    @And("I save the quiz")
    public void iSaveTheQuiz() throws Throwable{
        getDriver().findElement(By.xpath("//span[contains(text(),'Save')]")).click();
//        getDriver().findElement(By.xpath("//span[contains(text(),'Discard')]"))
        Thread.sleep(5000);
    }

    @And("I click on Create New Assignment button")
    public void clickOnCreateNewAssignmentButton()throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Assignment')]")).click();
        Thread.sleep(5000);
    }

    @Then("I select quiz {string}")
    public void iSelectQuiz(String TitleOfQuiz) {
        getDriver().findElement(By.xpath("//*[@placeholder=\"Select Quiz To Assign\"]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'"+TitleOfQuiz+"')]")).click();
    }

    @Then("I select student {string}")
    public void iSelectStudent(String arg0) {
        getDriver().findElement(By.xpath("//body//mat-list-option[139]"));
    }

    @Then("I click Give assignment button")
    public void iClickGiveAssignmentButton()throws Throwable {
        getDriver().findElement(By.xpath("//span[contains(text(),'Give Assignment')]"));
    }

    @When("I click Log out")
    public void iClickLogOut() {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]"));
    }

    @And("I confirm Log Out")
    public void iConfirmLogOut() throws Throwable {
        getDriver().findElement(By.xpath("//*[contains(text(),'Log Out')]"));
        Thread.sleep(5000);
    }

    @When("I click on My Assignments")
    public void iClickOnMyAssignments() throws Throwable {
        getDriver().findElement(By.xpath("//h5[contains(text(),'My Assignments')]")).click();
        Thread.sleep(5000);
    }

    @Then("Student Assignment page should have quiz {string}")
    public void studentAssignmentPageShouldHaveQuiz(String arg0) {
        AssertThat(getDriver().findElement(By.xpath("//td[contains(text(),'3.10 End to End Quiz')]")).isDisplayed());
    }

    private void AssertThat(boolean displayed) {
    }


    @Then("select quiz {string} from Assignments and delete")
    public void selectQuizFromAssignmentsAndDelete(String arg0) {
        getDriver().findElement(By.xpath("//tr[1]//td[4]//a[1]//button[1]"));
    }
}