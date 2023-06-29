package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRun {

    public static void main(String[] args)
    {
        System.out.println("Master Selenium Automation with java");

        System.setProperty("webdriver.chrome.driver","C:\\Users\\rajur\\Career\\Selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        driver.close();
        System.out.println("website title: "+ title );

    }

}
