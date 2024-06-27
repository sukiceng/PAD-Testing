package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobjects.LoginPage;
import utils.TestContext;
import org.openqa.selenium.WebDriver;
public class LoginSteps {
    TestContext testContext;
    LoginPage loginPage;
    WebDriver driver;

    public LoginSteps() {
        testContext = new TestContext();
        driver = testContext.getDriver();
        loginPage = new LoginPage(driver);
    }

    @Given("user is on home page")
    public void user_is_on_home_page() {
        driver.get("https://syauqi.codecrab.my.id");
    }

    @When("user enters {string} as email")
    public void user_enters_as_email(String email) {
        loginPage.enterEmail(email);
    }

    @When("user enters {string} as password")
    public void user_enters_as_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("user clicks submit button")
    public void user_clicks_submit_button() {
        loginPage.clickSubmit();
    }

    @Then("user is redirected to dashboard page")
    public void user_is_redirected_to_dashboard_page() {
        Assert.assertEquals("https://syauqi.codecrab.my.id/dashboard", driver.getCurrentUrl());
    }

    @Then("dashboard page URL should be {string}")
    public void dashboard_page_URL_should_be(String expectedUrl) {
        Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
    }
}
