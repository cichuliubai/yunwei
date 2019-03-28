package cmic.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZR on 2019/3/25.
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping("/test")
    public String index(){
        return "who are you? don't Swimming , please work hard";
    }

}
