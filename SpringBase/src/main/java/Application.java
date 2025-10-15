import com.xys.service.BookService;
import com.xys.service.impl.BookServiceImpl;

public class Application {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
