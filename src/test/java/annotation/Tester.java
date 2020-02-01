package annotation;

public enum Tester {

    AKASH("Akash Gupta");
    private String authorName;

    Tester(String name) {
        this.authorName = name;
    }

    public String getAuthorName(){
        return authorName;
    }
}
