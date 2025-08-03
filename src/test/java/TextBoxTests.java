import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.xpath;

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
        String userNumber = "8927850610";
        String subjects = "Maths";
        String file = "png/Скрин.png";
        String currentAddress = "Адрес";

        open("https://demoqa.com/automation-practice-form");


        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(userEmail);
        $("label[for='gender-radio-1']").click();
        $("#userNumber").setValue(userNumber);
        $("[id=dateOfBirthInput]").click();
        $(xpath("//div[contains(@aria-label,'10th')]"))
                .click();
        $("label[for='hobbies-checkbox-1']").click();
        $("#subjectsInput").setValue(subjects).pressEnter();
        $("#uploadPicture").uploadFromClasspath(file);
        $("#currentAddress").setValue(currentAddress);
        $("#stateCity-label").scrollIntoView(true);
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("[id=submit]").click();
    }
}
