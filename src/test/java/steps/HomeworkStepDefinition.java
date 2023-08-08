package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.HomeworkAccountspage;
import pages.HomeworkDashboardpage;
import pages.HomeworkListpage;
import pages.HomeworkLoginpage;
import pages.TestBase;

public class HomeworkStepDefinition extends TestBase {

	HomeworkLoginpage loginPage;
	HomeworkDashboardpage dashboardPage;
	HomeworkAccountspage accountspage;
	HomeworkListpage listpage;
	int randomNumber = randomGenerator();

	@Before
	public void setup() {
		initDriver();
		loginPage = PageFactory.initElements(driver, HomeworkLoginpage.class);
		dashboardPage = PageFactory.initElements(driver, HomeworkDashboardpage.class);
		accountspage = PageFactory.initElements(driver, HomeworkAccountspage.class);
		listpage = PageFactory.initElements(driver, HomeworkListpage.class);
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}


	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String inputValue, String inputField) {
		switch (inputField) {
		case "username":
			loginPage.enterUserName(inputValue);
			break;
		case "password":
			loginPage.enterPassword(inputValue);
			break;
		default:
			System.out.println("No Matching input" + inputField);
			break;
		}

	}

	@When("User clicks on {string}")
	public void user_clicks_on(String clickButton) {
		switch (clickButton) {
		case "login":
			loginPage.clickSignInButton();
			break;
		case "bankCash":
			dashboardPage.clickBankAndCashButton();
			break;
		case "newAccount":
			dashboardPage.clickNewAccountButton();
			break;
		case "submit":
			accountspage.clickSubmitButton();
			break;
		default:
			System.out.println("No Matching click button" + clickButton);
			break;
		}
	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = dashboardPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("User should land on Account page")
	public void user_should_land_on_Account_page() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expectedTitle = "Accounts- iBilling";
		String actualTitle = accountspage.getAccountsPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String inputValue, String inputField) {
		switch (inputField) {
		case "accountTitle":
			accountspage.enterAccountTitle(inputValue + "-" + randomNumber);
			break;
		case "description":
			accountspage.enterDescription(inputValue);
			break;
		case "initialBalance":
			accountspage.enterInitialBalance(inputValue);
			break;
		case "accountNumber":
			accountspage.enterAccountNumber(inputValue + randomNumber);
			break;
		case "contactPerson":
			accountspage.enterContactPerson(inputValue);
			break;
		case "Phone":
			accountspage.enterPhone(inputValue);
			break;
		case "internetBankingUR":
			accountspage.enterinternetBankingURL(inputValue);
			break;
		default:
			System.out.println("No Matching input" + inputField);
			break;
		}
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expectedTitle = "×\nAccount Created Successfully";
		String actualTitle = listpage.getAccountStatus();
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("Actual---["+actualTitle+"]---");
		
	}
	@After
	public void closeBrowser() {
		try {
			tearDown();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}

}
