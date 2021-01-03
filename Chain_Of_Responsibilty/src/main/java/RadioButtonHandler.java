import org.openqa.selenium.WebElement;

public class RadioButtonHandler extends ElementHandler{


    public RadioButtonHandler(ElementHandler next) {
        super(next);
    }

    void actOnElements(WebElement element) {
        if (element.getAttribute("type").equals("radio")) {

            System.out.println("\n ******* handling radio button ******\n");


        } else {

            super.actOnElements(element);
        }


    }
}
