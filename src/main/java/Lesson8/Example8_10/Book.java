package Lesson8.Example8_10;

public enum Book {
    JHTP("JAVA HOW","2012"),
    CHTP("C HOW","2007"),
    IW3HTP("INTERNET","2008");
    private final String title;
    private final String copyrightYear;

    Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}
