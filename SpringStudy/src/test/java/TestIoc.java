import bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xk
 * @Date: 2021/7/8 13:09
 * @Desc:
 */
public class TestIoc {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
// retrieve configured instance
        Person person = context.getBean("Person", Person.class);
        System.out.println(person);

// use configured instance

    }
}
