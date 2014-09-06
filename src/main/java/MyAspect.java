import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    public static MyAspect aspectOf(){
        System.out.println("Aspect of called");
        return new MyAspect();
    }

    @Before("execution(private * MyService.get*())")
    public void adviceGetter(){
        System.out.println("Advising getter");
    }
}
