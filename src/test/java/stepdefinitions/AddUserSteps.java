package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.LoginPage;
import pageobjects.UserManagementPage;
import java.time.Duration;

public class AddUserSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private UserManagementPage userManagementPage;
    private WebDriverWait wait;

    @Given("Admin is logged in")
    public void admin_is_logged_in() {
        driver = new ChromeDriver(); // Ubah sesuai browser yang ingin Anda gunakan
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://syauqi.codecrab.my.id/");
        loginPage = new LoginPage(driver);
        loginPage.enterEmail("jakubowski.dock@example.org");
        loginPage.enterPassword("password");
        loginPage.clickSubmit();
        wait.until(ExpectedConditions.urlContains("dashboard"));
    }

    @When("Admin navigates to the user management page")
    public void admin_navigates_to_the_user_management_page() {
        driver.get("https://syauqi.codecrab.my.id/dashboard/user");
        userManagementPage = new UserManagementPage(driver);
    }

    @When("Admin clicks on the 'Add New' button")
    public void admin_clicks_on_the_add_new_button() {
        userManagementPage.clickAddNewButton();
    }

    @When("Admin enters user details")
    public void admin_enters_user_details() {
        userManagementPage.enterNama("newuser");
        userManagementPage.enterNISN("1234567890");
        userManagementPage.selectKelas("10"); // Sesuaikan dengan pilihan kelas yang tersedia
        userManagementPage.enterTanggalLahir("01-01-2000");
        userManagementPage.enterAlamat("123 Example Street");
        userManagementPage.enterEmail("newuser@example.com");
        userManagementPage.enterPassword("newpassword");
        userManagementPage.enterConfirmPassword("newpassword");
    }

    @When("Admin submits the form")
    public void admin_submits_the_form() {
        userManagementPage.clickSaveButton();
    }

    @Then("The new user should be added successfully")
    public void the_new_user_should_be_added_successfully() {
        // Add assertion or verification steps here
        // Example: Check for a success message or the presence of the new user in the list
        String successMessage = userManagementPage.getSuccessMessage();
        assert(successMessage.contains("User added successfully"));
        driver.quit();
    }
}

