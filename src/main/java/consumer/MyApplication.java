package consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import services.MessageService;

@Component
public class MyApplication {
    //field-based dependency injection
    //@Autowired
    private MessageService service;
    
    // constructor-based dependency injection  
    //  @Autowired
//    public MyApplication(MessageService msv){
//        this.service = msv;
//    }
    @Autowired
    public void setService(MessageService msv) {
        this.service = msv;
    }
    
    public boolean processMessage(String msg, String rec) {
        return this.service.sendMessage(msg, rec);
    }
}
