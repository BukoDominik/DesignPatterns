package patterns.structural.Bridge;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Lord of the rings");
        book.setAuthor("Tolkien");
        book.setNumberOfPages(500);

        BookPrinter bookPrinter = new BookPrinter(book);
        PrintFormatter printFormatter = new PrintFormatter();
        bookPrinter.print(printFormatter);
    }
}
