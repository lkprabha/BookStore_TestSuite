package StepDef;

import PageObjects.AvailableBooksPageObject;
import PageObjects.RegistrationPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class BookRegisterStepDef {

    public static RegistrationPageObject registrationPageObject= new RegistrationPageObject();
    public static AvailableBooksPageObject availablebokPageObject = new AvailableBooksPageObject();

    @And("User click the Registration Tab")
    public void userClickTheRegistrationPage() {
        registrationPageObject.NavigatePageBookRegister();
    }

    @And("^User see the Registration page (.+)$")
    public void userSeeTheRegistrationPageTitle(String tilte2)throws Throwable {
        registrationPageObject.CheckTitle(tilte2);
    }

    @And("^User enter the book Name (.+)$")
    public void userEnterTheBookNameName(String name) {
        registrationPageObject.EnterBook(name);
    }

    @And("^User enter name of the Author (.+)$")
    public void userEneterNameOfTheAuthorAuthor(String author) {
        registrationPageObject.EnterAuthorName(author);
    }

    @And("^User enter price of the book (.+)$")
    public void userEnterPriceOfTheBookPrice(String price) {
        registrationPageObject.EnterPrice(price);
    }

    @And("User press Submit Button")
    public void userPressSubmitButton() {
        registrationPageObject.PressSubmitButton();
    }

    @Then("User sees the available books page (.+)")
    public void userSeesTheAvailableBooksPageTitle(String title3) {
        availablebokPageObject.CheckTitle(title3);
    }


}
