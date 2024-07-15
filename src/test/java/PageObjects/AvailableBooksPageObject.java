package PageObjects;

import PageFactory.WebPageFactory;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AvailableBooksPageObject {


    public void CheckTitle(String title){
        try{
            WebPageFactory.wpf.AvailableBooksPage_Title.getText();
        }
        catch(Exception e){
            System.out.println("Page not loaded: Exception");
            throw(e);
        }
    }
    public void ClickAddToMyBookButton(String book){
         try{

//            List<WebElement> listOfRows = WebPageFactory.wpf.AvailableBooksPage_AddToMyBook_List;
            List<WebElement> rows = WebPageFactory.wpf.AvailableBooksPage_AddToMyBook_List;
             for (int i = 0; i < rows.size(); i++) {
                 WebElement row = rows.get(i);
                 if (row.getText().contains(book)) {
                     int roNo= i + 1; // Return 1-based row number
                   //  System.out.println("Matching Book Row Found"+roNo);
                     WebElement addToMyBookButton=  WebPageFactory.wpf.AvailableBooksPage_clickAddBookButton(roNo);
                     addToMyBookButton.click();
                     break;
                 }
             }

        }
        catch(Exception e){

        }

    }
    public void ClickDeleteBookButton(String book) {
        try {
        List<WebElement> listOfRows = WebPageFactory.wpf.AvailableBooksPage_AddToMyBook_List; // take available book list
            for (int i = 0; i < listOfRows.size(); i++) {
                WebElement row = listOfRows.get(i);
                if (row.getText().contains(book)) { // check whether the book available for deletion
                    int roNo= i + 1; // Return 1-based row number
                  //  System.out.println("Matching Book Row Found in row no "+roNo);
                    WebElement delButtonElement=  WebPageFactory.wpf.AvailableBooksPage_clickDeleteButton(roNo);
                   // System.out.println("Web Element found and above to click the Delete button!");
                    delButtonElement.click();
                    break;
                }
            }
        } catch (Exception e) {
        }
    }
    public void ClickEditBookButton(String book) {
        try {
            List<WebElement> listOfRows = WebPageFactory.wpf.AvailableBooksPage_AddToMyBook_List; // take available book list
            for (int i = 0; i < listOfRows.size(); i++) {
                WebElement row = listOfRows.get(i);
                if (row.getText().contains(book)) { // check whether the book available for edit
                    int roNo= i + 1; // Return 1-based row number
                    //  System.out.println("Matching Book Row Found in row no "+roNo);
                    WebElement editButtonElement=  WebPageFactory.wpf.AvailableBooksPage_clickEditButton(roNo);
                    // System.out.println("Web Element found and above to click the Delete button!");
                    editButtonElement.click();
                    break;
                }
            }
        } catch (Exception e) {
        }
    }


    public boolean IsBookAvailable(String book) {
        try {
            List<WebElement> rows = WebPageFactory.wpf.AvailableBooksPage_AddToMyBook_List;
            for (int i = 0; i < rows.size(); i++) {
                WebElement row = rows.get(i);
                if (row.getText().contains(book)) {
                   // System.out.println("Matching Book Row Found");
                    return false;
                }
            }
        } catch (Exception e) {

        }
        return true;
    }

}
