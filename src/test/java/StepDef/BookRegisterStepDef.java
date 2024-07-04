package StepDef;

import PageObjects.HomePageObject;
import PageObjects.RegistrationPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class BookRegisterStepDef {
    public static HomePageObject homePage= new HomePageObject();
    public static RegistrationPageObject registrationPage= new RegistrationPageObject();

    @Given("^User is navigate to Home page (.+)$")
    public void userIsNavigateToHomePageTitle(String title1)throws Throwable {
        homePage.GotoHome();
        homePage.CheckTitle(title1);
    }

    @And("^User see the Registration page (.+)$")
    public void userSeeTheRegistrationPageTitle(String tilte2)throws Throwable {
       homePage.NavigatePageBookRegister();
        homePage.CheckTitle(tilte2);
    }

    @And("^User enter the book Name (.+)$")
    public void userEnterTheBookNameName(String name) {
        registrationPage.EnterBook(name);
    }

    @And("^User enter name of the Author (.+)$")
    public void userEneterNameOfTheAuthorAuthor(String author) {
        registrationPage.EnterAuthorName(author);
    }

    @And("^User enter price of the book (.+)$")
    public void userEnterPriceOfTheBookPrice(String price) {
        registrationPage.EnterPrice(price);
    }

    @And("User press Submit Button")
    public void userPressSubmitButton() {
        registrationPage.PressSubmitButton();
    }

    @Then("User sees the available books page (.+)")
    public void userSeesTheAvailableBooksPageTitle(String title3) {
        homePage.CheckTitle(title3);
    }

    @And("User click the Registration Tab")
    public void userClickTheRegistrationPage() {

    }
}
