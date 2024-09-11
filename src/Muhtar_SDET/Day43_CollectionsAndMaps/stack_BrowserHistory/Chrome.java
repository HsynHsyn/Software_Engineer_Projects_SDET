package Muhtar_SDET.Day43_CollectionsAndMaps.stack_BrowserHistory;

public class Chrome {
    public static void main(String[] args) {

        BrowserHistory chrome = new BrowserHistory();
        System.out.println(chrome);
        chrome.goTo("www.google.com");
        System.out.println(chrome);
        chrome.goTo("www.youtube.com");
        System.out.println(chrome);
        chrome.goBack();
        System.out.println(chrome);
        chrome.goBack();
        System.out.println(chrome);
        chrome.goForward();
        System.out.println(chrome);
    }
}