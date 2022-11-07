package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class AddContactsSteps {

    WebDriver driver;

    @Given("Navigate to Home Page for ADD Contact")
    public void navigateToLoginPageForAddContact() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://contacts-app.tobbymarshall815.vercel.app");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("Click on Login tab for ADD Contact")
    public void clickOnLoginTabForAddContact() {
        click(By.xpath("//a[.='LOGIN']"));
    }

    @Then("Appear LoginRegistration form for ADD Contact")
    public void isLoginRegistrationFormPresentForAddContact() {
        Assert.assertTrue(isElementPresent(By.cssSelector(".login_login__3EHKB")));
    }

    @And("Enter valid data for ADD Contact")
    public void enterValidDataForAddContact() {
        type(By.cssSelector("[placeholder='Email']"),"kuku+1@mail.com");
        type(By.cssSelector("[placeholder='Password']"),"kukT12345}~");
    }

    @And("Click on Login button for ADD Contact")
    public void clickOnLoginButtonForAddContact() {
        click(By.xpath("//button[.=' Login']"));

    }

    @And("Click on Add link")
    public void clickOnAddLink(){
        click(By.cssSelector("a:nth-child(5)"));
    }

    @Then("Fill Contact form")
    public void fillContactForm() {
        type(By.cssSelector("input:nth-child(1)"), "Kim");
        type(By.cssSelector("input:nth-child(2)"), "Bessenger");
        type(By.cssSelector("input:nth-child(3)"), "1234567891");
        type(By.cssSelector("input:nth-child(4)"), "kim@gm.com");
        type(By.cssSelector("input:nth-child(5)"), "Berlin");
        type(By.cssSelector("input:nth-child(6)"), "ura!");
    }

    @And("click on Save button")
    public void clickOnSaveButton() {
        click(By.xpath("//button[.='Save']"));
    }

    @Then("Added Contact displayed")
    public void isAddedContcactPresent() {
        Assert.assertTrue(isElementPresent(By.xpath("//*[.='CONTACTS']")));
    }

    private void click(By locator) {
        driver.findElement(locator).click();
    }

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void type(By locator, String text) {
        if (text != null) {
            click(locator);
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
    }

    private boolean isElementPresent(By locator) {
        return driver.findElements(locator).size() > 0;
    }
}
