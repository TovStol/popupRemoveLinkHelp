package objectPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ClearFolderPopup {
    public ClearFolderPopup checkExistButtonAndPopup() {
        $(byText("Письма из папки будут удалены навсегда и их нельзя будет восстановить.")).shouldBe(exist);
        $(".nb-button[data-dialog-action=\"dialog.submit\"]").shouldBe(exist);
        $(".nb-button[data-dialog-action=\"dialog.cancel\"]").shouldBe(exist);
        return this;
    }

    public ClearFolderPopup clickCancelButton(){
        $(".nb-button[data-dialog-action=\"dialog.cancel\"]").click();
        return this;
    }
}
