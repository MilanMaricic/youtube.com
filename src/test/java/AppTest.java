import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {
    private String siteURL = "https://www.youtube.com/";
    private String projectLocation = System.getProperty("user.dir");
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver",projectLocation+"\\lib\\chromedriver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void loadPageTest(){
        driver.get(siteURL);
        Assert.assertEquals(driver.getTitle(), "YouTube");
        driver.quit();
    }

}
