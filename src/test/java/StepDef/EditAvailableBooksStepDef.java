package StepDef;

import static StepDef.AddToMyBooksStepdefs.HomePageObject;
import static StepDef.DeleteAvailableBookStepDef.availableBooksPageObject;

public class EditAvailableBooksStepDef {

    public void userClickAvailableBooksTab() {
        HomePageObject.NavigateTo_AvailableBooksPage();
    }
    public void userAvailableBooksPageTitle(String title_availableBooks)throws Throwable  {
        availableBooksPageObject.CheckTitle(title_availableBooks);
    }
    public void userPressEditButton(String book) {
       availableBooksPageObject.ClickEditBookButton(book);

    }
    public void userSeeEditBooksPageTitle(String title_editBooks)throws Throwable  {
        availableBooksPageObject.CheckTitle(title_editBooks);
    }
    public void userEnterName(String name)throws Throwable{

    }
    public void userEnterAuthor(String author)throws Throwable{

    }
    public void userEnterPrice(String price)throws Throwable{

    }
    public void userClickSubmitButton(){

    }
//    public void userAvailableBooksPageTitle(String title_availableBooks)throws Throwable  {
//        availableBooksPageObject.CheckTitle(title_availableBooks);
//    }

}
