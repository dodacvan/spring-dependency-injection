package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import services.EmailService;
import services.MessageService;

@Configuration
@ComponentScan(value={"consumer"})
public class DIConfiguration {
    @Bean
    public MessageService returnService(){
        return new EmailService();
    }
}
