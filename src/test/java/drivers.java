import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivers {
    @Test
    void testExample() {
        WebDriverManager.chromedriver().setup(); // автоматическая настройка ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        driver.quit();
    }
}
