package example3.bean;

/**
 * 
 * @author vandd
 *
 */

// XML Based Spring Bean Configuration in folder Web-INF/spring/appServlet/servlet-context.xml
public class MyBean {
    public String name;
    
    public void setString(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
