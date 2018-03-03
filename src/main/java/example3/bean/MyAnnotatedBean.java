package example3.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;
// Annotation Based Spring Bean Configuration
@Service
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class MyAnnotatedBean {

    private int empId;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    
}
