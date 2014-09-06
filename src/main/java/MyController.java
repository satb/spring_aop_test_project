import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-app")
public class MyController {
    @Autowired
    private MyService myService;

    @RequestMapping("/motd")
    public String get(){
        return myService.getMessage();
    }
}
