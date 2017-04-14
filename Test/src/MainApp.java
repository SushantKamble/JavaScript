import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {

	public static void main(String[] args) {
		 ApplicationContext context =  new ClassPathXmlApplicationContext("Beans.xml");

	      Employee obj = (Employee) context.getBean("employee");

	      System.out.println(obj.getEmployeeNumber());
	      System.out.println(obj.getName());

	}

}
