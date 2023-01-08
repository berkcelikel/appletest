package StepDefinitions;

import Pages.BodyContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class AppleTestStep {

    BodyContent apple = new BodyContent();

    @Given("Nagivgate to apple.com")
    public void nagivgateToAppleCom() {
        GWD.getDriver().get("https://www.apple.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @And("Click to mobile phone")
    public void clickToMobilePhone(DataTable mobile) {

        List<String> listElement = mobile.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            apple.findAndClick(listElement.get(i));
        }
    }

    @And("Click to buy")
    public void clickToBuy(DataTable click) {
        List<String> listElement = click.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            apple.findAndClick(listElement.get(i));
        }

    }

    @And("Chose the info")
    public void choseTheInfo(DataTable chose) {
        List<String> listElement = chose.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            apple.findAndClick(listElement.get(i));
        }

    }

    @And("Add to Bag")
    public void addToBag(DataTable bag) {
        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();

        js.executeScript("window.scrollBy(0,400)");

        List<String> listElement = bag.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            apple.findAndClick(listElement.get(i));
        }
    }

    @And("Select Value")
    public void selectValue(DataTable value) {

        List<List<String>> listElement = value.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            apple.findandselectvalue(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }

    @And("Scrool")
    public void scrool(DataTable checkout) {
        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();

        js.executeScript("window.scrollBy(0,850)");

        List<String> listElement = checkout.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            apple.findAndClick(listElement.get(i));
        }
    }

    @And("Code Write")
    public void codeWrite(DataTable zipcode) {

        List<List<String>> listElement = zipcode.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            apple.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));


    }

    @And("Checkout")
    public void checkout(DataTable check) {

        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();

        js.executeScript("window.scrollBy(0,850)");

        List<String> listElement = check.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            apple.findandscrollclick(listElement.get(i));
        }
    }

    @And("Code Write Scrool")
    public void codeWriteScrool(DataTable info) {

        JavascriptExecutor js= (JavascriptExecutor) GWD.getDriver();

        js.executeScript("window.scrollBy(0,250)");

        List<List<String>> listElement = info.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            apple.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("Check the Delivery")
    public void checkTheDelivery(DataTable confirm) {

        List<String> listElement = confirm.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            apple.findAndContainsText("checkdelivers","Delivers");
        }
    }
}
