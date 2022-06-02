package objectPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class InboxPage {
    String toWriteButton = "[href='#compose']";
    String listOfLetters = ".ns-view-messages-item-wrap";
    String selectEmailButton = ".ns-view-toolbar-button-main-select-all";
    String deleteEmailButton = ".ns-view-toolbar-button-delete";
    String confirmDeleteButton = "button.js-confirm-mops";



    public InboxPage smokeCheckPage() {
        $(toWriteButton).shouldBe(visible);
        $(listOfLetters).shouldBe(exist);
        return this;
    }
    public InboxPage deleteAllLetters(){
        $(selectEmailButton).click();
        $(deleteEmailButton).click();
        //$(confirmDeleteButton).click();
        return this;
    }


}
