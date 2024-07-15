package TestCases;
import StepDef.AddToMyBooksStepdefs;
import Utility.PropertyFileHandler;
import Utility.TextFileHandler;

public class AddToMyBooksTest {
    public static AddToMyBooksStepdefs addtomybook= new AddToMyBooksStepdefs();
    public static void TestCaseNumber2() throws Throwable {
        String[] myBookData = TextFileHandler.csvDataRead(PropertyFileHandler.readProperty("AddToBookDataCsv"),5);
        addtomybook.userClickAvailableBooksTab();
        addtomybook.userAvailableBooksPageTitle(myBookData[0]);
        addtomybook.userPressAddToMyBookButton(myBookData[1]);
        addtomybook.userSeesTheMyBooksPageTitle_MyBooks(myBookData[2]);
    }
}

