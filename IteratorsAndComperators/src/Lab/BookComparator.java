package Lab;

import Lab.Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book first, Book second) {
        if (first.getTitle().compareTo(second.getTitle()) == 0) {
            return Integer.compare(first.getYears(), second.getYears());
        }
        return first.getTitle().compareTo(second.getTitle());
    }
}
