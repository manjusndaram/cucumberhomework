package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomeworkAccountspage {

	WebDriver driver;
	
	//Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement Phone;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement InternetBankingURL;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SubmitButton;
	
	
	
	
	
	public HomeworkAccountspage(WebDriver driver) {
		this.driver = driver;
	}	
	
	public String getAccountsPageTitle() {
		return driver.getTitle();
	}
	
	// Methods to interact with the elements
		public void enterAccountTitle(String accountTitle) {
			AccountTitle.sendKeys(accountTitle);
			
		}
	
		public void enterDescription(String description) {
			Description.sendKeys(description);
			
		}	
		public void enterInitialBalance(String initialBalance) {
			InitialBalance.sendKeys(initialBalance);
			
		}
		
		public void enterAccountNumber(String accountNumber) {
			AccountNumber.sendKeys(accountNumber);
			
		}
		
		public void enterContactPerson(String contactPerson) {
			ContactPerson.sendKeys(contactPerson);
			
		}
		
		public void enterPhone(String phone) {
			Phone.sendKeys(phone);
			
		}
		
		public void enterinternetBankingURL(String internetBankingURL) {
			InternetBankingURL.sendKeys(internetBankingURL);
			
		}
		public void clickSubmitButton() {
			SubmitButton.click();
			
		}
		
		
}
