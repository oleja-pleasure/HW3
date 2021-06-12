import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.collections.ItemWithText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.itemWithText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class findJUnit5Example {

    @BeforeAll
    static void setUpConfig() {
        Configuration.browser = "chrome";
        //  Configuration.startMaximized = true;
    }

    @Test
    void findUnit5ExampleTest() {
        open("https://github.com/selenide/selenide");
        $(byText("Wiki")).click();
        $("#wiki-pages-filter").setValue("So");
        $$(".Box-row .d-block").findBy(text("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5"));
    }
}
