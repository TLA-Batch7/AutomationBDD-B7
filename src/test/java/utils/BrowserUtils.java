package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtils {
    private BrowserUtils(){};
    private static WebDriver driver = null;

    public static WebDriver getDriver(){
        if (driver == null){
            initializeDriver("chrome");
        }
        return driver;
    }

    public static void closeDriver(){
        driver.close();
        driver = null;
    }

    private static void initializeDriver(String browser){
        switch(browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
        }
    }



    public static void switchToNewWindow(WebDriver driver){
        for(String each: driver.getWindowHandles()){
            if(!each.equalsIgnoreCase(driver.getWindowHandle())) {
                System.out.println(driver.getTitle());
                System.out.println(driver.getCurrentUrl());
                driver.switchTo().window(each);
            }
        }
    }
}
