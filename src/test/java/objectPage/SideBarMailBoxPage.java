package objectPage;

import static com.codeborne.selenide.Selenide.$;

public class SideBarMailBoxPage {
    String deleteFolder = "[data-title=\"Удалённые\"]";
    String clearButton = ".mail-NestedList-Item-Clean";

    public SideBarMailBoxPage clickDeletedFolder() {
        $(deleteFolder).click();
        return this;
    }

    public void clickClearButton() {
        $(clearButton).hover().click();
    }
}
