package StepDef;

import PageObjects.AvailableBooksPageObject;
import PageObjects.RegistrationPageObject;



public class BookRegisterStepDef {

    public static RegistrationPageObject registrationPageObject= new RegistrationPageObject();
    public static AvailableBooksPageObject availableBookObject = new AvailableBooksPageObject();

    public void userClickNewRegisterTab() throws InterruptedException{
        registrationPageObject.NavigatePageBookRegister();
    }

    public void userSeeTheRegistrationPageTitle(String title_RegisterPage)throws InterruptedException{
        Thread.sleep(3000);
        registrationPageObject.CheckTitle(title_RegisterPage);
    }

    public void userEnterTheBookNameName(String bookName) {
       // System.out.println("----Step Def name para :"+ bookName+"----------");
        registrationPageObject.EnterBook(bookName);
    }

    public void userEnterAuthor(String author) {
        registrationPageObject.EnterAuthorName(author);
    }

    public void userEnterPriceOfTheBookPrice(String price) {
        registrationPageObject.EnterPrice(price);
    }

    public void userPressSubmitButton() throws InterruptedException{
        registrationPageObject.PressSubmitButton();
    }

    public void userSeesTheAvailableBooksPageTitle(String title_AvailableBookPage)throws InterruptedException {
        Thread.sleep(3000);
        availableBookObject.CheckTitle(title_AvailableBookPage);
    }



}
