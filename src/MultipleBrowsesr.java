import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowsesr {


    static String browser = "edge";
    static String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public void multiDriver() {
        if (browser.equalsIgnoreCase("chorme")) {
            System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase(("edge"))) {
            System.setProperty("webdriver.edge.driver", "driver/msedgedriver.exe");
             driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
           driver = new FirefoxDriver();
        } else {
            System.out.println("Incorrect Browser name ");
        }
        driver.get(baseUrl);
    }


    public static void main(String[] args) {
        MultipleBrowsesr obj = new MultipleBrowsesr();
        obj.multiDriver();
    }


}
