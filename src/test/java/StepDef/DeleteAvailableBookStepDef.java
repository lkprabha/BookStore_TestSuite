package StepDef;

import PageObjects.AvailableBooksPageObject;
import PageObjects.HomePageObject;
import PageObjects.MyBooksPageObject;

public class DeleteAvailableBookStepDef {
    public static AvailableBooksPageObject availableBooksPageObject = new AvailableBooksPageObject();
    public static PageObjects.HomePageObject HomePageObject= new HomePageObject();
    public static MyBooksPageObject myBookPage= new MyBooksPageObject();

    public void userClickAvailableBooksTab() {
       // System.out.println("Navigating to Available Books Page");
        HomePageObject.NavigateTo_AvailableBooksPage();
    }
    public void userAvailableBooksPageTitle(String title_availableBooks)throws Throwable  {
           availableBooksPageObject.CheckTitle(title_availableBooks);
    }
    public void userPressDeleteButton(String book) {
       // System.out.println("Click the delete button with book "+book);
        availableBooksPageObject.ClickDeleteBookButton(book);
    }
    public void userSeeBookDeleted(String book) {
        boolean isAvailable = availableBooksPageObject.IsBookAvailable(book);
        if (!isAvailable) {
            System.out.println("The book is available.Deletion unsuccessful");
        } else {
            System.out.println("The book is not available.Delete complete");
        }


    }
}
