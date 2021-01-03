import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChainOfResponsibility {


    public static void main(String args[])
    {
        ElementHandler chain = new TextBoxHandler(new RadioButtonHandler(null));
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://localhost:8080");
        WebElement textBox = driver.findElement(By.id("username"));
        WebElement radioButton = driver.findElement(By.id("male"));
        chain.actOnElements(textBox);
        chain.actOnElements(radioButton);
        driver.close();




    }
}
