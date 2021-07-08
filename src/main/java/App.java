import impl.Abonent;
import interfaces.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Abonent abonent = context.getBean(Abonent.class);
        System.out.println(abonent);
    }
}

