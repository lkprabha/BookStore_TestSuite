package TestCases;

import StepDef.EditAvailableBooksStepDef;
import Utility.PropertyFileHandler;
import Utility.TextFileHandler;

public class AvailableBooksEditTest {
    public static EditAvailableBooksStepDef editBooks  = new EditAvailableBooksStepDef();
    public static void TestCaseNumber4() throws Throwable {
        String[] myBookData = TextFileHandler.csvDataRead(PropertyFileHandler.readProperty("EditAvailableBooksCsv"),2);
        //  System.out.println("Inside the Third test");
        editBooks.userClickAvailableBooksTab();
        editBooks.userAvailableBooksPageTitle(myBookData[0]);
        editBooks.userPressEditButton(myBookData[1]);
       // editBooks.userSeeBookDeleted(myBookData[0]);
    }

}
