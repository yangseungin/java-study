package modern_java.behavior_parameterization;

public class Book {
    private String name;    //책이름
    private String author;  //저자
    private Integer year;   //출판년도
    private String field;   //분야

    public Book(String name, String author, Integer year, String field) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }

    public String getField() {
        return field;
    }
}
