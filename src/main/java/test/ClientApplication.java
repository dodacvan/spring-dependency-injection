package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import configuration.DIConfiguration;
import consumer.MyApplication;
/**
 * 
 * @author vandd
 *
 */
public class ClientApplication {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
        MyApplication app = context.getBean(MyApplication.class);
        app.processMessage("come with me", "Sarad");
        context.close();
    }
}
