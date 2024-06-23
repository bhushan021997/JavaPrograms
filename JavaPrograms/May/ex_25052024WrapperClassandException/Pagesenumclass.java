package ex_25052024WrapperClassandException;

public enum Pagesenumclass {
	

    HOME("https://app.vwo.com/","homePage"),
    LOGIN("https://app.vwo.com/#login","loginPage"),
    DASHBOARD("https://app.vwo.com/dashboard","dashPage");
	
	private String page;
	private String url;

    
    // Home ->
    // Login -> https://app.vwo.com/login
    // Dashboard -> https://app.vwo.com/dasbhoard


    Pagesenumclass(String url, String page) {
        this.url = url;
        this.page = page;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

}
