package example3.main;

import java.util.Date;
// Java Based Spring Bean Configuration
public class MyService {

    public void log(String msg){
        System.out.println(new Date()+"::"+msg);
    }
}
