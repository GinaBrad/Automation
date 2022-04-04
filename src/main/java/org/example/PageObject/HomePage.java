package org.example.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    public WebElement getMenLink() {
        return menLink;
    }

    @FindBy(xpath = "//a[text()='Men']")
    public WebElement menLink;

    public WebElement getBasicIndoor() {
        return basicIndoor;
    }

    @FindBy(id = "product-collection-image-1122")
    public WebElement basicIndoor;

    public WebElement getAddToCart() {
        return addToCart;
    }

    @FindBy(css = "div.add-to-cart-buttons")
    public WebElement addToCart;

    public WebElement getProceedToCheckout() {
        return proceedToCheckout;
    }

    @FindBy(xpath = "//ul[@class='checkout-types bottom']")
    public WebElement proceedToCheckout;

    public WebElement getContinueAsGuest() {
        return continueAsGuest;

    }

    @FindBy(id = "onepage-guest-register-button")
    public WebElement continueAsGuest;


    public WebElement getFirstName() {
        return firstName;
    }

    @FindBy(id = "billing:firstname")
    public WebElement firstName;

    public WebElement getLastName() {
        return lastName;
    }

    @FindBy(id = "billing:lastname")
    public WebElement lastName;

    public WebElement getEmailAddress() {
        return emailAddress;
    }

    @FindBy(id = "billing:email")
    public WebElement emailAddress;

    public WebElement getAddress() {
        return address;
    }

    @FindBy(id = "billing:street1")
    public WebElement address;

    public WebElement getCity() {
        return city;
    }

    @FindBy(id = "billing:city")
    public WebElement city;

    public WebElement getZipCode() {
        return zipCode;
    }

    @FindBy(id = "billing:postcode")
    public WebElement zipCode;


    public WebElement getCountry() {
        return country;


    }

    @FindBy(id = "billing:country_id")
    public WebElement country;


    @FindBy(id = "billing:telephone")
    public WebElement telephone;

    public WebElement getTelephone() {
        return telephone;
    }

    public WebElement getStateOrProvince() {
        return stateOrProvince;
    }

    @FindBy(id = "billing:region_id")
    public WebElement stateOrProvince;

    public WebElement getContinueButton() {
        return continueButton;
    }

    @FindBy(css = " button[title='Continue']")
    public WebElement continueButton;

    public WebElement getContinueBtt() {
        return continueBtt;
    }

    @FindBy(xpath = "//button[@onclick='shippingMethod.save()']")
    public WebElement continueBtt;

    public WebElement getNextButton() {
        return nextButton;
    }

    @FindBy(xpath = "//button[@onclick='payment.save()']")
    public WebElement nextButton;

    public WebElement getPlaceOrder() {
        return placeOrder;
    }

    @FindBy(id = "review-buttons-container")
    public WebElement placeOrder;

    public WebElement getAccessories() {
        return accessories;
    }

    @FindBy(xpath = "//a[text()='Accessories']")
    public WebElement accessories;

    public WebElement getLordOfTheRings() {
        return lordOfTheRings;
    }

    @FindBy(id = "product-collection-image-1107")
    public WebElement lordOfTheRings;

    public WebElement getQuantity() {
        return quantity;


    }

    @FindBy(xpath = "//input[@class='input-text qty']")
    public WebElement quantity;


    public WebElement getFreeShipping() {
        return freeShipping;
    }

    @FindBy(id = "s_method_freeshipping_freeshipping")
    public WebElement freeShipping;


    public WebElement getHomeAndDecor() {
        return homeAndDecor;
    }

    @FindBy(xpath = "//a[text()='Home & Decor']")
    public WebElement homeAndDecor;

    public WebElement getPillowAndThrowSet() {
        return pillowAndThrowSet;
    }

    @FindBy(id = "product-collection-image-447")
    public WebElement pillowAndThrowSet;

    public WebElement getAccentPillow() {
        return accentPillow;
    }

    @FindBy(id = "bundle-option-24")
    public WebElement accentPillow;


    public WebElement getCartile() {
        return cartile;


    }

    @FindBy(xpath = "//a[text()='Cartile']")
    public WebElement cartile;

    public WebElement getDeLaIdeeLaBani() {
        return deLaIdeeLaBani;
    }

    @FindBy(id = "product-collection-image-973")
    public WebElement deLaIdeeLaBani;


    public WebElement getCosplayOutfit() {
        return cosplayOutfit;
    }

    @FindBy(xpath = "//a[text()='Cosplay Outfit']")
    public WebElement cosplayOutfit;

    public WebElement getSakuraBlossom() {
        return sakuraBlossom;
    }

    @FindBy(xpath = "//a[text()='Sakura blossom flower dress , inspirat from anime ']")
    public WebElement sakuraBlossom;


    public WebElement getFlatRate() {
        return flatRate;
    }

    @FindBy(id = "s_method_flatrate_flatrate")
    public WebElement flatRate;

    public WebElement getLittleOnes() {
        return littleOnes;
    }

    @FindBy(xpath = "//a[text()='Little Ones']")
    public WebElement littleOnes;

    public WebElement getFlowerPower() {
        return flowerPower;
    }

    @FindBy(id = "product-collection-image-1103")
    public WebElement flowerPower;


    public WebElement getVip() {
        return vip;
    }

    @FindBy(xpath = "//a[text()='VIP']")
    public WebElement vip;

    public WebElement getIphone13Pro() {
        return iphone13Pro;
    }

    @FindBy(id = "product-collection-image-1132")
    public WebElement iphone13Pro;


    public WebElement getMemorieInterna() {
        return memorieInterna;
    }

    @FindBy(id = "bundle-option-31")
    public WebElement memorieInterna;

    public WebElement getSport() {
        return sport;
    }

    @FindBy(xpath = "//a[text()='SPORT']")
    public WebElement sport;

    public WebElement getFitnessShorts() {
        return fitnessShorts;


    }

    @FindBy(id = "product-collection-image-1000")
    public WebElement fitnessShorts;

    public WebElement getShortsColour() {
        return shortsColour;
    }

    @FindBy(id = "select_11")
    public WebElement shortsColour;

    public WebElement getShortsSize() {
        return shortsSize;


    }

    @FindBy(id = "select_12")
    public WebElement shortsSize;

    public WebElement getTestCategory() {
        return testCategory;
    }

    @FindBy(xpath = "//a[text()='Test category']")
   public WebElement testCategory;

    public WebElement getSnowdrop() {
        return snowdrop;
    }

    @FindBy(id = "product-collection-image-1027")
    public WebElement snowdrop;


    public WebElement getPlante() {
        return plante;
    }

    @FindBy(xpath = "//a[text()='plante']")
    public WebElement plante;

    public WebElement getOxalisPlanta() {
        return oxalisPlanta;
    }

    @FindBy(id = "product-collection-image-1044")
    public WebElement oxalisPlanta;

    public WebElement getBougie() {
        return bougie;
    }

    @FindBy(xpath = "//a[text()='Bougie']")
    public WebElement bougie;

    public WebElement getGucianna() {
        return gucianna;
    }

    @FindBy(id = "product-collection-image-1023")
    public WebElement gucianna;


    public WebElement getCatTest() {
        return catTest;
    }

    @FindBy(xpath = "//a[text()='CatTest']")
    public WebElement catTest;


    public WebElement getClimateSaving() {
        return climateSaving;
    }

    @FindBy(id = "product-collection-image-1184")
    public WebElement climateSaving;



//register


    public WebElement getCreateAccount() {
        return createAccount;
    }

    @FindBy(xpath = "//span[text()='Account']")
    private WebElement createAccount;

    public WebElement getRegister() {
        return register;
    }

    @FindBy(xpath = "//a[text()='Register']")
    public WebElement register;

    public WebElement getFirstNameToRegister() {
        return firstNameToRegister;
    }

    @FindBy(id = "firstname")
public WebElement firstNameToRegister;

    public WebElement getLastNameToRegister() {
        return lastNameToRegister;
    }

    @FindBy(id = "lastname")
public WebElement lastNameToRegister;


    public WebElement getEmailAddressToRegister() {
        return emailAddressToRegister;
    }

    @FindBy(id = "email_address")
    public WebElement emailAddressToRegister;


    public WebElement getPasswordToRegister() {
        return passwordToRegister;
    }

    @FindBy(id = "password")
    public WebElement passwordToRegister;

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    @FindBy(id = "confirmation")
    public WebElement confirmPassword;


    public WebElement getFinalRegister() {
        return finalRegister;
    }

    @FindBy(xpath = "//span[text()='Register']")
    public WebElement finalRegister;


    //LogIn


    public WebElement getLogIn() {
        return logIn;
    }

    @FindBy(xpath = "//a[text()='Log In']")
    public WebElement logIn;


    public WebElement getEmailToLogIn() {
        return emailToLogIn;
    }

    @FindBy(id = "email")
    public WebElement emailToLogIn;


    public WebElement getPasswordToLogIn() {
        return passwordToLogIn;
    }

    @FindBy(id = "pass")
    public WebElement passwordToLogIn;

    public WebElement getFinalLogIn() {
        return finalLogIn;
    }

    @FindBy(id = "send2")
    public WebElement finalLogIn;
}


