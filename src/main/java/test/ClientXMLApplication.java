package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import consumer.MyXMLApplication;

public class ClientXMLApplication {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configuration/applicationContext.xml");
        
        // will put in src/main/java or src/main/resources
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyXMLApplication app = context.getBean(MyXMLApplication.class);

        app.processMessage("Hi Pankaj", "pankaj@abc.com");

        // close the context
        context.close();
    }
}
