import com.xys.config.SpringConfig;
import com.xys.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.update();
        int select = bookDao.select();
        System.out.println(select);
    }
}
