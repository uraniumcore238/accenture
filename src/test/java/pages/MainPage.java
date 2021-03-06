package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class MainPage {

    public void OpenMainPage() {
        step("Open main page", () -> open(""));

        step("Check the menu", () -> {
            $("[data-cell='GH1']>span").shouldHave(text("Insights"));
        });

    }
//
//    public void OpenBlogPage() {
//
//        step("Click on blog button in main menu", () -> {
//            $("[data-cell='GH1'] span").click();
//        });
//    }
//
//    public void OpenContactsPage() {
//
//        step("Click on contact button in main menu", () -> {
//            $("a[href='/contact']").click();
//        });
//    }
//
//    public void OpenNoveoUniversityPage() {
//
//        step("Click on Noveo University button in main menu", () -> {
//            $("a[href='https://university.noveogroup.ru/']").click();
//            Selenide.switchTo().window("Noveo University");
//            $("h1").shouldHave(text("Твой путь в IT –"));
//
//        });
//
//    }
//
//    public void CheckPresenceOfMainDivisions() {
//
//        step("Check main division's titles presence", () -> {
//            $(".index-vacancies").shouldHave(text("Горячие вакансии"));
//            $(".index-office").shouldHave(text("Офисы разработки"));
//            $(".index-stages").shouldHave(text("Этапы отбора"));
//            $(".index-blog").shouldHave(text("Наш блог"));
//
//        });
//
//    }
//
//    public void CheckPresenceOfIndexStagesDivisions() {
//
//        step("Check stages division's titles presence", () -> {
//            $(".index-stages__one").shouldHave(text("1. Рассмотрение резюме"));
//            $(".index-stages__two").shouldHave(text("2. Тестовое задание"));
//            $(".index-stages__three").shouldHave(text("3. Собеседование"));
//            $(".index-stages__four").shouldHave(text("4. Job-offer"));
//
//        });
//
//    }

}
