import com.xys.dao.BookDao;
import com.xys.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application2 {
    public static void main(String[] args) {
        // 3.获取 IOC 容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 4.获取 bean
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//
//        bookDao.save();
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
