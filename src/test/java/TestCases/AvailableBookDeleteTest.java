package TestCases;

import StepDef.DeleteAvailableBookStepDef;
import Utility.PropertyFileHandler;
import Utility.TextFileHandler;

public class AvailableBookDeleteTest {
    public static DeleteAvailableBookStepDef deleteStepDef = new DeleteAvailableBookStepDef();
    public static void TestCaseNumber3() throws Throwable {
        String[] myBookData = TextFileHandler.csvDataRead(PropertyFileHandler.readProperty("DeleteAvailableBookCsv"),2);
      //  System.out.println("Inside the Third test");
        deleteStepDef.userClickAvailableBooksTab();
        deleteStepDef.userAvailableBooksPageTitle(myBookData[0]);
        deleteStepDef.userPressDeleteButton(myBookData[1]);
        deleteStepDef.userSeeBookDeleted(myBookData[0]);
    }

}
