package Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int years;
    private List<String> authors;

    public Book(String title, int years, String... authors) {
        setTitle(title);
        setYears(years);
        setAuthors(authors);

    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setYears(int years) {
        this.years = years;
    }

    private void setAuthors(String... authors) {
        if (authors.length == 0) {
            this.authors = new ArrayList<>();
        } else {
            this.authors = new ArrayList<>(Arrays.asList(authors));
        }
    }

    public String getTitle() {
        return title;
    }

    public int getYears() {
        return years;
    }

    public List<String> getAuthors() {
        return authors;
    }

    @Override
    public int compareTo(Book book) {
        if (this.title.compareTo(book.getTitle()) == 0) {
           return Integer.compare(this.years, book.getYears());
        }
        return title.compareTo(book.getTitle());
    }
}
