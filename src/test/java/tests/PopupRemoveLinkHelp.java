package tests;

import com.codeborne.selenide.Selenide;
import objectPage.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selenide.webdriver;

public class PopupRemoveLinkHelp {
    @BeforeAll
    static void openBrowserLogin() {
        Selenide.open("https://yandex.ru");
        String login = "n.surnametest";
        String password = "!N.surnametest!";
        MainPage mainPage = new MainPage();
        LoginPage loginPage = new LoginPage();
        PasswordPage passwordPage = new PasswordPage();
        UserSideBarMainPage userSideBarMainPage = new UserSideBarMainPage();


        mainPage
                .smokeCheckPage()
                .clickEnterButton();
        loginPage
                .smokeCheckPage()
                .mailLoginMode()
                .inputLogin(login);
        passwordPage
                .smokeCheckPage()
                .inputPassword(password);
        userSideBarMainPage
                .smokeCheckPage()
                .clickMailButton();
        switchTo().window(1);


    }

    @Test
    void popupRemoveLinkHelp() {
        InboxPage inboxPage = new InboxPage();
        DeletedPage deletedPage = new DeletedPage();
        SideBarMailBoxPage sideBarMailBoxPage = new SideBarMailBoxPage();
        ClearFolderPopup clearFolderPopup = new ClearFolderPopup();

        inboxPage
                .smokeCheckPage()
                .deleteAllLetters();
        sideBarMailBoxPage
                .clickDeletedFolder();
        deletedPage
                .checkExistEmail();
        sideBarMailBoxPage
                .clickClearButton();
        clearFolderPopup
                .checkExistButtonAndPopup()
                .clickConfirmButton();
        webdriver().object().navigate().back();
        inboxPage
                .smokeCheckPage();
    }
}
