import com.itguigu.spring6.iocxml.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//       根据id获取bean
        Object user = context.getBean("user");
        System.out.println(user);
//根据id和类型获取bean
        User user1 = context.getBean("user", User.class);
        System.out.println(user1);
    }
}
