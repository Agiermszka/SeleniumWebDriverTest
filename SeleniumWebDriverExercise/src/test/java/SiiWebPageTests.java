import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SiiWebPageTests {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {

        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver(); // inicjalizacja ChromeDrivera
    }

    @Test
    public void TestPrintSiiPageTitleOnConsole() {
        driver.get("https://sii.pl/"); // uruchomienie strony Sii Polska

        driver.getTitle(); // pobranie tytułu strony

        System.out.println(driver.getTitle()); // pobranie tytułu strony i wyświetlenie go w konsoli
    }

    @AfterTest
    public void tearDown() {
        driver.close(); // zamknięcie przeglądarki
    }
}
