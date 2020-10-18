import implementation.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ykeskin
 * @since 10/18/2020
 */
public class ServiceApp {

    public static void main(String[] args) {

        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor = (Mentor) container.getBean("partTimeMentor");

        ApplicationContext container2 = new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor2 = container.getBean("fullTimeMentor", Mentor.class);

        mentor.createAccount();
        mentor2.createAccount();
    }
}
