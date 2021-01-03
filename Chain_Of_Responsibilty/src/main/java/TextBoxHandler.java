import org.openqa.selenium.WebElement;

public class TextBoxHandler extends ElementHandler {


    public TextBoxHandler(ElementHandler next) {
        super(next);
    }

    void actOnElements(WebElement element) {
        if (element.getAttribute("type").equals("text")) {

            System.out.println("\n ******* handling text box ******\n");


        } else {

            super.actOnElements(element);
        }


    }
}
