package PageObjects;

import PageFactory.WebPageFactory;

public class MyBooksPageObject {
    public void CheckTitle(String title){
        try{
            //      System.out.println("Inside AvailableBooksPageObject");
            WebPageFactory.wpf.MyBooksPage_Title.getText();
        }
        catch(Exception e){
            System.out.println("Page not loaded: Exception");
            throw(e);
        }
    }
}
