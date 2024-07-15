package TestCases;

import StepDef.BookRegisterStepDef;
import Utility.PropertyFileHandler;
import Utility.TextFileHandler;

public class BookRegisterTest{

    public static BookRegisterStepDef bookreg= new BookRegisterStepDef();

    public static void TestCaseNumber1() throws Throwable {
        String[] sequence = TextFileHandler.csvDataRead(PropertyFileHandler.readProperty("RegisterBookDataCsv"),5);
        bookreg.userClickNewRegisterTab();
        bookreg.userSeeTheRegistrationPageTitle(sequence[0]);
        bookreg.userEnterTheBookNameName(sequence[1]);
        bookreg.userEnterAuthor(sequence[2]);
        bookreg.userEnterPriceOfTheBookPrice(sequence[3]);
        bookreg.userPressSubmitButton();
        bookreg.userSeesTheAvailableBooksPageTitle(sequence[4]);
    }

}
