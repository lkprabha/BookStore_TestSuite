package StepDef;

import PageObjects.AvailableBooksPageObject;
import PageObjects.HomePageObject;
import PageObjects.MyBooksPageObject;


public class AddToMyBooksStepdefs {
    public static AvailableBooksPageObject availableBooksPageObject = new AvailableBooksPageObject();
    public static HomePageObject HomePageObject= new HomePageObject();
    public static MyBooksPageObject myBookPage= new MyBooksPageObject();

    public void userClickAvailableBooksTab() {
        HomePageObject.NavigateTo_AvailableBooksPage();
    }
    public void userAvailableBooksPageTitle(String title_availableBooks)throws Throwable  {
        availableBooksPageObject.CheckTitle(title_availableBooks);
    }
    public void userPressAddToMyBookButton(String book) {
        availableBooksPageObject.ClickAddToMyBookButton(book);
    }
    public void userSeesTheMyBooksPageTitle_MyBooks(String title_MyBooks)throws Throwable {
        myBookPage.CheckTitle(title_MyBooks);
    }
}

