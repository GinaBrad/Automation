package org.example.StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.PageObject.HomePage;
import org.example.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.MatcherAssert.assertThat;

public class CheckOutUserSteps extends TestBase {

    private HomePage homePage = PageFactory.initElements(driver, HomePage.class);



    @And("I click on the Men link")
    public void iClickOnTheMenLink() {homePage.menLink.click();
    }

    @And("I click on the Basic Indoor link")
    public void iClickOnTheBasicIndoorLink() {homePage.basicIndoor.click();
    }

    @And("I click on the Add to Cart button")
    public void iClickOnTheAddToCartButton() {homePage.addToCart.click();
    }

    @And("I click on the Proceed to Checkout")
    public void iClickOnTheProceedToCheckout() {homePage.proceedToCheckout.click();
    }

    @And("I click on the Continue as a Guest")
    public void iClickOnTheContinueAsAGuest() {homePage.getContinueAsGuest().click();
    }

    @And("I type in the First Name field")
    public void iTypeInTheFirstNameField() {homePage.firstName.sendKeys("Gina");
    }


    @And("I type in the Last Name field")
    public void iTypeInTheLastNameField() {homePage.getLastName().sendKeys("Brad");
    }

    @And("I type in the Email Address field")
    public void iTypeInTheEmailAddressField() {homePage.getEmailAddress().sendKeys("bradgina1990@gmail.com");
    }

    @And("I type in the Address field")
    public void iTypeInTheAddressField() {homePage.getAddress().sendKeys("str.Oasului,nr.285");
    }

    @And("I type in the City field")
    public void iTypeInTheCityField() {homePage.getCity().clear();
                                        homePage.getCity().sendKeys("Hollywood");
    }
    @And("I type in the ZIP code field")
    public void iTypeInTheZIPCodeField() {homePage.zipCode.clear();
        homePage.zipCode.sendKeys("90011");
    }

    @And("I type in the Country field")
    public void iTypeInTheCountryField() {homePage.getCountry().sendKeys("Statele Unite ale Americii");
    }

    @And("I type in the Telephone field")
    public void iTypeInTheTelephoneField() {homePage.getTelephone().sendKeys("0737670490");
    }

    @And("I select from the drop down the State or Province")
    public void iSelectFromTheDropDownTheStateOrProvince() {homePage.getStateOrProvince().sendKeys("Colorado" + Keys.ENTER);
    }

    @And("I click the continue button")
    public void iClickTheContinueButton() {homePage.getContinueButton().click();
    }

    @And("I click on the Continue button from Checkout")
    public void iClickOnTheContinueButtonFromCheckout() throws InterruptedException {
        Thread.sleep(1000);
        homePage.getContinueBtt().click();
    }

    @And("I click the next Continue button")
    public void iClickTheNextContinueButton() {homePage.getNextButton().click();
    }

    @And("I click on the Place Order button")
    public void iClickOnThePlaceOrderButton() {homePage.getPlaceOrder().click();
    }

    @Then("I should see Thank you for your Purchase!")
    public void iShouldSeeThankYouForYourPurchase() {
        boolean elementExists = !driver.findElements(By.xpath("//div[@class='page-title']")).isEmpty();
        assertThat("Element is not present.", elementExists);
    }

    @And("I click on the Accessories link")
    public void iClickOnTheAccessoriesLink() {homePage.getAccessories().click();
    }

    @And("I click on the Lord of the Rings link")
    public void iClickOnTheLordOfTheRingsLink() {homePage.getLordOfTheRings().click();
    }

    @And("I type in the input Quantity")
    public void iTypeInTheInputQuantity() {
        homePage.getQuantity().clear();
        homePage.getQuantity().sendKeys("2");
    }

    @And("I click on Free Shipping")
    public void iClickOnFreeShipping() {homePage.getFreeShipping().click();
    }


    @And("I click on the Home and Decor link")
    public void iClickOnTheHomeAndDecorLink() {homePage.getHomeAndDecor().click();
    }

    @And("I click on the Pillow and Throw Set link")
    public void iClickOnThePillowAndThrowSetLink() {homePage.getPillowAndThrowSet().click();
    }


    @And("I select from the drop down the Accent Pillow")
    public void iSelectFromTheDropDownTheAccentPillow() {homePage.getAccentPillow().sendKeys("Titian Raw Silk Pillow");
    }


    @And("I click on the Cartile link")
    public void iClickOnTheCartileLink() {homePage.getCartile().click();
    }

    @And("I click on the De La Idee La Bani")
    public void iClickOnTheDeLaIdeeLaBani() {homePage.getDeLaIdeeLaBani().click();
    }


    @And("I click on the Cosplay Outfit link")
    public void iClickOnTheCosplayOutfitLink() {homePage.getCosplayOutfit().click();
    }

    @And("I click on the SAKURA BLOSSOM FLOWER DRESS , INSPIRAT FROM ANIME")
    public void iClickOnTheSAKURABLOSSOMFLOWERDRESSINSPIRATFROMANIME() {homePage.getSakuraBlossom().click();
    }

    @And("I click on the Flat Rate")
    public void iClickOnTheFlatRate() {homePage.getFlatRate().click();
    }

    @And("I click on the Little Ones link")
    public void iClickOnTheLittleOnesLink() {homePage.getLittleOnes().click();
    }

    @And("I click on the Flower power")
    public void iClickOnTheFlowerPower() {homePage.getFlowerPower().click();
    }


    @And("I click on the VIP link")
    public void iClickOnTheVIPLink() {homePage.getVip().click();
    }

    @And("I click on the Iphone {int} Pro")
    public void iClickOnTheIphonePro(int arg0) {homePage.getIphone13Pro().click();
    }

    @And("I select from the drop down the Memorie Interna")
    public void iSelectFromTheDropDownTheMemorieInterna() {homePage.getMemorieInterna().sendKeys("Memorie 256 GB  +1000,00 LEU");
    }

    @And("I click on the Sport link")
    public void iClickOnTheSportLink() {homePage.getSport().click();
    }

    @And("I click on the Fitness Shorts")
    public void iClickOnTheFitnessShorts() {homePage.getFitnessShorts().click();
    }

    @And("I select from the drop down the Colour")
    public void iSelectFromTheDropDownTheColour() {homePage.getShortsColour().sendKeys("Black");
    }

    @And("I select from the drop down the Size")
    public void iSelectFromTheDropDownTheSize() {homePage.getShortsSize().sendKeys("Small");
    }

    @And("I click on the Test Category link")
    public void iClickOnTheTestCategoryLink() {homePage.getTestCategory().click();
    }

    @And("I click on the Snowdrop \\(Ghiocel)")
    public void iClickOnTheSnowdropGhiocel() {homePage.getSnowdrop().click();
    }

    @And("I click on the Plante link")
    public void iClickOnThePlanteLink() {homePage.getPlante().click();
    }

    @And("I click on the Oxalis Planta")
    public void iClickOnTheOxalisPlanta() {homePage.getOxalisPlanta().click();
    }

    @And("I click on the Bougie link")
    public void iClickOnTheBougieLink() {homePage.getBougie().click();
    }

    @And("I click on the Gucianna Lucrentianna")
    public void iClickOnTheGuciannaLucrentianna() {homePage.getGucianna().click();
    }

    @And("I click on the Cattest link")
    public void iClickOnTheCattestLink() {homePage.getCatTest().click();
    }

    @And("I click on the Climate Saving Plant-Indoor")
    public void iClickOnTheClimateSavingPlantIndoor() {homePage.getClimateSaving().click();
    }
}
