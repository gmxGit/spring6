import bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean-ditest.xml");
        Student student = context.getBean("student", Student.class);
        student.run();
        System.out.println(student);
    }
}
