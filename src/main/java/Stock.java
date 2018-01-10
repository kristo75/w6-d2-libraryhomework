import java.util.ArrayList;

public class Stock {

    private int capacity;
    private ArrayList<Book> books;

    public Stock(int inputCapacity) {
        this.capacity = inputCapacity;
        this.books = new ArrayList<>();
    }

    public int booksCount() {
        return this.books.size();
    }

    public void addBooks(Book book) {
        if (this.books.size() < this.capacity) {
            this.books.add(book);
        } else {
            System.out.println("Library is full!");
        }
    }
}
