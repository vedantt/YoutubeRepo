import org.openqa.selenium.WebElement;

public abstract class ElementHandler {

    private ElementHandler next;

    public ElementHandler(ElementHandler next) {
        this.next = next;
    }

    void actOnElements(WebElement element) {
        if (next != null) {

            next.actOnElements(element);
        }


    }

}
