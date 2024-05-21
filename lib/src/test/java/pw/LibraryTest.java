package pw;

import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void test() {
        try (var playwright = Playwright.create();
             var browser = playwright.chromium().launch()) {
            var page = browser.newPage();
            page.navigate("https://www.bilibili.com/");
            assertEquals("哔哩哔哩 (゜-゜)つロ 干杯~-bilibili", page.title());
        }
    }
}
