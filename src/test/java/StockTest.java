import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StockTest {

    Stock myStock;
    Book book;

    @Before
    public void before(){
        myStock = new Stock(20);
    }

    @Test
    public void stockIsEmpty(){
        assertEquals(0, myStock.booksCount());
    }

    @Test
    public void addBooks(){
        myStock.addBooks(book);
        assertEquals(1, myStock.booksCount());
    }

}
