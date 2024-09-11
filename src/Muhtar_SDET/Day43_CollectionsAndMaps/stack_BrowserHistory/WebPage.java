package Muhtar_SDET.Day43_CollectionsAndMaps.stack_BrowserHistory;

public class WebPage {

    private String url;

    public WebPage(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return url;
    }
}
