package ejb3.bean;
import javax.ejb.Stateless;

@Stateless( name="HelloEjb")
public class HelloEjbBean implements HelloEjb {
    public HelloEjbBean() {}

    public String printHello(String name) {
        return "Hello bro " + name + " welcome to EJB 3";
    }
}