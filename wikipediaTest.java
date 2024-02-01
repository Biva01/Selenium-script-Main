import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class wikipediaTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@Before
public void setUp() {
 driver = new ChromeDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}
@After
public void tearDown() {
 driver.quit();
}
@Test
public void test1() {
 driver.get("https://ums.lpu.in/lpuums/LoginNew.aspx");
 driver.manage().window().setSize(new Dimension(546, 518));
 driver.findElement(By.id("txtU")).sendKeys("12003590");
 driver.findElement(By.id("TxtpwdAutoId_8767")).sendKeys("Ak4shLPU#");
 driver.findElement(By.id("TxtpwdAutoId_8767")).sendKeys("Ak4shLPU#");
 driver.findElement(By.id("iBtnLogins")).click();
 {
   WebElement element = driver.findElement(By.cssSelector(".navbar-toggler"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
 }
 {
   WebElement element = driver.findElement(By.cssSelector(".navbar-toggler-icon"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element).perform();
 }
 {
   WebElement element = driver.findElement(By.tagName("body"));
   Actions builder = new Actions(driver);
   builder.moveToElement(element, 0, 0).perform();
// }
// driver.findElement(By.cssSelector(".row:nth-child(3) .main-heading")).click();
// driver.findElement(By.cssSelector(".row:nth-child(3) .main-heading")).click();
// assertThat(driver.findElement(By.cssSelector(".row:nth-child(3) .main-heading")).getText(), is("Important Links and Information"));
}
}
}
