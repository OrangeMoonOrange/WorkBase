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
        //最好还是用这个吧。避免windows和Linux上不路径的不同
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        // retrieve configured instance
//        Person person = context.getBean("Person", Person.class);
//        System.out.println(person);
//
//        Person person2 = context.getBean("Person", Person.class);
//        System.out.println(person2);
//
//        System.out.println(person == person2);//return true  单例的

        //如果定义了2个同类型的对象的时候，就有问题
        Person bean = context.getBean("Person",Person.class);
        System.out.println(bean);

        Person bean2 = context.getBean("Person1",Person.class);
        System.out.println(bean2);



    }
}
