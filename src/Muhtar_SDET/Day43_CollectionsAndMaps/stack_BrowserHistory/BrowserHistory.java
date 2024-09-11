package Muhtar_SDET.Day43_CollectionsAndMaps.stack_BrowserHistory;

import java.util.Stack;

public class BrowserHistory {
    private Stack<WebPage> backwards;
    private Stack<WebPage> forwards;
    private WebPage currentPage;



    public BrowserHistory() {
        this.currentPage = new WebPage( "www.google.com");
        backwards = new Stack<>();
        forwards = new Stack<>();
    }

    public void goTo(String url) {
        backwards.push(currentPage);
        currentPage = new WebPage(url);
    }

    public void goBack() {
        if (!backwards.isEmpty()) {
            forwards.push(currentPage);
            currentPage = backwards.pop(); // pop() method pay attention
        }
    }

    public void goForward() {
        if (!forwards.isEmpty()) {
            backwards.push(currentPage);
            currentPage = forwards.pop();
        }
    }

    public Stack<WebPage> getBackwards() {
        return backwards;
    }

    public Stack<WebPage> getForwards() {
        return forwards;
    }

    public WebPage getCurrentPage() {
        return currentPage;
    }

    @Override
    public String toString() {
        return "BrowserHistory{" +
                "backwards=" + backwards +
                ", forwards=" + forwards +
                ", currentPage=" + currentPage +
                '}';
    }
}
