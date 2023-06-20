import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println((bean2.getMessage()));

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat1.getCat());
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(cat2.getCat());

        System.out.println("Бины helloworld равны?");
        System.out.println(bean1 == bean2);

        System.out.println("Бины cat равны?");
        System.out.println(cat1 == cat2);
    }
}