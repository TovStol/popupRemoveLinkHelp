package objectPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class DeletedPage {
    String clearFolderLink = "[action=\"folder.clear\"]";

    public DeletedPage checkExistEmail() {
        $(clearFolderLink).shouldBe(exist);
        return this;
    }
}

