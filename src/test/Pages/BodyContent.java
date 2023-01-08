package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BodyContent extends Parent{

    public BodyContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//li[@class='ac-gn-item ac-gn-item-menu ac-gn-ipad']")
    private WebElement ipad;

    @FindBy(xpath = "(//span[@class='chapternav-label'])[1]")
    private WebElement pro;

    @FindBy(xpath = "//a[@class='ac-ln-button']")
    private WebElement buy;

    @FindBy(xpath = "(//label[@class='form-selector-label'])[4]/img")
    private WebElement color;

    @FindBy(xpath = "(//label[@class='form-selector-label'])[7]/span[1]")
    private WebElement gb;

    @FindBy(xpath = "(//span[@class='acinstallment-term-length'])[3]")
    private WebElement inch;

    @FindBy(xpath = "(//label[@class='form-selector-label'])[10]")
    private WebElement Connectivity;

    @FindBy(xpath = "//span[@class='form-selector-left-col column large-12']")
    private WebElement engraving;

    @FindBy(xpath = "//button[@data-autom='acc_pencil_section_noaccessory']")
    private WebElement pencil;

    @FindBy(xpath = "(//span[@class='rf-accessorybutton-left-label'])[5]")
    private WebElement keyboard;

    @FindBy(xpath = "(//span[@class='form-selector-title'])[15]")
    private WebElement notrade;

    @FindBy(xpath = "(//span[@class='rf-po-bfe-dimension-base-title'])[1]")
    private WebElement cashbuy;

    @FindBy(xpath = "(//span[@class='form-selector-title'])[16]")
    private WebElement nocare;

    @FindBy(xpath = "//button[@data-autom='add-to-cart']")
    private WebElement bag;

    @FindBy(xpath = "//button[@title='Review Bag']")
    private WebElement reviewbag;

    @FindBy(xpath = "//select[@class='rs-quantity-dropdown form-dropdown-select']")
    private WebElement add;

    @FindBy(xpath = "//div[@class='rs-bag-checkoutbutton rs-bag-checkout-mainbutton']")
    private WebElement checkout;

    @FindBy(xpath = "//button[@id='signIn.guestLogin.guestLogin']")
    private  WebElement guest;

    @FindBy(xpath = "//input[@class='form-textbox-input']")
    private WebElement zipcode;

    @FindBy(xpath = "//button[@class='rf-inlineeditor-apply form-textbox-button']")
    private WebElement zipcodeapply;

    @FindBy(xpath = "//button[@id='rs-checkout-continue-button-bottom']")
    private WebElement shippingadress;

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstname;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastname;

    @FindBy(xpath = "//input[@name='street']")
    private WebElement street;

    @FindBy(xpath = "//input[@name='street2']")
    private WebElement building;

    @FindBy(xpath = "//span[@class='form-checkbox-indicator']")
    private WebElement click;

    @FindBy(xpath = "//input[@name='companyName']")
    private WebElement companyname;

    @FindBy(xpath = "//input[@name='emailAddress']")
    private WebElement email;

    @FindBy(xpath = "//input[@name='fullDaytimePhone']")
    private WebElement phone;

    @FindBy(xpath = "//button[@class='form-button']")
    private WebElement payment;

    @FindBy(xpath = "//input[@aria-describedby='checkout.billing.billingOptions.selectedBillingOptions.creditCard.cardInputs.cardInput-0.cardNumber_error ']")
    private WebElement card;

    @FindBy(xpath = "//input[@aria-describedby='checkout.billing.billingOptions.selectedBillingOptions.creditCard.cardInputs.cardInput-0.expiration_error ']")
    private WebElement expiration;

    @FindBy(xpath = "//input[@aria-describedby='checkout.billing.billingOptions.selectedBillingOptions.creditCard.cardInputs.cardInput-0.securityCode_error ']")
    private WebElement cvv;

    @FindBy(xpath = "//span[@class='form-checkbox-indicator']")
    private WebElement use;

    @FindBy(xpath = "//button[@id='checkout.shipping.addressVerification.selectedAddress.continueWithSelected']")
    private WebElement useadress;

    @FindBy(xpath = "//label[@id='checkout.billing.billingoptions.credit_label']")
    private WebElement creditcardbutton;

    @FindBy(xpath = " //button[@class='form-button']")
    private WebElement rewieww;

    @FindBy(xpath = "//h2[@id='checkout.review.fulfillmentReview.reviewGroup-1-shipquote']")
    private WebElement checkdelivers;

    WebElement myElement22;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "firstname": myElement22 = firstname; break;
            case "lastname": myElement22 = lastname; break;
            case "street": myElement22 = street; break;
            case "building": myElement22 = building; break;
            case "companyname": myElement22 = companyname; break;
            case "email": myElement22 = email; break;
            case "phone": myElement22 = phone; break;
            case "card": myElement22 = card; break;
            case "expiration": myElement22 = expiration; break;
            case "cvv": myElement22 = cvv; break;
            case "zipcode": myElement22 = zipcode; break;
        }

        sendKeysFunction(myElement22, value);
    }

    public void findAndClick(String strElement22) {

        switch (strElement22) {
            //---------------------------------------APPLE-----------

            case "ipad": myElement22= ipad; break;
            case "pro": myElement22= pro; break;
            case "inch": myElement22= inch; break;
            case "buy": myElement22= buy; break;
            case "color": myElement22= color; break;
            case "gb": myElement22= gb; break;
            case "Connectivity": myElement22= Connectivity; break;
            case "engraving": myElement22= engraving; break;
            case "pencil": myElement22= pencil; break;
            case "keyboard": myElement22= keyboard; break;
            case "notrade": myElement22=notrade; break;
            case "cashbuy": myElement22=cashbuy; break;
            case "nocare": myElement22=nocare; break;

            case "bag": myElement22= bag; break;
            case "reviewbag": myElement22= reviewbag; break;
            case "add": myElement22= add; break;
            case "checkout": myElement22= checkout; break;
            case "guest": myElement22= guest; break;
            case "zipcodeapply": myElement22= zipcodeapply; break;
            case "click": myElement22= click; break;
            case "useadress": myElement22= useadress; break;
            case "creditcardbutton": myElement22= creditcardbutton; break;
            case "rewieww": myElement22= rewieww; break;

            case "payment": myElement22= payment; break;
            case "use": myElement22= use; break;
        }
        clickFunction(myElement22);
    }

    public void  findandselectvalue(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "add": myElement22= add; break;

        }

        select(myElement22, text);
    }

    public void  findandscrollclick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {


            case "shippingadress": myElement22= shippingadress; break;
        }

        scrollclick(myElement22);
    }
    public void findAndContainsText(String strElement, String text) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {

            case "checkdelivers": myElement22= checkdelivers; break;

        }

        verifyContainsText(myElement22, text);
    }
}
