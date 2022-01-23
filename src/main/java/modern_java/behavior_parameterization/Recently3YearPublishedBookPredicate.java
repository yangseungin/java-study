package modern_java.behavior_parameterization;

import java.time.LocalDateTime;

public class Recently3YearPublishedBookPredicate implements BookPredicate {
    @Override
    public boolean test(Book book) {
        int nowYear = LocalDateTime.now().getYear();
        return nowYear - book.getYear() <= 3;
    }
}
