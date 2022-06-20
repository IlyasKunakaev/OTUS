package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest {
    private ChromeDriver driver;
    private final By title = By.xpath("//div[@class='title-new__text']//h1");

    @BeforeMethod
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void simpleTest() {
        driver.get("https://otus.ru/");
    }

    @AfterMethod
    void tearDown() {
        driver.close();
    }
}
