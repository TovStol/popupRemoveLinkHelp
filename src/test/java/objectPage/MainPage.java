package objectPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    String enterButton = "[data-statlog='notifications.mail.logout.enter']";
    public MainPage smokeCheckPage() {
        $(enterButton).shouldBe(visible);
        return this;
    }
    public void clickEnterButton() {
        $(enterButton).click();
    }
}
