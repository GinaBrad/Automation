package org.example.StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.PageObject.HomePage;
import org.example.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;

public class LogIn extends TestBase {
    private HomePage homePage = PageFactory.initElements(driver, HomePage.class);


    @And("I click on the Log In")
    public void iClickOnTheLogIn() {homePage.getLogIn().click();
    }

    @And("I type in the Email Address to LogIn")
    public void iTypeInTheEmailAddressToLogIn() {homePage.getEmailToLogIn().sendKeys("bradgina1990@gmail.com");
    }

    @And("I type in the Password to LogIn")
    public void iTypeInThePasswordToLogIn() {homePage.getPasswordToLogIn().sendKeys("123456");
    }

    @And("I click on the LOGIN")
    public void iClickOnTheLOGIN() {homePage.getFinalLogIn().click();
    }


}
