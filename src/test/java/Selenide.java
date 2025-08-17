import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class Selenide {
    @Test
    void SoftAssertions () {
        String softAssertions = "//a[@href='/selenide/selenide/wiki/SoftAssertions']";
        String juntFind = "@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "@Test\n" +
                "void test() {\n" +
                "Configuration.assertionMode = SOFT;\n" +
                "open(\"page.html\");\n" +
                "$(\"#first\").should(visible).click();\n" +
                "$(\"#second\").should(visible).click();\n" +
                "}\n" +
                "}";
        open("https://github.com/");
        $(".header-search-button").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("[data-testid='results-list'] div").first().$("a").click();
        $("#wiki-tab").click();
        $x(softAssertions).shouldHave(text("Soft assertions"));
        $$x(softAssertions).first().click();
        $("body").shouldHave(text(juntFind));
    }

    @Test
    void DragAndDrop () {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
