import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service("myService")
public class MyService {
    public String getMessage(){
        return "Today's date is " + getDate() + "\n";
    }

    private String getDate(){
        return Calendar.getInstance().get(Calendar.MONTH) + 1 + "/" + Calendar.getInstance().get(Calendar.DATE);
    }
}
