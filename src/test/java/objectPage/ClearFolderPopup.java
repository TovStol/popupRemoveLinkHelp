package objectPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ClearFolderPopup {
    String submitButton = ".nb-button[data-dialog-action=\"dialog.submit\"]";
    String cancelButton = ".nb-button[data-dialog-action=\"dialog.cancel\"]";

    public ClearFolderPopup checkExistButtonAndPopup() {


        $(byText("Письма из папки будут удалены навсегда и их нельзя будет восстановить.")).shouldBe(exist);
        $(submitButton).shouldBe(exist);
        $(cancelButton).shouldBe(exist);
        return this;
    }

    public ClearFolderPopup clickCancelButton() {
        $(cancelButton).click();
        return this;
    }

    public ClearFolderPopup clickConfirmButton() {
        $(submitButton).click();
        return this;
    }
}
