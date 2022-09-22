package doing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoingController {

    @GetMapping
    public String getDoing(){
        return "Starting doingApplication using Java 11.0.12 on LongCoin with PID 13832 (D:\\aiara\\doing\\build\\classes\\java\\main started by coin in D:\\aiara\\doing)";
    }
}
