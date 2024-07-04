package TestCases;

import StepDef.BookRegisterStepDef;

import java.io.IOException;

public class BookRegisterTest {
    public static BookRegisterStepDef bookreg= new BookRegisterStepDef();
    public static void TestCaseNumber1() throws IOException, InterruptedException{
        bookreg.userClickTheRegistrationPage();
        bookreg.userEnterTheBookNameName("name");
        bookreg.userEneterNameOfTheAuthorAuthor("author");
        bookreg.userEnterPriceOfTheBookPrice("price");
        bookreg.userPressSubmitButton();
    }

}
