package objectPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

public class DeletedPage {

public DeletedPage checkExistEmail(){
    $("[action=\"folder.clear\"]").shouldBe(exist);
    return this;
}
}

