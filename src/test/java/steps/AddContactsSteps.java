package steps;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class AddContactsSteps {

    WebDriver driver;


    @And("Click on Add link")
    public void clickOnAddLink(){
       // pause(2000);
        click(By.xpath("//a[contains(text(),'ADD')]"));
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
}
