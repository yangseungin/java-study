package modern_java.behavior_parameterization;

public class ITBookPredicate implements BookPredicate {
    @Override
    public boolean test(Book book) {
        return "IT".equals(book.getField());
    }
}
