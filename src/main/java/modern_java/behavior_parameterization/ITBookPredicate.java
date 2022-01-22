package modern_java.behavior_parameterization;

public class ITBookPredicate implements BookPredicate {
    @Override
    public boolean filter(Book book) {
        return "IT".equals(book.getField());
    }
}
