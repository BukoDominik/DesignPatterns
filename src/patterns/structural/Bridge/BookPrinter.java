package patterns.structural.Bridge;

import java.util.ArrayList;
import java.util.List;

public class BookPrinter extends AbstractPrinter {
    Book book;
    List<Detail> details;

    public BookPrinter(Book book) {
        this.book = book;
    }

    public List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("Author", book.getAuthor()));
        details.add(new Detail("Pages", book.getNumberOfPages()+""));
        return details;
    }

    @Override
    protected String getHeader() {
        return book.getTitle();
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }
}
