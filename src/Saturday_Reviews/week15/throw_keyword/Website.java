package Saturday_Reviews.week15.throw_keyword;

public class Website {
    private String url;

    public Website(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        if (url == null || url.isEmpty() || !url.contains("www")){
            throw new IllegalArgumentException("invalid Url - " + url);
        }
        this.url = url;
    }

    @Override
    public String toString() {
        return "Website{" +
                "url='" + url + '\'' +
                '}';
    }
}
