import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library myLibrary;
    Book book;
    Stock myStock;

    @Before
    public void before(){
        myLibrary = new Library("Blackhall Library");
        book = new Book();
        myStock = new Stock(20);
    }

    @Test
    public void libraryIsEmpty(){
        assertEquals(0, myLibrary.stockCount());
    }

    @Test
    public void canAddStock(){
        myLibrary.add(myStock);
        assertEquals(1, myLibrary.stockCount());

    }

}
