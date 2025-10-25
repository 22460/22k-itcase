import com.xys.dao.AccountDao;
import com.xys.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


public class App {
    public static void main(String[] args) throws IOException {
        //1. 创建SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //2. 加载SqlMapConfig.xml配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //3. 创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
        //4. 创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //5. 执行SqlSession对象执行查询，获取结果
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);

        Account ac = accountDao.findById(2);
        System.out.println(ac);

        // 6. 释放资源
        sqlSession.close();
    }
}
