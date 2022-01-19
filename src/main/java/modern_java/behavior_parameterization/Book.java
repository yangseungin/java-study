package modern_java.behavior_parameterization;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Book {
    private String name;    //책이름
    private String author;  //저자
    private Integer year;   //출판년도
    private String field;   //분야
}
