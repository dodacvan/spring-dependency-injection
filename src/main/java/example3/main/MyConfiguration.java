package example3.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
// Java Based Spring Bean Configuration
@Configuration
@ComponentScan(value="example3.main")
public class MyConfiguration {

    @Bean
    public MyService getService(){
        return new MyService();
    }
}
