package org.example.StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.PageObject.HomePage;
import org.example.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;

public class Register extends TestBase {
    private HomePage homePage = PageFactory.initElements(driver, HomePage.class);



    @And("I click on the Account button")
    public void iClickOnTheAccountButton() { homePage.getCreateAccount().click();
    }

    @And("I click on the Register button")
    public void iClickOnTheRegisterButton() {homePage.getRegister().click();
    }
    @And("I type in the First Name to Register")
    public void iTypeInTheFirstNameToRegister() {homePage.getFirstNameToRegister().sendKeys("Gina");
    }

    @And("I type in the Last Name  to Register")
    public void iTypeInTheLastNameToRegister() {homePage.getLastNameToRegister().sendKeys("Brad");
    }


    @And("I type in the Email Address to Register")
    public void iTypeInTheEmailAddressToRegister() {homePage.getEmailAddressToRegister().sendKeys("bradgina1990@gmail.com");
    }

    @And("I type in the Password to Register")
    public void iTypeInThePasswordToRegister() {homePage.getPasswordToRegister().sendKeys("1234567890");
    }

    @And("I type in the Confirm Password to Register")
    public void iTypeInTheConfirmPasswordToRegister() {homePage.getConfirmPassword().sendKeys("1234567890");
    }

    @And("I click on the final Register button")
    public void iClickOnTheFinalRegisterButton() {homePage.getFinalRegister().click();
    }

    @Then("I should see Welcome, Gina Brad!")
    public void iShouldSeeWelcomeGinaBrad() { boolean elementExists = !driver.findElements(By.xpath("//p[@class='welcome-msg']")).isEmpty();
        assertThat ("You are not registered.", elementExists);

    }
}
