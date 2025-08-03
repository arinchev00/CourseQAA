import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll () {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "none";
    }

    @Test
    void fillFormTest () {
        String firstName = "Илья";
        String lastName = "Аринчев";
        String userEmail = "arinchev00@rambler.ru";

        open("https://demoqa.com/automation-practice-form");


        $("[id=firstName]").setValue(firstName);
        $("[id=lastName]").setValue(lastName);
        $("[id=userEmail]").setValue(userEmail);
        $("[id=submit]").scrollIntoView(true).click();
        $("[id=submit]").scrollIntoView(true).click();
    }
}
