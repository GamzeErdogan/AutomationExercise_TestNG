package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    private static WebDriver webDriver;

    public static WebDriver getDriver() {
        String browser = ConfigReader.getProperty("browser");
        if (webDriver == null) {

            switch (browser) {
                case "Firefox":
                    WebDriverManager.firefoxdriver().setup();
                    webDriver = new FirefoxDriver();
                    break;
                case "Chrome":
                    WebDriverManager.chromedriver().setup();
                    webDriver = new ChromeDriver();
                    break;
                case "Safari":
                    WebDriverManager.safaridriver().setup();
                    webDriver = new SafariDriver();
                    break;
                case "Edge":
                    WebDriverManager.edgedriver().setup();
                    webDriver = new EdgeDriver();
                    break;
//                case "cloud" :
//                    String username = PropManager.getProperties(env, "cloud_username");
//                    String accesskey = PropManager.getProperties(env, "cloud_accesskey");
//                    DesiredCapabilities capability = new DesiredCapabilities();
//                    capability.setCapability(CapabilityType.BROWSER_NAME, browser);
//                    capability.setCapability(CapabilityType.PLATFORM_NAME, PropManager.getProperties(env, "platform_name"));
//                    capability.setCapability(CapabilityType.BROWSER_VERSION, PropManager.getProperties(env, "browser_version") );
//
//                    capability.setCapability("build", "Cucumber Sample Build");
//                    capability.setCapability("network", true);
//                    capability.setCapability("video", true);
//                    capability.setCapability("console", true);
//                    capability.setCapability("visual", true);
//                    String gridURL = "https://" + username + ":" + accesskey + "@<your cloud provider>/wd/hub";
//                    RemoteWebDriver connection = new RemoteWebDriver(new URL(gridURL), capability);
//                    log.info(String.valueOf(capability));
//                    log.info(String.valueOf(connection.getSessionId()));
////                    break;
//                default:
//                    log.error("No such a browser type");
//                    break;
            }
            }

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().window().fullscreen();
        return webDriver;
    }

    public static void closeDriver() {
        if (webDriver != null) {
            webDriver.close();
            webDriver = null;
        }

    }

    public static void quitDriver() {
        if (webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }
}
